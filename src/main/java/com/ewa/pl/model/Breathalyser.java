package com.ewa.pl.model;

import java.util.Calendar;


public class Breathalyser {

    private long id;
    private Gender gender;
    private int weight;
    private int height;
    private int age;
    private int startDrinking;
    private int time;
    private int quantity;
    private int typ;
    private int percent;

    public Breathalyser() {
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public int getStartDrinking() {
        return startDrinking;
    }

    public void setStartDrinking(int startDrinking) {
        this.startDrinking = startDrinking;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTyp() {
        return typ;
    }

    public void setTyp(int typ) {
        this.typ = typ;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gander) {
        this.gender = gander;
    }


    @Override
    public String toString() {
        return "Breathalyser{" +
                "gender='" + gender + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", age=" + age +
                ", startDrinking=" + startDrinking +
                ", time=" + time +
                ", quantity=" + quantity +
                ", typ='" + typ + '\'' +
                ", percent=" + percent +
                '}';
    }


    public String displayResult() {

        double totalBodyWater = countTotalBodyWater(gender, age, height, weight);
        double alcoholMassInGrams = countAlcoholMassInGrams(percent, quantity, typ);

        double czasRound = Math.round((time / 60) * 100) / 100;
        double stezeniePo = (alcoholMassInGrams / totalBodyWater) * 0.8 - (czasRound * 0.15);


        Calendar cal = Calendar.getInstance();
        int hours = cal.get(Calendar.HOUR_OF_DAY);
        int min = cal.get(Calendar.MINUTE);

        double godzina = Math.round(((min / 60) + hours) * 100) / 100;
        double okres = startDrinking + czasRound;
        double czas_roznica = godzina - okres;
        double result = (alcoholMassInGrams / totalBodyWater) * 0.8 - (czas_roznica * 0.15);

        double resultRound = 0;
        if (result > 0) {
            resultRound = Math.round(result * 100) / 100;
        } else if (result <= 0) {
            resultRound = 0;
        }

        String inf = null;
        if (resultRound > 4.0) {
            inf = "JESTEŚ PIJANY, (STOPIEŃ 5)";
        } else if (resultRound >= 3.0 && resultRound < 4.0) {
            inf = "JESTEŚ PIJANY, (STOPIEŃ 4)";
        } else if (resultRound >= 2.0 && resultRound < 3.0) {
            inf = "JESTEŚ PIJANY, (STOPIEŃ 3)";
        } else if (resultRound >= 1.0 && resultRound < 2.0) {
            inf = "JESTEŚ PIJANY, (STOPIEŃ 2)";
        } else if (resultRound >= 0.2 && resultRound < 1.0) {
            inf = "JESTEŚ PIJANY, (STOPIEŃ 1)";
        } else if (resultRound < 0.2) {
            inf = "JESTEŚ TRZEŹWY, MOŻESZ PROWADZIĆ SAMOCHÓD";
        } else {
            inf = "Spróbuj jeszcze raz";
        }

//        return "Total Body Water: " + totalBodyWater;

        return "Powyższe obliczenia są jedynie teoretyczne i przybliżone" + '\''
                + "Stężenie alkoholu we krwi wynosiło: " + stezeniePo + " promili " + '\'' +
                "Obecnie stężenie alkoholu we krwi wynosi: " + resultRound + " promili " + '\'' +
                inf;
    }

    private double countAlcoholMassInGrams(int percent, int quantity, int typ) {
        return (percent / 100) * quantity * typ * 0.79;
    }


    private double countTotalBodyWater(Gender gender, int age, int height, int weight) {
        double totalBodyWaterAmount;
        if (gender.isMale) {
            totalBodyWaterAmount = 2.447 - (0.09156 * age) + (0.1074 * height) + (0.3362 * weight);
        } else {
            totalBodyWaterAmount = (0.1069 * height) + (0.2466 * weight) - 2.097;
        }
        return totalBodyWaterAmount;
    }

    public enum Gender {
        MALE(true),
        FIMALE(false);

        private final boolean isMale;

        Gender(boolean male) {
            this.isMale = male;
        }

        public boolean isMale() {
            return this.isMale;
        }

        public String toString() {
            return isMale ? "MALE" : "FIMALE";
        }
    }


}

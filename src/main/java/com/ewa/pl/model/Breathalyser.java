package com.ewa.pl.model;

import com.ewa.pl.utils.BreathAnalyserUtil;

import java.util.Calendar;


public class Breathalyser {

    private long id;
    private Gender gender;
    private int weight;
    private int height;
    private int age;
    private int startDrinking;
    private int howLong;
    private int quantity;
    private int type;
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

    public int getHowLong() {
        return howLong;
    }

    public void setHowLong(int howLong) {
        this.howLong = howLong;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
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
                ", howLong=" + howLong +
                ", quantity=" + quantity +
                ", type='" + type + '\'' +
                ", percent=" + percent +
                '}';
    }




    public String displayResult() {

        double totalBodyWater = BreathAnalyserUtil.countTotalBodyWater(gender, age, height, weight);
        double alcoholMassInGrams = BreathAnalyserUtil.countAlcoholMassInGrams(percent, quantity, type);
        double concentrationOfAlcoholWhenStopDrinking = BreathAnalyserUtil.countConcentrationOfAlcohol(totalBodyWater, alcoholMassInGrams, howLong);
        double hourWhenStop = (startDrinking + howLong) > 23 ? (startDrinking + howLong - 24) : (startDrinking + howLong);
        double actualHour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        double timeDifferenceInHours = (hourWhenStop <= actualHour) ? (actualHour - hourWhenStop) : (actualHour - hourWhenStop) + 24;
        double concentrationOfAlcoholNow = BreathAnalyserUtil.countConcentrationOfAlcohol(totalBodyWater, alcoholMassInGrams, timeDifferenceInHours + howLong);





        return "Powyższe obliczenia są jedynie teoretyczne i przybliżone:" + '\n'
                + "Max stężenie alkoholu we krwi wynosiło: " + concentrationOfAlcoholWhenStopDrinking + " promili " + '\n'
                + "Aktualnie wynosi: " + concentrationOfAlcoholNow + " promili " + '\n'
                + "Do calkowitego wytrzezwienia brakuje jeszcze: " + BreathAnalyserUtil.howManyHoursToAlcoholVanish(concentrationOfAlcoholNow) + " godzin";

    }



    public enum Gender {
        MALE(true),
        FIMALE(false);

        private final boolean isMale;

        Gender(boolean male) {
            this.isMale = male;
        }

        public boolean isMale() {
            return isMale;
        }

        public String toString() {
            return isMale ? "MALE" : "FIMALE";
        }
    }
}

package com.ewa.pl.model;

import java.io.Serializable;
import java.util.Calendar;


public class Breathalyser{// implements Serializable {

    //private static final long serialVersionUID = 1L;

    private long id;
    private String gender;
    private int weight;
    private int height;
    private int age;
    private int startDrinking;
    private int time;
    private int quantity;
    private int typ;
    private int procent;

    public Breathalyser() {super();}
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public int getProcent() {
        return procent;
    }
    public void setProcent(int procent) {
        this.procent = procent;
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
    public int getAge(){
        return age;
    }
    public void setAge(int age){
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
    public String getGender(){
        return gender;
    }
    public void setGender(String gander){
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
                ", procent=" + procent +
                '}';
    }



    public String displayResult() {

        double tbw = getTbw();

        double tbwRound = Math.round(tbw * 100) / 100;

        double wartosc = ((procent/100)*quantity*typ);
        double wartoscRound = Math.round(wartosc * 100) / 100;

        double gramy = (wartoscRound)*0.79;
        double gramyRound = Math.round(gramy * 100) / 100;

        double czasRound = Math.round((time / 60) * 100)/100;
        double stezeniePo = (gramyRound/tbwRound)*0.8-(czasRound*0.15);
        double stezeniePoRound = Math.round(stezeniePo * 100) / 100;

        Calendar cal = Calendar.getInstance();
        int hours = cal.get(Calendar.HOUR_OF_DAY);
        int min = cal.get(Calendar.MINUTE);

        double godzina = Math.round(((min/60) + hours) * 100)/100;
        double okres = startDrinking + czasRound;
        double czas_roznica = godzina - okres;
        double result = (gramyRound/tbwRound)*0.8-(czas_roznica*0.15);

        double resultRound = 0;
        if (result > 0)
        {resultRound = Math.round(result * 100)/100;}
        else if (result <= 0)
        {resultRound = 0;}

        String inf = null;
        if (resultRound > 4.0)
        {inf = "JESTEŚ PIJANY, (STOPIEŃ 5)";}
        else if (resultRound >= 3.0 && resultRound < 4.0)
        {inf = "JESTEŚ PIJANY, (STOPIEŃ 4)";}
        else if (resultRound >= 2.0 && resultRound < 3.0)
        {inf = "JESTEŚ PIJANY, (STOPIEŃ 3)";}
        else if (resultRound >= 1.0 && resultRound < 2.0)
        {inf = "JESTEŚ PIJANY, (STOPIEŃ 2)";}
        else if (resultRound >= 0.2 && resultRound < 1.0)
        {inf = "JESTEŚ PIJANY, (STOPIEŃ 1)";}
        else if (resultRound < 0.2)
        {inf = "JESTEŚ TRZEŹWY, MOŻESZ PROWADZIĆ SAMOCHÓD";}
        else {inf = "Spróbuj jeszcze raz";}

return "napraw mnie prosze";

//        return "Powyższe obliczenia są jedynie teoretyczne i przybliżone"+ '\''
//                +"Stężenie alkoholu we krwi wynosiło: "+stezeniePoRound+" promili " + '\'' +
//                "Obecnie stężenie alkoholu we krwi wynosi: "+resultRound+" promili " + '\'' +
//                inf;
    }

    private double getTbw() {
        // // TODO: 9/15/2017  data rozpoczecia picia nie mas sensu
        // TODO: 9/15/2017  add some tests
        // TODO: 9/15/2017  domyslnie zaznaczaj jaks plec bo leca nullpointery
        double tbw;
        if (gender.equals("Male")){
            tbw = 2.447 - (0.09156 * age) + (0.1074 * height) + (0.3362 * weight);
        } else{
            tbw = (0.1069 * height) + (0.2466 * weight) - 2.097;
        }
        return tbw;
    }


}

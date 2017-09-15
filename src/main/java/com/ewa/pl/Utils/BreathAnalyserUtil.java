package com.ewa.pl.utils;

import com.ewa.pl.model.Breathalyser;

public class BreathAnalyserUtil {

    public static double countConcentrationOfAlcohol(double totalBodyWater, double alcoholMassInGrams, double time) {
        return (alcoholMassInGrams / totalBodyWater) * 0.8 - (time * 0.15);
    }

    public static double countAlcoholMassInGrams(int percent, int quantity, int type) {
        return percent * 0.01 * quantity * type * 0.79;
    }


    public static double countTotalBodyWater(Breathalyser.Gender gender, int age, int height, int weight) {
        double totalBodyWaterAmount;
        if (gender.isMale()) {
            totalBodyWaterAmount = 2.447 - (0.09156 * age) + (0.1074 * height) + (0.3362 * weight);
        } else {
            totalBodyWaterAmount = (0.1069 * height) + (0.2466 * weight) - 2.097;
        }
        return totalBodyWaterAmount;
    }

    public static int howManyHoursToAlcoholVanish(double concentrationOfAlcohol) {
        return (int) (concentrationOfAlcohol / 0.15);
    }
}

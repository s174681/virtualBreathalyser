package com.ewa.pl.utils;

import com.ewa.pl.model.Breathalyser;

public class BreathAnalyserUtil {

    public static double countConcentrationOfAlcohol(double totalBodyWater, double alcoholMassInGrams, double timeInHours) {
        double correctTotalBodyWater = totalBodyWater < 1.0 ? 1.0 : totalBodyWater;
        double correctAlcoholMassInGrams = alcoholMassInGrams < 0 ? 0 : alcoholMassInGrams;
        double correctTimeInHours = timeInHours < 0 ? 0 : timeInHours;
        return (correctAlcoholMassInGrams / correctTotalBodyWater) * 0.8 - (correctTimeInHours * 0.15);
    }

    public static double countAlcoholMassInGrams(int percent, int quantity, int type) {
        int correctPercent = percent < 0 ? 0 : percent;
        int correctQuantity = quantity < 0 ? 0 : quantity;
        int correctType = type < 0 ? 0 : type;
        return correctPercent * 0.01 * correctQuantity * correctType * 0.79;
    }

    public static double countTotalBodyWater(Breathalyser.Gender gender, int age, int height, int weight) {
        double totalBodyWaterAmount;
        int correctAge = age < 0 ? 0 : age;
        int correctHeight = height < 0 ? 0 : height;
        int correctWeight = weight < 0 ? 0 : weight;
        if (gender.isMale()) {
            totalBodyWaterAmount = 2.447 - (0.09156 * correctAge) + (0.1074 * correctHeight) + (0.3362 * correctWeight);
        } else {
            totalBodyWaterAmount = (0.1069 * correctHeight) + (0.2466 * correctWeight) - 2.097;
        }
        return totalBodyWaterAmount;
    }

    public static int howManyHoursToAlcoholVanish(double concentrationOfAlcohol) {
        double correctValue = concentrationOfAlcohol > 0 ? concentrationOfAlcohol : 0;
        return (int) (correctValue / 0.15);
    }
}

package com.ewa.pl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import com.ewa.pl.utils.BreathAnalyserUtil;
import com.ewa.pl.model.Breathalyser.Gender;

public class BreathAnalyserUtilTest {

    private static final double FLOATING_POINT_BOUNDARY = 0.01;
    private static final double DEFAULT_MALE_VALUE = 2.447;
    private static final double DEFAULT_FIMALE_VALUE = -2.097;
    private static final int NEGATIVE_VALUE = -1;
    private static final int ZERO = 0;
    private static final int ONE = 1;


    @Test
    public void countConcentrationOfAlcoholClassOfEqualityTest() {

        //(AlcoholMassInGrams / TotalBodyWater) * 0.8 - (TimeInHours * 0.15); Minimal TotalBodyWater is 1.0
        // TotalBodyWater
        assertEquals(ZERO, BreathAnalyserUtil.countConcentrationOfAlcohol(NEGATIVE_VALUE,0.0,0.0) , FLOATING_POINT_BOUNDARY);
        assertEquals(0.8, BreathAnalyserUtil.countConcentrationOfAlcohol(ZERO,ONE,0.0) , FLOATING_POINT_BOUNDARY);
        assertEquals(0.8, BreathAnalyserUtil.countConcentrationOfAlcohol(ONE,ONE,0.0) , FLOATING_POINT_BOUNDARY);

        // AlcoholMassInGrams
        assertEquals(ZERO, BreathAnalyserUtil.countConcentrationOfAlcohol(ONE,NEGATIVE_VALUE,0.0) , FLOATING_POINT_BOUNDARY);
        assertEquals(ZERO, BreathAnalyserUtil.countConcentrationOfAlcohol(ONE,ZERO,0.0) , FLOATING_POINT_BOUNDARY);

        // TimeInHours
        assertEquals(ZERO, BreathAnalyserUtil.countConcentrationOfAlcohol(0.0,0.0,NEGATIVE_VALUE) , FLOATING_POINT_BOUNDARY);
        assertEquals(ZERO, BreathAnalyserUtil.countConcentrationOfAlcohol(0.0,0.0,ZERO) , FLOATING_POINT_BOUNDARY);
        assertEquals(-0.15, BreathAnalyserUtil.countConcentrationOfAlcohol(0.0,0.0,ONE) , FLOATING_POINT_BOUNDARY);

    }

    @Test
    public void countAlcoholMassInGramsClassOfEqualityTest() {

        //Percent * 0.01 * Quantity * Type * 0.79;
        assertEquals(ZERO, BreathAnalyserUtil.countAlcoholMassInGrams(NEGATIVE_VALUE, 1, 1), FLOATING_POINT_BOUNDARY);
        assertEquals(ZERO, BreathAnalyserUtil.countAlcoholMassInGrams(1, NEGATIVE_VALUE, 1), FLOATING_POINT_BOUNDARY);
        assertEquals(ZERO, BreathAnalyserUtil.countAlcoholMassInGrams(1, 1, NEGATIVE_VALUE), FLOATING_POINT_BOUNDARY);
        assertEquals(0.01 * 0.79, BreathAnalyserUtil.countAlcoholMassInGrams(1, 1, 1), FLOATING_POINT_BOUNDARY);

    }

    @Test
    public void countTotalBodyWaterMaleClassOfEqualityTest() {

        //For MALE: 2.447 - (0.09156 * age) + (0.1074 * height) + (0.3362 * weight);
        assertEquals(DEFAULT_MALE_VALUE, BreathAnalyserUtil.countTotalBodyWater(Gender.MALE, 0, 0, 0), FLOATING_POINT_BOUNDARY);

        //Age<0 should change for 0;
        assertEquals(DEFAULT_MALE_VALUE, BreathAnalyserUtil.countTotalBodyWater(Gender.MALE, NEGATIVE_VALUE, 0, 0), FLOATING_POINT_BOUNDARY);
        assertEquals(DEFAULT_MALE_VALUE, BreathAnalyserUtil.countTotalBodyWater(Gender.MALE, ZERO, 0, 0), FLOATING_POINT_BOUNDARY);
        assertEquals(DEFAULT_MALE_VALUE - 0.09156, BreathAnalyserUtil.countTotalBodyWater(Gender.MALE, ONE, 0, 0), FLOATING_POINT_BOUNDARY);

        //Height<0 should change for 0;
        assertEquals(DEFAULT_MALE_VALUE, BreathAnalyserUtil.countTotalBodyWater(Gender.MALE, 0, NEGATIVE_VALUE, 0), FLOATING_POINT_BOUNDARY);
        assertEquals(DEFAULT_MALE_VALUE, BreathAnalyserUtil.countTotalBodyWater(Gender.MALE, 0, ZERO, 0), FLOATING_POINT_BOUNDARY);
        assertEquals(DEFAULT_MALE_VALUE + 0.1074, BreathAnalyserUtil.countTotalBodyWater(Gender.MALE, 0, ONE, 0), FLOATING_POINT_BOUNDARY);

        //Weight<0 should change for 0;
        assertEquals(DEFAULT_MALE_VALUE, BreathAnalyserUtil.countTotalBodyWater(Gender.MALE, 0, 0, NEGATIVE_VALUE), FLOATING_POINT_BOUNDARY);
        assertEquals(DEFAULT_MALE_VALUE, BreathAnalyserUtil.countTotalBodyWater(Gender.MALE, 0, 0, ZERO), FLOATING_POINT_BOUNDARY);
        assertEquals(DEFAULT_MALE_VALUE + 0.3362, BreathAnalyserUtil.countTotalBodyWater(Gender.MALE, 0, 0, ONE), FLOATING_POINT_BOUNDARY);

    }

    @Test
    public void countTotalBodyWaterFimaleClassOfEqualityTest() {

        //For FIMALE: (0.1069 * height) + (0.2466 * weight) - 2.097;
        assertEquals(DEFAULT_FIMALE_VALUE, BreathAnalyserUtil.countTotalBodyWater(Gender.FIMALE, 0, 0, 0), FLOATING_POINT_BOUNDARY);

        //Height<0 should change for 0;
        assertEquals(DEFAULT_FIMALE_VALUE, BreathAnalyserUtil.countTotalBodyWater(Gender.FIMALE, 0, NEGATIVE_VALUE, 0), FLOATING_POINT_BOUNDARY);
        assertEquals(DEFAULT_FIMALE_VALUE, BreathAnalyserUtil.countTotalBodyWater(Gender.FIMALE, 0, ZERO, 0), FLOATING_POINT_BOUNDARY);
        assertEquals(0.1069 + DEFAULT_FIMALE_VALUE, BreathAnalyserUtil.countTotalBodyWater(Gender.FIMALE, 0, ONE, 0), FLOATING_POINT_BOUNDARY);

        //Weight<0 should change for 0;
        assertEquals(DEFAULT_FIMALE_VALUE, BreathAnalyserUtil.countTotalBodyWater(Gender.FIMALE, 0, 0, NEGATIVE_VALUE), FLOATING_POINT_BOUNDARY);
        assertEquals(DEFAULT_FIMALE_VALUE, BreathAnalyserUtil.countTotalBodyWater(Gender.FIMALE, 0, 0, ZERO), FLOATING_POINT_BOUNDARY);
        assertEquals(0.2466 + DEFAULT_FIMALE_VALUE, BreathAnalyserUtil.countTotalBodyWater(Gender.FIMALE, 0, 0, ONE), FLOATING_POINT_BOUNDARY);

    }

    @Test
    public void howManyHoursToAlcoholVanishClassOfEqualityTest() {
        assertEquals("For negative values should return 0", 0, BreathAnalyserUtil.howManyHoursToAlcoholVanish(-2));
        assertEquals("For 0 should return 0", 0, BreathAnalyserUtil.howManyHoursToAlcoholVanish(0));
        assertEquals("For 1 should return 6", 6, BreathAnalyserUtil.howManyHoursToAlcoholVanish(1));
        assertEquals("For 1 should return 1/0,15~=6", 6, BreathAnalyserUtil.howManyHoursToAlcoholVanish(1));
    }
}

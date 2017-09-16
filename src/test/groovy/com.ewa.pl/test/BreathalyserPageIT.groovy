package com.ewa.pl.test

import com.ewa.pl.page.BreathalyserPage
import com.ewa.pl.page.BreathalyserResultPage
import geb.spock.GebReportingSpec

class BreathalyserPageIT extends GebReportingSpec {



    def "Check validation weightField "() {

        given: "I'm at the sign up form"
        to BreathalyserPage

        when: "I signup as a valid user"
        weightField = "34"
        //assert element =="Wartość nie może być mniejsza niż 30."


        then: "I'm at the result page "
        at BreathalyserPage

    }

    def "Fill out the form Breathalyser pass test"() {

        given: "I'm at the sign up form"
        to BreathalyserPage

        when: "I signup as a valid user"
        genderMField = "MALE"
        weightField = "35"
        heightField = "110"
        ageField = "19"
        startDrinkingField = "23"
        howLongField = "1"
        quantityField = "2"
        typeField = "50"
        percentField = "25"
        submitButton.click()

        then: "I'm at the result page "
        at BreathalyserResultPage

    }

}
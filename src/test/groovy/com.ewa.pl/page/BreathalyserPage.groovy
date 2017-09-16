package com.ewa.pl.page

import geb.Page
import org.openqa.selenium.By

class BreathalyserPage extends Page {

    static url = "/breathalyserForm"
    static at = { title.startsWith("BreathalyserForm") }


    static content = {
        genderMField { $(By.id(GENDERM_ID)) }
        genderFField { $(By.id(GENDERF_ID)) }
        weightField { $(By.id(WEIGHT_ID)) }
        heightField { $(By.id(HEIGHT_ID)) }
        ageField { $(By.id(AGE_ID)) }
        startDrinkingField { $(By.id(START_DRINKING_ID)) }
        howLongField { $(By.id(HOW_LONG_ID)) }
        quantityField { $(By.id(QUANTITY_ID)) }
        typeField { $(By.id(TYPE_ID)) }
        percentField { $(By.id(PERCENT_ID)) }
        heading { $("h1") }
        //element = driver.FindElement(By.id("divTooltips")
        //element = driver.findElement(By.cssSelector(".ui-tooltip"))
        submitButton(to: BreathalyserResultPage) { $("button[type=submit]")}
    }


    public static final String GENDERM_ID = "genderM";
    public static final String GENDERF_ID = "genderF";
    public static final String WEIGHT_ID = "weight";
    public static final String HEIGHT_ID = "height";
    public static final String AGE_ID = "age";
    public static final String START_DRINKING_ID = "startDrinking";
    public static final String HOW_LONG_ID = "howLong";
    public static final String QUANTITY_ID = "quantity";
    public static final String TYPE_ID = "type";
    public static final String PERCENT_ID = "percent";


}

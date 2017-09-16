package com.ewa.pl.page

import geb.Page
import org.openqa.selenium.By

class BreathalyserResultPage extends Page{

    static url = "/breathalyserResult"
    static at = { title.startsWith("BreathalyserResult") }


    static content = {
        heading { $("h2").text() }

    }
}

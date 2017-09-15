package com.ewa.pl.controller;

import com.ewa.pl.model.Breathalyser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BreathalyserController {
    private static final String BREATHALYSER = "breathalyser";

    @GetMapping("/breathalyserForm")
    public String getBreathalyserForm(Model model) {
        model.addAttribute(BREATHALYSER, new Breathalyser());
        return "breathalyserForm";
    }

    @PostMapping("/breathalyserForm")
    public String submitBreathalyser(@ModelAttribute Breathalyser breathalyser, ModelMap model) {
        model.addAttribute(BREATHALYSER, breathalyser);
        return "breathalyserResult";
    }
}

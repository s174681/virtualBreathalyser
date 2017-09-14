package com.ewa.pl.controller;

import com.ewa.pl.model.Breathalyser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
public class BreathalyserController {

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public ModelAndView handleRequest(HttpServletRequest request,
                                      HttpServletResponse response) throws ServletException, IOException {

        String aMessage = "Hello World MVC!";

        ModelAndView modelAndView = new ModelAndView("hello");
        modelAndView.addObject("message", aMessage);

        return modelAndView;
    }

//    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
//    public String hello() {
//        return "hello";
//    }
////
//    @RequestMapping(value = {"/breathalyserForm"}, method = RequestMethod.GET)
//    public ModelAndView getBreathalyser() {
//        //model.addAttribute("breathalyserForm", new Breathalyser());
//        // initializeFormValues(model);
//        return new ModelAndView("breathalyserForm","breathalyserForm", new Breathalyser());
//    }
//
//
//    Map<Long, Breathalyser> breathalyserMap = new HashMap<>();
//
//    @RequestMapping(value = "/breathalyserForm", method = RequestMethod.GET)
//    public ModelAndView showForm() {
//        return new ModelAndView("breathalyserForm", "breathalyserForm", new Breathalyser());
//    }
//
//    @RequestMapping(value = "/breathalyserForm/{Id}", produces = { "application/json", "application/xml" }, method = RequestMethod.GET)
//    public @ResponseBody
//    Breathalyser getBreathalyserById(@PathVariable final long Id) {
//        return breathalyserMap.get(Id);
//    }
//
//    @RequestMapping(value = "", method = RequestMethod.POST)
//    public String submit(@Valid @ModelAttribute("breathalyserForm") final Breathalyser breathalyser, final BindingResult result, final ModelMap model) {
//        if (result.hasErrors()) {
//            return "breathalyserError";
//        }
//        model.addAttribute("quantity", breathalyser.getQuantity());
//        model.addAttribute("typ", breathalyser.getTyp());
//        model.addAttribute("id", breathalyser.getId());
//        breathalyserMap.put(breathalyser.getId(), breathalyser);
//        return "breathalyserResult";
//    }



    @RequestMapping(value = {"/breathalyserForm"}, method = RequestMethod.GET)
    public String getBreathalyser(Model model) {
        model.addAttribute("breathalyserForm", new Breathalyser());
        // initializeFormValues(model);
        return "breathalyserForm";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String postBreathalyser(@Valid @ModelAttribute("breathalyserForm") Breathalyser breathalyser
            , SessionStatus status, BindingResult result, ModelMap model, HttpServletRequest request) {
        if (result.hasErrors()) {
            return "breathalyserError";
        }
        String aMessage = "Hello World MVC!";

        status.setComplete();
        System.out.println("ilość " + breathalyser.getQuantity());
        model.addAttribute("quantity", breathalyser.getQuantity());
        model.addAttribute("typ", breathalyser.getTyp());
        model.addAttribute("procent", breathalyser.getProcent());
        model.addAttribute("massage", aMessage);
        return "redirect:breathalyserResult";
        //return breathalyser.displayResult();
    }




//    @RequestMapping( value="", method = RequestMethod.POST)
//    public String postBreathalyser(Breathalyser breathalyser) {
//        System.out.println("ilość " + breathalyser.getQuantity());
//        return "redirect:breathalyserResult";
//        //return breathalyser.displayResult();
//    }

//    @RequestMapping(value="/breathalyserResult",method=RequestMethod.GET)
//    public String developersList(Model model) {
//        model.addAttribute("breathalyserForm");
//        return "breathalyserResult";
//    }

//    @RequestMapping(value = {""}, method = RequestMethod.GET)
//    public ModelAndView postBreathalyser( @Valid @ModelAttribute("breathalyserForm") Breathalyser breathalyser, BindingResult resul,
//                                          HttpServletRequest request,
//                                      HttpServletResponse response) throws ServletException, IOException {
//
//        String aMessage = "Hello World MVC!";
//
//        ModelAndView modelAndView = new ModelAndView("redirect:breathalyserResult");
//        modelAndView.addObject("message", aMessage);
//        modelAndView.addObject("quantity", breathalyser.getQuantity());
//
//        return modelAndView;
//    }

//    @RequestMapping(value = "/breathalyserResult", method = RequestMethod.GET)
//    public String breathalyserResult(Model model)
//    {
//        return "breathalyserResult";
//    }

//    @RequestMapping(value = {"/breathalyserResult"}, method = RequestMethod.POST, params="count")
//    public String postBreathalyser(Breathalyser breathalyser) {
//       return "redirect:breathalyserResult";
//       //return breathalyser.displayResult();
//    }

//    @RequestMapping(value = "/breathalyserResult", method = RequestMethod.GET)
//    public String breathalyserResult(Model model)
//    {
//        return "breathalyserResult";
//    }

//    @RequestMapping(method = RequestMethod.POST)
//    public String add(@Valid Breathalyser breathalyser, BindingResult result) {
//        if (result.hasErrors()) {
//            return "breathalyserForm";
//        }
//        breathalyser.displayResult();
//        return "redirect:/breathalyserResult";
//    }
//    @RequestMapping(value = "/breathalyserResult", method = RequestMethod.GET)
//    public String success(Model model)
//    {
//        return "breathalyserResult";
//    }


//    @RequestMapping(params = "count", method = RequestMethod.POST)
//    public String posttBreathalyser(HttpServletRequest request) {
//        return "redirect:/breathalyserResult";
//    }

//    private void initializeFormValues(Model model) {
////        List<String> courses = new ArrayList<String>();
////        courses.add("Java");
////        courses.add("J2EE");
////        courses.add("Spring");
////        courses.add("Hibernate");
////        courses.add("Jquery");
////        model.addAttribute("courses", courses);
//
//        List<String> genders = new ArrayList<String>();
//        genders.add("Male");
//        genders.add("Female");
//        model.addAttribute("genders", genders);
//    }
}

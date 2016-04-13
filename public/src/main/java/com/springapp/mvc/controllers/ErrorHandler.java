package com.springapp.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorHandler {

    @RequestMapping(value = "/403")
    public String error400() {
        System.out.println("custom error handler(error 403)");
        return "../errorPages/error-403";
    }

    @RequestMapping(value = "/404")
    public String error404() {
        System.out.println("custom error handler(error 404)");
        return "../errorPages/error-404";
    }

    @RequestMapping(value = "/500")
    public String error500() {
        System.out.println("custom error handler(error 500)");
        return "../errorPages/error-500";
    }
}

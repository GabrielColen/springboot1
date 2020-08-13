package com.eventoapp.eventoapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;


public class indexController {

    @RequestMapping("/")
    public String index(){

        return "index";
        //teste
    }
}

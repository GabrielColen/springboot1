package com.eventoapp.eventoapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;

@Controller
public class indexController {

    @RequestMapping("/")
    public String index(){

        return "index";
    }
}

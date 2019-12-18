package com.camaraderiesgo.netflix.servicesaludar;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.Inet4Address;

@RestController
public class ServiceSaludarController {

    private static final String TEMPLATE = "Hola, %s IP %s !";

    private String service;

    @RequestMapping("/saludar/{name}")
    public String  saludar(@PathVariable("name") String name){
        try{
            service = Inet4Address.getLocalHost().getHostAddress();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return "1 Hola " + name + "hola desde la ip " + service ;
    }


}

package be.ehb.demofragements.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NavigationController {

    @RequestMapping(method = RequestMethod.GET, value = {"" , "/index"})
    public  String showIndex(){
        return "index";
    }

    @RequestMapping(method = RequestMethod.GET , value = "/about")
    public String showAbout(){
        return "about";
    }
}

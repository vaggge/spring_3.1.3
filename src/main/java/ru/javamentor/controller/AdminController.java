package ru.javamentor.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@RequestMapping("/admin")
@SessionAttributes({"isVisible", "id"})
public class AdminController {

    @RequestMapping(method = RequestMethod.GET)
    public String printUsers(ModelMap modelMap, Authentication authentication) {
        return "users";
    }

}

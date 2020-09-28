package org.launchcode.online.seller.organizer.controllers;

import org.launchcode.online.seller.organizer.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping
    public String displayHello() {
        return "index";
    }
}

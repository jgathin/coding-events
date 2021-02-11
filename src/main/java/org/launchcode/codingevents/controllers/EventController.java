package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    @GetMapping
    public String displayAlLEvents(Model model){
        List<String> events = new ArrayList<>();
        events.add("Juneteenth");
        events.add("Cinco de Mayo");
        events.add("Soul Roll");
        events.add("Rolling in the Carolinas");
        model.addAttribute("events", events);
        return "events/index";

    }
}

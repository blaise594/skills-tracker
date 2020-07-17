package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {
    //TODO: At localhost:8080, add text that states the three possible programming languages someone could be working on.
    // You need to have an h1 with the title “Skills Tracker”, an h2, and an ol containing three programming languages of your choosing.
    @RequestMapping(value="")
    //@RequestMapping(value = "displaySkills", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String displaySkills(){
        String html="<h1>Skills Tracker</h1>" +
                "<h2>Some subtitle goes here</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>PHP</li>" +
                "<li>C++</li>" +
                "</ol>";
        return html;
    }


    //TODO: At localhost:8080/form, add a form that lets the user enter their name and choose their favorite, second favorite,
    // and third favorite programming languages on your list. Use select elements for each of the rankings.
    // Just as with the exercises, we will use @GetMapping().
    @GetMapping(value="form")
    @ResponseBody
    public String displayFormSkills(){
        String html="<form method='post'>" +
                        "Name:<br><input type = 'text' name = 'name' />" +
                        "<input type = 'submit' value = 'Submit' />" +
                    "</form>";
        return html;
    }
    //TODO: Also at localhost:8080/form, use @PostMapping and @RequestParam to update the HTML with an h1 stating the user’s name and
    // an ol showing the three programming languages in the order they chose
    @PostMapping(value="form")
    @ResponseBody
    public String namepage(@RequestParam String name){
    String html = "<h1>"+name+"</h1>";
    return html;
    }

}

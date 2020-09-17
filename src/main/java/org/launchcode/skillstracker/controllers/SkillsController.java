package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping("/")
    @ResponseBody
    public String skillsTracker() {
        return "<h1> Skills Tracker</h1>" +
                    "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                        "<ol>" +
                            "<li>Java</li>" +
                            "<li>JavaScript</li>" +
                            "<li>Python</li>" +
                        "</ol>";
    }


    @GetMapping("/form")
    @ResponseBody
    public String skillsForm() {
        return "<form method='post' action='form'>" +
                    "<label> Name: </label><br/>" +
                        "<input type='text' name='name'><br/>" +
                    "<label> My favorite language: </label><br/>" +
                        "<select name='firstFav'>" +
                            "<option value='Java'>Java</option>" +
                            "<option value='JavaScript'>JavaScript</option>" +
                            "<option value='Python'>Python</option>" +
                        "</select><br/>" +
                    "<label> My second favorite language: </label><br />" +
                        "<select name='secondFav'>" +
                            "<option value='Java'>Java</option>" +
                            "<option value='JavaScript'>JavaScript</option>" +
                            "<option value='Python'>Python</option>" +
                        "</select><br/>" +
                    "<label> My third favorite language: </label><br />" +
                        "<select name='thirdFav'>" +
                            "<option value='Java'>Java</option>" +
                            "<option value='JavaScript'>JavaScript</option>" +
                            "<option value='Python'>Python</option>" +
                        "</select><br/>" +
                    "<input type='submit' value='Submit'>" +
                "</form>";
    }


    @PostMapping("/form")
    @ResponseBody
    public String processForm(@RequestParam String name, @RequestParam String firstFav,
                              String secondFav, String thirdFav) {
        return "<h1>" + name + "</h1>" +
                    "<ol>" +
                        "<li>" + firstFav + "</li>" +
                        "<li>" + secondFav + "</li>" +
                        "<li>" + thirdFav + "</li>" +
                    "</ol>";
    }

}

package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String lang(){
        return "<html>" +
                "" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    @ResponseBody
    public String form(){
        return "<html>" +
                "<body>" +
                "<form action = 'learn' method = 'post'>" +  // submit a request to /hello
                "<label>Name</label><br>" +
                "<input type='text' name='name' /><br>" +
                "<label>My Favorite Language</label><br>" +
                "<select name='lang1'>" +
                "  <option value='Java'>Java</option>" +
                "  <option value='JavaScript'>JavaScript</option>" +
                "  <option value='Python'>Python</option>" +
                "</select><br>" +
                "<label>My Second Favorite Language</label><br>" +
                "<select name='lang2'>" +
                "  <option value='Java'>Java</option>" +
                "  <option value='JavaScript'>JavaScript</option>" +
                "  <option value='Python'>Python</option>" +
                "</select><br>" +
                "<label>My Third Favorite Language</label><br>" +
                "<select name='lang3'>" +
                "  <option value='Java'>Java</option>" +
                "  <option value='JavaScript'>JavaScript</option>" +
                "  <option value='Python'>Python</option>" +
                "</select><br>" +
                "<input type = 'submit' value = 'Submit' >" +
                "</select>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("learn")
    @ResponseBody
    public String learn(@RequestParam String name,@RequestParam String lang1,@RequestParam String lang2,@RequestParam String lang3){
        return "<html>" +
                "<h1>"+name+ "</h1>" +
                "<ol>" +
                "<li> " + lang1+ "</li>" +
                "<li> " + lang2+ "</li>" +
                "<li> " + lang3+ "</li>" +
                "</ol>" +
                "</html>";
    }


}

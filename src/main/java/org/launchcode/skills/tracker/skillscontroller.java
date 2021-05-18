package org.launchcode.skills.tracker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping
class skillsController {
    @GetMapping
    public String printScreen(){
        return "<html>" +
                        "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>We have a few skills we would like to learn. Here is the list!<h2>" +
                        "<ol>" +
                        "<li>Java</li>" +
                        "<li>JavaScript</li>" +
                        "<li>Python</li>" +
                        "</ol>" +
                        "</body>" +
                        "</html>";

    }
@GetMapping(value="form")
    public String printForm(){
        return "<html>" +
                "<body>" +
                "<form action='/printFormPage' method='post'>" +
                "<label>Name:" +
                "<div><input type='text' name='name'></label></div>" +
                "<label>My favorite language:" +
                "<div><select name='firstLang'>" +
                "<option value='java'>Java</option>" +
                "<option value='python'>Python</option>" +
                "<option value='cSharp'>C#</option>" +
                "<option value='javaScript'>JavaScript</option>" +
                "<option value='html'>HTML</option>" +
                "</select><div>" +
                "<label>My 2nd favorite language:" +
                "<div><select name='secondLang'>" +
                "<option value='java'>Java</option>" +
                "<option value='python'>Python</option>" +
                "<option value='cSharp'>C#</option>" +
                "<option value='javaScript'>JavaScript</option>" +
                "<option value='html'>HTML</option>" +
                "</select><div>" +
                "<label>My 3rd favorite language:" +
                "<div><select name='thirdLang'>" +
                "<option value='java'>Java</option>" +
                "<option value='python'>Python</option>" +
                "<option value='cSharp'>C#</option>" +
                "<option value='javaScript'>JavaScript</option>" +
                "<option value='html'>HTML</option>" +
                "</select><div>" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";

}
    @PostMapping("printFormPage")
    public String printFormSubmit(@RequestParam String name, String firstLang, String secondLang, String thirdLang) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>"+ firstLang +"</li>" +
                "<li>"+ secondLang +"</li>" +
                "<li>"+ thirdLang +"</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
}




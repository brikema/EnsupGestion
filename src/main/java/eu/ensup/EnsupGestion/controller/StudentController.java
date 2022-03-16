package eu.ensup.EnsupGestion.controller;

import eu.ensup.EnsupGestion.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpSession;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/toto")
    public String testPage(@ModelAttribute StudentService studentService, HttpSession session) {
        return "redirect:/toto";
    }
}

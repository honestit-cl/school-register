package pl.robertprzydatek.register.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.robertprzydatek.register.dtos.AddStudentDto;
import pl.robertprzydatek.register.models.Student;
import pl.robertprzydatek.register.services.AddStudentService;

import javax.validation.Valid;

@Controller
@RequestMapping("/addStudent")
public class AddStudentController {
    @Autowired
    private AddStudentService addStudentService;

    @GetMapping
    public String showRegistrationPage(Model model) {
        model.addAttribute("student", new AddStudentDto());
        return "addStudent";
    }


    @PostMapping
    public String processRegistrationForm(@ModelAttribute("student") @Valid AddStudentDto form,
                                          BindingResult results, Model model) {
        if(results.hasErrors()){
            return "addStudent";
        }

        addStudentService.addUser(form);

        return "redirect:/addStudent";
    }
}





package pl.robertprzydatek.register.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.robertprzydatek.register.models.Student;
import pl.robertprzydatek.register.repositories.StudentRepository;

import java.util.List;

@Controller
public class ViewController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/view")
    public String getView(Model model){
        List<Student> students = studentRepository.loadAll();



        model.addAttribute("students", students);

        return "view";

    }
}

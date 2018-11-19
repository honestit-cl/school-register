package pl.robertprzydatek.register.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.robertprzydatek.register.dtos.AddStudentDto;
import pl.robertprzydatek.register.models.Student;
import pl.robertprzydatek.register.repositories.GuardianRepository;
import pl.robertprzydatek.register.repositories.StudentRepository;


@Service
@Transactional
public class AddStudentService {


    @Autowired
    StudentRepository studentRepository;

    public void addUser(AddStudentDto form) {

        String firstName = form.getFirstName();
        String lastName = form.getLastName();



        Student student =  new Student();
        student.setFirstName(firstName);
        student.setLastName(lastName);

        studentRepository.save(student);




    }


}

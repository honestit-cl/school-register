package pl.robertprzydatek.register.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.robertprzydatek.register.models.Student;

import java.util.List;

public interface StudentRepository extends JpaRepository <Student,Long> {

    @Query("select s from Student s")
    List<Student> loadAll();
}

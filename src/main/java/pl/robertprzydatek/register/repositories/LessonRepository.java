package pl.robertprzydatek.register.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.robertprzydatek.register.models.Lesson;

public interface LessonRepository extends JpaRepository <Lesson,Long> {

}

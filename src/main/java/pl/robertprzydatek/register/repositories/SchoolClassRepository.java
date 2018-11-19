package pl.robertprzydatek.register.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.robertprzydatek.register.models.SchoolClass;

public interface SchoolClassRepository extends JpaRepository<SchoolClass,Long> {

}

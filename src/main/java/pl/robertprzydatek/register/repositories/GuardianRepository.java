package pl.robertprzydatek.register.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.robertprzydatek.register.models.Guardian;

public interface GuardianRepository extends JpaRepository<Guardian,Long> {
}

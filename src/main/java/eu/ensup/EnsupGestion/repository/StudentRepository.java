package eu.ensup.EnsupGestion.repository;

import eu.ensup.EnsupGestion.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findAllByUsername(String username);
}

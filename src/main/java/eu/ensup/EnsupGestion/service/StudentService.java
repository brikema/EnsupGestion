package eu.ensup.EnsupGestion.service;

import eu.ensup.EnsupGestion.domain.Student;
import eu.ensup.EnsupGestion.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class StudentService{

    @Autowired
    private StudentRepository studentRepository;

    public Iterable<Student> getAll(){
        return studentRepository.findAll();
    }

    public boolean save(Student student) {
        return studentRepository.save(student) != null;
    }
}

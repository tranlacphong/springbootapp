package demo.phuctt.api.service;

import demo.phuctt.api.model.*;
import demo.phuctt.api.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public List<Student> readStudents() {
        return studentRepository.findAll();
    }

    public Student getStudent(Long id) throws UserNotFoundException {
        Optional<Student> studentData = studentRepository.findById(id);
        if (studentData.isPresent()) {
            return studentData.get();
        }
        throw new UserNotFoundException("Not found");
    }

    public Student createStudent(Student s) {
        return studentRepository.save(s);  
    }

    public Student updateStudent(Long id, Student s) throws UserNotFoundException {
        Optional<Student> studentData = studentRepository.findById(id);
        if (studentData.isPresent()) {
            Student _student = studentData.get();
            _student.setName(s.getName());
            _student.setDob(s.getDob());
            return studentRepository.save(_student);
        }
        throw new UserNotFoundException("Not found");
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}

package edu.icet.Assignment.service;

import edu.icet.Assignment.dao.StudentEntity;
import edu.icet.Assignment.dto.Student;
import edu.icet.Assignment.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Value("${student.institute}")
    String instituteName;
    @Autowired
    StudentRepository studentRepository;

    public Iterable<StudentEntity> findAllByStudentName(String studentName){
        return studentRepository.findAllByStudentName(studentName);
    }

    public Iterable<StudentEntity> retrieveAllStudent(){
        return studentRepository.findAll();
    }

    public void registerStudent(Student student) {

        //  DTO-->DAO transformation= model mapping

        StudentEntity entity = new StudentEntity();

        entity.setStudentName(student.getStudentName());
        entity.setStudentAge(student.getStudentAge());
        entity.setStudentContact(student.getStudentContact());
        entity.setInstituteName(instituteName);

        entity.setGuardianName(student.getGuardianName());
        entity.setGuardianAddress(student.getGuardianAddress());
        entity.setGuardianContact(student.getGuardianContact());

        studentRepository.save(entity);
    }

}

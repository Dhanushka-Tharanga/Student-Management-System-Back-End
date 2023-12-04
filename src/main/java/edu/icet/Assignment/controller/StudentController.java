package edu.icet.Assignment.controller;

import edu.icet.Assignment.dao.StudentEntity;
import edu.icet.Assignment.service.StudentService;
import edu.icet.Assignment.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/student")
@CrossOrigin

public class StudentController {

    @Autowired  
    StudentService studentService;

    @GetMapping("/{firstName}")
    public Iterable<StudentEntity> findByStudentName(@PathVariable String studentName){
            return studentService.findAllByStudentName(studentName);
    }

    @GetMapping
    public Iterable<StudentEntity> retrieveAllStudent(){
            return studentService.retrieveAllStudent();
    }


    @PostMapping
    public void createStudent(@RequestBody Student student){
            studentService.registerStudent(student);
    }

}

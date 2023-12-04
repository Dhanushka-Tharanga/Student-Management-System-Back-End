package edu.icet.Assignment.service;

import edu.icet.Assignment.dao.StudentEntity;
import edu.icet.Assignment.dto.Student;

public interface StudentService {

    public void registerStudent(Student student);

    public Iterable<StudentEntity> retrieveAllStudent();

    public Iterable<StudentEntity> findAllByStudentName(String studentName);
}

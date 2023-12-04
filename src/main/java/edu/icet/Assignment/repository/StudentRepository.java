package edu.icet.Assignment.repository;

import edu.icet.Assignment.dao.StudentEntity;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<StudentEntity,Long> {

 Iterable<StudentEntity> findAllByStudentName(String studentName);

}

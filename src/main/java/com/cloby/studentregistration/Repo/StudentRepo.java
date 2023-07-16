package com.cloby.studentregistration.Repo;

import com.cloby.studentregistration.Entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public class StudentRepo extends MongoRepository<Student, String> {
}

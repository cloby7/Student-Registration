package com.cloby.studentregistration.Controller;

import com.cloby.studentregistration.Entity.Student;
import com.cloby.studentregistration.Service.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/student")
public class StudentController {

    @Autowired
    private StudentServices studentServices;

    @PostMapping(value = "/save")
    public String saveStudent(@RequestBody Student students)
    {
        studentServices.saveorUpdate(students);
        return students.get_id();
    }

    @GetMapping(value = "/getAll")
    public Iterable<Student>getStudents()
    {

        return studentServices.listAll();
    }

}

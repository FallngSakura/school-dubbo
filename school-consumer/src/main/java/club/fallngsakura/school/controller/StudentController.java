package club.fallngsakura.school.controller;

import club.fallngsakura.school.entity.Student;
import club.fallngsakura.school.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeoutException;

/**
 * @author MISAKI RINNE
 */
@RestController
public class StudentController {

    /**
     *  学生实现类
     */
    @Autowired
    private StudentService studentService;

    /**
     * 获取学生信息
     * @param id
     * @return
     * @throws TimeoutException
     */
    @GetMapping("/getStudent/{id}")
    public Student getStudent(@PathVariable Integer id) throws TimeoutException {
        return studentService.initStudent(id);
    }

    @GetMapping("/hello")
    public boolean hello(){
        return studentService == null;
    }

}

package club.fallngsakura.school.service.impl;

import club.fallngsakura.school.entity.Student;
import club.fallngsakura.school.service.SchoolService;
import club.fallngsakura.school.service.StudentService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;

import java.util.concurrent.TimeoutException;

/**
 * @author MISAKI RINNE
 */

@Service()
@org.springframework.stereotype.Service
public class StudentServiceImpl implements StudentService {

    @Reference
    SchoolService schoolService;

    @Override
    public Student initStudent(Integer id) throws TimeoutException {
        return schoolService.getStudentById(id);
    }
}

package club.fallngsakura.school.service;

import club.fallngsakura.school.entity.Student;

import java.util.concurrent.TimeoutException;

/**
 * @author MISAKI RINNE
 */
public interface SchoolService {

    /**
     * 获取学生信息
     * @param id
     * @return
     */
    public Student getStudentById(Integer id) throws TimeoutException;

}

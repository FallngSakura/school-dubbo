package club.fallngsakura.school.service;

import club.fallngsakura.school.entity.Student;

import java.util.concurrent.TimeoutException;

/**
 * @author MISAKI RINNE
 */
public interface StudentService {

    /**
     * 初始化学生
     * @param id
     * @return
     */
    public Student initStudent(Integer id) throws TimeoutException;
}

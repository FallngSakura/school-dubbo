package club.fallngsakura.school.service.impl;

import club.fallngsakura.school.entity.Student;
import club.fallngsakura.school.service.SchoolService;

/**
 * @author MISAKI RINNE
 */

@org.apache.dubbo.config.annotation.Service()
public class SchoolServiceImpl implements SchoolService {


    @Override
    public Student getStudentById(Integer id){
        if(id.equals(1)){
            return new Student("小明",id );
        }

        if(id.equals(2)){
            return new Student("小张",id );
        }

        throw new RuntimeException("id错误");
    }
}

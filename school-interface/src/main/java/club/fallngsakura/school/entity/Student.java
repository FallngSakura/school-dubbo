package club.fallngsakura.school.entity;

import java.io.Serializable;

/**
 * @author MISKAI RENNE
 */
public class Student implements Serializable {

    /**
     * 学生id
     */
    private Integer studentId;

    /**
     * 学生名称
     */
    private String studentName;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Student(){}

    public Student(String studentName , Integer studentId){
        this.studentId=studentId;
        this.studentName=studentName;
    }
}

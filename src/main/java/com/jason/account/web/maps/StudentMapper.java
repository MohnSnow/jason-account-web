package com.jason.account.web.maps;

import com.jason.account.web.entity.StudentEntity;

import java.util.List;

/**
 * Created by MengDexin.
 * Date : 17/9/20.
 * Time : 13:04.
 */
public interface StudentMapper {
    public StudentEntity getStudent(String studentID);

    public StudentEntity getStudentAndClass(String studentID);

    public List<StudentEntity> getStudentAll();

    public void insertStudent(StudentEntity entity);

    public void deleteStudent(StudentEntity entity);

    public void updateStudent(StudentEntity entity);
}

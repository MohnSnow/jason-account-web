package com.jason.account.web.maps;

import com.jason.account.web.AbstractTest;
import com.jason.account.web.entity.StudentEntity;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by MengDexin.
 * Date : 17/9/20.
 * Time : 13:18.
 */
public class StudentMapperTest extends AbstractTest {

    @Autowired
    private StudentMapper studentMapper;

    @Transactional
    @Test
    public void getStudent() throws Exception {
        StudentEntity entity = studentMapper.getStudent("10000013");
        System.out.println("" + entity.getStudentID() + entity.getStudentName());
        List<StudentEntity> studentList = studentMapper.getStudentAll();
        for (StudentEntity entityTemp : studentList) {
            System.out.println(entityTemp.getStudentName());

        }
    }
}
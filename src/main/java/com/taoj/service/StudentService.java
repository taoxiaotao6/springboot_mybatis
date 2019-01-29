package com.taoj.service;

import com.taoj.dao.StudentDao;
import com.taoj.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentDao dao;

    public Student findOneStu(int id){
        return dao.findOneStu(id);
    }

}

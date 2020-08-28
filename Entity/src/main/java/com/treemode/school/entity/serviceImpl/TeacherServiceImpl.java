/*

 * Copyright (C) Joffer Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Alok Dethe <dethealok@gmail.com>, <det.alex0110@gmail.com>, July 2020

 */
package com.treemode.school.entity.serviceImpl;

import com.treemode.school.entity.model.Teacher;
import com.treemode.school.entity.repository.TeacherRepository;
import com.treemode.school.entity.service.TeacherService;
import java.util.Optional;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 *
 * @author alokdethe
 */
@Service
public class TeacherServiceImpl implements TeacherService {

    @Resource
    private TeacherRepository teacherRepo;
    
    @Override
    public Optional<Teacher> getTeacherById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Teacher saveTeacher(Teacher teacher) {
        return teacherRepo.saveAndFlush(teacher);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

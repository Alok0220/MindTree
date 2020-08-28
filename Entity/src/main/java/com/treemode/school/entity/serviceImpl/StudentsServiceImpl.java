/*

 * Copyright (C) Joffer Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Alok Dethe <dethealok@gmail.com>, <det.alex0110@gmail.com>, July 2020

 */
package com.treemode.school.entity.serviceImpl;

import com.treemode.school.entity.model.Students;
import com.treemode.school.entity.repository.StudentsRepository;
import com.treemode.school.entity.service.StudentsService;
import java.util.Optional;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 *
 * @author alokdethe
 */
@Service
public class StudentsServiceImpl implements StudentsService {

    @Resource
    private StudentsRepository studentsRepo;
    
    @Override
    public Optional<Students> getStudentsById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Students saveStudents(Students students) {
        return studentsRepo.saveAndFlush(students);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

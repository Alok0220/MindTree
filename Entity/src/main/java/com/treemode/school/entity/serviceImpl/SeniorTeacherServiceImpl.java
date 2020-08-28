/*

 * Copyright (C) Joffer Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Alok Dethe <dethealok@gmail.com>, <det.alex0110@gmail.com>, July 2020

 */
package com.treemode.school.entity.serviceImpl;

import com.treemode.school.entity.model.SeniorTeacher;
import com.treemode.school.entity.repository.SeniorTeacherRepository;
import com.treemode.school.entity.service.SeniorTeacherService;
import java.util.Optional;
import javax.annotation.Resource;
import javax.annotation.Resources;
import org.springframework.stereotype.Service;

/**
 *
 * @author alokdethe
 */
@Service
public class SeniorTeacherServiceImpl implements SeniorTeacherService {

    @Resource
    private SeniorTeacherRepository seniorTeacherRepo;
    
    @Override
    public Optional<SeniorTeacher> getSeniorTeacherById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SeniorTeacher saveSeniorTeacher(SeniorTeacher seniorTeacher) {
        return seniorTeacherRepo.saveAndFlush(seniorTeacher);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

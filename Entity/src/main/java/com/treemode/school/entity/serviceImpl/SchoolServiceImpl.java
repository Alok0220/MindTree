/*

 * Copyright (C) Joffer Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Alok Dethe <dethealok@gmail.com>, <det.alex0110@gmail.com>, July 2020

 */
package com.treemode.school.entity.serviceImpl;

import com.treemode.school.entity.model.School;
import com.treemode.school.entity.repository.SchoolRepository;
import com.treemode.school.entity.service.SchoolService;
import java.util.Optional;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 *
 * @author alokdethe
 */
@Service
public class SchoolServiceImpl implements SchoolService {

    @Resource
    private SchoolRepository schoolRepo;
    
    @Override
    public Optional<School> getSchoolById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public School saveSchool(School school) {
        return schoolRepo.saveAndFlush(school);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

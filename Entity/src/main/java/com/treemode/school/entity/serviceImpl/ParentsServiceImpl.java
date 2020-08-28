/*

 * Copyright (C) Joffer Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Alok Dethe <dethealok@gmail.com>, <det.alex0110@gmail.com>, July 2020

 */
package com.treemode.school.entity.serviceImpl;

import com.treemode.school.entity.model.AsstPrincipal;
import com.treemode.school.entity.model.Parents;
import com.treemode.school.entity.repository.ParentsRepository;
import com.treemode.school.entity.service.ParentsService;
import java.util.Optional;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author alokdethe
 */
@Service
public class ParentsServiceImpl implements ParentsService {
    
    @Resource
    private ParentsRepository parentsRepo;
    
    

    @Override
    public Optional<Parents> getParentsById(Long id) {
        
        Optional<Parents> parents = parentsRepo.getParentsById(id);
        
        return parents;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Parents saveParents(Parents parents) {
        return parentsRepo.saveAndFlush(parents);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    
}

/*

 * Copyright (C) Joffer Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Alok Dethe <dethealok@gmail.com>, <det.alex0110@gmail.com>, July 2020

 */
package com.treemode.school.entity.service;

import com.treemode.school.entity.model.AsstPrincipal;
import com.treemode.school.entity.model.Parents;
import java.util.Optional;

/**
 *
 * @author alokdethe
 */
public interface ParentsService {
    
    public Optional<Parents> getParentsById(Long id);
    
    public Parents saveParents(Parents parents);
}

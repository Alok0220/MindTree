/*

 * Copyright (C) Joffer Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Alok Dethe <dethealok@gmail.com>, <det.alex0110@gmail.com>, July 2020

 */
package com.treemode.school.entity.repository;

import com.treemode.school.entity.model.AsstPrincipal;
import com.treemode.school.entity.model.Students;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author alokdethe
 */
@Repository
public interface StudentsRepository extends JpaRepository<Students, Long> {
    
    @Query( value = "SELECT * FROM MST_STUDENTS WHERE ID = :id", nativeQuery = true )
    public Optional<Students> getStudentsById(@Param("id") long id);
    
    
}

/*

 * Copyright (C) Joffer Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Alok Dethe <dethealok@gmail.com>, <det.alex0110@gmail.com>, July 2020

 */
package com.treemode.school.administrator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author alokdethe
 */
@SpringBootApplication
public class AdministratorApplication {
    
    public static void main(String[] args){
        try{
            SpringApplication.run(AdministratorApplication.class, args);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tabdeal;

import com.tabdeal.Entite.Categorie;
import com.tabdeal.Service.ServiceCategorie;

/**
 *
 * @author SBS
 */
public class MainClass {
    public static void main(String[] args) {
        
        ServiceCategorie cat = new ServiceCategorie();
        Categorie c = new Categorie(2,"book");
        cat.ajouter2(c);
        System.out.println(cat.readAll());
        
    }
    
}
    


package com.sistema.sistema.controllers;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Liderado extends Pessoa{

    @Id
    private int id;


    private int geradorDeID(){
      
 return id;
    }
}

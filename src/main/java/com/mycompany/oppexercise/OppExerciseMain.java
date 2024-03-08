/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oppexercise;

import com.mycompany.oppexercise.model.Carro;
import com.mycompany.oppexercise.model.Moto;
import com.mycompany.oppexercise.model.Vehiculo;
import java.awt.Desktop.Action;
import java.util.ArrayList;
import java.util.List;
import services.Actions;

/**
 *
 * @author HP
 */
public class OppExerciseMain {

    public static void main(String[] args) {
        List<Vehiculo> lista = new ArrayList<>();
        
        Vehiculo carro = new Carro();
        carro.setPlaca ("GHI234");
        lista.add(carro);
        
        Vehiculo moto = new Moto ();
        moto.setPlaca ("GHI234");
         lista.add(moto);
         
         
       

         
             
         
         }
        
        
                
        
        
        
        
    }


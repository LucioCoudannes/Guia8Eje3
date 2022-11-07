/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author A288808
 */
public class AlumnoService {
    
    Scanner leer = new Scanner(System.in);
    
    
    public Alumno crearalumno(){
        
        Alumno a = new Alumno();
        ArrayList<Integer> not = new ArrayList();
        System.out.println("Ingrese el nombre del Alumno");
        a.setNombre(leer.next());
        for (int i = 0; i < 3; i++) {
            
            System.out.println("Ingrese las nota");
            not.add(leer.nextInt());
            
        }
        
        a.setNotas(not);
        
        
        
     return a;   
    }
    
    public void notafinal(ArrayList<Alumno> listaAlumnos){
        
        Integer notaTotal = 0;
        Alumno x = this.buscarA(listaAlumnos);
        
        for (Integer n :  x.getNotas()) {
            
            notaTotal += n;
            System.out.println(notaTotal);
            
        }
       
        System.out.println("El promedio del alumno es " + notaTotal/3);
        
        
        
    }
    
    public Alumno buscarA(ArrayList<Alumno> listaAlumnos){
        
     Alumno b = new Alumno();   
      
     Iterator <Alumno> it = listaAlumnos.iterator();
        String nombreA;
        ArrayList<Integer> n = new ArrayList();
        System.out.println("ingrese el nombre del alumno a buscar");
        nombreA = leer.next();
        while(it.hasNext()){
            
            if(it.next().getNombre().equalsIgnoreCase(nombreA)){
              b.setNombre(nombreA);
            }
            for (int i = 0; i < listaAlumnos.size(); i++) {
                if(listaAlumnos.get(i).getNombre().equals(b.getNombre())){
                    for (int j = 0; j < listaAlumnos.get(i).getNotas().size(); j++) {
                     n.add(listaAlumnos.get(i).getNotas().get(j));
                    }
                    
                    
                }
            } 
            b.setNotas(n);
        }
     
     return b;   
    }
    

    
}

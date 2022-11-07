/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8eje3;

import Entidades.Alumno;
import Servicios.AlumnoService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author A288808
 */
public class Guia8Eje3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        AlumnoService as = new AlumnoService();
        ArrayList<Alumno> listaAlumnos = new ArrayList();
        String respuesta;
        
        do {
           
            listaAlumnos.add(as.crearalumno());
            
            System.out.println("desea ingresar otro alumno");
            respuesta = leer.next();
            
        } while (respuesta.equalsIgnoreCase("s"));
        
        
        as.notafinal(listaAlumnos);
        


        
    } 
    
}

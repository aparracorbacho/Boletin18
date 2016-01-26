/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnosnotas;

import java.util.Scanner;

/**
 *
 * @author aparracorbacho
 */
public class MetodosAlumnos {
    int []notas = new int[30];
    String []nAlumnos = {"aa","bb","cc","dd","ee","ff","gg","hh","ii","jj","kk","ll","mm","nn","oo","pp","qq","rr","ss","tt","uu","vv","ww","xx","yy","zz","ab","cd","ef","gh"};
    
    public void notas(){
        for (int i=0;i<notas.length;i++){
            notas[i]=(int)(Math.random()*10+1);            
        }
    }
        
   public void stats(){
       int aprobados=0;
       int suspensos=0;
       int media=0;
       int nalta=0;
   
       for (int i=0;i<notas.length;i++){
            if (notas[i]>5){ aprobados = aprobados +1; }
            if (notas[i]<5){ suspensos = suspensos +1; }
            if (notas[i]>nalta){ nalta = notas[i]; }
            media = media + notas[i];
       }
       media = media/notas.length;
       System.out.println("Estadisticas de clase:\nAprobados: "+aprobados+"\nSuspensos: "+suspensos+"\nMedia: "+media+"\nNota mas alta: "+nalta);
   }
   
   public void stats2(){
       System.out.println("\nLista de alumnos aprobados");
       for (int i=0;i<notas.length;i++){
           if (notas[i]>5) { System.out.print(nAlumnos[i]+":"+notas[i]+", "); }
       }
       System.out.println("\n\nVisualizamos el nombre y la nota del alumno 13 >> "+nAlumnos[12] +": "+notas[12] +"\n");      
       System.out.println("Indica el nombre del alumno que quieres visualizar la nota");
        Scanner pAlumnoTeclado = new Scanner(System.in);
        String pAlumno = pAlumnoTeclado.next();
        for (int i=0;i<notas.length;i++){
            if (nAlumnos[i].equalsIgnoreCase(pAlumno)) { System.out.println("El alumno "+nAlumnos[i] + " tiene de nota "+notas[i]); }
        }
        System.out.println("\nOrdenamos a los alumnos por nota");
        for (int i=0;i<(notas.length-1);i++){
            int aux1=0;
            String aux2;
            if (notas[i]>notas[i+1]){
                aux1 = notas[i+1];
                aux2 = nAlumnos[i+1];
                
                notas[i+1]=notas[i];
                nAlumnos[i+1]=nAlumnos[i];
                
                notas[i]=aux1;
                nAlumnos[i]=aux2;
            }
        }
        
        for (int i=0;i<notas.length;i++){
            System.out.print(nAlumnos[i] +":"+notas[i]+", ");
        }
        
   }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

/**
 *
 * @author aparracorbacho
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int []numeros = new int[6];
        // int []numeros={0,1,2,3,4,5}
        for (int i=0;i<numeros.length;i++){
            numeros[i]=(int)(Math.random()*50+1);            
        }
       for (int i=(numeros.length-1);i>=0;i--){
           System.out.println(numeros[i]);            
       }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

/**
 *
 * @author ASUS
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        Escuela f1 = new Escuela("Juan Pablo", 7.1, 9.9, 6.1);
        f1.establecerNombreEstudiante("Nixon");
        f1.establecerPromedio();
        System.out.printf("%s\n",f1);
    }
}

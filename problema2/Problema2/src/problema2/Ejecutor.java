/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

/**
 *
 * @author ASUS
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        Profesores s1 = new Profesores("Juan","Salazar", 350.00, "1104350810");
        s1.establecerSueldoTotal();
        System.out.printf("%s\n",s1);
    }
}

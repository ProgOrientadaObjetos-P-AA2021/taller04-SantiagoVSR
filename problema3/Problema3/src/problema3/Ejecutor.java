/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

/**
 *
 * @author ASUS
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        Carros car1 = new Carros("1102435274","Nisan", 2005, 25000);
        car1.establecerValordelaMatricula();
        System.out.printf("%s\n",car1);
    }
}

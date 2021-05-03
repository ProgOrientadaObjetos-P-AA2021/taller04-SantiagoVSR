/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema4;

/**
 *
 * @author ASUS
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        Cheques dolar = new Cheques("Alex Gomez","Pichincha", 25500);
        dolar.establecerComiciondelBanco();
        System.out.printf("%s\n",dolar);
    }
}

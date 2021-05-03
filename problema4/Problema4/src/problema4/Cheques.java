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
public class Cheques {

   private String nombredelCliente;
    private String nombredelBanco;
    private double valordelCheque;
    private double comisiondelBanco;
    
    public Cheques(String nomC, String nomB, double valC){
        nombredelCliente= nomC;
        nombredelBanco= nomB;
        valordelCheque= valC;
        
    }

    public void establecerNombredelCliente(String nomC){
        nombredelCliente=nomC;
    }
    
    public void establecerNombredelBanco(String nomB){
        nombredelBanco = nomB;
    }
    
    public void establecerValordelCheque(double valC){
        valordelCheque = valC;
    }
    
    public void establecerComiciondelBanco(){
        comisiondelBanco= valordelCheque * 0.00003;
    }
    
    
    public String obtenerNombredelCliente(){
        return nombredelCliente;
    }
    
    public String obtenerNombredelBanco(){
        return nombredelBanco;
    }
    
    public double obtenerValordelCheque(){
        return valordelCheque;
    }
    
    public double obtenerComiciondelBanco(){
        return comisiondelBanco;
    }
    
    @Override
    public String toString(){
        String dol = String.format("El Cliente %s visita el Banco %s"
                + " para depositar un cheque de %s dolares y el Banco tendra "
                + "una comicion de %s ",obtenerNombredelCliente(), 
                obtenerNombredelBanco(),obtenerValordelCheque(), 
                obtenerComiciondelBanco());
        return dol;
    }
}

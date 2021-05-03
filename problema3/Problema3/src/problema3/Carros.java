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
public class Carros {

    private String ceduladelDueño;
    private String marcadelVehículo;
    private double añodeFabricacion;
    private double valordelVehículo;
    private double valordelaMatricula;
    double añoact = 2021;
    
    public Carros(String celD, String marcaV, double añoF, double valV){
        ceduladelDueño= celD;
        marcadelVehículo= marcaV;
        añodeFabricacion= añoF;
        valordelVehículo= valV;
        
    }

    public void establecerCeduladelDueño(String celD){
        ceduladelDueño=celD;
    }
    
    public void establecerMarcadelVehículo(String marcaV){
        marcadelVehículo = marcaV;
    }
    
    public void establecerAñodeFabricacion(double añoF){
        añodeFabricacion = añoF;
    }
    
    public void establecerValordelVehiculo(double valV){
        valordelVehículo= valV;
    }
    
    public void establecerValordelaMatricula(){
        valordelaMatricula=(valordelVehículo * 0.00002)* (añoact-añodeFabricacion) ;
    }
    
    public String obtenerCeduladelDueño(){
        return ceduladelDueño;
    }
    
    public String obtenerMarcadelVehículo(){
        return marcadelVehículo;
    }
    
    public double obtenerAñodeFabricacion(){
        return añodeFabricacion;
    }
    
    public double obtenerValordelVehiculo(){
        return valordelVehículo;
    }
    
    public double obtenerValordelaMatricula(){
        return valordelaMatricula;
    }
    
    @Override
    public String toString(){
        String p1 = String.format("El carro de marca %s con dueño de numero de cedula %s"
                + " que fue fabricado en el año %s con un valor de %s "
                + "tiene un costo de matricula de: %s \n",obtenerMarcadelVehículo(),
                obtenerCeduladelDueño(), obtenerAñodeFabricacion(), 
                obtenerValordelVehiculo(), obtenerValordelaMatricula());
        return p1;
    }
}

package problema2;

public class Profesores {

    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;
    
    public Profesores(String name, String ape, double sueldoB, String cel){
        nombre= name;
        apellido= ape;
        sueldoBasico= sueldoB;
        cedula= cel;
        
    }

    public void establecerNombre(String name){
        nombre=name;
    }
    
    public void establecerApellido(String ape){
        apellido = ape;
    }
    
    public void establecerSueldoBasico(double sueldoB){
        sueldoBasico = sueldoB;
    }
    
    public void establecerSueldoTotal(){
        sueldoTotal= sueldoBasico + (sueldoBasico * 0.20);
    }
    
    public void establecerCedula(String cel){
        cedula=cel;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerApellido(){
        return apellido;
    }
    
    public double obtenerSueldoBasico(){
        return sueldoBasico;
    }
    
    public double obtenerSueldoTotal(){
        return sueldoTotal;
    }
    
    public String obtenerCedula(){
        return cedula;
    }
    
    @Override
    public String toString(){
        String p1 = String.format("El Docente: %s %s\n"
                + "De numero de cedula %s que gana un sueldo basico de %s y un sueldo total de %s \n",obtenerNombre(), obtenerApellido(),
                obtenerCedula(),obtenerSueldoBasico(), obtenerSueldoTotal());
        return p1;
    }
}

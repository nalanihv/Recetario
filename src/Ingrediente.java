
public class Ingrediente {
     private String nombre;
   private  double peso;
   private boolean salado;
//gettesr setters
    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public double getPeso() {return peso;}

    public void setPeso(double peso) {this.peso = peso;}

    public boolean isSalado() {return salado;}

    public void setSalado(boolean salado) {this.salado = salado;}

//constructor
    public Ingrediente(String nombre, double peso, boolean salado) {
        this.nombre = nombre;
        this.peso = peso;
        this.salado = salado;
        System.out.println("Ingrediente creado");
    }



}

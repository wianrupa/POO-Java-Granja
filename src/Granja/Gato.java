package Granja;

public class Gato extends Animal{

    String nombre;

    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void Sonido() {
        System.out.println("Miau");
    }
    
    


}

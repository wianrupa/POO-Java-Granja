package Granja;

public class Perro extends  Animal{

    String nombre;

    public Perro(String nombre) {
        super(nombre);
    }
    
    @Override
    public void Sonido() {
        System.out.println("Wof");
    }

}

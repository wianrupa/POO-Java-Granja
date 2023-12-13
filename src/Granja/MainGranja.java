
package Granja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MainGranja {
    
    public static void main(String[] args) {
        
        List<Animal> animal = new ArrayList<>(); 
        
        Perro p1 = new Perro("Snoopy");
        Perro p2 = new Perro("Hector");
        Gato g1 = new Gato("Tome");
        Leopardo l1 = new Leopardo("Leo");
        
        animal.add(p1);
        animal.add(g1);
        animal.add(l1);
        animal.add(p2);
        
        for(Animal unAnimal : animal){
            unAnimal.Sonido();
        }
    }
}
 


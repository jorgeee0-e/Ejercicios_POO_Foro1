/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package collections;
import java.util.*;

/**
 *
 * @author Jorge LG
 */
public class Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear una colección de animales
        Collection<String> animales = new ArrayList<>();

        // Agregar algunos animales a la colección con metodo .add
        animales.add("León");
        animales.add("Tigre");
        animales.add("Elefante");
        animales.add("Zebra");

        // Mostrar en pantalla la colección antes de remover un animal
        System.out.println("Animales antes de remover:");
        System.out.println(animales);
        System.out.println("Ingresaron: " + animales.size()+ " animales");

        // Remover un animal específico, llamando funcion para remover un elemento de la collection
        removerAnimal(animales, "León");

        // Mostrar en pantalla la colección después de remover un animal
        System.out.println("Animales después de remover:");
        System.out.println(animales);
    }

    // Método para remover un animal específico de la colección
    public static void removerAnimal(Collection<String> animales, String animal) {
        Iterator<String> iterator = animales.iterator();
        while (iterator.hasNext()) {
            String animalActual = iterator.next();
            if (animalActual.equals(animal)) {
                iterator.remove();
                System.out.println("Se ha removido el animal: " + animalActual);
            }
        }
    }
    
}

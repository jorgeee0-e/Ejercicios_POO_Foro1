
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class EjemploMap {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración Map: Map<KeyType, ValueType> nombreDeMap
        Map<Integer, String> trabajadores = new HashMap<>();
        
        //Asignación de valores
        trabajadores.put(1, "David Morales");
        trabajadores.put(2, "Alex Menéndez");
        trabajadores.put(3, "Patricia Pocasangre");
        trabajadores.put(4, "Reyna Ayala");
        trabajadores.put(5, "Medardo Villanueva");
        
        //Imprimir HashMap
        System.out.println("Primera impresión: " + trabajadores);

        //Eliminar valores
        //trabajadores.remove(3);                
        trabajadores.clear();
        
        //Imprimir HashMap
        System.out.println("Segunda impresión: " + trabajadores);
    }
    
}

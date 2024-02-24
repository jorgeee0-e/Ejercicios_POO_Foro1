/*
 comentarios!
 */
package ventafrutas;

/**
 *
 * @author danwi
 */
import java.util.ArrayList;
import java.util.List;

public class VentaFrutas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear una lista para almacenar las frutas disponibles para la venta
                List<String> frutasDisponibles = new ArrayList<>();
  // Agregando frutas a la lista con .add
        frutasDisponibles.add("Manzana");
        frutasDisponibles.add("Plátano");
        frutasDisponibles.add("Naranja");
        frutasDisponibles.add("Pera");
        frutasDisponibles.add("Uva");
        
// Eliminando la fruta "Naranja y Uva" de la lista
frutasDisponibles.remove("Naranja");
frutasDisponibles.remove("Uva");

        // Mostrar todas las frutas disponibles para la venta
        System.out.println("Frutas disponibles para la venta:");
        for (String fruta : frutasDisponibles) {
            System.out.println(fruta);
             }
        
        // Mostrar la cantidad de frutas disponibles para la venta
        System.out.println("Cantidad de frutas disponibles: " + frutasDisponibles.size());
    }
    }
    
    


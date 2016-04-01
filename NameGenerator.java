
/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameGenerator
{
    

    /**
     * Constructor for objects of class NameGenerator
     */
    public NameGenerator()
    {
        
    }

    /**
     * Método que nos permite generar un nombre aleatorio
     */
    public void generateStarWarsName(String apellido, String nombre, String apellidoMadre, String ciudad){
        System.out.println(apellido.substring(0,3) + nombre.substring(0,3) + " " + apellidoMadre.substring(0,2) + ciudad.substring(0,3));
    }
}

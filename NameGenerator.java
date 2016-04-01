
/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
    
    public class NameGenerator
{    
    public static final int VALOR_INICIO = 0;
    public static final int VALOR_FINAL_APELLIDO1 = 3;
    public static final int VALOR_FINAL_APELLIDO2 = 2;
    public static final int VALOR_FINAL_NOMBRE = 3;
    public static final int VALOR_FINAL_CIUDAD = 3;

    /**
     * Metodo que crea el nombre que tendrias en Star wars 
     */
    public void generateStarWarsName(String nombre, String apellido1, String apellido2, String ciudad){

        String starWarsName = apellido1.substring(NameGenerator.VALOR_INICIO,NameGenerator.VALOR_FINAL_APELLIDO1) + nombre.substring(NameGenerator.VALOR_INICIO,NameGenerator.VALOR_FINAL_NOMBRE).toLowerCase() + " " + 
            apellido2.substring(NameGenerator.VALOR_INICIO,NameGenerator.VALOR_FINAL_APELLIDO2) + ciudad.substring(NameGenerator.VALOR_INICIO,NameGenerator.VALOR_FINAL_CIUDAD).toLowerCase();
        System.out.println(starWarsName);
    }
}
  


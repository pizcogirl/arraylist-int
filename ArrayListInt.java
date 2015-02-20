
/**
 * Una arraylist con base en una array tradicional
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayListInt
{
    // Una array para guardar los numeros enteros
    private int[] lista;

    /**
     * Constructor for objects of class ArrayListInt
     */
    public ArrayListInt()
    {
        // Inicializamos con un valor 0 posiciones para no desperdiciar
        // espacio en ningun momento
        lista = new int[0];
    }

    /**
     * Metodo que añade un elemento a la arrayList
     */
    public void add(int numero)
    {
        // Creamos una lista temporal, transpasamos todos los numeros con un
        // for, y añadimos el numero en la ultima posicion
        int tamaño = lista.length;
        int[] temporal = new int[tamaño + 1];
        for(int i = 0; i < (tamaño - 1); i++)
        {
            temporal[i] = lista[i];
        }
        temporal[lista.length] = numero;
        // Por ultimo pasamos la lista temporal a lista
        lista = temporal;

    }
}

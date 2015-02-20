
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
     * @param numero El numero a añadir
     */
    public void add(int numero)
    {
        // Creamos una lista temporal, transpasamos todos los numeros con un
        // for, y añadimos el numero en la ultima posicion
        int tamanio = lista.length;
        int[] temporal = new int[tamanio + 1];
        for(int i = 0;i < tamanio;i++)
        {
            temporal[i] = lista[i];
        }
        temporal[tamanio] = numero;
        // Por ultimo pasamos la lista temporal a lista
        lista = temporal;
    }

    /**
     * Metodo que añade un elemento a la arrayList en la posicion indicada
     * @param index La posición donde colocar el numero
     * @param numero El numero a añadir
     */
    public void add( int index, int numero)
    {
        // Comprobamos que sea un indice valido, es decir, que se encuentre en el 
        // tamaño de la lista
        // de lo contrario muestra un mensaje de error
        int tamanio = lista.length;
        if ((index <= tamanio) && (index >= 0))
        {
            // Creamos una lista temporal, transpasamos todos los numeros con un
            // while, pero al llegar al indice indicado introducimos el numero introducido
            // como parametro
            int[] temporal = new int[tamanio + 1];
            int indiceTemp = 0;
            int indiceLista = 0;
            while(indiceLista < tamanio)
            {
                if(indiceTemp == index)
                {
                    temporal[indiceTemp] = numero;
                }
                else
                {
                    temporal[indiceTemp] = lista[indiceLista];
                    indiceLista++;
                }
                indiceTemp++;
            }
            // Por ultimo pasamos la lista temporal a lista
            lista = temporal;
        }
        else
        {
            System.out.println("El indice indicado no es valido, utiliza un valor entre 0 y " + tamanio);
        }
    }
}

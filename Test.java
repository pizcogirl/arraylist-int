public class Test
{
    public Test()
    {
        ArrayListInt array;
        testSize();
        testAdd();
        testAddConIndice(5, 20);
        testClear();
        testContains(5);
        testGet(1);
        testSet(5, 20);
        testIndexOf(1);
        testIsEmpty();
    }

    public void testSize()
    {
        ArrayListInt array = new ArrayListInt();
        if (array.size() == 0)
        {
            System.out.println("OK. El metodo size() devuelve " + array.size() + ". Deberia devolver 0");
        }
        else
        {
            System.out.println("Error. El metodo size() devuelve " + array.size() + ". Deberia devolver 0");
        }
    }

    public void testAdd()

    {
        ArrayListInt array = new ArrayListInt();
        // Añadimos numeros a la array
        for (int i = 1; i <= 10; i++)
        {
            array.add(i);
        }
        // sumamos el valor de los numeros añadidos
        int sumatorio = 0;
        for (int e = 0; e < 10; e++)
        {
            sumatorio = sumatorio + array.get(e);
        }
        if (sumatorio == 55)
        {
            System.out.println("OK. El sumatorio de los numeros da " + sumatorio + ". Deberia dar 55");
        }
        else
        {
            System.out.println("Error. El sumatorio de los numeros da " + sumatorio + ". Deberia dar 55");
        }
    }

    public void testAddConIndice(int posicion, int num)

    {
        ArrayListInt array = new ArrayListInt();
        // Añadimos numeros a la array
        for (int i = 1; i <= 10; i++)
        {
            array.add(i);
        }
        // Ahora añadimos un numero a la posicion 5
        array.add(posicion, num);
        if (array.get(posicion) == num)
        {
            System.out.println("OK. El metodo testAddConIndice() añade en la posicion "+ posicion + " el numero " + array.get(5) + ". Deberia añadir " + num);
        }
        else
        {
            System.out.println("Error.El metodo testAddConIndice() añade en la posicion "+ posicion + " el numero " + array.get(5) + ". Deberia añadir " + num);
        }
    }

    public void testClear()

    {
        ArrayListInt array = new ArrayListInt();
        // Añadimos numeros a la array
        for (int i = 1; i <= 10; i++)
        {
            array.add(i);
        }
        // Borramos la coleccion y vemos el tamaño que tiene
        array.clear();
        if (array.size() == 0)
        {
            System.out.println("OK. El metodo clear() deja una lista con tamaño " + array.size() + ". Deberia ser 0");
        }
        else
        {
            System.out.println("Error. El metodo clear() deja una lista con tamaño " + array.size() + ". Deberia ser 0");
        }
    }

    public void testContains(int num)

    {
        if ((num >= 1) && (num <= 10))
        {
            ArrayListInt array = new ArrayListInt();
            // Añadimos numeros a la array
            for (int i = 1; i <= 10; i++)
            {
                array.add(i);
            }
            // Buscamos el valor 5 en el array y guardamos el resultado
            boolean contiene = array.contains(num);
            if (contiene)
            {
                System.out.println("OK. El metodo contains() devuelve " + contiene + ". Deberia devolver true");
            }
            else
            {
                System.out.println("Error. El metodo contains() devuelve " + contiene + ". Deberia devolver true");
            }
        }
        else
        {
            System.out.println("Introduce un numero entre 1 y 10, incluidos");
        }
    }

    public void testGet(int index)
    {
        ArrayListInt  array = new ArrayListInt();
        // Añadimos numeros a la array
        for (int i = 1; i <= 10; i++)
        {
            array.add(i);
        }
        // Tomamos el valor de la posicion 5 del array (1, 2, 3, 4, 5, 6)
        int num = array.get(index);
        if (num == (index + 1))
        {
            System.out.println("OK. El metodo get() devuelve " + num + ". Deberia devolver " + (index + 1));
        }
        else
        {
            System.out.println("Error. El metodo get() devuelve " + num + ". Deberia devolver " + (index + 1));
        }
    }

    public void testSet(int indice, int num)
    {
        if ((indice >= 0) && (indice < 10))
        {
            ArrayListInt array = new ArrayListInt();
            // Añadimos numeros a la array
            for (int i = 1; i <= 10; i++)
            {
                array.add(i);
            }
            // Seteamos el valor de la posicion 5 a 20, comprobamos si el cambio ocurre
            array.set(indice, num);
            if (array.get(indice) == num)
            {
                System.out.println("OK. El metodo set() coloca en la posicion " + indice + " el numero " + array.get(indice) + ". Deberia ser el numero " + num);
            }
            else
            {
                System.out.println("Error. El metodo set() coloca en la posicion " + indice + " el numero " + array.get(indice) + ". Deberia ser el numero " + num);
            }
        }
        else
        {
            System.out.println("Introduce un indice entre 0 y 9, incluidos");
        }
    }

    public void testIndexOf(int num)
    {
        if ((num > 0) && (num <= 10))
        {
            ArrayListInt array = new ArrayListInt();
            // Añadimos numeros a la array
            for (int i = 1; i <= 10; i++)
            {
                array.add(i);
            }
            // Tomamos la posicion del valor 5, que sera 4 y comrpobamos que sea correcta
            int indice = array.indexOf(num);
            if (indice == (num - 1))
            {
                System.out.println("OK. El metodo indexOf() devuelve " + indice + ". Deberia devolver " + (num - 1));
            }
            else
            {
                System.out.println("Error. El metodo indexOf() devuelve " + indice + ". Deberia devolver " + (num -1));
            }
        }
        else
        {
            System.out.println("Introduce un numero entre 1 y 10, incluidos");
        }
    }

    public void testIsEmpty()

    {
        ArrayListInt array = new ArrayListInt();
        boolean vacia = array.isEmpty();
        if (vacia)
        {
            System.out.println("OK. El metodo isEmpty() devuelve " + vacia + ". Deberia devolver true");
        }
        else
        {
            System.out.println("Error. El metodo isEmpty() devuelve " + vacia + ". Deberia devolver true");
        }
    }

    public void testRemove(int indice)

    {
        if (indice >= 0 && indice < 9)
        {
            ArrayListInt array = new ArrayListInt();
            // Añadimos numeros a la array
            for (int i = 1; i <= 10; i++)
            {
                array.add(i);
            }
            // Borramos el primer numero de la lista
            int num = array.remove(indice);
            if (num == array.get(indice))
            {
                System.out.println("Error. El metodo remove() no elimina la posicion " + array.get(indice) + ".");
            }
            else
            {
                System.out.println("OK. El metodo remove() elimina " + num);
            }
        }
        else
        {
            System.out.println("Introduce un indice entre 0 y 9 incluidos");
        }
    }
}
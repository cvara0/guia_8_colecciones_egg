package ej1y2_guia8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Ej1y2_guia8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        ArrayList<String> razasDePerros = new ArrayList<>();
        char salir;
        do {
            System.out.print("Ingrese raza de perro: ");
            razasDePerros.add(entrada.next());
            System.out.print("Agregar otra? s/n: ");
            salir = entrada.next().charAt(0);
            if (salir == 'n') {
                System.out.println("Fin de la carga");
            }
        } while (salir == 's');
        System.out.println("");
        System.out.println("Las razas de perros guardadas son:");
        System.out.println(razasDePerros);
        System.out.println("");

        System.out.print("Ingrese raza de perro a eliminar: ");
        String aEliminar = entrada.next();
        Iterator<String> iterator1 = razasDePerros.iterator();
        boolean encontro=false;
        while (iterator1.hasNext()) {

            if (iterator1.next().equals(aEliminar)) {
                
                iterator1.remove();
                encontro=true;
                break;
            }
        }
        if(encontro==true)
            System.out.println("Se elimino 1 elemento de la raza "+aEliminar);
        else
            System.out.println("No se encontro la raza "+aEliminar);
        System.out.println("Las razas guardadas ahora son:");
        System.out.println(razasDePerros);
        System.out.println("");

    }

}
/* Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
decide salir, se mostrará todos los perros guardados en el ArrayList.

2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y
se mostrará la lista ordenada.*/

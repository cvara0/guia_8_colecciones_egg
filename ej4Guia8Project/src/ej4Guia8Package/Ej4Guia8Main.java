package ej4Guia8Package;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Ej4Guia8Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
        char agregarOtra;

        /*  En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
            usuario todos sus datos y guardándolos en el objeto Pelicula.

            Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si
            quiere crear otra Pelicula o no.*/
        do {
            System.out.println("Agregando pelicula\n");
            System.out.print("Título: ");
            String titulo = entrada.next();
            System.out.print("Director: ");
            String director = entrada.next();
            System.out.println("Duración: ");
            System.out.print("Horas: ");
            int horas = entrada.nextInt();
            System.out.print("Minutos: ");
            int minutos = entrada.nextInt();
            LocalTime duracion = LocalTime.of(horas, minutos);
            Pelicula nuevaPelicula = new Pelicula(titulo, director, duracion);
            listaPeliculas.add(nuevaPelicula);
            System.out.print("¿Agregar otra pelicula? s/n: ");
            agregarOtra = entrada.next().charAt(0);//sin validar
            if (agregarOtra == 'n') {
                System.out.println("-------------------------");
                System.out.println("Fin de la carga");
                System.out.println("-------------------------");
            }

        } while (agregarOtra == 's');

        /* • Mostrar en pantalla todas las películas.*/
        System.out.println("-------------------------");
        System.out.println("Todas las peliculas:");
        for (Pelicula i : listaPeliculas) {
            System.out.printf("[%s]\n", i);//recordar que i esta sola
            //dado que se @overide el metodo toString
        }

        System.out.println("-------------------------");

        /*• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.*/
        System.out.println("-------------------------");
        System.out.println("Peliculas con duración menor a 1h:");
        for (Pelicula i : listaPeliculas) {
            if ((int) i.getDuracion().getHour() < 1) {
                System.out.printf("[%s]\n", i);
            }
        }
        System.out.println("-------------------------");

        /*• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
            en pantalla.*/
        System.out.println("-------------------------");
        System.out.println("Peliculas ordenadas por duracion de mayor a menor:");
        Collections.sort(listaPeliculas, Comparadores.ordenarPorDuracionDesc);
        for (Pelicula i : listaPeliculas) {
            System.out.printf("[%s]\n", i);

        }
        System.out.println("-------------------------");

        /*
        • Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla. */
         System.out.println("-------------------------");
        System.out.println("Peliculas ordenadas por título alfabeticamente:");
        Collections.sort(listaPeliculas, Comparadores.ordenarPorTituloAlfabet);
        for (Pelicula i : listaPeliculas) {
            System.out.printf("[%s]\n", i);
        }
        System.out.println("-------------------------");
        
        
        /*• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.*/
         System.out.println("-------------------------");
        System.out.println("Peliculas ordenadas por director alfabeticamente:");
        Collections.sort(listaPeliculas, Comparadores.ordenarPorDirectorAlfabet);
        for (Pelicula i : listaPeliculas) {
            System.out.printf("[%s]\n", i);
        }
        System.out.println("-------------------------");
    }
}

/*4. Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para
esto, tendremos una clase Pelicula con el titulo, director y duración de la película (en
horas). 

Implemente las clases y métodos necesarios para esta situación, teniendo en
cuenta lo que se pide a continuación:

En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
usuario todos sus datos y guardándolos en el objeto Pelicula.

Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si
quiere crear otra Pelicula o no.

Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
en pantalla.
• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.*/

 /*hashSet no admite duplicacion de elementos
no se respeta el orden de insercion de los elementos
tambien se pueden iterar con el iterator
no se admiten repetidos

@Override
public String toString(){
return name;
}
sobre escribir el metodo toString predeterminado

el metodo toString lo invocan todas las clases cuando imprimen
 */

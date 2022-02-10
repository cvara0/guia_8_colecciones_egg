package ej3Guia8Package;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Ej3Guia8Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        /*En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
        información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
        pregunta al usuario si quiere crear otro Alumno o no.*/
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        ArrayList<Integer> listaNotas = new ArrayList<>();
        char salir;

        do {
            System.out.println("---------------------------------");
            System.out.println("Cargando nuevo alumno");
            System.out.println("---------------------------------");
            Alumno alumnoNuevo = new Alumno();
            System.out.print("Ingrese nombre: ");
            alumnoNuevo.setNombre(entrada.next());
            System.out.println("Ingrese notas:");
            for (int i = 0; i < 3; i++) {
                System.out.printf("Nota %d: ", (i + 1));
                listaNotas.add(entrada.nextInt());
            }
            alumnoNuevo.setNotas((ArrayList<Integer>) listaNotas.clone());
            listaNotas.clear();
            listaAlumnos.add(alumnoNuevo);
            System.out.print("Datos guardados, ¿ingresar otro alumno? s/n :");
            salir = entrada.next().charAt(0);
            if (salir == 'n') {
                System.out.println("---------------------------------");
                System.out.println("Fin de la carga");
                System.out.println("---------------------------------");
            }

        } while (salir == 's');

        do {
            boolean encontro = false;
            System.out.println("---------------------------------");
            System.out.println("Buscando alumno");
            System.out.println("---------------------------------");
            System.out.print("Ingrese nombre: ");
            String alumnoBuscar = entrada.next();
            Iterator<Alumno> iterator1 = listaAlumnos.iterator();
            while (iterator1.hasNext()) {
                Alumno elemento = iterator1.next();
                if (elemento.getNombre().equals(alumnoBuscar)) {
                    System.out.println("---------------------------------");
                    System.out.println("Se muestra la primer coincidencia:");
                    System.out.println("Nombre: " + elemento.getNombre());
                    System.out.println("Notas [nota1,nota2,nota3]: " + (elemento.getNotas().toString()));
                    System.out.println("Promedio final: " + (double) Math.round(elemento.notaFinal() * 100) / 100);
                    System.out.println("---------------------------------");
                    encontro = true;
                }
            }
            if (encontro == false) {
                System.out.println("---------------------------------");
                System.out.println("No se encontro al alumno");
                System.out.println("---------------------------------");
            }

            System.out.print("¿Buscar otro alumno? s/n :");
            salir = entrada.next().charAt(0);
            if (salir == 'n') {
                System.out.println("---------------------------------");
                System.out.println("Fin del programa");
                System.out.println("---------------------------------");
            }
            
        } while (salir == 's');

    }

}

/*3. Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de
tipo Integer con sus 3 notas.

En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.

Después de ese bluce tendremos el siguiente método en la clase Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su
nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
Dentro del método se usará la lista notas para calcular el promedio final de alumno.
Siendo este promedio final, devuelto por el método y mostrado en el main.
Nota: encontrarán en Moodle un ejemplo de una Colección como Atributo*/

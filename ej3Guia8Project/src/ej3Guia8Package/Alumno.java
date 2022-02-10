
package ej3Guia8Package;

import java.util.ArrayList;
import java.util.Iterator;


public class Alumno {
    /*  La clase Alumno tendrá como atributos, su nombre y una lista de
        tipo Integer con sus 3 notas.*/
    private String nombre;
    private ArrayList<Integer> listaNotas;//=new ArrayList<>(3);
    //
    public Alumno(){
        //this.notas=new ArrayList<>(3);
    }
    
    public Alumno(ArrayList<Integer> notas,String nombre){
        this.listaNotas=notas;
        this.nombre=nombre;
    }
    //
    public void setNotas(ArrayList<Integer>notas){
        this.listaNotas=notas;
    }
    
    public ArrayList<Integer> getNotas(){
        return this.listaNotas;
    }
    //

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //
    /*  Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su
        nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
        Dentro del método se usará la lista notas para calcular el promedio final de alumno.
        Siendo este promedio final, devuelto por el método y mostrado en el main*/
    public double notaFinal(){
        Iterator<Integer> iterator1=listaNotas.iterator();
        double contador=0;
        double suma=0;
        
        while(iterator1.hasNext()){
            suma+=iterator1.next();
            contador++;
        }
        return (double)Math.round((suma/contador) * 100) / 100;   
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
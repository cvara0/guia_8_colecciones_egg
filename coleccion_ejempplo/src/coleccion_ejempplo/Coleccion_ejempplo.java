
package coleccion_ejempplo;

import java.util.ArrayList;
import java.util.Iterator;


public class Coleccion_ejempplo {

    public static void main(String[] args) {
        //ArrayList permite modificar arrays de forma dinamica
        //un array es como una pelota, con dimension estatica
        //un array list es como un globo, se infla segun la cantidad de aire
        
        ArrayList<String> arrayList1=new ArrayList<String>();//tipo de dato en el construcor
        ArrayList<Integer> arrayList2=new ArrayList<>();//no es necesario en las versiones nuevas
        //los ArrayList solo admiten objetos no datos primitivos,
        // como int etc.
        
        //generico es un metodo que recive cualquier tipo de dato
        //cuando se ven los diamantes <> hace referencia a algo generico
        
        arrayList1.add("cristian");//agrega elemento a la cola del arrayList
        arrayList2.add(5);
        
        int number1=50;
        Integer nro1=number1;//esto se conoce como envoltura
        //envolver una variable primitiva en un objeto del tipo
        //correspondiente, con esto se pueden usar los metodos
        // de la clase Integer, cosa que int no tiene
        // asi se puede tambien agregar number1 al arrayList
        arrayList1.add(2,"cristian");
        
        //(ubicacion,elemento) y hay otro elemento en esa posicion
        //lo desplaza hacia la derecha
        
        ArrayList<String> arrayList3=new ArrayList<>();
        
        arrayList3.add("one");
        arrayList3.add("two");
        arrayList3.add("four");
        arrayList3.add(2,"three");
        
        
        for (String i:arrayList3){
            System.out.println(i);
        } 
        Iterator<String> iterator=arrayList3.iterator();
        //guarda en el iterador una especie de copia dura
        //ya que al modificarlo tambien se modifica el arrayList
        while(iterator.hasNext()){  //devuelve un bool en caso de que se encuentre
                                    //un elemento en el iterador
                                    //devuelve true si hay un elemento siguiente
            System.out.println(iterator.next());//extrae el elemento
        }
        
        
        arrayList3.add("one");
        arrayList3.add("two");
        arrayList3.add("four");
        arrayList3.set(1,"dos");//con set se reemplaza el valor
                                //en la posicion
                                
       //un arrayList en el fondo utiliza un array estatico tradicional
       
       //se puede elminar elemntos de un array list
       //pero no es buena practica elimianrlos mienstras se
       //los recorre , es decir no se debe utilizar un for
       //sino un iterador
       
       arrayList3.remove(ubicacion);
       
       Iterator<Clase> iterator2=arrayList3.iterator();
       //guarda todas las posiciones de memoria del
       //arrayList
       while(iterator2.hasNext()){
       
           Clase elemento=iterator2.next();
           if(elemento.atributoDeLaClase.equals("nombre a elimnar")){
           iterator2.remove();
           }
       }
        
        /*
       Iterator <MyPerson> iterator=arrayList.iterator();
       while(iterator.hasNext()){
       
       MyPerson myPerson =iterator.netx();
       if(myPerson.name.equals("Martin"))
        iterator.remove();
       }
       */
  
    }
    
}

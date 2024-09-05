package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       //array
        Scanner input = new Scanner(System.in);
    //    int[] array = new int[5];   //forma 1

    int [] array = {1, 2, 3, 4, 5};
    int [] array2 = {1, 6, 3, 4, 5};

    
   
       
    int x =array[0];
    array[0] = array[4];             //Intercambio de elementos: Crea un array de enteros con 5 elementos. Intercambia el primer elemento con el último elemento del array.
    array[4] = x;
                     

    boolean z =Arrays.equals(array, array2);            // Verificar igualdad: Crea dos arrays de enteros con 5 elementos cada uno. Comprueba si los dos arrays son iguales.

    
    
    Arrays.sort(array);
    int n =array[array.length-1];                             // Encontrar el elemento máximo: Crea un array de enteros con 5 elementos. Encuentra el elemento máximo del array.

    
    int m = array[0];                                          // Encontrar el elemento mínimo: Crea un array de enteros con 5 elementos. Encuentra el elemento mínimo del array.
                             

                                                                   

                                                                  

    int q,w,e,r,t,sum;
      
    q = array[0];
    w = array[1];                                           // Suma de elementos: Crea un array de enteros con 5 elementos. Calcula la suma de todos los elementos del array.
    e = array[2];              
    r = array[3];              
    t = array[4];              
    sum = q+w+e+r+t;            



    int sum2 = sum / array.length;                     // Promedio de elementos: Crea un array de enteros con 5 elementos. Calcula el promedio de todos los elementos del array.

    int cont1= 0 ;
    
    
            
    
if (q%2==0) {cont1++;}
if (w%2==0) {cont1++;}           // Contar elementos pares: Crea un array de enteros con 5 elementos. Cuenta la cantidad de elementos pares del array.
if (e%2==0) {cont1++;}
if (r%2==0) {cont1++;}
if (t%2==0) {cont1++;
    }                                                           



    if (q%2!=0) {cont1++;}  
    if (w%2!=0) {cont1++;}                      // Contar elementos impares: Crea un array de enteros con 5 elementos. Cuenta la cantidad de elementos impares del array.
    if (e%2!=0) {cont1++;}              
    if (r%2!=0) {cont1++;}
    if (t%2!=0) {cont1++;}                    

     
    System.out.println("ingrese elemnto a buscar en el array -->");
    int l =input.nextInt();
    Arrays.binarySearch(array, l);     // Verificar si un elemento existe: Crea un array de enteros con 5 elementos. Verifica si un elemento específico existe en el array.

       
    
    int[] arrayInvertido = new int[5];                    // Invertir un array: Crea un array de enteros con 5 elementos. Invierte el orden de los elementos del array.
       arrayInvertido[0] = array[4];
       arrayInvertido[1] = array[3];                    //Se invirtío el array "array"
       arrayInvertido[2] = array[2];
       arrayInvertido[3] = array[1];
       arrayInvertido[4] = array[0];

    System.out.println(Arrays.toString(arrayInvertido));
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
        // //arraylist
        // Scanner input = new Scanner(System.in);

        // ArrayList<String> list = new ArrayList<String>();

        //     list.add("first");                         //Agregar un elemento al principio: Crea un ArrayList de String. Agrega un nuevo elemento al principio del ArrayList.
        //     list.add("hello");                         // Agregar un elemento al final: Crea un ArrayList de String. Agrega un nuevo elemento al final del ArrayList.


        // list.add("nabo");// Valores x, para eviytar errores de un ARL vacio                    
        // list.add("nabo");// Valores x, para eviytar errores de un ARL vacio
        // list.add("nabo");// Valores x, para eviytar errores de un ARL vacio    



        // int x = list.size();
        // list.remove(x-1);                              // Eliminar el último elemento: Crea un ArrayList de String. Elimina el último elemento del ArrayList.

        // list.remove(0);                      // Eliminar el primer elemento: Crea un ArrayList de String. Elimina el primer elemento del ArrayList.

        // x = list.size();
        // list.get(x-1);                            // Obtener el último elemento: Crea un ArrayList de String. Obtiene el último elemento del ArrayList.

        // list.get(0);                         // Obtener el primer elemento: Crea un ArrayList de String. Obtiene el primer elemento del ArrayList.

        // list.isEmpty();                        // Verificar si el ArrayList está vacío: Crea un ArrayList de String. Comprueba si el ArrayList está vacío.

        // int a =list.size();                // Obtener el tamaño del ArrayList: Crea un ArrayList de String. Obtiene el tamaño del ArrayList.

        // System.out.println("ingrese el valor a verificar-->");
        // String z = input.nextLine();                  // Verificar si un elemento existe: Crea un ArrayList de String. Verifica si un elemento específico existe en el ArrayList.
        // list.contains(z);                                             

        // System.out.println("Ingrese el valor del que quiere obtener el indice -->");
        // String v = input.nextLine();

        // list.indexOf(v);                    // Obtener el índice de un elemento: Crea un ArrayList de String. Obtiene el índice de un elemento específico del ArrayList.
        
        // input.close();
        

    }
}
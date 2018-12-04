package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Abrimos un Scanner y declaramos variable numero donde almacenar la entrada en consola pedida al usuario.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número entero");
        Numero numero = new Numero(sc.next());

        //Si el número es de una cifra, usamos el resultado del método esDivisiblePorTres para mostrar en pantalla el mensaje apropiado.
        if (numero.getSize()==1){
            if(numero.esDivisiblePorTres()){
                System.out.println("El número es divisible entre tres.");
            }else{
                System.out.println("El número no es divisible entre tres.");
            }
        }
        //Si el número es de dos o tres cifras, usamos el resultado del método esCapicua para mostrar en pantalla el mensaje apropiado.
        if(numero.getSize()==2 || numero.getSize()==3){
            if(numero.esCapicua()){
                System.out.println("El número es capicúa.");
            }else{
                System.out.println("El número no es capicúa.");
            }
        }
        //Si el número es de tres o mas cifras, usamos el resultado del método esPar para mostrar en pantalla el mensaje apropiado.
        if(numero.getSize()>=3){
            if(numero.esPar()){
                System.out.println("El número es par.");
            }else{
                System.out.println("El número no es par.");
            }
        }
        //Cerramos el Scanner
        sc.close();
    }
}

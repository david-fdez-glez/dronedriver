package org.dfernandez.idealista;


import org.dfernandez.idealista.service.ServiceApi;
import org.dfernandez.idealista.service.ServiceApiImpl;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        System.out.println("Bienvenido a idealista i+d. ");
        System.out.println("Escoge entre los dos algoritmos. Cualquier caracter terminará el programa");
        System.out.println("1) Depth-first search");
        System.out.println("2) Breadth-first search");
        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()) {
            ServiceApi serviceApi = new ServiceApiImpl(in.nextInt());

            System.out.println("Elige coordenadaX:");
            in = new Scanner(System.in);
            BigDecimal coordenadaX = in.nextBigDecimal();

            System.out.println("Elige coordenadaY:");
            in = new Scanner(System.in);
            BigDecimal coordenadaY = in.nextBigDecimal();

            System.out.println("Elige rango:");
            in = new Scanner(System.in);
            int rango = in.nextInt();

            System.out.println(" obtenerUrbanizaciones " + serviceApi.obtenerUrbanizaciones(coordenadaX, coordenadaY, rango));

            System.out.println("\n\nEscoge entre los dos algoritmos. Cualquier caracter terminará el programa");
            System.out.println("1) Depth-first search");
            System.out.println("2) Breadth-first search");
            in = new Scanner(System.in);
        }


    }
}

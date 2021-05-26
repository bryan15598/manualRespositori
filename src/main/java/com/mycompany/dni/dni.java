/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dni;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class dni {

    public static void main(String args[]) {
        Scanner teclat = new Scanner(System.in);
        System.out.println("Intruduce el numero de tu DNI");
        int dni = teclat.nextInt();
        System.out.println("Intruduce la letra de tu DNI");
        String lletra = teclat.next();

        final char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        char letraDNI = letras[numeroResult(dni)];

        if (String.valueOf(letraDNI).equalsIgnoreCase(lletra)) {
            System.out.println("TRUE " + lletra + " es igual a " + letraDNI);
        } else {
            System.out.println("FALSE" + lletra + " no es igual a " + letraDNI);
        }
    }

    public static int numeroResult(int num) {
        return num % 23;
    }

}

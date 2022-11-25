package com.jay.boletin14;

import com.jay.partes.Cpu;
import com.jay.partes.Monitor;
import com.jay.partes.Teclado;

/**
 * @author JayBGB
 * @version 22.11.2022
 */


public class Main {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {


        Monitor objMo = new Monitor (27.5f);
        // Cpu objPro = new Cpu (4800);




        bol14.Ordenador objPc = new bol14.Ordenador(1500.50f, objMo, new Teclado ("Newskill"), new Cpu (4800));

        System.out.println(objPc.toString());

        System.out.println("------------------------------------------------");

        System.out.println("Precio = "+objPc.getPrecio());

        System.out.println("------------------------------------------------");

        System.out.println("Marca = "+objPc.getTe());

        System.out.println("------------------------------------------------");

        System.out.println("Velocidad = "+objPc.getPro());

        System.out.println("------------------------------------------------");







    }

}

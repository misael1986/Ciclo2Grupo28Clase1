/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.unal.ciclo2grupo28clase1;

/**
 *
 * @author Usuario
 */
public class Ciclo2Grupo28Clase1 {
    
    static final int EDAD_MAXIMA_AFILIACION=100;

    public static void main(String[] args) {//Punto de inicio
        System.out.print("Hello ");//print()
        System.out.println("Everyone");//

        int edadCliente=21;
        mensajeBienvenida();
        double pi=Math.PI;
        
        double tresOctavos=3.0/8.0;
        System.out.println(tresOctavos);
        
        boolean bandera=false;
        if (edadCliente<EDAD_MAXIMA_AFILIACION) System.out.println("admitido");
        
        float dia, Dia, DIA, DiA;//son 4 variables diferentes
        
        int dd=21;//32bits -> 4 Mil millones
        short mm=6;//16bits
        long anio=2022;//64bits - Muchos trillones
        
        /*
        lo que
        escriba aca
        es comentarios
        no se van a
        compilar
        */ 
    }
    
    public static void mensajeBienvenida(){
        System.out.println("Bienvenido: "+EDAD_MAXIMA_AFILIACION);
    }
}

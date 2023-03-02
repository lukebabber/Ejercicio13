/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package máquinaexpendedoraUnderwoodLuke2223;

/**
 * Clase Main del programa, que define un objeto MáquinaExpendedoraUnderwoodLuke2223 con unos
 * parámetros y realiza acciones de subir y obtener
 *
 * @author Luke Anthony Underwood
 */
public class Main {

    /**
     * Método Main
     * 
     * Este método es el principal de ejecución del programa
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              MáquinaExpendedoraUnderwoodLuke2223 snack;
       
        
        snack=new MáquinaExpendedoraUnderwoodLuke2223(13,2,5);
        sube1_PrecioUnderwoodLuke2223(snack);
        
        sube2_PrecioUnderwoodLuke2223(snack);
        
        obtener1_UnidadesUnderwoodLuke2223(snack);
        
        obtener2_UnidadesUnderwoodLuke2223(snack);
        
        obtener3_UnidadesUnderwoodLuke2223(snack);
        
    }
    
    /**
     * Método obtener3_UnidadesUnderwoodLuke2223
     * 
     * En este método vamos a intentar sacar 12 snack, y tengo 50 euros.
     * Como no hay unidades suficientes en la máquina saltará
     * una excepción y no se modificará el nº de unidades de la tienda 
     * 
     * @param snack 
     * @throws Exception cuando no hay suficientes unidades
     */

    private static void obtener3_UnidadesUnderwoodLuke2223(MáquinaExpendedoraUnderwoodLuke2223 snack) {
        /*Vamos a intentar sacar 12 snack, y tengo 50 euros.
        Como no hay unidades suficientes en la máquina saltará
        una excepción y no se modificará el nº de unidades de la tienda*/
        try {
            System.out.println("3º.- Vamos a sacar snacks (queremos 12 y tenemos 50 €)");
            snack.sacarsnack(12, 50, "pegatina");
            System.out.println("Operación realizada, ahora tiene "+snack.obtenerUnidades()+" unidades en la máquina");
        } catch (Exception e) {
            System.out.println("Error al sacar snack,porque no hay suficientes unidades");
            System.out.println("El nº de unidades sigue siendo: "+snack.obtenerUnidades());
            
        }
    }
    
    /**
     * Método obtener2_UnidadesUnderwoodLuke2223
     * 
     * En este método vamos a intentar sacar 2 snack, y tengo 9 euros.
        Ahora se actualizará el número de snack que tenemos en
        la máquina 
     * 
     * @param snack 
     * @throws Exception cuando no hay suficientes dinero
     */

    private static void obtener2_UnidadesUnderwoodLuke2223(MáquinaExpendedoraUnderwoodLuke2223 snack) {
        /*Vamos a intentar sacar 2 snack, y tengo 9 euros.
        Ahora se actualizará el número de snack que tenemos en
        la máquina*/
        try {
            System.out.println("2º.- Vamos a sacar snacks (queremos 2 y tenemos 9 €)");
            snack.sacarsnack(2, 9, "pegatina");
            System.out.println("Operación realizada, ahora tiene "+snack.obtenerUnidades()+" unidades en la máquina");
        } catch (Exception e) {
            System.out.println("Error al sacar snack,porque no hay suficientes dinero");
            System.out.println("El nº de unidades sigue siendo: "+snack.obtenerUnidades());
            
        }
    }
    
    /**
     * Método obtener1_UnidadesUnderwoodLuke2223
     * 
     * En este método vamos a intentar sacar 2 snack, y tengo 5 euros.
        Como no hay dinero suficiente saltará
        una excepción y no se modificará el nº de unidades de la tienda
     * 
     * @param snack 
     * @throws Exception cuando no hay suficientes dinero
     */

    private static void obtener1_UnidadesUnderwoodLuke2223(MáquinaExpendedoraUnderwoodLuke2223 snack) {
        /*Vamos a intentar sacar 2 snack, y tengo 5 euros.
        Como no hay dinero suficiente saltará
        una excepción y no se modificará el nº de unidades de la tienda*/
        try {
            System.out.println("1º.- Vamos a sacar snacks (queremos 2 y tenemos 5 €)");
            snack.sacarsnack(2, 5, "pegatina");
            System.out.println("Operación realizada, ahora tiene "+snack.obtenerUnidades()+" unidades en la máquina");
        } catch (Exception e) {
            System.out.println("Error al sacar snack,porque no hay suficientes dinero");
            System.out.println("El nº de unidades sigue siendo: "+snack.obtenerUnidades());
            
        }
    }
    
    /**
     * Método sube2_PrecioUnderwoodLuke2223
     * 
     * En este método vamos a aumentar el precio 3€, como supera el precio máximo establecido la operación
        no tendrá éxito y se mantendrá el precio anterior
     * 
     * @param snack 
     * @throws Exception cuando el precio supere el precio máximo de 5 €
     */

    private static void sube2_PrecioUnderwoodLuke2223(MáquinaExpendedoraUnderwoodLuke2223 snack) {
        /*Vamos a aumentar el precio 3€, como supera el precio máximo establecido la operación
        no tendrá éxito y se mantendrá el precio anterior*/
        try {
            System.out.println("Vamos a aumentar el precio de venta de un snack por encima del precio máximo");
            snack.aumentarPrecio(3);
            System.out.println("El precio actual es "+snack.obtenerPrecio()+" €");
        } catch (Exception e) {
            System.out.println("Error al aumentar el precio porque se supera el precio máximo de 5 €");
        }
    }
    
    /**
     * Método sube1_PrecioUnderwoodLuke2223
     * 
     * En este método vamos a aumentar el precio 1€, como no supera el precio máximo establecido la operación
        tendrá éxito y el nuevo precio será de 3€
     * 
     * @param snack 
     * @throws Exception al aumentar el precio
     */

    private static void sube1_PrecioUnderwoodLuke2223(MáquinaExpendedoraUnderwoodLuke2223 snack) {
        /*Vamos a aumentar el precio 1€, como no supera el precio máximo establecido la operación
        tendrá éxito y el nuevo precio será de 3€*/
        try {
            System.out.println("Vamos a aumentar el precio de venta de un snack por debajos del precio máximo");
            snack.aumentarPrecio(1);
            System.out.println("El precio actual es "+snack.obtenerPrecio()+" €");
        } catch (Exception e) {
            System.out.println("Error al aumentar el precio");
        }
    }
    
}

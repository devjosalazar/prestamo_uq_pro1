package co.edu.uniquindio.prestamo.util;

import javax.swing.*;
import java.util.Scanner;

public class CapturaDatosUtil {

    /*-----------------------------Captura de datos con JoptionPane*/
    /**
     * Permite leer un numero entero mediante una caja de dialogo
     * @param mensaje El mensaje que verá el usuario
     * @return el numero ingresado por el usuario
     */
    public static int leerEnteroVentana (String mensaje)
    {
        int dato= Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        return dato;
    }

    /**
     * Permite imprimir un mensaje
     * @param mensaje El mensaje a imprimir
     */
    public static void imprimir (String mensaje)
    {
        JOptionPane.showMessageDialog(null,mensaje);
    }

    /**
     * Permite leer un numero double mediante una caja de dialogo
     * @param mensaje El mensaje que verá el usuario
     * @return el numero ingresado por el usuario
     */

    public static double leerDouble (String mensaje)
    {
        double dato= Double.parseDouble(JOptionPane.showInputDialog(mensaje));
        return dato;
    }

    public static String  leerStringVentana(String mensaje) {
        String respuesta = "";
        respuesta  = JOptionPane.showInputDialog(mensaje);
        return respuesta;
    }

    public static int mostrarMensajeAlerta(String mensaje){
        return JOptionPane.showConfirmDialog(
                null,
                mensaje,
                "Alerta!",
                JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
    }

    public static void mostrarMensaje(String mensaje){
         JOptionPane.showMessageDialog(null, mensaje);
    }



    /*-------------------------Captura de datos por consola*/

    /**
     *
     * @param mensaje
     * @return
     */
    public static int leerEntero(String mensaje) {
        int dato = 0;
        String captura = "";
        System.out.println(mensaje);
        Scanner teclado = new Scanner(System.in);
        captura = teclado.nextLine();
        dato = Integer.parseInt(captura);
        return dato;
    }

    /**
     *
     * @param mensaje
     * @return
     */
    public static double leerDoubleConsola(String mensaje)
    {
        double dato=0;
        String captura="";
        System.out.println(mensaje);
        Scanner teclado = new Scanner(System.in);
        captura = teclado.nextLine();
        dato=Double.parseDouble(captura);
        return dato;
    }

    /**
     *
     * @param mensaje
     * @return
     */
    public static String leerStringConsola(String mensaje)
    {
        String captura="";
        System.out.println(mensaje);
        Scanner teclado = new Scanner(System.in);
        captura = teclado.nextLine();
        return captura;
    }

    /**
     *
     * @param mensaje
     * @return
     */
    public static boolean leerBooleano(String mensaje){

        Scanner entradaEscaner = new Scanner(System.in);
        boolean dato;

        System.out.println(mensaje);
        dato = entradaEscaner.nextBoolean();
        entradaEscaner.nextLine();
        return dato;
    }

    /**
     *
     * @param msj
     * @return
     */
    private static float leerFloat(String msj) {
        // TODO Auto-generated method stub
        float dato;
        System.out.println(msj);
        Scanner teclado= new Scanner(System.in); // creando el objeto para leer por teclado
        dato= Float.parseFloat(teclado.nextLine()); // capturando lo que ingreso por teclado
        return dato;
    }
}

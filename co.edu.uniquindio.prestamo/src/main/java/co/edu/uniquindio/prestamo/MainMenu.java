package co.edu.uniquindio.prestamo;

import javax.swing.*;

import static co.edu.uniquindio.prestamo.util.CapturaDatosUtil.*;

public class MainMenu {

    public static void main(String[] args) {
        int opcion = 0;
        do {
            mostrarMenuPrincipal();
            opcion= leerEnteroVentana("Ingrese la opción");
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    int valorRespuesta = mostrarMensajeAlerta("Esta seguro de desea sali de la aplicación");
                    if(valorRespuesta == 1){
                        opcion = 0;
                    }
                    break;
                default:
                    mostrarMensaje("La opción seleccionada no es una opción validad");
                    break;
            }
        }while(opcion!=7);
    }

    private static void mostrarMenuPrincipal() {
        System.out.println("1 - Gestionar clientes");
        System.out.println("2 - Gestionar empleados");
        System.out.println("3 - Gestionar objetos");
        System.out.println("4 - Realizar prestamo de objetos");
        System.out.println("5 - Devolver prestamo de objetos");
        System.out.println("6 - Gestionar otros requisitos");
        System.out.println("7 - Salir");
    }

    private static void mostrarMenuCrudCliente() {
        System.out.println("1 - Crear Cliente");
        System.out.println("2 - Calcular Promedio");
        System.out.println("3 - Salir");
    }
}

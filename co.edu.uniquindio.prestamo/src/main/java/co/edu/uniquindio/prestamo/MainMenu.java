package co.edu.uniquindio.prestamo;

import co.edu.uniquindio.prestamo.model.Cliente;
import co.edu.uniquindio.prestamo.model.PrestamoUq;

import java.util.List;

import static co.edu.uniquindio.prestamo.constantes.PrestamoConstantes.*;
import static co.edu.uniquindio.prestamo.util.CapturaDatosUtil.*;

public class MainMenu {

    public static void main(String[] args) {
        PrestamoUq prestamoUq = inicializarDatosPrueba();
        gestionarOpcionesAplicacionPrestamoUQ(prestamoUq);
    }

    private static void gestionarOpcionesAplicacionPrestamoUQ(PrestamoUq prestamoUq) {
        int opcion = 0;
        do {
            mostrarMenuPrincipal();
            opcion= leerEntero("Seleccione una de las opciones del menú: ");
            switch (opcion) {
                case 1:
                    gestionarOpcionesCliente(prestamoUq);
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

    private static void gestionarOpcionesCliente(PrestamoUq prestamoUq) {
        int opcion = 0;
        do {
            mostrarMenuCrudCliente();
            opcion = leerEntero("Seleccione la opcion de gestion de clientes: ");
            switch (opcion) {
                case 1:
                    prestamoUq.mostrarInformacionClientes();
                    break;
                case 2:
                    crearCliente(prestamoUq);
                    break;
                case 3:
                    actualizarCliente(prestamoUq);
                    break;
                case 4:
                    eliminarCliente(prestamoUq);
                    break;
                case 5:
                    buscarCliente(prestamoUq);
                    break;
                case 6:
                    int valorRespuesta = mostrarMensajeAlerta("Esta seguro de desea sali de la aplicación");
                    if(valorRespuesta == 1){
                        opcion = 0;
                    }
                    break;
                default:
                    mostrarMensaje("La opción seleccionada no es una opción valida");
                    break;
            }
        }while (opcion != 6);
    }

    private static void crearCliente(PrestamoUq prestamoUq) {
        String nombre = leerStringConsola(INGRESE_NOMBRE_CLIENTE);
        String apellido = leerStringConsola(INGRESE_APELIIDO_CLIENTE);
        String cedula = leerStringConsola(INGRESE_CEDULA_CLIENTE);
        int edad = leerEntero(INGRESE_EDAD_CLIENTE);
        boolean flagCreado = prestamoUq.crearCliente(nombre, apellido, cedula, edad);
        if(flagCreado == true){
            System.out.println(CLIENTE_CREADO);
        }else{
            System.out.println(CLIENTE_NO_CREADO);
        }
    }

    private static void eliminarCliente(PrestamoUq prestamoUq){
        String cedula = leerStringConsola(INGRESE_CEDULA_CLIENTE);
        prestamoUq.eliminarCliente(cedula);
    }

    private static void actualizarCliente(PrestamoUq prestamoUq) {
        String cedulaActual = leerStringConsola(INGRESE_CEDULA_CLIENTE_ACTUAL);
        String nombre = leerStringConsola(INGRESE_NOMBRE_CLIENTE);
        String apellido = leerStringConsola(INGRESE_APELIIDO_CLIENTE);
        String cedula = leerStringConsola(INGRESE_CEDULA_CLIENTE);
        int edad = leerEntero(INGRESE_EDAD_CLIENTE);
        boolean flagActualizado = prestamoUq.actualizarCliente(cedulaActual, nombre, apellido, cedula, edad);
        if(flagActualizado == true){
            System.out.println(CLIENTE_ACTUALIZADO);
        }else{
            System.out.println(CLIENTE_NO_ACTUALIZADO);
        }
    }

    private static void buscarCliente(PrestamoUq prestamoUq) {
        String cedula = leerStringConsola(INGRESE_CEDULA_CLIENTE);
        prestamoUq.buscarCliente(cedula);
    }

    private static void mostrarMenuPrincipal() {
        System.out.println("Opciones del menú principal: ");
        System.out.println("1 - Gestionar clientes");
        System.out.println("2 - Gestionar empleados");
        System.out.println("3 - Gestionar objetos");
        System.out.println("4 - Realizar prestamo de objetos");
        System.out.println("5 - Devolver prestamo de objetos");
        System.out.println("6 - Gestionar otros requisitos");
        System.out.println("7 - Salir");
    }

    private static void mostrarMenuCrudCliente() {
        System.out.println("Menú gestion clientes: ");
        System.out.println("1 - Mostrar la información de los clientes");
        System.out.println("2 - Crear Cliente");
        System.out.println("3 - Actualiza cliente");
        System.out.println("4 - Eliminar cliente");
        System.out.println("5 - Buscar cliente");
        System.out.println("6 - Volver al menú principal");
    }

    private static PrestamoUq inicializarDatosPrueba() {
        PrestamoUq prestamoUq = new PrestamoUq();
        prestamoUq.setNombre("Prestamos UniQuindio");

        Cliente cliente = new Cliente();
        cliente.setNombre("Juan");
        cliente.setApellido("Arias");
        cliente.setCedula("1094");
        cliente.setEdad(25);
        prestamoUq.getListaClientes().add(cliente);

        cliente = new Cliente();
        cliente.setNombre("Ana");
        cliente.setApellido("Perez");
        cliente.setCedula("1095");
        cliente.setEdad(28);
        prestamoUq.getListaClientes().add(cliente);

        return prestamoUq;
    }
}

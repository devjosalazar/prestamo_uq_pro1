package co.edu.uniquindio.prestamo;

import co.edu.uniquindio.prestamo.model.Cliente;
import co.edu.uniquindio.prestamo.model.PrestamoUq;

import java.util.List;

public class Main {
    public static void main(String[] args) {
       PrestamoUq prestamoUq = inializarDatosPrueba();

       //CRUD

        //Create
       crearCliente("juan", "arias", "1094", 24, prestamoUq);
       crearCliente("ana", "alzate", "1095", 35, prestamoUq);
       crearCliente("maria", "perez", "1096", 22, prestamoUq);
       crearCliente("pedro", "arias", "1097", 24, prestamoUq);

       //Read
       mostrarInformacionCliente(prestamoUq);

       //Update

       //Delete
       elilimarCliente(prestamoUq, "1094");
        System.out.println("-----> Informacion luego de eliminar");
       mostrarInformacionCliente(prestamoUq);
    }

    private static PrestamoUq inializarDatosPrueba() {
        PrestamoUq prestamoUq = new PrestamoUq();
        prestamoUq.setNombre("Prestamo Rapido");

        return prestamoUq;
    }

    private static void crearCliente(String nombre,
                                     String apellido,
                                     String cedula,
                                     int edad,
                                     PrestamoUq prestamoUq) {
        prestamoUq.crearCliente(nombre, apellido, cedula, edad);
    }

    private static void elilimarCliente(PrestamoUq prestamoUq, String cedula) {
        prestamoUq.eliminarCliente(cedula);
    }

    private static void mostrarInformacionCliente(PrestamoUq prestamoUq) {
        List<Cliente> listaClientes = prestamoUq.obtenerClientes();
        int tamanioLista = listaClientes.size();
        for(int i=0; i < tamanioLista; i++){
            Cliente cliente = listaClientes.get(i);
            System.out.println(cliente.toString());
        }
    }

}
package co.edu.uniquindio.prestamo.model;

import java.util.ArrayList;
import java.util.List;

import static co.edu.uniquindio.prestamo.constantes.PrestamoConstantes.*;

public class PrestamoUq {

    private String nombre;

    List<Cliente> listaClientes = new ArrayList<>();

    public PrestamoUq() {
    }

    public PrestamoUq(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }


    @Override
    public String toString() {
        return "PrestamoUq{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    /**
     * Metodo para crear un cliente
     * @param nombre
     * @param apellido
     * @param cedula
     * @param edad
     * @return boolean
     */
    public boolean crearCliente(String nombre, String apellido, String cedula, int edad){
        Cliente clienteActual = obtenerCliente(cedula);
        if(clienteActual == null){
            Cliente cliente = new Cliente();
            cliente.setNombre(nombre);
            cliente.setApellido(apellido);
            cliente.setCedula(cedula);
            cliente.setEdad(edad);
            getListaClientes().add(cliente);
            return true;
        }else{
            return false;
        }
    }


    /**
     * Metodo para eliminar un cliente buscado por la cédula
     * @param cedula
     */
    public void eliminarCliente(String cedula) {
        Cliente clienteEncontrado = obtenerCliente(cedula);
        if (clienteEncontrado != null){
            System.out.println(CLIENTE_ELIMINADO);
            getListaClientes().remove(clienteEncontrado);
        }else{
            System.out.println(CLIENT_NO_EXISTE);
        }
    }

    /**
     * Metodo para eliminar un cliente buscado por la cédula
     * @param cedula
     */
    public void eliminarClienteInicial(String cedula) {
        int tamanioLista = getListaClientes().size();
        for (int i=0; i < tamanioLista; i++){
            Cliente cliente = getListaClientes().get(i);
            if(cliente.getCedula().equalsIgnoreCase(cedula)){
                getListaClientes().remove(i);
                break;
            }
        }
    }

    /**
     * Metodo para obtener la lista de todos los clientes
     * @return List<Cliente>
     */
    public List<Cliente> obtenerClientes() {
        return getListaClientes();
    }

    /**
     * Metodo para obtener la informacion de un cliente por la cedula
     * @param cedula
     * @return
     */

    public Cliente obtenerCliente(String cedula){
        Cliente clienteEncontrado = null;
        for (Cliente cliente : getListaClientes()) {
            if (cliente.getCedula().equalsIgnoreCase(cedula)){
                clienteEncontrado = cliente;
                break;
            }
        }

        return clienteEncontrado;
    }

    /**
     * Metodo para mostrar la informacion de todos los clientes existentes
     */
    public void mostrarInformacionClientes() {
        //Opcion 1
        //System.out.println(getListaClientes().toString());
        for (Cliente cliente : getListaClientes()) {
            System.out.println(cliente.toString());
        }
    }


    /**
     * Metodo para buscar y mostrar la informacion de un cliente
     * @param cedula
     */
    public void buscarCliente(String cedula) {
        Cliente clienteEncontrado = obtenerCliente(cedula);
        if(clienteEncontrado != null){
            System.out.println(CLIENT_ENCONTRADO);
            System.out.println(clienteEncontrado.toString());
        }else{
            System.out.println(CLIENT_NO_EXISTE);
        }
    }

    /**
     * Metodo para actualizar la información de un cliente
     * @param cedulaActual
     * @param nombre
     * @param apellido
     * @param cedula
     * @param edad
     * @return
     */
    public boolean actualizarCliente(String cedulaActual, String nombre, String apellido, String cedula, int edad) {
        Cliente clienteEncontrado = obtenerCliente(cedulaActual);
        if(clienteEncontrado != null){
            clienteEncontrado.setNombre(nombre);
            clienteEncontrado.setApellido(apellido);
            clienteEncontrado.setCedula(cedula);
            clienteEncontrado.setEdad(edad);

            return true;
        }else{
            return false;
        }
    }
}

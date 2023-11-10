package co.edu.uniquindio.prestamo;

import co.edu.uniquindio.prestamo.model.Cliente;
import co.edu.uniquindio.prestamo.model.Empleado;

public class MainHerencia {

    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        Cliente cliente = new Cliente();

        empleado.indicarEdad();
        cliente.indicarEdad("por saber");


    }
}

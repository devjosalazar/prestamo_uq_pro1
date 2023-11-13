package co.edu.uniquindio.prestamo;

import co.edu.uniquindio.prestamo.model.Cliente;
import co.edu.uniquindio.prestamo.model.Empleado;
import co.edu.uniquindio.prestamo.model.Objeto;
import co.edu.uniquindio.prestamo.model.PrestamoUq;

import java.util.Date;

public class MainTransaccion {

    public static void main(String[] args) {
        PrestamoUq prestamoUq = inializarDatosPrueba();
        if(crearPrestamo(prestamoUq)== true){
            System.out.println("Prestamo creado");
        }else{
            System.out.println("Prestamo no creado");
        }
    }

    private static boolean crearPrestamo(PrestamoUq prestamoUq) {
        return prestamoUq.crearPrestamo(
                "pr-001",
                new Date(2023,10,13,12,50),
                new Date(2023,11,13,13,50),
                "prestamo de un pala",
                "191919",
                "1080",
                "001"
                );
    }

    private static PrestamoUq inializarDatosPrueba() {
        PrestamoUq prestamoUq = new PrestamoUq();
        prestamoUq.setNombre("Prestamo Rapido");

        Cliente cliente1 = new Cliente();
        cliente1.setNombre("juan");
        cliente1.setApellido("arias");
        cliente1.setCedula("1094");
        cliente1.setEdad(30);
        Cliente cliente2 = new Cliente();
        cliente2.setNombre("pedro");
        cliente2.setApellido("perez");
        cliente2.setCedula("1095");
        cliente2.setEdad(32);

        Empleado empleado1 = new Empleado();
        empleado1.setNombre("ana");
        empleado1.setApellido("perez");
        empleado1.setCedula("1080");
        empleado1.setEdad(40);

        Objeto objeto = new Objeto();
        objeto.setNombre("Pala");
        objeto.setIdObjeto("001");

        cliente1.setOwnedByPrestamoUq(prestamoUq);
        cliente2.setOwnedByPrestamoUq(prestamoUq);
        empleado1.setOwnedByPrestamoUq(prestamoUq);
        objeto.setOwnedByPrestamoUq(prestamoUq);

        prestamoUq.getListaClientes().add(cliente1);
        prestamoUq.getListaClientes().add(cliente2);
        prestamoUq.getListaEmpleados().add(empleado1);
        prestamoUq.getListaObjetos().add(objeto);

        return prestamoUq;
    }

}

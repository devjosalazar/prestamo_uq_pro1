package co.edu.uniquindio.prestamo.model;

public class Empleado extends  Persona{
    PrestamoUq ownedByPrestamoUq;

    public Empleado() {
    }

    public PrestamoUq getOwnedByPrestamoUq() {
        return ownedByPrestamoUq;
    }

    public void setOwnedByPrestamoUq(PrestamoUq ownedByPrestamoUq) {
        this.ownedByPrestamoUq = ownedByPrestamoUq;
    }

}

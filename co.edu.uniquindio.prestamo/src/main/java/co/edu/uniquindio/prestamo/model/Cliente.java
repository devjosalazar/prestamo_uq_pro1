package co.edu.uniquindio.prestamo.model;

public class Cliente extends Persona{
    PrestamoUq ownedByPrestamoUq;

    public Cliente() {
    }

    public PrestamoUq getOwnedByPrestamoUq() {
        return ownedByPrestamoUq;
    }

    public void setOwnedByPrestamoUq(PrestamoUq ownedByPrestamoUq) {
        this.ownedByPrestamoUq = ownedByPrestamoUq;
    }


    @Override
    public void indicarEdad() {
        System.out.println("Buenas, no le quiero decir");
    }


    public void indicarEdad(String motivo) {
        System.out.println("Buenas, cual es el motivo"+motivo);
    }


}

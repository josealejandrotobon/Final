package com.Oftalmologo;

public class PacienteApto extends Paciente implements Operable {
    public PacienteApto(String nombre, int edad, boolean necesitaCirugia) {
        super(nombre, edad, necesitaCirugia);
    }

    public void operar() {
        this.setNecesitaCirugia(false);
    }

    public String toString() {
        return super.getNombre();
    }
}

package com.Oftalmologo;

public class PacienteNoApto extends Paciente {
    public PacienteNoApto(String nombre, int edad, boolean necesitaCirugia) {
        super(nombre, edad, necesitaCirugia);
    }

    public String toString() {
        return super.getNombre();
    }
}

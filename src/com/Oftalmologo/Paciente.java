package com.Oftalmologo;

public abstract class Paciente {
    private String nombre;
    private int edad;
    private boolean necesitaCirugia;

    public Paciente(String nombre, int edad, boolean necesitaCirugia) {
        this.nombre = nombre;
        this.edad = edad;
        this.necesitaCirugia = necesitaCirugia;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public boolean isNecesitaCirugia() {
        return this.necesitaCirugia;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNecesitaCirugia(boolean necesitaCirugia) {
        this.necesitaCirugia = necesitaCirugia;
    }
}



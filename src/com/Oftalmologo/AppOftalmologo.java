package com.Oftalmologo;

public class AppOftalmologo {
    public AppOftalmologo() {
    }

    public static void main(String[] args) {
        Oftalmologo oftalmologoElRetiro = new Oftalmologo();
        oftalmologoElRetiro.revisarPaciente("Valentina", 39);
        oftalmologoElRetiro.revisarPaciente("Chaparro", 31);
        oftalmologoElRetiro.revisarPaciente("Julio", 50);
        oftalmologoElRetiro.revisarPaciente("Julia", 80);
        System.out.println("Pacientes a Operar");
        oftalmologoElRetiro.getPacientesAOperar();
        System.out.println("Se operaran los pacientes");
        oftalmologoElRetiro.operarPacientes();
        System.out.println("Pacientes que faltan por operar");
        oftalmologoElRetiro.getPacientesAOperar();
        System.out.println("Lista de pacientes");
        oftalmologoElRetiro.getPacientes();
        System.out.println("Gracias por todo!!!!");
    }
}



package com.Oftalmologo;

import com.Oftalmologo.Paciente;
import com.Oftalmologo.PacienteApto;
import com.Oftalmologo.PacienteNoApto;

import java.util.ArrayList;
import java.util.List;

public class Oftalmologo {
    private String nombre;
    private List<Paciente> pacientes;
    public Oftalmologo() {
        this.pacientes= new ArrayList<>();
    }



    public Object revisarPaciente(String nombre, int edad) {
        boolean NecesitaCirugia;
        if (nombre.toLowerCase().contains("a") && edad < 40) {
            NecesitaCirugia = true;
            PacienteApto paciente = new PacienteApto(nombre, edad, NecesitaCirugia);
            this.pacientes.add(paciente);
            return paciente;



        }
        else {
            NecesitaCirugia = false;
            PacienteNoApto paciente = new PacienteNoApto(nombre, edad, NecesitaCirugia);
            this.pacientes.add(paciente);
            return paciente;

        }


    }
    public void operarPacientes() {
        pacientes.forEach(paciente -> {
            boolean operar = pacientes.stream().anyMatch(Paciente::isNecesitaCirugia);
            if (paciente instanceof PacienteApto && operar) {
                ((PacienteApto) paciente).operar();


            }
        });
    }







    public void getPacientesAOperar(){

        pacientes.stream().filter(r -> r.isNecesitaCirugia() == true && r instanceof PacienteApto).forEach(System.out::println);


    }
    public void getPacientes(){

        pacientes.stream().forEach(System.out::println);


    }
}





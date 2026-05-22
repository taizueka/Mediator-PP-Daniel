package br.com.clinica.participantes;

import br.com.clinica.mediator.MediadorClinica;

public class Enfermagem {

    private MediadorClinica mediador;

    public Enfermagem(MediadorClinica mediador) {
        this.mediador = mediador;
    }

    public void prepararPaciente() {

        mediador.enviarMensagem(
                "Paciente preparado.",
                "Enfermagem"
        );
    }

    public void receberMensagem(String mensagem) {

        System.out.println(
                "[ENFERMAGEM] " + mensagem
        );
    }
}
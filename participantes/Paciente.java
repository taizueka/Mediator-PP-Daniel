package br.com.clinica.participantes;

import br.com.clinica.mediator.MediadorClinica;

public class Paciente {

    private MediadorClinica mediador;

    public Paciente(MediadorClinica mediador) {
        this.mediador = mediador;
    }

    public void chegarClinica() {

        mediador.enviarMensagem(
                "Paciente chegou na clínica.",
                "Paciente"
        );
    }

    public void receberMensagem(String mensagem) {

        System.out.println(
                "[PACIENTE] " + mensagem
        );
    }
}
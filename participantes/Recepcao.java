package br.com.clinica.participantes;

import br.com.clinica.mediator.MediadorClinica;

public class Recepcao {

    private MediadorClinica mediador;

    public Recepcao(MediadorClinica mediador) {
        this.mediador = mediador;
    }

    public void iniciarAtendimento() {

        mediador.enviarMensagem(
                "Iniciando atendimento do paciente.",
                "Recepcao"
        );
    }

    public void receberMensagem(String mensagem) {

        System.out.println(
                "[RECEPÇÃO] " + mensagem
        );
    }

    public void finalizarAtendimento() {

        System.out.println(
                "[RECEPÇÃO] Atendimento finalizado."
        );
    }
}
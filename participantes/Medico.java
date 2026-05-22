package br.com.clinica.participantes;

import br.com.clinica.mediator.MediadorClinica;

public class Medico {

    private MediadorClinica mediador;

    public Medico(MediadorClinica mediador) {
        this.mediador = mediador;
    }

    public void solicitarExame() {

        mediador.enviarMensagem(
                "Solicitando exame do paciente.",
                "Medico"
        );
    }

    public void receberMensagem(String mensagem) {

        System.out.println(
                "[MÉDICO] " + mensagem
        );
    }
}
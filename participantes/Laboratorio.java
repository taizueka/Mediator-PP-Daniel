package br.com.clinica.participantes;

import br.com.clinica.mediator.MediadorClinica;

public class Laboratorio {

    private MediadorClinica mediador;

    public Laboratorio(MediadorClinica mediador) {
        this.mediador = mediador;
    }

    public void informarResultado() {

        mediador.enviarMensagem(
                "Resultado do exame concluído.",
                "Laboratorio"
        );
    }

    public void receberMensagem(String mensagem) {

        System.out.println(
                "[LABORATÓRIO] " + mensagem
        );
    }
}
package br.com.clinica.mediator;

public interface MediadorClinica {

    void enviarMensagem(
            String mensagem,
            String remetente
    );
}
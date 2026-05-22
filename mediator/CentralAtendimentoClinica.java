package br.com.clinica.mediator;

import br.com.clinica.participantes.Enfermagem;
import br.com.clinica.participantes.Laboratorio;
import br.com.clinica.participantes.Medico;
import br.com.clinica.participantes.Paciente;
import br.com.clinica.participantes.Recepcao;

public class CentralAtendimentoClinica
        implements MediadorClinica {

    private Recepcao recepcao;
    private Medico medico;
    private Enfermagem enfermagem;
    private Laboratorio laboratorio;
    private Paciente paciente;

    public void setRecepcao(Recepcao recepcao) {
        this.recepcao = recepcao;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setEnfermagem(
            Enfermagem enfermagem
    ) {
        this.enfermagem = enfermagem;
    }

    public void setLaboratorio(
            Laboratorio laboratorio
    ) {
        this.laboratorio = laboratorio;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public void enviarMensagem(
            String mensagem,
            String remetente
    ) {

        System.out.println(
                "[CENTRAL] Mensagem de "
                        + remetente
                        + ": "
                        + mensagem
        );

        if (remetente.equals("Paciente")) {

            recepcao.receberMensagem(
                    "Paciente chegou para atendimento."
            );
        }

        else if (remetente.equals("Recepcao")) {

            medico.receberMensagem(
                    "Paciente encaminhado ao médico."
            );
        }

        else if (remetente.equals("Medico")) {

            laboratorio.receberMensagem(
                    "Realizar exame solicitado."
            );
        }

        else if (remetente.equals("Laboratorio")) {

            enfermagem.receberMensagem(
                    "Resultado do exame disponível."
            );
        }

        else if (remetente.equals("Enfermagem")) {

            recepcao.receberMensagem(
                    "Paciente pronto para finalização."
            );
        }
    }
}
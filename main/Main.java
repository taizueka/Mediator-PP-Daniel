package br.com.clinica.main;

import br.com.clinica.mediator.CentralAtendimentoClinica;
import br.com.clinica.participantes.Enfermagem;
import br.com.clinica.participantes.Laboratorio;
import br.com.clinica.participantes.Medico;
import br.com.clinica.participantes.Paciente;
import br.com.clinica.participantes.Recepcao;

public class Main {

    public static void main(String[] args) {

        CentralAtendimentoClinica central =
                new CentralAtendimentoClinica();

        Recepcao recepcao =
                new Recepcao(central);

        Medico medico =
                new Medico(central);

        Enfermagem enfermagem =
                new Enfermagem(central);

        Laboratorio laboratorio =
                new Laboratorio(central);

        Paciente paciente =
                new Paciente(central);

        central.setRecepcao(recepcao);
        central.setMedico(medico);
        central.setEnfermagem(enfermagem);
        central.setLaboratorio(laboratorio);
        central.setPaciente(paciente);

        paciente.chegarClinica();

        recepcao.iniciarAtendimento();

        medico.solicitarExame();

        laboratorio.informarResultado();

        enfermagem.prepararPaciente();

        recepcao.finalizarAtendimento();
    }
}
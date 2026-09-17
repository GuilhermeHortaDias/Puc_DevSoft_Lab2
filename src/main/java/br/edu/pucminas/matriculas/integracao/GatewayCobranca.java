package br.edu.pucminas.matriculas.integracao;

import br.edu.pucminas.matriculas.dominio.MatriculaSemestral;

/** Contrato com o sistema externo; adaptador concreto previsto para a Sprint 03. */
public interface GatewayCobranca {
    /** UC13/RN07: notificar as disciplinas vigentes após registro bem-sucedido da matrícula. */
    void notificarMatricula(MatriculaSemestral matricula);
}

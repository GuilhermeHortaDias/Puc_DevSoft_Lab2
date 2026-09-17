package br.edu.pucminas.matriculas.servico;

import br.edu.pucminas.matriculas.dominio.Aluno;
import br.edu.pucminas.matriculas.dominio.Inscricao;
import br.edu.pucminas.matriculas.dominio.MatriculaSemestral;
import br.edu.pucminas.matriculas.dominio.OfertaDisciplina;
import br.edu.pucminas.matriculas.dominio.Professor;
import br.edu.pucminas.matriculas.dominio.Semestre;
import br.edu.pucminas.matriculas.integracao.GatewayCobranca;
import java.time.LocalDateTime;
import java.util.List;

/** Orquestração de matrícula, cancelamento e consultas. */
public class MatriculaServico {
    private List<MatriculaSemestral> matriculas;
    private GatewayCobranca cobranca;

    /** Inicializa a estrutura; as validações de negócio serão implementadas na Sprint 03. */
    public MatriculaServico(List<MatriculaSemestral> matriculas, GatewayCobranca cobranca) {
        this.matriculas = matriculas;
        this.cobranca = cobranca;
    }

    /**
     * UC09/UC13: validar aluno autenticado, período, curso, semestre, duplicidades, limites e vagas; registrar o lote atomicamente na matrícula única do aluno e notificar cobrança após sucesso. Listas representam novas escolhas, somadas às vigentes.
     * @throws UnsupportedOperationException stub previsto para a Sprint 03
     */
    public MatriculaSemestral realizarMatricula(Aluno aluno, Semestre semestre, List<OfertaDisciplina> primeirasOpcoes, List<OfertaDisciplina> alternativas, LocalDateTime agora) {
        throw new UnsupportedOperationException("Sprint 03: implementar MatriculaServico.realizarMatricula");
    }

    /**
     * UC10: validar titularidade e período; cancelar inscrição e liberar vaga.
     * @throws UnsupportedOperationException stub previsto para a Sprint 03
     */
    public void cancelarInscricao(Aluno aluno, Inscricao inscricao, LocalDateTime agora) {
        throw new UnsupportedOperationException("Sprint 03: implementar MatriculaServico.cancelarInscricao");
    }

    /**
     * UC11: autorizar aluno do curso; retornar vagas disponíveis para inscrição, zero fora do período ou em oferta encerrada.
     * @throws UnsupportedOperationException stub previsto para a Sprint 03
     */
    public int consultarVagas(Aluno aluno, OfertaDisciplina oferta, LocalDateTime agora) {
        throw new UnsupportedOperationException("Sprint 03: implementar MatriculaServico.consultarVagas");
    }

    /**
     * UC12: autorizar professor responsável e listar alunos com inscrições vigentes.
     * @throws UnsupportedOperationException stub previsto para a Sprint 03
     */
    public List<Aluno> consultarAlunos(Professor professor, OfertaDisciplina oferta) {
        throw new UnsupportedOperationException("Sprint 03: implementar MatriculaServico.consultarAlunos");
    }
}

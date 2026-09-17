package br.edu.pucminas.matriculas.dominio;

import java.util.ArrayList;
import java.util.List;

/** Escolhas de um aluno em um semestre. */
public class MatriculaSemestral {
    public static final int MAXIMO_PRIMEIRAS_OPCOES = 4;
    public static final int MAXIMO_ALTERNATIVAS = 2;
    private long id;
    private Aluno aluno;
    private Semestre semestre;
    private List<Inscricao> inscricoes;

    /** Inicializa a estrutura; as validações de negócio serão implementadas na Sprint 03. */
    public MatriculaSemestral(long id, Aluno aluno, Semestre semestre) {
        this.id = id;
        this.aluno = aluno;
        this.semestre = semestre;
        this.inscricoes = new ArrayList<>();
    }

    /**
     * RN03: contar inscrições vigentes da categoria informada.
     * @throws UnsupportedOperationException stub previsto para a Sprint 03
     */
    public int contarInscricoes(TipoOpcao tipo) {
        throw new UnsupportedOperationException("Sprint 03: implementar MatriculaSemestral.contarInscricoes");
    }

    /**
     * RN03/RN09: validar escolhas novas junto das vigentes; impedir repetições e ultrapassagem de 4 + 2.
     * @throws UnsupportedOperationException stub previsto para a Sprint 03
     */
    public void validarLimites(List<OfertaDisciplina> primeirasOpcoes, List<OfertaDisciplina> alternativas) {
        throw new UnsupportedOperationException("Sprint 03: implementar MatriculaSemestral.validarLimites");
    }

    /**
     * RN03/RN09: criar inscrição vinculada a esta matrícula e oferta; preservar os limites.
     * @throws UnsupportedOperationException stub previsto para a Sprint 03
     */
    public Inscricao adicionarInscricao(long idInscricao, OfertaDisciplina oferta, TipoOpcao tipo) {
        throw new UnsupportedOperationException("Sprint 03: implementar MatriculaSemestral.adicionarInscricao");
    }
}

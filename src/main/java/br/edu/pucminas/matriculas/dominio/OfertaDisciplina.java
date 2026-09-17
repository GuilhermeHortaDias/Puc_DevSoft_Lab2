package br.edu.pucminas.matriculas.dominio;

import java.util.ArrayList;
import java.util.List;

/** Realização semestral de uma disciplina; concentra capacidade e situação. */
public class OfertaDisciplina {
    public static final int MINIMO_ALUNOS = 3;
    public static final int MAXIMO_ALUNOS = 60;
    private long id;
    private Disciplina disciplina;
    private Professor professor;
    private Curriculo curriculo;
    private SituacaoOferta situacao;
    private List<Inscricao> inscricoes;

    /** Inicializa a estrutura; as validações de negócio serão implementadas na Sprint 03. */
    public OfertaDisciplina(long id, Disciplina disciplina, Professor professor, Curriculo curriculo) {
        this.id = id;
        this.disciplina = disciplina;
        this.professor = professor;
        this.curriculo = curriculo;
        this.situacao = SituacaoOferta.EM_MATRICULA;
        this.inscricoes = new ArrayList<>();
    }

    /**
     * RN05/RN06: contar somente inscrições vigentes.
     * @throws UnsupportedOperationException stub previsto para a Sprint 03
     */
    public int contarInscritos() {
        throw new UnsupportedOperationException("Sprint 03: implementar OfertaDisciplina.contarInscritos");
    }

    /**
     * RN05: verificar capacidade inferior a 60 e situação EM_MATRICULA.
     * @throws UnsupportedOperationException stub previsto para a Sprint 03
     */
    public boolean possuiVaga() {
        throw new UnsupportedOperationException("Sprint 03: implementar OfertaDisciplina.possuiVaga");
    }

    /**
     * RN05/RN09: vincular inscrição da própria oferta, sem duplicidade e respeitando capacidade.
     * @throws UnsupportedOperationException stub previsto para a Sprint 03
     */
    public void adicionarInscricao(Inscricao inscricao) {
        throw new UnsupportedOperationException("Sprint 03: implementar OfertaDisciplina.adicionarInscricao");
    }

    /**
     * RN06: ao encerrar o período, ativar se houver ao menos 3 alunos; senão cancelar oferta e inscrições.
     * @throws UnsupportedOperationException stub previsto para a Sprint 03
     */
    public void avaliarAtivacao() {
        throw new UnsupportedOperationException("Sprint 03: implementar OfertaDisciplina.avaliarAtivacao");
    }

    /**
     * UC12: listar alunos com inscrições vigentes.
     * @throws UnsupportedOperationException stub previsto para a Sprint 03
     */
    public List<Aluno> listarAlunos() {
        throw new UnsupportedOperationException("Sprint 03: implementar OfertaDisciplina.listarAlunos");
    }
}

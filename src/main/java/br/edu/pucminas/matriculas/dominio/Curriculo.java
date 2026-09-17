package br.edu.pucminas.matriculas.dominio;

import java.util.ArrayList;
import java.util.List;

/** Oferta curricular de um curso em um semestre. */
public class Curriculo {
    private long id;
    private Curso curso;
    private Semestre semestre;
    private List<OfertaDisciplina> ofertas;

    /** Inicializa a estrutura; as validações de negócio serão implementadas na Sprint 03. */
    public Curriculo(long id, Curso curso, Semestre semestre) {
        this.id = id;
        this.curso = curso;
        this.semestre = semestre;
        this.ofertas = new ArrayList<>();
    }

    /**
     * UC06: criar oferta de disciplina do curso; não duplicar disciplina no currículo.
     * @throws UnsupportedOperationException stub previsto para a Sprint 03
     */
    public OfertaDisciplina ofertarDisciplina(long idOferta, Disciplina disciplina, Professor professor) {
        throw new UnsupportedOperationException("Sprint 03: implementar Curriculo.ofertarDisciplina");
    }
}

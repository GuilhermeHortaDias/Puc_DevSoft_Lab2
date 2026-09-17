package br.edu.pucminas.matriculas.dominio;

import java.util.ArrayList;
import java.util.List;

/** Catálogo do curso e suas disciplinas. */
public class Curso {
    private long id;
    private String nome;
    private int totalCreditos;
    private List<Disciplina> disciplinas;

    /** Inicializa a estrutura; as validações de negócio serão implementadas na Sprint 03. */
    public Curso(long id, String nome, int totalCreditos) {
        this.id = id;
        this.nome = nome;
        this.totalCreditos = totalCreditos;
        this.disciplinas = new ArrayList<>();
    }

    /**
     * UC05: atualizar nome e quantidade de créditos do curso.
     * @throws UnsupportedOperationException stub previsto para a Sprint 03
     */
    public void atualizarDados(String nome, int totalCreditos) {
        throw new UnsupportedOperationException("Sprint 03: implementar Curso.atualizarDados");
    }

    /**
     * RN02: vincular uma disciplina ao curso sem duplicação.
     * @throws UnsupportedOperationException stub previsto para a Sprint 03
     */
    public void adicionarDisciplina(Disciplina disciplina) {
        throw new UnsupportedOperationException("Sprint 03: implementar Curso.adicionarDisciplina");
    }
}

package br.edu.pucminas.matriculas.dominio;

/** Aluno vinculado a um curso. */
public class Aluno extends Usuario {
    private String registroAcademico;
    private Curso curso;

    /** Inicializa a estrutura; as validações de negócio serão implementadas na Sprint 03. */
    public Aluno(long id, String nome, String login, String senhaHash, String registroAcademico, Curso curso) {
        super(id, nome, login, senhaHash);
        this.registroAcademico = registroAcademico;
        this.curso = curso;
    }
}

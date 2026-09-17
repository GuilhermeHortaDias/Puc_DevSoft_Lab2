package br.edu.pucminas.matriculas.dominio;

/** Professor responsável por ofertas de disciplinas. */
public class Professor extends Usuario {
    private String registroFuncional;

    /** Inicializa a estrutura; as validações de negócio serão implementadas na Sprint 03. */
    public Professor(long id, String nome, String login, String senhaHash, String registroFuncional) {
        super(id, nome, login, senhaHash);
        this.registroFuncional = registroFuncional;
    }
}

package br.edu.pucminas.matriculas.dominio;

/** Usuário autorizado a manter cadastros e currículos. */
public class FuncionarioSecretaria extends Usuario {
    private String registroFuncional;

    /** Inicializa a estrutura; as validações de negócio serão implementadas na Sprint 03. */
    public FuncionarioSecretaria(long id, String nome, String login, String senhaHash, String registroFuncional) {
        super(id, nome, login, senhaHash);
        this.registroFuncional = registroFuncional;
    }
}

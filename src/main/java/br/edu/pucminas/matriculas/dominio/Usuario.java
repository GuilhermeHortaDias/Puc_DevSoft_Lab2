package br.edu.pucminas.matriculas.dominio;

/** Identidade comum aos usuários humanos. */
public abstract class Usuario {
    private long id;
    private String nome;
    private String login;
    private String senhaHash;

    /** Inicializa a estrutura; as validações de negócio serão implementadas na Sprint 03. */
    protected Usuario(long id, String nome, String login, String senhaHash) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senhaHash = senhaHash;
    }

    /**
     * RN01: verificar a senha informada contra o hash armazenado.
     * @throws UnsupportedOperationException stub previsto para a Sprint 03
     */
    public boolean validarSenha(String senha) {
        throw new UnsupportedOperationException("Sprint 03: implementar Usuario.validarSenha");
    }

    /**
     * UC02/UC03: atualizar identificação e login, preservando unicidade.
     * @throws UnsupportedOperationException stub previsto para a Sprint 03
     */
    public void atualizarDados(String nome, String login) {
        throw new UnsupportedOperationException("Sprint 03: implementar Usuario.atualizarDados");
    }

    /**
     * RN01: armazenar somente o hash da nova senha.
     * @throws UnsupportedOperationException stub previsto para a Sprint 03
     */
    public void alterarSenha(String novaSenha) {
        throw new UnsupportedOperationException("Sprint 03: implementar Usuario.alterarSenha");
    }
}

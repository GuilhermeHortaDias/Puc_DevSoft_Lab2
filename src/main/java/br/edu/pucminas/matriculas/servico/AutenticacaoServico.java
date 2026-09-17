package br.edu.pucminas.matriculas.servico;

import br.edu.pucminas.matriculas.dominio.Usuario;
import java.util.List;

/** Contrato de autenticação dos três perfis. */
public class AutenticacaoServico {
    private List<Usuario> usuarios;

    /** Inicializa a estrutura; as validações de negócio serão implementadas na Sprint 03. */
    public AutenticacaoServico(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    /**
     * UC01: localizar login único e validar senha; rejeitar credenciais inválidas.
     * @throws UnsupportedOperationException stub previsto para a Sprint 03
     */
    public Usuario autenticar(String login, String senha) {
        throw new UnsupportedOperationException("Sprint 03: implementar AutenticacaoServico.autenticar");
    }
}

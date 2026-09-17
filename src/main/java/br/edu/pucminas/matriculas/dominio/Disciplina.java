package br.edu.pucminas.matriculas.dominio;

/** Disciplina do catálogo, independente de sua oferta semestral. */
public class Disciplina {
    private long id;
    private String nome;
    private int creditos;

    /** Inicializa a estrutura; as validações de negócio serão implementadas na Sprint 03. */
    public Disciplina(long id, String nome, int creditos) {
        this.id = id;
        this.nome = nome;
        this.creditos = creditos;
    }

    /**
     * UC04: atualizar os dados da disciplina no catálogo.
     * @throws UnsupportedOperationException stub previsto para a Sprint 03
     */
    public void atualizarDados(String nome, int creditos) {
        throw new UnsupportedOperationException("Sprint 03: implementar Disciplina.atualizarDados");
    }
}

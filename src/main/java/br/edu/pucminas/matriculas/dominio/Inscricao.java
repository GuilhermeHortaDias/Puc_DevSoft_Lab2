package br.edu.pucminas.matriculas.dominio;

/** Vínculo entre uma matrícula semestral e uma oferta. */
public class Inscricao {
    private long id;
    private MatriculaSemestral matricula;
    private OfertaDisciplina oferta;
    private TipoOpcao tipo;
    private SituacaoInscricao situacao;

    /** Inicializa a estrutura; as validações de negócio serão implementadas na Sprint 03. */
    public Inscricao(long id, MatriculaSemestral matricula, OfertaDisciplina oferta, TipoOpcao tipo) {
        this.id = id;
        this.matricula = matricula;
        this.oferta = oferta;
        this.tipo = tipo;
        this.situacao = SituacaoInscricao.VIGENTE;
    }

    /**
     * UC10/RN06: marcar CANCELADA; também usado no cancelamento administrativo da oferta.
     * @throws UnsupportedOperationException stub previsto para a Sprint 03
     */
    public void cancelar() {
        throw new UnsupportedOperationException("Sprint 03: implementar Inscricao.cancelar");
    }
}

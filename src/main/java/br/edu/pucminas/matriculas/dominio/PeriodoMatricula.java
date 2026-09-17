package br.edu.pucminas.matriculas.dominio;

import java.time.LocalDateTime;

/** Intervalo no qual alunos podem efetuar ou cancelar inscrições. */
public class PeriodoMatricula {
    private LocalDateTime inicio;
    private LocalDateTime fim;
    private boolean encerrado;

    /** Inicializa a estrutura; as validações de negócio serão implementadas na Sprint 03. */
    public PeriodoMatricula(LocalDateTime inicio, LocalDateTime fim) {
        this.inicio = inicio;
        this.fim = fim;
        this.encerrado = false;
    }

    /**
     * RN04: considerar limites inclusivos e o indicador de encerramento.
     * @throws UnsupportedOperationException stub previsto para a Sprint 03
     */
    public boolean estaAberto(LocalDateTime agora) {
        throw new UnsupportedOperationException("Sprint 03: implementar PeriodoMatricula.estaAberto");
    }

    /**
     * RN04: encerrar somente após o fim; impedir alterações posteriores.
     * @throws UnsupportedOperationException stub previsto para a Sprint 03
     */
    public void encerrar(LocalDateTime agora) {
        throw new UnsupportedOperationException("Sprint 03: implementar PeriodoMatricula.encerrar");
    }
}

package br.edu.pucminas.matriculas.dominio;

import java.time.LocalDateTime;

/** Semestre letivo com um período de matrículas. */
public class Semestre {
    private int ano;
    private int numero;
    private PeriodoMatricula periodoMatricula;

    /** Inicializa a estrutura; as validações de negócio serão implementadas na Sprint 03. */
    public Semestre(int ano, int numero, PeriodoMatricula periodoMatricula) {
        this.ano = ano;
        this.numero = numero;
        this.periodoMatricula = periodoMatricula;
    }

    /**
     * UC07: definir intervalo válido de matrícula do semestre.
     * @throws UnsupportedOperationException stub previsto para a Sprint 03
     */
    public void definirPeriodo(LocalDateTime inicio, LocalDateTime fim) {
        throw new UnsupportedOperationException("Sprint 03: implementar Semestre.definirPeriodo");
    }
}

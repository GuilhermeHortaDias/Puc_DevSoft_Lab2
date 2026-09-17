package br.edu.pucminas.matriculas.servico;

import br.edu.pucminas.matriculas.dominio.Aluno;
import br.edu.pucminas.matriculas.dominio.Curriculo;
import br.edu.pucminas.matriculas.dominio.Curso;
import br.edu.pucminas.matriculas.dominio.Disciplina;
import br.edu.pucminas.matriculas.dominio.FuncionarioSecretaria;
import br.edu.pucminas.matriculas.dominio.OfertaDisciplina;
import br.edu.pucminas.matriculas.dominio.Professor;
import br.edu.pucminas.matriculas.dominio.Semestre;
import java.time.LocalDateTime;
import java.util.List;

/** Orquestração das operações administrativas. */
public class SecretariaServico {
    private List<Aluno> alunos;
    private List<Professor> professores;
    private List<Curso> cursos;
    private List<Disciplina> disciplinas;
    private List<Curriculo> curriculos;

    /** Inicializa a estrutura; as validações de negócio serão implementadas na Sprint 03. */
    public SecretariaServico(List<Aluno> alunos, List<Professor> professores, List<Curso> cursos, List<Disciplina> disciplinas, List<Curriculo> curriculos) {
        this.alunos = alunos;
        this.professores = professores;
        this.cursos = cursos;
        this.disciplinas = disciplinas;
        this.curriculos = curriculos;
    }

    /**
     * UC02: autorizar secretaria e cadastrar aluno com identificadores únicos.
     * @throws UnsupportedOperationException stub previsto para a Sprint 03
     */
    public void cadastrarAluno(FuncionarioSecretaria responsavel, Aluno aluno) {
        throw new UnsupportedOperationException("Sprint 03: implementar SecretariaServico.cadastrarAluno");
    }

    /**
     * UC02: autorizar secretaria e atualizar aluno cadastrado.
     * @throws UnsupportedOperationException stub previsto para a Sprint 03
     */
    public void atualizarAluno(FuncionarioSecretaria responsavel, Aluno aluno, String nome, String login) {
        throw new UnsupportedOperationException("Sprint 03: implementar SecretariaServico.atualizarAluno");
    }

    /**
     * UC03: autorizar secretaria e cadastrar professor com identificadores únicos.
     * @throws UnsupportedOperationException stub previsto para a Sprint 03
     */
    public void cadastrarProfessor(FuncionarioSecretaria responsavel, Professor professor) {
        throw new UnsupportedOperationException("Sprint 03: implementar SecretariaServico.cadastrarProfessor");
    }

    /**
     * UC03: autorizar secretaria e atualizar professor cadastrado.
     * @throws UnsupportedOperationException stub previsto para a Sprint 03
     */
    public void atualizarProfessor(FuncionarioSecretaria responsavel, Professor professor, String nome, String login) {
        throw new UnsupportedOperationException("Sprint 03: implementar SecretariaServico.atualizarProfessor");
    }

    /**
     * UC05: autorizar secretaria e cadastrar curso.
     * @throws UnsupportedOperationException stub previsto para a Sprint 03
     */
    public void cadastrarCurso(FuncionarioSecretaria responsavel, Curso curso) {
        throw new UnsupportedOperationException("Sprint 03: implementar SecretariaServico.cadastrarCurso");
    }

    /**
     * UC05: autorizar secretaria e atualizar curso cadastrado.
     * @throws UnsupportedOperationException stub previsto para a Sprint 03
     */
    public void atualizarCurso(FuncionarioSecretaria responsavel, Curso curso, String nome, int totalCreditos) {
        throw new UnsupportedOperationException("Sprint 03: implementar SecretariaServico.atualizarCurso");
    }

    /**
     * UC04: autorizar secretaria e cadastrar disciplina.
     * @throws UnsupportedOperationException stub previsto para a Sprint 03
     */
    public void cadastrarDisciplina(FuncionarioSecretaria responsavel, Disciplina disciplina) {
        throw new UnsupportedOperationException("Sprint 03: implementar SecretariaServico.cadastrarDisciplina");
    }

    /**
     * UC04: autorizar secretaria e atualizar disciplina cadastrada.
     * @throws UnsupportedOperationException stub previsto para a Sprint 03
     */
    public void atualizarDisciplina(FuncionarioSecretaria responsavel, Disciplina disciplina, String nome, int creditos) {
        throw new UnsupportedOperationException("Sprint 03: implementar SecretariaServico.atualizarDisciplina");
    }

    /**
     * UC06: autorizar secretaria e criar currículo único por curso e semestre.
     * @throws UnsupportedOperationException stub previsto para a Sprint 03
     */
    public Curriculo prepararCurriculo(FuncionarioSecretaria responsavel, long id, Curso curso, Semestre semestre) {
        throw new UnsupportedOperationException("Sprint 03: implementar SecretariaServico.prepararCurriculo");
    }

    /**
     * UC06: autorizar secretaria e adicionar oferta ao currículo do curso.
     * @throws UnsupportedOperationException stub previsto para a Sprint 03
     */
    public OfertaDisciplina ofertarDisciplina(FuncionarioSecretaria responsavel, Curriculo curriculo, long idOferta, Disciplina disciplina, Professor professor) {
        throw new UnsupportedOperationException("Sprint 03: implementar SecretariaServico.ofertarDisciplina");
    }

    /**
     * UC07: autorizar secretaria e definir período válido do semestre.
     * @throws UnsupportedOperationException stub previsto para a Sprint 03
     */
    public void definirPeriodo(FuncionarioSecretaria responsavel, Semestre semestre, LocalDateTime inicio, LocalDateTime fim) {
        throw new UnsupportedOperationException("Sprint 03: implementar SecretariaServico.definirPeriodo");
    }

    /**
     * UC08/RN06: autorizar secretaria, encerrar período após o fim e avaliar todas as ofertas dos currículos do semestre.
     * @throws UnsupportedOperationException stub previsto para a Sprint 03
     */
    public void encerrarMatriculas(FuncionarioSecretaria responsavel, Semestre semestre, LocalDateTime agora) {
        throw new UnsupportedOperationException("Sprint 03: implementar SecretariaServico.encerrarMatriculas");
    }
}

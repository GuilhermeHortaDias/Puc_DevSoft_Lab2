# Rastreabilidade — análise, modelo e código

Todos os caminhos abaixo são relativos a `src/main/java/br/edu/pucminas/matriculas/`. Os tipos estão no [modelo de classes](./CLASSES.md); os contratos são stubs nesta sprint.

| Caso de uso | Métodos principais | Arquivos |
| --- | --- | --- |
| UC01 | `autenticar`, `validarSenha` | `servico/AutenticacaoServico.java`, `dominio/Usuario.java` |
| UC02 | `cadastrarAluno`, `atualizarAluno`, `atualizarDados` herdado | `servico/SecretariaServico.java`, `dominio/Aluno.java`, `dominio/Usuario.java` |
| UC03 | `cadastrarProfessor`, `atualizarProfessor`, `atualizarDados` herdado | `servico/SecretariaServico.java`, `dominio/Professor.java`, `dominio/Usuario.java` |
| UC04 | `cadastrarDisciplina`, `atualizarDisciplina`, `atualizarDados` | `servico/SecretariaServico.java`, `dominio/Disciplina.java` |
| UC05 | `cadastrarCurso`, `atualizarCurso`, `atualizarDados`, `adicionarDisciplina` | `servico/SecretariaServico.java`, `dominio/Curso.java` |
| UC06 | `prepararCurriculo`, `ofertarDisciplina` | `servico/SecretariaServico.java`, `dominio/Curriculo.java`, `dominio/OfertaDisciplina.java` |
| UC07 | `definirPeriodo` | `servico/SecretariaServico.java`, `dominio/Semestre.java`, `dominio/PeriodoMatricula.java` |
| UC08 | `encerrarMatriculas`, `encerrar`, `avaliarAtivacao`, `cancelar` | `servico/SecretariaServico.java`, `dominio/PeriodoMatricula.java`, `dominio/OfertaDisciplina.java`, `dominio/Inscricao.java` |
| UC09 | `realizarMatricula`, `validarLimites`, `adicionarInscricao`, `estaAberto`, `possuiVaga` | `servico/MatriculaServico.java`, `dominio/MatriculaSemestral.java`, `dominio/OfertaDisciplina.java`, `dominio/PeriodoMatricula.java` |
| UC10 | `cancelarInscricao`, `cancelar` | `servico/MatriculaServico.java`, `dominio/Inscricao.java` |
| UC11 | `consultarVagas`, `contarInscritos`, `possuiVaga` | `servico/MatriculaServico.java`, `dominio/OfertaDisciplina.java` |
| UC12 | `consultarAlunos`, `listarAlunos` | `servico/MatriculaServico.java`, `dominio/OfertaDisciplina.java` |
| UC13 | `notificarMatricula`, coordenado por `realizarMatricula` | `integracao/GatewayCobranca.java`, `servico/MatriculaServico.java` |

| Regra | Elementos estruturais |
| --- | --- |
| RN01 | `Usuario.login`, `senhaHash`, `validarSenha`, `alterarSenha`; perfis especializados e `AutenticacaoServico`. |
| RN02 | `Curso.nome`, `totalCreditos`, `disciplinas`; `Curriculo.curso`, `semestre`, `ofertas`. |
| RN03 | `TipoOpcao`; constantes 4 e 2, `contarInscricoes` e `validarLimites` em `MatriculaSemestral`. |
| RN04 | `PeriodoMatricula.inicio`, `fim`, `encerrado`, `estaAberto`, `encerrar`; horário recebido como parâmetro para permitir testes futuros. |
| RN05 | `OfertaDisciplina.MAXIMO_ALUNOS = 60`, `contarInscritos`, `possuiVaga`, `adicionarInscricao`; `SituacaoInscricao`. |
| RN06 | `OfertaDisciplina.MINIMO_ALUNOS = 3`, `avaliarAtivacao`, `SituacaoOferta`; cancelamento das inscrições. |
| RN07 | Interface `GatewayCobranca` recebida pelo construtor de `MatriculaServico`. |
| RN08 | `OfertaDisciplina.professor`; contrato de `MatriculaServico.consultarAlunos`. |
| RN09 | `Aluno.curso`, `Curriculo.curso/semestre`, `MatriculaSemestral.aluno/semestre`, `Inscricao.matricula/oferta`; validações previstas nos serviços. |

## Limite desta entrega

Modelar uma restrição não significa implementá-la. Construtores inicializam a estrutura, coleções de domínio começam vazias e métodos de negócio interrompem a chamada com `UnsupportedOperationException`. Login, autorização, limites, atomicidade, persistência e comunicação externa ainda não funcionam. O projeto entrega a estrutura solicitada no Lab01S02 para implementação na Sprint 03.

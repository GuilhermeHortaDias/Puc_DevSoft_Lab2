# Sistema de Matrículas — Lab01S02

Projeto da disciplina **Projeto de Software**, do curso de Engenharia de Software da **Pontifícia Universidade Católica de Minas Gerais** — segundo semestre de 2026. Professora: Milena Menezes Adão.

## Integrantes

- Guilherme Horta Dias
- Rafael Abras
- Lucas Batista Duarte

## Segunda entrega — Sprint 02

Esta entrega contém a revisão dos casos de uso, o projeto estrutural e um projeto Java compilável com classes, atributos, construtores e **stubs dos métodos modelados**. Os métodos de negócio lançam `UnsupportedOperationException`; o funcionamento do sistema será implementado na Sprint 03. Não há aplicação interativa nesta etapa.

| Artefato | Conteúdo |
| --- | --- |
| [Casos de uso](./Artefato/DIAGRAMA.md) | Diagrama revisado e imagem original da Sprint 01. |
| [Revisão da análise](./Artefato/REVISAO-S02.md) | Correções, regras RN01–RN09 e decisões sobre ambiguidades do enunciado. |
| [Diagrama de classes](./Artefato/CLASSES.md) | Relacionamentos, atributos, métodos, tipos, multiplicidades e fontes PlantUML. |
| [Rastreabilidade](./Artefato/RASTREABILIDADE.md) | Correspondência entre casos de uso, regras, modelo e Java. |
| [Código Java](./src/main/java/br/edu/pucminas/matriculas) | 19 tipos distribuídos entre domínio, serviços e integração. |
| [Validação da entrega](./Artefato/VALIDACAO-S02.md) | Verificações realizadas e roteiro para a Sprint 03. |

### Compilar

Requisito: **JDK 17 ou superior** (`java` e `javac` disponíveis no `PATH`). Não há dependências de bibliotecas externas no código.

Em macOS/Linux, a partir da raiz do repositório:

```sh
./scripts/compilar.sh
```

As classes compiladas são gravadas em `target/classes`. O script usa `--release 17`, UTF-8 e trata avisos do compilador como erros.

Com Maven instalado (inclusive no Windows):

```sh
mvn clean compile
```

Para abrir em IntelliJ IDEA, Eclipse ou outra IDE, importe o `pom.xml` como projeto Maven e configure um JDK 17 ou superior. O diretório de fontes é `src/main/java`.

### Organização

```text
Artefato/                           Modelos, histórico e documentação
src/main/java/br/edu/pucminas/matriculas/
├── dominio/                        Usuários, catálogo e matrículas
├── servico/                        Autenticação e casos de uso
└── integracao/                     Contrato de cobrança
scripts/compilar.sh                  Compilação sem Maven
pom.xml                             Configuração do projeto Java
```

### Cinco etapas em commits

1. `docs: corrigir casos de uso e esclarecer regras da sprint 02`
2. `docs: modelar diagrama de classes e contratos do sistema`
3. `feat: criar projeto Java e classes de usuarios e catalogo`
4. `feat: adicionar classes e stubs de ofertas e matriculas semestrais`
5. `feat: adicionar servicos e concluir documentacao da sprint 02`

## Histórias de usuário

As histórias da primeira entrega estão preservadas em [Artefato/README.md](./Artefato/README.md). Abaixo está a versão consolidada com os identificadores usados nos diagramas e no código.

| Caso de uso | História |
| --- | --- |
| UC01 — Autenticar usuário | Como usuário, quero acessar minha conta com login e senha para utilizar as funcionalidades do meu perfil. |
| UC02 — Manter alunos | Como funcionário da secretaria, quero cadastrar e atualizar alunos para manter as informações acadêmicas corretas. |
| UC03 — Manter professores | Como funcionário da secretaria, quero cadastrar e atualizar professores para manter as informações do corpo docente. |
| UC04 — Manter disciplinas | Como funcionário da secretaria, quero cadastrar e atualizar disciplinas para organizar o catálogo acadêmico. |
| UC05 — Manter cursos | Como funcionário da secretaria, quero cadastrar e atualizar cursos, créditos e disciplinas para organizar sua estrutura acadêmica. |
| UC06 — Preparar currículo | Como funcionário da secretaria, quero preparar o currículo semestral com ofertas e professores para definir as disciplinas disponíveis. |
| UC07 — Definir período | Como funcionário da secretaria, quero definir o período de matrículas para controlar quando inscrições e cancelamentos são permitidos. |
| UC08 — Encerrar matrículas | Como funcionário da secretaria, quero encerrar o período e avaliar as ofertas para confirmar aquelas com pelo menos 3 alunos e cancelar as demais. |
| UC09 — Realizar matrícula | Como aluno, quero escolher até 4 disciplinas de primeira opção e até 2 alternativas para organizar meus estudos no semestre. |
| UC10 — Cancelar inscrição | Como aluno, quero cancelar uma inscrição durante o período permitido para alterar as disciplinas que cursarei. |
| UC11 — Consultar vagas | Como aluno, quero consultar vagas das ofertas do meu curso para escolher uma opção disponível. |
| UC12 — Consultar alunos | Como professor, quero consultar os alunos matriculados nas minhas ofertas para acompanhar minhas turmas. |
| UC13 — Notificar cobrança | Como sistema de cobranças, quero receber os dados da matrícula semestral para cobrar as disciplinas do aluno. |

Os limites de 4 + 2 escolhas, 3 a 60 alunos por oferta, validação do período e restrições de acesso estão detalhados nas [regras de negócio](./Artefato/REVISAO-S02.md). As alternativas foram tratadas como inscrições, preservando a interpretação da primeira entrega; essa decisão está explicitada para revisão com a professora.

## Enunciado original

[PDF anexado à primeira entrega](https://github.com/user-attachments/files/32010973/LABORATORIO_2_LAB_DESENVOLVIMENTO_DE_SOFTWARE.1.pdf)

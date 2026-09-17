# Revisão da análise — Lab01S02

Esta revisão parte das histórias e do diagrama entregues na Sprint 01. Não foram fornecidos comentários da professora; as correções abaixo resultam da comparação com o enunciado.

## Correções dos casos de uso

| Ponto da primeira versão | Correção e justificativa |
| --- | --- |
| Atores representados como elipses | Atores UML externos à fronteira do sistema; casos de uso em elipses dentro dela. |
| Autenticação repetida para cada perfil | Ator geral `Usuário`, especializado em aluno, professor e funcionário da secretaria. Autenticação é precondição para as ações protegidas. |
| Consulta de vagas sem associação direta com aluno | UC11 representa explicitamente a história de consultar disponibilidade. |
| Ativar/cancelar disciplinas como extensões da avaliação | Resultados obrigatórios e mutuamente exclusivos de UC08; documentados como regras, sem `extend` artificial. |
| Encerrar inscrições como extensão da consulta de vagas | Lotação é restrição de UC09. Consultar vagas não altera a oferta. |
| Disciplina sem distinção de semestre | O catálogo contém `Disciplina`; `OfertaDisciplina` representa sua realização em um currículo semestral. |
| Regras automáticas escritas como histórias da universidade | Mantidas como requisitos, identificadas abaixo como regras de negócio, sem inventar um ator Universidade. |

As setas tracejadas `include` apontam para o comportamento incluído. O sistema de cobranças permanece ator externo; sua implementação não pertence ao sistema de matrículas.

## Regras e decisões de modelagem

| ID | Regra / interpretação adotada |
| --- | --- |
| RN01 | Todo usuário humano possui login e senha. O modelo armazena `senhaHash`, nunca a senha em texto puro. Cada perfil só executa suas ações. |
| RN02 | Curso tem nome, total de créditos e disciplinas. Currículo reúne as ofertas de um curso em um semestre. |
| RN03 | Uma matrícula semestral reúne até 4 inscrições de primeira opção e até 2 alternativas, sem repetir a mesma oferta. A classificação pertence à escolha do aluno, não ao cadastro da disciplina. |
| RN04 | Inscrever-se e cancelar inscrições só são permitidos dentro do período do semestre, enquanto não encerrado. Início e fim são inclusivos; o encerramento administrativo ocorre após o fim. |
| RN05 | Uma oferta admite no máximo 60 inscrições vigentes, contando as duas categorias. Inscrições canceladas liberam vagas durante o período aberto. |
| RN06 | No encerramento, ofertas com 3 a 60 inscritos tornam-se ativas; com 0 a 2 são canceladas, assim como suas inscrições. Não se cancela a disciplina do catálogo. |
| RN07 | Após registrar com sucesso as escolhas do aluno no semestre, notificar o sistema de cobranças com a matrícula semestral. Nesta sprint existe apenas o contrato da integração. |
| RN08 | Professor consulta somente as ofertas sob sua responsabilidade e somente alunos com inscrição vigente. |
| RN09 | Aluno só altera sua matrícula; as ofertas escolhidas pertencem ao currículo do seu curso no semestre. Não há matrículas semestrais duplicadas para o mesmo aluno e semestre. |

### Pontos não detalhados no enunciado

- “4 disciplinas” e “mais 2 alternativas” são tratados como limites máximos, preservando a interpretação da Sprint 01; não se exige preencher as seis vagas.
- As alternativas contam como inscrições, como na análise inicial. Não se inventa promoção automática, fila de espera ou prioridade entre categorias. Caso a professora determine que alternativas sejam apenas reservas, revisar RN03/RN05 e a implementação na Sprint 03.
- Adota-se um professor por oferta e um curso por aluno. Um curso possui um currículo por semestre; neste protótipo há uma oferta por disciplina em cada currículo.
- Liberação de vagas por cancelamento durante o período é uma decisão de projeto: atingir 60 impede novas inscrições enquanto a oferta estiver lotada.
- Valores, pagamentos, reembolso, sincronização de cancelamentos com a cobrança e política de falhas da integração não foram especificados. Devem ser definidos antes da implementação da cobrança na Sprint 03; a notificação após inscrição é o requisito já modelado.

## Histórico

A versão original continua no histórico Git da Sprint 01. O PNG original também permanece em `diagrama-casos-de-uso.png` para comparação. A fonte editável revisada é `casos-de-uso.puml`, com visualização em `casos-de-uso.png`.

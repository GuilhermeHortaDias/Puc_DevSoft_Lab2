# Validação — Lab01S02

## Verificações da entrega

- Compilação via `scripts/compilar.sh`, com JDK 25.0.1 e `--release 17`, UTF-8, `-Xlint:all` e `-Werror`.
- Compilação Maven com Apache Maven 3.9.9: `mvn -B clean compile`, resultado `BUILD SUCCESS`, 19 arquivos compilados para Java 17. O Maven foi executado a partir de um diretório temporário, sem exigir instalação global.
- Compilação independente dos commits que introduzem as classes de catálogo/usuários e as classes semestrais, em diretórios temporários, sem depender de arquivos de commits posteriores.
- Conferência dos 19 tipos Java contra as declarações do UML: classes, classe abstrata, interface, enumerações, atributos, constantes, construtores e assinaturas dos métodos: 52 atributos/constantes e 52 assinaturas correspondentes.
- Renderização das fontes PlantUML em PNG e inspeção visual das imagens.
- Verificação dos links locais de documentação e de espaços em branco com `git diff --check`.

Essas verificações avaliam a estrutura da Sprint 02. Não representam testes das regras de negócio, pois os métodos ainda são stubs.

## Roteiro de aceitação para implementar na Sprint 03

| Cenário | Resultado esperado após implementação |
| --- | --- |
| Login válido / senha incorreta | Autenticar / recusar acesso; não expor hash nem senha. |
| Ação de outro perfil ou matrícula de outro aluno | Recusar a operação. |
| Escolher 4 primeiras opções e 2 alternativas | Permitir quando período, curso, semestre e vagas forem válidos. |
| Escolher a 5ª primeira opção ou a 3ª alternativa | Recusar sem alterar inscrições ou notificar cobrança. |
| Repetir oferta na mesma categoria ou entre categorias | Recusar duplicidade, inclusive entre chamadas sucessivas. |
| Escolher oferta de outro curso ou semestre | Recusar a operação. |
| Inscrição no início ou fim exatos do período | Permitir; recusar fora do intervalo ou após encerramento. |
| 59 inscritos e mais uma inscrição / 60 e mais uma | Aceitar a 60ª / recusar a 61ª, inclusive sob concorrência. |
| Cancelar durante o período / fora dele | Cancelar e liberar vaga / recusar a alteração. |
| Encerrar oferta com 0, 1 ou 2 inscritos | Cancelar oferta e suas inscrições. |
| Encerrar oferta com 3 ou 60 inscritos | Confirmar oferta como ativa. |
| Solicitar encerramento antes ou no instante final | Recusar; permitir encerramento somente após o fim. |
| Oferta lotada durante o período | Impedir inscrição; manter cancelamento disponível ao titular. |
| Professor consulta oferta própria / de outro professor | Listar apenas inscritos vigentes / recusar consulta. |
| Matrícula válida com múltiplas escolhas | Registrar lote completo e notificar cobrança após sucesso. |
| Falha de validação em qualquer escolha do lote | Não registrar parcialmente nem notificar cobrança. |
| Nova inscrição do mesmo aluno no mesmo semestre | Reutilizar matrícula semestral e aplicar limites acumulados. |

A definição do tratamento de falhas da cobrança e da sincronização de cancelamentos permanece pendente de detalhamento do requisito, conforme [decisões da análise](./REVISAO-S02.md).

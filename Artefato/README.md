# Histórias de Usuário

## Autenticação

### Autenticar usuário

Como usuário do sistema, quero acessar minha conta utilizando login e senha, para utilizar as funcionalidades correspondentes ao meu perfil.

## Secretaria

### Cadastrar e atualizar alunos

Como funcionário da secretaria, quero cadastrar e atualizar os dados dos alunos, para manter as informações acadêmicas corretas.

### Cadastrar e atualizar professores

Como funcionário da secretaria, quero cadastrar e atualizar os dados dos professores, para manter as informações do corpo docente corretas.

### Cadastrar e atualizar disciplinas

Como funcionário da secretaria, quero cadastrar e atualizar as disciplinas, para organizar as opções disponíveis para os cursos.

### Cadastrar e atualizar cursos

Como funcionário da secretaria, quero cadastrar e atualizar os cursos e seus créditos, para organizar a estrutura acadêmica da universidade.

### Preparar o currículo do semestre

Como funcionário da secretaria, quero preparar o currículo de cada semestre, para definir as disciplinas que serão oferecidas aos alunos.

### Definir o período de matrículas

Como funcionário da secretaria, quero definir o período de matrículas, para controlar quando os alunos poderão realizar ou cancelar suas matrículas.

### Processar o encerramento das matrículas

Como funcionário da secretaria, quero processar o encerramento do período de matrículas, para confirmar as disciplinas com pelo menos 3 alunos e cancelar aquelas que não atingirem esse número.

## Aluno

### Realizar matrícula

Como aluno, quero me matricular em até 4 disciplinas de primeira opção (obrigatórias) e até 2 alternativas (optativas), para organizar meus estudos no semestre.

### Cancelar matrícula

Como aluno, quero cancelar uma matrícula durante o período permitido, para alterar as disciplinas que cursarei no semestre.

### Consultar disponibilidade de vagas

Como aluno, quero saber se uma disciplina ainda possui vagas, para escolher uma opção disponível para matrícula.

## Professor

### Consultar alunos matriculados

Como professor, quero consultar os alunos matriculados em cada uma das minhas disciplinas, para acompanhar as turmas pelas quais sou responsável.

## Regras do sistema

### Encerrar inscrições ao atingir o limite

Como universidade, quero que as inscrições de uma disciplina sejam encerradas ao atingir 60 alunos, para respeitar o limite máximo da turma.

### Avaliar a quantidade mínima de alunos

Como universidade, quero que cada disciplina seja avaliada ao final do período de matrículas, para ativá-la quando houver pelo menos 3 alunos ou cancelá-la quando esse número não for alcançado.

## Sistema de Cobranças

### Receber dados da matrícula

Como sistema de cobranças, quero ser notificado após a matrícula do aluno, para realizar a cobrança das disciplinas do semestre.

## Revisão na Sprint 02

As categorias acima representam as escolhas do aluno no semestre. Os limites e o cancelamento se aplicam à oferta semestral, preservando o cadastro da disciplina. Consulte as [regras e decisões revisadas](./REVISAO-S02.md) e o [diagrama corrigido](./DIAGRAMA.md). As histórias da seção “Regras do sistema” são detalhadas como RN05 e RN06, sem representar um ator adicional.

# Instruções para Publicar no GitHub/GitLab

O repositório Git já foi inicializado localmente e o commit inicial foi feito.

## Opção 1: GitHub

### Passo 1: Criar repositório no GitHub
1. Acesse https://github.com e faça login
2. Clique no botão "+" no canto superior direito
3. Selecione "New repository"
4. Escolha um nome para o repositório (ex: `lab-prog2`, `atividade-programacao1`)
5. **NÃO** inicialize com README, .gitignore ou licença (já temos esses arquivos)
6. Clique em "Create repository"

### Passo 2: Conectar e fazer push
Execute os seguintes comandos no terminal (substitua `SEU_USUARIO` e `NOME_DO_REPO`):

```bash
git remote add origin https://github.com/SEU_USUARIO/NOME_DO_REPO.git
git branch -M main
git push -u origin main
```

Ou se preferir usar SSH:
```bash
git remote add origin git@github.com:SEU_USUARIO/NOME_DO_REPO.git
git branch -M main
git push -u origin main
```

## Opção 2: GitLab

### Passo 1: Criar repositório no GitLab
1. Acesse https://gitlab.com e faça login
2. Clique no botão "+" no canto superior direito
3. Selecione "New project / repository"
4. Escolha "Create blank project"
5. Escolha um nome para o repositório
6. **NÃO** inicialize com README
7. Clique em "Create project"

### Passo 2: Conectar e fazer push
Execute os seguintes comandos no terminal (substitua `SEU_USUARIO` e `NOME_DO_REPO`):

```bash
git remote add origin https://gitlab.com/SEU_USUARIO/NOME_DO_REPO.git
git branch -M main
git push -u origin main
```

Ou se preferir usar SSH:
```bash
git remote add origin git@gitlab.com:SEU_USUARIO/NOME_DO_REPO.git
git branch -M main
git push -u origin main
```

## Verificação

Após o push, você pode verificar se funcionou acessando o repositório no navegador. Todos os arquivos devem estar visíveis:
- `Main.java`
- `README.md`
- `test_cases.txt`
- `.gitignore`

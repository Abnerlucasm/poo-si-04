```git
git diff .
git add .
git commit -m '[mensagem de commit]'
git push (talvez usar "-u origin [nome-branch])
git pull
git fetch
git branch
git checkout
git checkout -b [nome-branch]
```

> `git add .`  *adiciona um novo arquivo no branch*

> `git commit -m 'mensagem'` *define o comentário para o novo arquivo adicionado a branch* 

> `git push`  *envia o (s) arquivos a branch*

> `git pull` *puxa os arquivos da branch*

> `git fetch` *atualiza as referencias de novos arquivos da branch*

> `git branch` *verifica as branchs criadas, pode ser usado para criar caso informado o parâmetro adequado*

> `git checkout nomedabranch` *usado para navegar/acessar as branchs*

> `git ckeckout -b 'nome-branch'` *cria a branch desejada*


# Passo a passo
1. `git init`
2. `git remote add origin <url ssh>`
3. `git config --global user.mail abnerlucas.m@gmail.com`
4. `git config --global user.name abner-freitas`
5. `git status`
6. `git add .`
7. `git commit -m 'mensagem'`
# Linketinder Gradle - by Heithor Urquiza Silva
Linketinder é um sistema baseado em Groovy, projetado para conectar candidatos e empresas de uma forma única e inovadora. O Linketinder tem como objetivo revolucionar a forma como as pessoas encontram oportunidades de trabalho e como as empresas descobrem talentos de alto nível.

## Link do repositório antigo
[linketinder-mvp](https://github.com/hecthorurquiza/linketinder-mvp)

---

## Funcionalidades Implementadas
CRUD básico funcionando para os modelos de Candidatos (Candidate), Empresas (Company), Vagas (Vacancies) e Competências (Competences)

---

## Requisitos Técnicos
* **Linguagem**: Groovy
* **Gerenciador de pacotes**: Gradle
* **Banco de Dados**: Postgres (um banco de dados Postgres pode ser criado para testes utilizando um arquivo docker-compose)

---

# Instruções para Build e Execução
## Pré-requisitos
* Ter o Gradle instalado na máquina. Se não tiver, você pode seguir as instruções de instalação aqui.
* Banco de dados Postgres configurado (se desejar testar localmente, utilize o arquivo docker-compose fornecido no projeto).

## Passos para Build
1. Clone este repositório:
```bash
git clone [URL do Repositório]
```

2. Navegue até o diretório do projeto:
```bash
cd linketinder-gradle
```

3. Execute o comando para fazer o build do projeto:
```bash
gradle build
```

## Executando o Projeto
* Após o build, execute o projeto com o seguinte comando:
```bash
gradle run
```
* O projeto será iniciado, e você poderá acessar as funcionalidades de CRUD para Candidatos, Empresas, Vagas e Competências.
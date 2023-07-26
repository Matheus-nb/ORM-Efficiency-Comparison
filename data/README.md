# Pasta "data" - Comparação de Eficiência de ORMs

Nesta pasta do repositório, encontram-se os arquivos de dados utilizados nos testes do Trabalho de Conclusão de Curso (TCC) com o tema "Comparação de Eficiência de ORMs". Aqui estão armazenados os scripts de criação de banco de dados e os dados de exemplo utilizados durante as análises comparativas dos ORMs Hibernate e Prisma.

## Objetivo

O objetivo desta pasta é centralizar todos os recursos de dados necessários para reproduzir os testes e experimentos realizados no TCC. Com esses arquivos, outros pesquisadores ou interessados poderão replicar os cenários de teste e verificar os resultados por conta própria.

## Referência

O banco de dados utilizado nos testes de comparação de eficiência dos ORMs Hibernate e Prisma foi criado a partir de uma referência específica. Nesta seção, explicaremos como o banco de dados foi projetado e quais foram as fontes utilizadas para sua construção.

### Descrição do Banco de Dados

O banco de dados usado como referencia trata-se do [Employees sample database](https://dev.mysql.com/doc/employee/en/employees-introduction.html) o qual é composto por 6 tabelas e um total de 4 milhões de dados. Contudo, apenas 3 tabelas foram utilizadas para os testes, com um total de aproximadamente 20000 dados ao todo.

### Entidades Principais

1. **Tabela de Employees**: Armazena informações sobre os empregados da aplicação, incluindo seu numero de empregado, primeiro nome, ultimo nome, data de nascimento, gênero e data de contratação.

2. **Tabela de Departments**: Contém informações sobre os departamentos da aplicação, incluindo o numero do departamento e nome do departamento.

3. **Tabela de DeptEmp**: Contém a relação de empregados/departamentos, incluindo o numero do empregado, numero do departamento, data de inicio de serviço e data final de serviço no departamento.

#### ER Diagram

![Alt text](https://github.com/Matheus-nb/ORM-Efficiency-Comparison/blob/6671b2107d92b910a1b4811fcf1d8177d034163c/data/ER%20Diagram.png)

## Estrutura da Pasta

A pasta "data" está organizada da seguinte forma:

- `/employees.sql`: Contém os scripts necessários para a criação do banco de dados utilizado nos testes.
- `/load_*.sql`: Scripts para inserir os dados de exemplo utilizados durante as análises.
- `/ER Diagram.mwb`: ER Diagram do banco de dados utilizados.

# Pasta "results" - Comparação de Eficiência de ORMs

Nesta pasta do repositório, encontram-se os arquivos de resultados dos testes do Trabalho de Conclusão de Curso (TCC) com o tema "Comparação de Eficiência de ORMs". Aqui estão armazenados as imagens dos gráficos de resultados, o PDF das tabelas de resultados, como também os links interativos para tais.

## Objetivo

O objetivo desta pasta é centralizar os resultados dos experimentos e testes realizados, permitindo que outros pesquisadores e interessados tenham acesso às conclusões e insights obtidos durante o estudo comparativo dos ORMs.

## Parâmetros de testes
Os seguintes parâmetros foram utilizados para a análise dos testes:
- **Q1** - Inserir na tabela 10.000 dados do tipo Employee
- **Q2** - Selecionar na tabela Employees um individuo com emp_no = 17869
- **Q3** - Selecionar na tabela Employees individuos com emp_no > 12000
- **Q4** - Selecionar na tabela Employees individuos cujo trabalham no dep_no = "d002"
- **Q5** - Selecionar na tabela Employees individuos cujo trabalham no dep_no = "d002" e tenham emp_no > 15000
- **Q6** - Selecionar na tabela Employees individuos cujo first_name contenha "da"
- **Q7** - Alterar fist_name dos Employees cujo emp_no > 15000
- **Q8** - Deletar da tabela Employees os individuos cujo first_name = "change_name"

Nos gráficos presentes, o parâmetro **Q1** se encontra omitido, o mesmo existe no texto de TCC, porém com implementação direta sem se utilizar da arquitetura web, como nosso comporativo, tinha como base a comparação de ORMs no desenvolvimeto web, acabou-se por ser retirado o parâmetro **Q1**, uma vez que os dados já existiam na base, e em um sistema de CRUD acabamos por armazenar geralmente 1 dado por vez, ao invés de 10000 dados de uma vez.
## Link Interativos

1. [Gráfico para 10 execuções de cada parâmetro dos testes](https://docs.google.com/spreadsheets/d/e/2PACX-1vTwg5r0bA2wdvBppH4Euz-ldT43SCMTL7oVlQ7q5uwIYp-C49Hl26XUr4UiiBmsIJ76r3OxM7hgTeue/pubchart?oid=444939502&format=interactive)
2. [Gráfico para 1000 execuções de cada parâmetro dos testes](https://docs.google.com/spreadsheets/d/e/2PACX-1vTwg5r0bA2wdvBppH4Euz-ldT43SCMTL7oVlQ7q5uwIYp-C49Hl26XUr4UiiBmsIJ76r3OxM7hgTeue/pubchart?oid=1176430176&format=interactive)
3. [Testes completos](https://docs.google.com/spreadsheets/d/e/2PACX-1vTwg5r0bA2wdvBppH4Euz-ldT43SCMTL7oVlQ7q5uwIYp-C49Hl26XUr4UiiBmsIJ76r3OxM7hgTeue/pubhtml)
## Atenção

Os dados e informações presentes nesta pasta são resultado de um estudo acadêmico e devem ser utilizados apenas para fins educacionais e de pesquisa. Caso você utilize ou referencie esses dados em seus próprios trabalhos, lembre-se de dar os devidos créditos ao autor do TCC e a este repositório.

Se tiver alguma dúvida adicional ou precisar de mais informações sobre os resultados apresentados, consulte a documentação do projeto no restante do repositório.

# Pasta "Prisma" - Comparação de Eficiência de ORMs

Nesta pasta do repositório, encontram-se os arquivos relacionados ao ORM Prisma utilizados no Trabalho de Conclusão de Curso (TCC) com o tema "Comparação de Eficiência de ORMs". Aqui estão armazenados os códigos, configurações e a collection utilizada no postman para testes.

## Sobre o ORM [Prisma](https://www.prisma.io)

O Prisma é um Object-Relational Mapping (ORM) moderno e poderoso, especialmente projetado para trabalhar com TypeScript e JavaScript. Ele simplifica a interação com bancos de dados relacionais, permitindo que os desenvolvedores consultem e manipulem dados usando modelos e consultas orientadas a objetos em vez de escrever SQL manualmente.

## Sobre o [Postman](https://www.postman.com)

O Postman é uma plataforma de colaboração para o desenvolvimento de APIs (Interfaces de Programação de Aplicativos) que permite aos desenvolvedores criar, testar, documentar e compartilhar facilmente APIs.

## Objetivo

O objetivo desta pasta é centralizar todos os arquivos e recursos relevantes do Prisma usados no TCC, garantindo que outros pesquisadores e interessados possam acessar e entender facilmente a implementação e utilização do Prisma nos testes de comparação de eficiência de ORMs.

## Estrutura da Pasta

A pasta "Prisma" está organizada da seguinte forma:

- `/PrismaTCC`: Contém os códigos desenvolvidos para o ORM Prisma.
  - `/prisma`: Contém o schema do banco de dados a ser criado, e as configurações de conexão ao banco.
  - `/src`: Contém os controllers e as rotas da aplicação.
- `/PRISMA.postman_collection.json`: Collection desenvolvida para testes apartir do Postman.

## Como Iniciar o Projeto

Se você deseja clonar o projeto para utilidades afins é necessário os seguintes passos abaixo:

1. Faça um Clone deste repositório `git clone https://github.com/Matheus-nb/ORM-Efficiency-Comparison.git`.
2. Navegue até a pasta do Prisma `cd Prisma/PrismaTCC`.
3. Instale as dependências necessárias `npm install`.
4. Configure o arquivo `schema.prisma` com as configurações do seu banco de dados.
5. Crie o mapeamento do modelo de dados para o banco de dados `npx prisma migrate dev --name init`.
6. Inicie o projeto `npm run dev` 

Lembre-se os passos documentos, levam em conta que já tenha em seu computador instalado o [NodeJS](https://nodejs.org/en).

## Atenção

Os arquivos presentes nesta pasta são fundamentais para a compreensão da utilização do Prisma no projeto de pesquisa. Certifique-se de que qualquer código ou configuração adicionado seja relevante e contribua para o propósito do TCC.

Se tiver alguma dúvida adicional ou precisar de mais informações sobre o uso do Prisma no projeto, consulte a documentação no restante do repositório.

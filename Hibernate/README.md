# Pasta "Hibernate" - Comparação de Eficiência de ORMs

Nesta pasta do repositório, encontram-se os arquivos relacionados ao ORM Hibernate utilizados no Trabalho de Conclusão de Curso (TCC) com o tema "Comparação de Eficiência de ORMs". Aqui estão armazenados os códigos, configurações e a collection utilizada no postman para testes.

## Sobre o ORM [Hibernate](https://hibernate.org)

O Hibernate é um framework de mapeamento objeto-relacional (ORM) de código aberto para a linguagem de programação Java. Ele fornece uma maneira conveniente e eficiente para que os desenvolvedores acessem e gerenciem dados em bancos de dados relacionais usando objetos Java.

## Sobre o [Postman](https://www.postman.com)

O Postman é uma plataforma de colaboração para o desenvolvimento de APIs (Interfaces de Programação de Aplicativos) que permite aos desenvolvedores criar, testar, documentar e compartilhar facilmente APIs.

## Sobre a Implementação
Afim de se utilizar de uma perspectiva web, foi se utilizado o SpringBoot com a adição do Spring Data JPA, o qual se utiliza do ORM Hibernate.

## Objetivo

O objetivo desta pasta é centralizar todos os arquivos e recursos relevantes do Hibernate usados no TCC, garantindo que outros pesquisadores e interessados possam acessar e entender facilmente a implementação e utilização do Hibernate nos testes de comparação de eficiência de ORMs.

## Estrutura da Pasta

A pasta "Hibernate" está organizada da seguinte forma:

- `/TCCI`: Contém os códigos desenvolvidos para o ORM Hibernate.
  - `/src`: Contém os controllers, models, repositories e dtos da aplicação.
- `/TCC.postman_collection.json`: Collection desenvolvida para testes apartir do Postman.
- `SQL - Alterar ordem das colunas para Hibernate.sql`: Script necessário para ordenar o schema da base de dados.

## Como Iniciar o Projeto

Se você deseja clonar o projeto para utilidades afins é necessário os seguintes passos abaixo:

1. Faça um Clone deste repositório `git clone https://github.com/Matheus-nb/ORM-Efficiency-Comparison.git`.
2. Navegue até a pasta do Prisma `cd Hibernate/TCCI`.
4. Configure o arquivo `application.properties` com as configurações do seu banco de dados.
6. Inicie o projeto `mvn spring-boot:run` (É aconselhavel utilizar a funcionalidade da própria IDE)
7. Após a primeira inicialização é necessário rodar o script `SQL - Alterar ordem das colunas para Hibernate.sql`
8. Inicie o projeto novamente `mvn spring-boot:run` (É aconselhavel utilizar a funcionalidade da própria IDE)

Lembre-se os passos documentos, levam em conta que já tenha em seu computador instalado um [JDK](https://www.oracle.com/java/technologies/downloads/#jdk20-windows) e uma [IDE](https://www.jetbrains.com/idea/).

## Atenção

Os arquivos presentes nesta pasta são fundamentais para a compreensão da utilização do Hibernate no projeto de pesquisa. Certifique-se de que qualquer código ou configuração adicionado seja relevante e contribua para o propósito do TCC.

Se tiver alguma dúvida adicional ou precisar de mais informações sobre o uso do Prisma no projeto, consulte a documentação no restante do repositório.

Este projeto foi desenvolvido como parte do curso de Java Completo do professor Nélio Alves (Udemy). A aplicação foca na construção de um sistema de gestão de vendedores e departamentos, aplicando conceitos avançados de persistência de dados e arquitetura de software.

O objetivo principal foi consolidar o conhecimento em integração de banco de dados MySQL utilizando JDBC, seguindo padrões de projeto profissionais para garantir um código escalável e de fácil manutenção.

Tecnologias Utilizadas:

Java 24

JDBC (Java Database Connectivity): Interface fundamental para comunicação com o banco de dados.

MySQL: Persistência de dados relacional.

Eclipse/VS Code: Ambientes de desenvolvimento utilizados.

Padrões de Projeto:

DAO Pattern (Data Access Object): Desacoplamento total entre a lógica de negócio e o acesso aos dados, facilitando a manutenção e testes.

Singleton Pattern: Implementação na classe DB para garantir uma única instância de conexão, otimizando o uso de recursos do servidor.

Gestão de Memória com Maps: No método findAll, utilizei HashMap para garantir que instâncias duplicadas de Department não sejam criadas desnecessariamente na memória.

Injeção de Dependência: O SellerDaoJDBC recebe a conexão via construtor, seguindo princípios de design flexível.

Custom Exceptions: Tratamento de erros de banco de dados centralizado na classe DbException, melhorando a legibilidade do código.

Funcionalidades Implementadas:

Busca por ID: Recuperação detalhada de vendedores com dados de seus respectivos departamentos.

Listagem por Departamento: Filtro eficiente de vendedores vinculados a um setor específico.

Listagem Completa: Recuperação de todos os registros com ordenação personalizada.

Como Executar o Projeto:

Clone este repositório.

Crie o banco de dados utilizando o script database.sql.

Configure o arquivo db.properties com suas credenciais do MySQL.

CP1 — Professor Salatiel Luz Marinho

Gabriel Barros Mazzariol RM 555410
Jefferson Junior Alvarez Urbina  RM 558497

Projeto em dupla dividido em dois repositórios:

| [SOA-CP1-api-erp](https://github.com/JeffersonJuniorr/SOA-CP1-api-erp) | Servidor SOAP — publica os serviços | Jefferson Junior |
| [CP1-SOA](https://github.com/gabriel-mazza/CP1-SOA.git) | Cliente SOAP — consome os serviços | Gabriel Barros Mazzariol |


Este projeto simula um sistema ERP simplificado para uma empresa de varejo.

O cenário é o seguinte: uma empresa possui setores diferentes (estoque, vendas, atendimento) que precisam se comunicar entre si. Cada setor pode ser um sistema independente, mas todos precisam acessar os mesmos dados de Produtos e Clientes.

A solução adotada foi uma API SOAP com JAX-WS, onde:
- O servidor publica os serviços centralizados de cadastro e consulta
- O cliente consome esses serviços via protocolo SOAP, usando stubs gerados automaticamente pelo `wsimport`

Essa arquitetura reflete o modelo SOA (Service-Oriented Architecture), no qual sistemas distribuídos se comunicam por meio de contratos formais definidos via WSDL.


Problemas que o Sistema Resolve

Antes da solução proposta, os problemas eram:

- Duplicação de dados: cada setor mantinha sua própria planilha de clientes e produtos, gerando inconsistências
- Falta de integração: sistemas diferentes não conseguiam se comunicar de forma padronizada
- Alto acoplamento: qualquer mudança em um sistema quebrava outros que dependiam dele
- Ausência de contrato formal: não havia uma definição clara de quais dados e operações estavam disponíveis

Com a API SOAP, todos os sistemas passam a consumir os mesmos serviços centralizados, garantindo consistência e padronização.


Boas Práticas Aplicadas

- Separação de responsabilidades: o servidor cuida apenas de publicar os serviços; o cliente cuida apenas de consumi-los
- Contrato formal via WSDL: o WSDL gerado automaticamente pelo JAX-WS define claramente todas as operações disponíveis, tipos de dados e endpoint
- Geração automática de stubs: uso do `wsimport` (via plugin Maven) para gerar as classes cliente automaticamente a partir do WSDL, eliminando código manual sujeito a erros
- Camadas bem definidas no servidor: separação em `model`, `repository` e `ws` (interface + implementação)
- Baixo acoplamento: o cliente não conhece a implementação do servidor — apenas o contrato WSDL
- Testes via Postman: collection documentada para validação manual dos endpoints


Arquitetura do Sistema


Tecnologias Utilizadas

| Tecnologia | Versão | Uso |
| Java | 17 | Linguagem principal |
| JAX-WS | 2.3.5 | Publicação e consumo de WebServices SOAP |
| Maven | 3.x | Gerenciamento de dependências |
| jaxws-maven-plugin | 2.6 | Geração automática de stubs via `wsimport` |
| Postman | — | Testes manuais dos endpoints |
| IntelliJ IDEA | — | IDE utilizada |

---

Endpoints Disponíveis

Todos os endpoints estão no endereço: `http://localhost:8080/sistema`

| Operação | Descrição | Parâmetros |
| `cadastrarProduto` | Cadastra um novo produto | nome, preço, quantidadeEstoque |
| `listarProdutos` | Retorna todos os produtos cadastrados | — |
| `cadastrarCliente` | Cadastra um novo cliente | nome, email, telefone |
| `listarClientes` | Retorna todos os clientes cadastrados | — |


Como Executar

Pré-requisitos
- Java 17+
- Maven 3.x
- IntelliJ IDEA (recomendado)

1. Subir o servidor


git clone https://github.com/JeffersonJuniorr/SOA-CP1-api-erp.git
cd SOA-CP1-api-erp


Execute a classe `Main.java`. O servidor estará disponível em:

http://localhost:8080/sistema?wsdl


Gerar os stubs e rodar o cliente (este projeto)


Com o servidor rodando, gere os stubs:
mvn generate-sources

Execute a classe Main.java


O menu interativo será exibido no terminal, permitindo cadastrar e listar produtos e clientes em tempo real.



Próximas Features

- Persistência em banco de dados: substituir o armazenamento em memória por um banco relacional (PostgreSQL ou MySQL)
- Autenticação no Header SOAP: adicionar token de segurança no `<soapenv:Header>` para proteger os endpoints
- Operação de atualização e remoção: implementar `atualizarProduto`, `removerProduto`, `atualizarCliente` e `removerCliente`
- Módulo de Pedidos: criar entidade `Pedido` vinculando clientes a produtos
- Deploy em servidor real: publicar o serviço em um servidor de aplicação como WildFly ou Tomcat
- Interface Web: criar um frontend simples para consumir os serviços sem precisar do terminal


Testando com Postman

Importe o arquivo `API-ERP_postman_collection.json` no Postman para testar os endpoints manualmente com requisições SOAP/XML prontas.


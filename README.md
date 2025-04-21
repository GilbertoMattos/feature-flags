### Feature Flags - Microsserviço de Exemplo

Este é um microsserviço de demonstração que implementa Feature Flags utilizando o framework Togglz com Spring Boot.

## 🚀 Tecnologias

- Java 21
- Spring Boot 3.4.4
- Togglz 4.4.0
- JTE (Java Template Engine) 3.2.0
- Lombok
- Spring Actuator
- Micrometer Prometheus

## 📋 Pré-requisitos

- Java 21 ou superior
- Maven 3.6 ou superior

## 🎯 Features Implementadas

### LAYOUT_NEW
- **Descrição**: Alterna entre o layout novo e antigo da listagem de produtos
- **Estado Padrão**: Desativado
- **Impacto**: Afeta a visualização da página de listagem de produtos

## 🖥️ Console de Administração

O Togglz fornece um console de administração web para gerenciar as feature flags:

- **URL**: `http://localhost:8081/togglz-console`
- **Segurança**: Desativada para ambiente de demonstração
- **Funcionalidades**:
  - Ativar/desativar features
  - Visualizar estado atual
  - Configurar estratégias de ativação

## 📊 Monitoramento

### Endpoints do Actuator

- `/actuator/health` - Status do serviço
- `/actuator/togglz` - Estado das feature flags
- `/actuator/info` - Informações da aplicação
- `/actuator/metrics` - Métricas do serviço

## 🔧 Como Executar

1. Clone o repositório
2. Build do projeto
3. Execute a aplicação
4. Acesse:
- Aplicação: `http://localhost:8081/produto`
- Console Togglz: `http://localhost:8081/togglz-console`

## 🔒 Segurança

**Nota**: Em ambiente de produção, recomenda-se:
- Ativar autenticação no console Togglz
- Configurar CORS adequadamente
- Restringir acesso aos endpoints do Actuator

## 📝 Notas de Desenvolvimento

- O projeto usa JTE como template engine
- Implementação de exemplo com uma única feature flag
- Monitoramento via Micrometer e Prometheus
- Suporte a hot-reload através do Spring DevTools

## 📚 Documentação Adicional

- [Documentação Togglz](https://www.togglz.org/documentation/overview.html)
- [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/current/reference/html/actuator.html)
- [JTE Documentation](https://jte.gg/)
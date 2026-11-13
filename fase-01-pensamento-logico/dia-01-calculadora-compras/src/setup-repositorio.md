# 🏗️ Arquitetura e Setup do Repositório

![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

Este documento registra as decisões de arquitetura, a estrutura de diretórios e o histórico de configuração inicial do repositório **`meus-projetos-Java`**, projetado para escalar ao longo de 6 fases de evolução técnica.

---

## 📂 Estrutura de Diretórios

A organização separa exercícios de fundamentos (microprojetos isolados) de aplicações completas com gerenciadores de dependências (Maven/Gradle):

```text
meus-projetos-Java/
├── .gitignore                        # Ignora binários (.class, .jar) e arquivos de IDE
├── README.md                         # Índice geral e acompanhamento de progresso
│
├── fase-01-pensamento-logico/        # Lógica básica, tipos primitivos e I/O
│   └── dia-01-calculadora-compras/
│       └── src/
├── fase-02-controle-fluxo/           # Condicionais e estruturas de repetição
├── fase-03-estruturas-dados/         # Arrays, listas, mapas e conjuntos
├── fase-04-orientacao-objetos/       # Classes, herança, polimorfismo e interfaces
├── fase-05-engenharia-software/      # Testes unitários, SOLID e padrões de projeto
└── fase-06-projetos-integradores/    # Aplicações completas e integrações
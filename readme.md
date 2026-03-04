# 🛍️ Virtual Store API - Web Service de Loja Virtual

[![Java Version](https://img.shields.io/badge/Java-21-blue.svg)](https://openjdk.java.net/projects/jdk/21/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.0-brightgreen.svg)](https://spring.io/projects/spring-boot)

API RESTful desenvolvida em Java 21 com Spring Boot para gerenciamento completo de uma loja virtual, oferecendo endpoints para catálogo de produtos, carrinho de compras, processamento de pedidos e gestão de usuários.

## 📋 Índice

- [Sobre o Projeto](#-sobre-o-projeto)
- [Tecnologias Utilizadas](#-tecnologias-utilizadas)
- [Funcionalidades](#-funcionalidades)
- [Arquitetura do Projeto](#-arquitetura-do-projeto)
- [Configuração e Instalação](#-configuração-e-instalação)
- [Endpoints da API](#-endpoints-da-api)

## 🎯 Sobre o Projeto

Este projeto consiste em um web service completo para uma loja virtual, desenvolvido com as tecnologias do ecossistema Spring. A API permite gerenciar produtos, usuários e pedidos, com foco em boas práticas de desenvolvimento.

## 🚀 Tecnologias Utilizadas

- **Java 21** - Última versão LTS com recursos modernos
- **Spring Boot 4.0.2** - Framework principal
- **Spring MVC** - Camada de controle REST
- **Spring Data JPA** - Persistência e acesso a dados
- **Maven** - Gerenciamento de dependências

## ⚙️ Funcionalidades

- ✅ CRUD completo de produtos
- ✅ Gestão de usuários
- ✅ Histórico de pedidos por usuário
- ✅ Tratamento global de exceções
- ✅ Validações de negócio

## 📐 Arquitetura do Projeto

O projeto segue os princípios da **Clean Architecture** e **Domain-Driven Design**:

## Configuração e Instalação

Para executar o projeto, tenha garantia de ter o java instalado na máquina. Você pode verificar utilizando o comando no terminal:

```bash
java --version
```

Em seguida basta executar o projeto com o comando:
```bash
./diretorio/run.sh
```

## Endpoints da API

Para utilizar os endpoints da API basta conectar o postman ao pronjeto.

### Endpoints

#### Users (/users):

- GET /users - Get all users
- GET /users/{id} - Get user by ID
- POST /users - Create user (body: name, phone, email, password)
- PUT /users/{id} - Update user (body: name, phone, email, password)
- DELETE /users/{id} - Delete user

#### Orders (/orders):

- GET /orders - Get all orders
- GET /orders/{id} - Get order by ID

#### Categories (/categories):

- GET /categories - Get all categories
- GET /categories/{id} - Get category by ID

#### Products (/products):

- GET /products - Get all products
- GET /products/{id} - Get product by ID
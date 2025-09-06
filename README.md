# Banco Simples – Projeto em Java

📌 **Autor:** Lucas Dias Bernardes  
📚 **Curso:** Ciências da Computação – UNIP  
📂 **Arquivo principal:** `Main.java`  

---

## 🎯 Objetivo

Este projeto simula um **sistema bancário simples** em Java.  
O sistema permite criar clientes, contas correntes e contas poupança, além de realizar operações básicas como **depósitos, saques e transferências**.  

O objetivo é praticar **Programação Orientada a Objetos (POO)**, **interfaces**, **herança**, **polimorfismo** e **encapsulamento**.

---

## 🛠️ Tecnologias utilizadas

- **Java 8+** → Linguagem principal do projeto.  
- **Orientação a Objetos** → Classes (`Conta`, `Cliente`, `Banco`), herança (`ContaCorrente`, `ContaPoupanca`), interfaces (`IConta`).  
- **Encapsulamento** → Uso de `private` e `protected` para atributos.  
- **Polimorfismo** → Uso de métodos sobrescritos como `imprimirExtrato()`.  
- **Coleções (List)** → Armazenamento de contas no banco (classe `Banco`).  

---

## 📝 Estrutura do Sistema

O sistema contém as seguintes classes e funcionalidades:

1. **Cliente**  
   - Armazena dados do cliente, como o nome.  

2. **Conta (abstract)**  
   - Classe base para `ContaCorrente` e `ContaPoupanca`.  
   - Contém atributos: agência, número da conta, saldo e cliente.  
   - Implementa métodos de **depósito**, **saque** e **transferência**.  
   - Possui método `imprimirInfosComuns()` para exibir informações da conta.  

3. **ContaCorrente e ContaPoupanca**  
   - Herdam de `Conta`.  
   - Implementam o método `imprimirExtrato()`, mostrando um extrato formatado.  

4. **Banco**  
   - Armazena o nome do banco e a lista de contas.  

5. **IConta (interface)**  
   - Define os métodos que todas as contas devem implementar: `depositar()`, `sacar()`, `transferir()` e `imprimirExtrato()`.  

---

## 🔄 Funcionalidades do Programa

No arquivo `Main.java`, o programa realiza o seguinte fluxo:

1. Criação de um **cliente**.  
2. Criação de uma **conta corrente** e **conta poupança** para o cliente.  
3. Realiza operações:  
   - Depósito na conta corrente.  
   - Transferência da conta corrente para a poupança.  
4. Imprime extratos das duas contas no console, mostrando:  
   - Titular  
   - Agência  
   - Número da conta  
   - Saldo atual  

---

## Conclusão

Este projeto demonstra o uso de POO em Java para modelar um sistema bancário simples.
Ele aplica conceitos como:

Herança e polimorfismo para diferenciar tipos de contas.

Encapsulamento para proteger dados sensíveis.

Interfaces para padronizar operações de contas.

É uma boa base para evoluir para um sistema bancário mais completo, adicionando funcionalidades como múltiplos clientes, histórico de transações e interface gráfica.

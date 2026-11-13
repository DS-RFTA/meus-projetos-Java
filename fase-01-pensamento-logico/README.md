# 🛒 Dia 01 — Calculadora de Compras

## 🎯 Objetivo
Desenvolver uma aplicação de console em Java que leia os dados de um item (nome, preço unitário, quantidade e percentual de desconto), calcule o valor bruto, o abatimento aplicado e exiba um recibo formatado no terminal.

---

## 🧠 Conceitos Praticados
- **Tipos Primitivos e Referência:** Uso de `String`, `int` e `double` para representação de dados comerciais.
- **Entrada de Dados:** Leitura via teclado com `java.util.Scanner` e padronização decimal com `java.util.Locale`.
- **Operadores Aritméticos:** Multiplicação, divisão percentual e subtração.
- **Formatação de Saída:** Alinhamento e controle de casas decimais com `System.out.printf()`.
- **Organização em Pacotes:** Estruturação do código sob `package app;` em vez do *default package*.

---

## 🚀 Como Executar

A partir da pasta `fase-01-pensamento-logico/dia-01-calculadora-compras`:

```bash
# 1. Compilar o código-fonte para a pasta 'out'
javac src/app/Main.java -d out

# 2. Executar a classe principal informando o pacote
java -cp out app.Main


💻 Exemplo de Saída

=== CALCULADORA DE COMPRAS ===
Nome do produto: Teclado Mecânico
Preço unitário (R$): 250.00
Quantidade: 2
Percentual de desconto (%): 10

--- RESUMO DO PEDIDO ---
Produto:     Teclado Mecânico
Quantidade:  2 x R$ 250.00
Subtotal:    R$ 500.00
Desconto:   -R$ 50.00 (10.0%)
TOTAL FINAL: R$ 450.00


---


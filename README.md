# 📘 Exercícios de Algoritmos em Java

Este repositório contém exercícios resolvidos em Java com foco no aprendizado de lógica de programação, estrutura de decisão, entrada/saída de dados e operações matemáticas. Os exercícios foram organizados em listas, cada uma com uma proposta de prática progressiva.

---
<!-- Lista01 -->
<details>
<summary><strong>📂 Lista 01 – Operações básicas e cálculos simples</strong></summary>

> ⚠️ **Instruções para esta lista:**
> 1. Os exercícios devem ser resolvidos utilizando **apenas estruturas básicas** como:
> 2. Operadores Aritméticos: `+`, `-`, `*`, `/`, `%`
> > **❌ Você não pode utilizar estruturas condicionais, arrays, listas, métodos ou estruturas de dados mais avançadas**

**🔹 [1.1](src/Lista01/L01_E01_AreaRetangulo.java)** Escreva um algoritmo para ler as dimensões de um retângulo (base e altura) e calcular a sua área.

**🔹 [1.2](src/Lista01/L01_E02_MediaAritmetica.java)** Escreva um algoritmo para ler 3 notas de um aluno e calcular a sua média final (média aritmética).

**🔹 [1.3](src/Lista01/L01_E03_MediaPonderada.java)** Escreva um algoritmo para ler 3 notas de um aluno e calcular a sua média final (média ponderada; o peso das notas é: 2, 3 e 5, respectivamente).

**🔹 [1.4](src/Lista01/L01_E04_IdadeEmAnosMesesDias.java)** Escreva um algoritmo para ler a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias (considerar o ano com 365 dias e o mês com 30 dias).

**🔹 [1.5](src/Lista01/L01_E05_IdadeEmDias.java)** Escreva um algoritmo para ler a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias (considerar o ano com 365 dias e o mês com 30 dias).

**🔹 [1.6](src/Lista01/L01_E06_ConversaoFahrenheitCelsius.java)** Escreva um algoritmo para ler a temperatura em Fahrenheit e calcular a temperatura correspondente em Celsius.

**🔹 [1.7](src/Lista01/L01_E07_ReajusteSalarial.java)** Escreva um algoritmo para ler o salário atual de um funcionário e o percentual de reajuste e calcular o seu novo salário.

**🔹 [1.8](src/Lista01/L01_E08_PercentualVotos.java)** Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.

**🔹 [1.9](src/Lista01/L01_E09_CustoCarroConsumidor.java)** Escreva um algoritmo para ler o custo de fábrica de um carro e escreva o custo ao consumidor, considerando o acréscimo de 28% do distribuidor e 45% de impostos.

**🔹 [1.10](src/Lista01/L01_E10_SalarioVendedor.java)** Escreva um algoritmo para calcular o salário final de um vendedor com base no número de carros vendidos, valor total das vendas, salário fixo e valor por carro vendido (com comissão de 5% sobre as vendas).

</details>

---
<!-- Lista02 -->
<details>
<summary><strong>📂 Lista 02 – Estruturas condicionais</strong></summary>

> ⚠️ **Instruções para esta lista:**
> 1. Você pode usar tudo o que aprendeu na lista anterior, e mais alguns comandos:
> 2. Operadores Aritméticos: `+`, `-`, `*`, `/`, `%`
> 3. Operadores Relacionais e Lógicos: `==`, `!=`, `<`, `>`, `<=`, `>=`, `&&`, `||`, `!`
> 4. Estruturas Condicionais: `if`, `else`, `else if`, `switch`, `ternários`
> > **❌ Você não pode utilizar arrays, listas, métodos ou estruturas de dados mais avançadas**

**🔹 [2.1](src/Lista02/L02_E01_Multiplos.java)** Escreva um algoritmo para ler 2 valores A e B e escrever seus valores seguidos da mensagem: "são múltiplos entre si" ou "não são múltiplos entre si".

**🔹 [2.2](src/Lista02/L02_E02_MaiorDeTres.java)** Escreva um algoritmo para ler 3 números inteiros e mostrar o maior deles.

**🔹 [2.3](src/Lista02/L02_E03_ParidadeESinal.java)** Escreva um algoritmo para ler um número inteiro e mostrar se é par ou ímpar, e se é positivo ou negativo.

**🔹 [2.4](src/Lista02/L02_E04_DuracaoJogo.java)** Escreva um algoritmo para ler a hora de início e fim de um jogo e calcular sua duração (até 24h, podendo passar para o dia seguinte).

**🔹 [2.5](src/Lista02/L02_E05_ValidaTriangulo.java)** Escreva um algoritmo para ler três valores A, B, C e verificar se formam um triângulo (A < B + C).

**🔹 [2.6](src/Lista02/L02_E06_TipoTriangulo.java)** Escreva um algoritmo para classificar um triângulo como Equilátero, Isósceles ou Escaleno, com base em suas medidas.

**🔹 [2.7](src/Lista02/L02_E07_CategoriaNadador.java)** Escreva um algoritmo para ler a idade de um nadador e classificá-lo em uma das categorias:
- Infantil A: 5-7 anos
- Infantil B: 8-10 anos
- Juvenil A: 11-13 anos
- Juvenil B: 14-17 anos
- Adulto: 18 anos ou mais

**🔹 [2.8](src/Lista02/L02_E08_NotaAlunoPonderada.java)** Escreva um algoritmo para ler o código de um aluno e suas três notas, calcular média ponderada (maior nota com peso 4, demais com peso 3), e informar a média e situação (APROVADO ou REPROVADO).

**🔹 [2.9](src/Lista02/L02_E09_ValorPedido.java)** Escreva um algoritmo para calcular o valor de um pedido com base no código e quantidade de um item do cardápio:

| Produto           | Código | Preço |
|-------------------|--------|-------|
| Cachorro-quente   | 100    | 1,20  |
| Bauru simples     | 101    | 1,30  |
| Bauru com ovo     | 102    | 1,50  |
| Hambúrguer        | 103    | 1,20  |
| Misto quente      | 104    | 1,30  |
| Refrigerante      | 105    | 1,00  |

**🔹 [2.10](src/Lista02/L02_E10_CreditoCliente.java)** Escreva um algoritmo para ler o saldo médio de um cliente e calcular o crédito com base na tabela:

| Saldo Médio     | Percentual de Crédito  |
|-----------------|------------------------|
| de 0 a 200      | nenhum crédito         |
| de 201 a 400    | 20%                    |
| de 401 a 600    | 30%                    |
| acima de 601    | 40%                    |

**🔹 [2.11](src/Lista02/L02_E11_ReajustePorCargo.java)** Escreva um algoritmo para calcular o novo salário de um funcionário com base no seu código de cargo:

| Código | Cargo      | Percentual de Aumento  |
|--------|------------|------------------------|
| 101    | Gerente    | 10%                    |
| 102    | Engenheiro | 20%                    |
| 103    | Técnico    | 30%                    |
| Outro  |            | 40%                    |

**🔹 [2.12](src/Lista02/L02_E12_OrdenaValores.java)** Escreva um algoritmo para ler um valor inteiro I e três reais A, B, C e:
- Se I = 1: mostrar A, B, C em ordem crescente.
- Se I = 2: mostrar A, B, C em ordem decrescente.

**🔹 [2.13](src/Lista02/L02_E13_DecomporNotas.java)** Escreva um algoritmo para ler um valor em reais e decompor esse valor na menor quantidade de notas de 100, 50, 10, 5, 2 e 1.

**🔹 [2.14](src/Lista02/L02_E14_MediaAproveitamento.java)** Escreva um algoritmo para ler número do aluno, suas três notas, média dos exercícios e calcular média de aproveitamento (MA):

    ```
    MA = (Nota1 + Nota2 × 2 + Nota3 × 3 + ME) / 7
    ```

Atribuir conceito:

| MA            | Conceito |
|---------------|----------|
| >= 9,0        | A        |
| 7,5 a < 9,0   | B        |
| 6,0 a < 7,5   | C        |
| 4,0 a < 6,0   | D        |
| < 4,0         | E        |

Mostrar também situação: APROVADO (A, B, C) ou REPROVADO (D, E).

**🔹 [2.15](src/Lista02/L02_E15_IndicePoluicao.java)** Escreva um algoritmo para ler o índice de poluição (entre 0,05 e 0,5) e emitir notificação para os seguintes grupos de indústrias:
- ≥ 0,3: Grupo 1 suspende atividades
- ≥ 0,4: Grupos 1 e 2 suspendem atividades
- ≥ 0,5: Todos os grupos suspendem atividades

</details>

---
<!-- Lista03 -->
<details>
<summary><strong>📂 Lista 03 – Laços de repetição</strong></summary>

> ⚠️ **Instruções para esta lista:**
> 1. Você pode usar tudo o que aprendeu na lista anterior, e mais alguns comandos:
> 2. Operadores Aritméticos: `+`, `-`, `*`, `/`, `%`
> 3. Operadores Relacionais e Lógicos: `==`, `!=`, `<`, `>`, `<=`, `>=`, `&&`, `||`, `!`
> 4. Estruturas Condicionais: `if`, `else`, `else if`, `switch`, `ternários`
> 5. Estruturas de Repetição: `while`, `do-while`, `for`
> > **❌ Você não pode utilizar arrays, listas, métodos ou estruturas de dados mais avançadas**

**🔹 [3.1](src/Lista03/L03_E01_IntervaloImpar.java)** Escreva um algoritmo para gerar e escrever os números ímpares entre 100 e 200.

**🔹 [3.2](src/Lista03/L03_E02_RestoDivisao5Por11.java)** Escreva um algoritmo para gerar os números de 1000 a 1999 e escrever aqueles que, divididos por 11, dão resto igual a 5.

**🔹 [3.3](src/Lista03/L03_E03_ProdutorioPares.java)** Escreva um algoritmo para ler vários números inteiros e positivos e calcular o produtório dos números pares. O fim da leitura será indicado pelo número 0.

**🔹 [3.4](src/Lista03/L03_E04_MaiorMenorMedia.java)** Escreva um algoritmo para ler 10 valores inteiros e:
- a) encontrar o maior valor;
- b) encontrar o menor valor;
- c) calcular a média dos números lidos.

**🔹 [3.5](src/Lista03/L03_E05_ProgressaoLinear.java)** Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem 1,10 metro e cresce 3 centímetros por ano. Escreva um algoritmo para calcular e imprimir quantos anos serão necessários para que Zé seja maior que Chico.

**🔹 [3.6](src/Lista03/L03_E06_Fatorial.java)** Escreva um algoritmo para ler um número inteiro e positivo e calcular o seu fatorial.

**🔹 [3.7](src/Lista03/L03_E07_Fatorial.java)** Escreva um algoritmo para ler dois números inteiros e positivos e informar se o segundo corresponde ao fatorial do primeiro.

**🔹 [3.8](src/Lista03/L03_E08_ProdutoPrimos.java)** Escreva um algoritmo para calcular e escrever o produto dos números primos entre 92 e 107.

**🔹 [3.9](src/Lista03/L03_E09_SerieEuler.java)** Escreva um algoritmo para ler um valor N inteiro e positivo e calcular o valor de E: ``` E = 1 + 1 / 1! + 1 / 2! + 1 / 3! + ... + 1 / N! ```

**🔹 [3.10](src/Lista03/L03_E10_NumerosPerfeitos.java)** Escreva um algoritmo para gerar e escrever os 5 primeiros números perfeitos.  
Um número perfeito é aquele que é igual à soma dos seus divisores (ex: 6 = 1 + 2 + 3 e 28 = 1 + 2 + 4 + 7 + 14).

**🔹 [3.11](src/Lista03/L03_E11_NumerosPerfeitos.java)** Escreva um algoritmo para ler um número inteiro e positivo e informar qual o próximo número perfeito a partir dele.

**🔹 [3.12](src/Lista03/L03_E12_EstatisticaPopulacional.java)** A prefeitura de uma cidade fez uma pesquisa entre seus habitantes. Escreva um algoritmo para ler o salário e número de filhos dos habitantes e escrever:
- a) média do salário da população;
- b) média do número de filhos;
- c) maior salário;
- d) percentual de pessoas com salário até R$ 100,00.  
  O final da leitura de dados dar-se-á com a entrada de um salário negativo.

**🔹 [3.13](src/Lista03/L03_E13_EstatisticaEleitoral.java)** Em uma eleição presidencial existem quatro candidatos. Os votos são informados através de códigos. Os dados utilizados para a contagem dos votos obedecem à seguinte codificação:
- 1, 2, 3, 4 = voto para os respectivos candidatos;
- 5 = voto nulo;
- 6 = voto em branco;

Escreva um algoritmo para ler o código do candidato em um voto. Calcular e escrever:
- total de votos para cada candidato;
- total de votos nulos;
- total de votos em branco;  
  O valor 0 finaliza o conjunto de votos.

**🔹 [3.14](src/Lista03/L03_E14_EstatisticaSalarial.java)** Foi feita uma pesquisa entre os habitantes de uma região. Escreva um algoritmo para ler idade, sexo (m/f) e salário dos habitantes. Calcular e escrever:
- a) a média de salário da população;
- b) maior e menor idade da população;
- c) quantidade de mulheres com salário até R$ 100,00.  
  Encerre a entrada de dados quando for digitada uma idade negativa.

**🔹 [3.15](src/Lista03/L03_E15_MediaPonderada.java)** Escreva um algoritmo para ler o código de um aluno e suas três notas. Calcule a média ponderada do aluno:
- Considerando que o peso para a maior nota seja 4 (quatro) e para as duas restantes, 3 (três)
- Mostre o código do aluno, suas três notas, a média calculada e uma mensagem:
  - **APROVADO:** se a média for maior ou igual a 5
  - **REPROVADO:** se a média for menor que 5.
- Repita a operação até que o código lido seja negativo.

**🔹 [3.16](src/Lista03/L03_E16_ProgressaoAritmetica.java)** Escreva um algoritmo para ler um número `n` (número de termos de uma progressão aritmética), `a1` (o primeiro termo da progressão) e `r` (a razão da progressão) e escrever os `n` termos desta progressão, bem como a soma dos elementos.

**🔹 [3.17](src/Lista03/L03_E17_Tabuada.java)** Escreva um algoritmo para ler um valor para uma variável `n` e calcular a tabuada de 1 até `n`. Escreva a tabuada na forma:

```
1 x n = n  
2 x n = 2n  
3 x n = 3n  
...  
n x n = n²
```

**🔹 [3.18](src/Lista03/L03_E18_CalculosCondicionais.java)** Escreva um algoritmo para ler um número não determinado de valores para `m`, todos inteiros e positivos.
- Se `m` for par, verificar quantos divisores possui e escrever esta informação.
- Se `m` for ímpar e menor do que 10, calcular e escrever o fatorial de `m`.
- Se `m` for ímpar e maior ou igual a 10, calcular e escrever a soma dos inteiros de 1 até `m`.

**🔹 [3.19](src/Lista03/L03_E19_EstatisticaPopulacional.java)** Foi realizada uma pesquisa de algumas características físicas da população de uma certa região. Coletaram-se os seguintes dados de cada habitante:
- sexo (masculino e feminino);
- cor dos olhos (azuis, verdes ou castanhos);
- cor dos cabelos (loiros, castanhos ou pretos);
- idade.

Calcular e escrever:
- a maior idade dos habitantes;
- a quantidade de indivíduos do sexo feminino cuja idade está entre 18 e 35 anos e que tenham olhos verdes e cabelos loiros.  
  Encerre a entrada de dados quando for digitada uma idade negativa.

**🔹 [3.20](src/Lista03/L03_E20_SerieHarmonica.java)** Escreva um algoritmo para ler um valor `n` inteiro e positivo e calcular a seguinte soma:  
S = 1 + 1/2 + 1/3 + 1/4 + ... + 1/n  
O algoritmo deve escrever cada termo gerado e o valor final de `S`.

</details>

---
<!-- Lista04 -->
<details>
<summary><strong>📂 Lista 04 – Vetores e operações com arrays</strong></summary>

> ⚠️ **Instruções para esta lista:**
> 1. Você pode usar tudo o que aprendeu na lista anterior, e mais alguns comandos:
> 2. Operadores Aritméticos: `+`, `-`, `*`, `/`, `%`
> 3. Operadores Relacionais e Lógicos: `==`, `!=`, `<`, `>`, `<=`, `>=`, `&&`, `||`, `!`
> 4. Estruturas Condicionais: `if`, `else`, `else if`, `switch`, `ternários`
> 5. Estruturas de Repetição: `while`, `do-while`, `for`
> 6. Estrutura de Dados: `tipo array[]`, `tipo matriz[][]`
> > **✅ Você pode utilizar vetores e matrizes**  
> > **❌ Você não pode utilizar listas, métodos ou estruturas de dados mais avançadas**

**🔹 [4.1](src/Lista04/L04_E01_VetorNumerosPares.java)** Escreva um algoritmo para criar e popular um vetor com os 100 primeiros números pares.

**🔹 [4.2](src/Lista04/L04_E02_VetorNumerosPrimos.java)** Escreva um algoritmo para criar e popular um vetor com os 10 primeiros números primos.

**🔹 [4.3](src/Lista04/L04_E03_VetorFatorial.java)** Escreva um algoritmo para receber 2 vetores A e B de tamanho 10 contendo números inteiros. Ao final do algoritmo, o vetor B deve conter o fatorial de cada elemento do vetor A.

**🔹 [4.4](src/Lista04/L04_E04_UniaoVetores.java)** Escreva um algoritmo para receber 2 vetores A e B de tamanho 10 contendo números inteiros. Ao final do algoritmo, um vetor C deve ser criado contendo a união de A e B.

**🔹 [4.5](src/Lista04/L04_E05_InterseccaoVetores.java)** Escreva um algoritmo para receber 2 vetores A e B de tamanho 10 contendo números inteiros. Ao final do algoritmo, um vetor C deve ser criado contendo a intersecção de A e B.

**🔹 [4.6](src/Lista04/L04_E06_QuantidadeNumerosPares.java)** Escreva um algoritmo para receber um vetor A de tamanho 15 contendo números inteiros e imprimir a quantidade de valores pares.

**🔹 [4.7](src/Lista04/L04_E07_SomarElementosVetor.java)** Escreva um algoritmo para receber um vetor A de tamanho 20 contendo números inteiros e imprimir a soma dos seus elementos.

**🔹 [4.8](src/Lista04/L04_E08_OrdenarVetorBubbleSortCrescente.java)** Escreva um algoritmo para receber um vetor A de tamanho 20 contendo números inteiros e ordená-lo em ordem crescente.

**🔹 [4.9](src/Lista04/L04_E09_OrdenarVetorBubbleSortDecrescente.java)** Escreva um algoritmo para receber 2 vetores A e B de tamanho 10 contendo números inteiros. Ao final do algoritmo, um vetor C deve ser criado contendo a união de A e B em ordem decrescente.

**🔹 [4.10](src/Lista04/L04_E10_FiltrarVetorNumerosPrimos.java)** Escreva um algoritmo para receber um vetor A de tamanho 10 contendo números inteiros. O algoritmo deve gerar um vetor B e o popular com os números primos do vetor A.

**🔹 [4.11](src/Lista04/L04_E11_EncontrarMaiorValorVetor.java)** Escreva um algoritmo para receber um vetor A de tamanho 15 contendo números inteiros e imprimir o maior valor do vetor.

**🔹 [4.12](src/Lista04/L04_E12_SomaElementosMatriz.java)** Escreva um algoritmo para receber uma matriz A(5,5) contendo números inteiros e imprimir a soma dos seus elementos.

**🔹 [4.13](src/Lista04/L04_E13_SomaDiagonalPrincipalMatriz.java)** Escreva um algoritmo para receber uma matriz A(5,5) contendo números inteiros e imprimir a soma do elementos da diagonal principal.

**🔹 [4.14](src/Lista04/L04_E14_SomaEspecificaMatriz.java)** Escreva um algoritmo para receber uma matriz A(5,5) contendo números inteiros e imprimir a soma dos elementos da linha 5 e da coluna 3.

**🔹 [4.15](src/Lista04/L04_E15_EncontrarValorDiagonalMatriz.java)** Escreva um algoritmo para receber uma matriz A(5,5) contendo números inteiros e imprimir o menor elemento da sua diagonal principal.

**🔹 [4.16](src/Lista04/L04_E16_ProdutoMatrizes.java)** Escreva um algoritmo para receber duas matrizes A(4,4) e B(4,4) e retornar a matriz C que seja o produto matricial de A por B.

**🔹 [4.17](src/Lista04/L04_E17_SomaMatrizes.java)** Escreva um algoritmo para receber duas matrizes A(4,4) e B(4,4) e retornar a matriz C que seja a soma de A com B.

**🔹 [4.18](src/Lista04/L04_E18_SomaLinhasPares.java)** Escreva um algoritmo para receber uma matriz A(9,9) de reais e imprimir a soma dos elementos das linhas pares de A.

**🔹 [4.19](src/Lista04/L04_E19_MultiplicaMatrizPorValor.java)** Escreva um algoritmo para receber uma matriz A(6,6) e um valor B. O algoritmo deve multiplicar cada elemento de A por B e armazenar em um vetor C.

**🔹 [4.20](src/Lista04/L04_E20_SomaLinhasEmVetor.java)** Escreva um algoritmo para receber uma matriz A(12,12). O algoritmo deve somar cada linha de A e armazenar em um vetor B.

</details>

---
<!-- Lista05 -->
<details>
<summary><strong>📂 Lista 05 – Introdução aos Métodos (Funções e Procedimentos)</strong></summary>

> ⚠️ **Instruções para esta lista:**
> 1. Você pode usar tudo o que aprendeu na lista anterior, e mais alguns comandos:
> 2. Operadores Aritméticos: `+`, `-`, `*`, `/`, `%`
> 3. Operadores Relacionais e Lógicos: `==`, `!=`, `<`, `>`, `<=`, `>=`, `&&`, `||`, `!`
> 4. Estruturas Condicionais: `if`, `else`, `else if`, `switch`, `ternários`
> 5. Estruturas de Repetição: `while`, `do-while`, `for`
> 6. Estrutura de Dados: `tipo array[]`, `tipo matriz[][]`
> 7. Métodos: `public static tipoRetorno nomeMetodo(tipo parametros) {corpo}`
> > **✅ Você pode utilizar arrays e métodos que você mesmo criou ou outros métodos simples**  
> > **❌ Você não pode utilizar listas, ou estruturas de dados mais avançadas**

**🔹 [5.01](src/Lista05/L05_E01_AreaRetangulo.java)** Escreva uma função para receber as dimensões de um retângulo (base e altura) e retornar a sua área.

**🔹 [5.02](src/Lista05/L05_E02_MediaPonderada.java)** Escreva uma função para receber 3 notas de um aluno e retornar a sua média final (média ponderada; o peso das notas é: 2, 3 e 5, respectivamente).

**🔹 [5.03](src/Lista05/L05_E03_IdadeEmAnosMesesDias.java)** Escreva uma função para receber a idade de uma pessoa expressa em dias e retorne ela expressa em anos, meses e dias (considerar o ano com 365 dias e o mês com 30 dias).

**🔹 [5.04](src/Lista05/L05_E04_CustoCarroConsumidor.java)** O custo ao consumidor de um carro novo é a soma do custo de fábrica com o percentual do distribuidor e dos impostos (aplicados ao custo de fábrica). O percentual do distribuidor é de 28% e os impostos de 45%. Escreva uma função para receber o custo de fábrica de um carro e retornar o custo ao consumidor.

**🔹 [5.05](src/Lista05/L05_E05_SalarioVendedor.java)** Uma revendedora de carros usados paga a seus funcionários um salário fixo por mês, mais uma comissão em reais para cada carro vendido e mais 5% do valor das vendas por ele efetuadas. Escreva uma função para receber o número de carros vendidos por um vendedor, o valor total de suas vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e retorne o salário final do vendedor.

**🔹 [5.06](src/Lista05/L05_E06_VerificarFatorial.java)** Escreva uma função para receber dois números inteiros e positivos e retornar se o segundo corresponde ao fatorial do primeiro.

**🔹 [5.07](src/Lista05/L05_E07_SerieEuler.java)** Escreva uma função para receber um valor N inteiro e positivo e retornar o valor de E: ``` E = 1 + 1 / 1! + 1 / 2! + 1 / 3! + ... + 1 / N! ```

**🔹 [5.08](src/Lista05/L05_E08_NumerosPerfeitos.java)** Escreva uma função para receber um número inteiro e positivo e retornar qual o próximo número perfeito a partir dele.

**🔹 [5.09](src/Lista05/L05_E09_ProgressaoAritmetica.java)** Escreva uma função para receber um número n (número de termos de uma progressão aritmética), a1 (o primeiro termo da progressão) e r (a razão da progressão) e retornar os n termos desta progressão.

**🔹 [5.10](src/Lista05/L05_E10_VetorFatorial.java)** Escreva uma função para receber um vetor A de números inteiros. A função deve retornar um vetor contendo o fatorial de cada elemento do vetor A.

**🔹 [5.11](src/Lista05/L05_E11_MaiorValorDoVetor.java)** Escreva uma função para receber um vetor A de números inteiros e retornar o maior valor do vetor.

**🔹 [5.12](src/Lista05/L05_E12_SomaElementosMatriz.java)** Escreva uma função para receber uma matriz A contendo números inteiros e retornar a soma dos seus elementos.

**🔹 [5.13](src/Lista05/L05_E13_SomaDiagonalPrincipalMatriz.java)** Escreva uma função para receber uma matriz A contendo números inteiros e retornar a soma dos elementos da diagonal principal.

**🔹 [5.14](src/Lista05/L05_E14_EncontrarValorDiagonalMatriz.java)** Escreva uma função para receber uma matriz A contendo números inteiros e retornar o menor elemento da sua diagonal principal.

**🔹 [5.15](src/Lista05/L05_E15_ProdutoMatrizes.java)** Escreva uma função para receber duas matrizes A e B e retornar a matriz C que seja o produto matricial de A por B.

</details>

---

> ✅ **As Próximas listas serão adicionadas conforme forem disponibilizadas.**

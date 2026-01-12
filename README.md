# Atividade #1 - Revisão de Programação 1

## Exercícios Implementados

### I - Seleção de Quadrante

Determina em qual quadrante do plano cartesiano se encontra um ponto (x, y).

#### Lógica do Programa

O programa verifica os sinais das coordenadas x e y:
- **Quadrante 1**: x < 0 e y > 0
- **Quadrante 2**: x > 0 e y > 0
- **Quadrante 3**: x < 0 e y < 0
- **Quadrante 4**: x > 0 e y < 0

#### Fluxograma

```
                    INÍCIO
                      │
                      ▼
                    Ler x
                      │
                      ▼
                    Ler y
                      │
                      ▼
          ┌───────────────────────────┐
          │   x > 0 AND y > 0 ?       │
          └─────────────┬─────────────┘
                        │
            ┌───────────┴───────────┐
            │                       │
          SIM                      NÃO
            │                       │
            ▼                       ▼
      Retornar 2          ┌──────────────────────┐
                          │ x < 0 AND y > 0 ?    │
                          └──────────┬───────────┘
                                     │
                        ┌────────────┴────────────┐
                        │                         │
                      SIM                        NÃO
                        │                         │
                        ▼                         ▼
                  Retornar 1          ┌──────────────────────┐
                                      │ x < 0 AND y < 0 ?    │
                                      └──────────┬───────────┘
                                                 │
                                    ┌────────────┴────────────┐
                                    │                         │
                                  SIM                        NÃO
                                    │                         │
                                    ▼                         ▼
                              Retornar 3                Retornar 4
                                    │                         │
                                    └─────────────┬───────────┘
                                                  ▼
                                                 FIM
```

#### Casos de Teste

| Input (x, y) | Output | Descrição |
|--------------|--------|-----------|
| 10, 6 | 2 | x positivo, y positivo → Quadrante 2 |
| 9, -13 | 4 | x positivo, y negativo → Quadrante 4 |
| -12, 5 | 1 | x negativo, y positivo → Quadrante 1 |
| -2, -2 | 3 | x negativo, y negativo → Quadrante 3 |

### II - Último Dígito Fatorial

Calcula o último dígito (unidade) de N! sem calcular o fatorial completo.

#### Lógica do Programa

Observação importante: Para qualquer N ≥ 5, o fatorial sempre contém os fatores 2 e 5, resultando em um múltiplo de 10, portanto o último dígito é sempre 0.

Para N < 5, calculamos o fatorial normalmente e retornamos o último dígito:
- 0! = 1 → último dígito: 1
- 1! = 1 → último dígito: 1
- 2! = 2 → último dígito: 2
- 3! = 3 × 2 = 6 → último dígito: 6
- 4! = 4 × 3 × 2 = 24 → último dígito: 4
- 5! = 120 → último dígito: 0
- 6! = 720 → último dígito: 0
- ...

#### Fluxograma

```
                    INÍCIO
                      │
                      ▼
          Ler T (número de casos de teste)
                      │
                      ▼
                    i = 0
                      │
                      ▼
          ┌──────────────────────┐
          │      i < T ?         │
          └──────────┬───────────┘
                     │
          ┌──────────┴──────────┐
          │                     │
        SIM                    NÃO
          │                     │
          ▼                     ▼
      Ler N                  FIM
          │
          ▼
    ┌──────────────┐
    │   N >= 5 ?   │
    └──────┬───────┘
           │
    ┌──────┴───────┐
    │              │
  SIM            NÃO
    │              │
    ▼              ▼
Retornar 0    fatorial = 1
    │              │
    │              ▼
    │           i = 2
    │              │
    │              ▼
    │      ┌───────────────┐
    │      │   i <= N ?    │
    │      └───────┬───────┘
    │              │
    │      ┌───────┴───────┐
    │      │               │
    │    SIM             NÃO
    │      │               │
    │      ▼               ▼
    │  fatorial *= i   fatorial % 10
    │      │               │
    │      ▼               │
    │      i++             │
    │      │               │
    │      └───────┐       │
    │              │       │
    │      ┌───────┘       │
    │      │               │
    │      ▼               │
    │  (continua loop)     │
    │      │               │
    └──────┴───────────────┘
                    │
                    ▼
            Mostrar resultado
                    │
                    ▼
                  i++
                    │
                    └──────┐
                           │
```

#### Casos de Teste

**Teste 1:**
```
Input:
3
1
2
3

Output:
1
2
6
```

**Teste 2:**
```
Input:
2
5
2

Output:
0
2
```

## Código-Fonte

O código está implementado na classe `Main.java` com os seguintes métodos:

- `determinarQuadrante(int x, int y)`: Determina o quadrante de um ponto
- `ultimoDigitoFatorial(int n)`: Calcula o último dígito de N!

## Como Executar

1. Compilar o código:
   ```bash
   javac Main.java
   ```

2. Executar o programa:
   ```bash
   java Main
   ```

3. Seguir as instruções no terminal para fornecer os valores de entrada.

## Resultados da Execução

### Exercício I - Casos de Teste

**Teste 1:**
```
Input:
x = 10
y = 6

Output:
2
```

**Teste 2:**
```
Input:
x = 9
y = -13

Output:
4
```

**Teste 3:**
```
Input:
x = -12
y = 5

Output:
1
```

**Teste 4:**
```
Input:
x = -2
y = -2

Output:
3
```

### Exercício II - Casos de Teste

**Teste 1:**
```
Input:
T = 3
N = 1
N = 2
N = 3

Output:
1
2
6
```

**Teste 2:**
```
Input:
T = 2
N = 5
N = 2

Output:
0
2
```

## Observações

- Para o Exercício I, assume-se que nenhuma coordenada terá valor 0 (conforme especificação).
- Para o Exercício II, a otimização para N ≥ 5 evita cálculos desnecessários de fatoriais grandes, pois todo fatorial de N ≥ 5 contém os fatores 2 e 5, resultando em múltiplo de 10 (último dígito = 0).

## Repositório Git

Este projeto está versionado com Git. Para publicar no GitHub ou GitLab, consulte o arquivo `GIT_SETUP.md` para instruções detalhadas.

### Status do Repositório

✅ Repositório Git inicializado
✅ Commit inicial realizado
📋 Aguardando configuração do repositório remoto (GitHub/GitLab)

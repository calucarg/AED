
# Práctica 1

Para realizar el punto 3 utilicé la extensión de vscode "Fast Unicode Math Characters"

## Repaso de lógica proposicional

### 1.Falta subir (hecho en papel)

### 2.Falta subir (hecho en papel)

### 3.a. qpq (p ∨ q) ∧ (p ∨ r) ≡ ¬p → (q ∧ r)

¬p → (q ∧ r) ≡ p ∨ (q ∧ r) (Definición de implicación)

p ∨ (q ∧ r) ≡ (p ∨ q) ∧ (p ∨ r) (Distributividad)

**¬p → (q ∧ r) ≡ (p ∨ q) ∧ (p ∨ r) como quería probar**

### 3.b. qpq ¬(¬p) → (¬(¬p ∧ ¬q)) ≡ q

¬(¬p) → (¬(¬p ∧ ¬q)) ≡ p → (p ∨ q) (Doble negación y Morgan)

p → (p ∨ q) ≡ ¬p ∨ (p ∨ q) (Definición implicación)

¬p ∨ (p ∨ q) ≡ (¬p ∨ p) ∨ q (Asociatividad)

(¬p ∨ p) ∨ q ≡ True ∨ q (Idempotencia)

True ∨ q ≡ True (Dominación)

**True ≢ q**


### 3.c. qpq ((True ∧ p) ∧ (¬p ∨ False)) → ¬(¬p ∨ q) ≡ p ∧ ¬q

((True ∧ p) ∧ (¬p ∨ False)) → ¬(¬p ∨ q) ≡ (p ∧ (¬p)) → (p ∧ ¬q) (Identidad y Morgan)

(p ∧ (¬p)) → (p ∧ ¬q) ≡ False → (p ∧ ¬q) (Contradicción)

False → (p ∧ ¬q) ≡ True ∨ (p ∧ ¬q) (Implicación)

True ∨ (p ∧ ¬q) ≡ True (identidad)

**True ≢ (p ∧ ¬q)**

### 3.d. qpq (p ∨ (¬p ∧ q)) ≡ (¬p → q)

(p ∨ (¬p ∧ q)) ≡ (p ∨ ¬p) ∧ (p ∨ q) (distributividad)

(p ∨ ¬p) ∧ (p ∨ q) ≡ True ∧ (p ∨ q) (exclusión)

True ∧ (p ∨ q) ≡ (p ∨ q) (identidad)

(p ∨ q) ≡ ¬p → q (implica)

**(p ∨ (¬p ∧ q)) ≡ ¬p → q como quería probar**


### 3.e. qpq p → (q ∧ ¬(q → r)) ≡ (¬p ∨ q) ∧ (¬p ∨ (q ∧ ¬r))**

p → (q ∧ ¬(q → r)) ≡ ¬p ∨ (q ∧ ¬(q → r)) (implica)

¬p ∨ (q ∧ ¬(q → r)) ≡ ¬p ∨ (q ∧ ¬(¬q ∨ r)) (implica)

¬p ∨ (q ∧ ¬(¬q ∨ r)) ≡ ¬p ∨ (q ∧ (q ∧ ¬r)) (Morgan)

¬p ∨ (q ∧ (q ∧ ¬r)) ≡ ¬p ∨ (q ∧ ¬r) (distributividad y q ∧ q ≡ q)

**p → (q ∧ ¬(q → r)) ≡ ¬p ∨ (q ∧ ¬r) como quería probar**


### 4.a.

| p     | ¬p           | p ∨ ¬p          |
|-------|--------------|-----------------|
|   V   |  F           |   V             |
|   F   |  V           |   V             |

**Tautología**

### 4.b.

| p     | ¬p           | p ∧ ¬p          |
|-------|--------------|-----------------|
|  V    |   F          |      F          |
|  F    |   V          |      F          |

**Contradicción**

### 4.c.

| p     | q            | ¬p           | ¬p ∨ q                | p → q                  | (¬p ∨ q) ↔ (p → q)     |
|-------|--------------|--------------|-----------------------|------------------------|------------------------|
|  V    |   V          |   F          |    V                  |   V                    |          V             |
|  F    |   V          |   V          |    V                  |   V                    |          V             |
|  V    |   F          |   F          |    F                  |   F                    |          V             |
|  F    |   F          |   V          |    V                  |   V                    |          V             |

¬p ∨ q ≡ p → q

**Tautología**

### 4.d.

| p     | q            | p ∧ q        | (p ∧ q) → p            |
|-------|--------------|--------------|------------------------|
|  V    |   V          |   V          |      V                 |
|  F    |   V          |   F          |      V                 |
|  V    |   F          |   F          |      V                 |
|  F    |   F          |   F          |      V                 |

**Tautología**

### 4.e.

| p     | q            | r            | p ∧ (q ∨ r)            | (p ∧ q) ∨ (p ∧ r)      | (p ∧ (q ∨ r)) ↔ ((p ∧ q) ∨ (p ∧ r)) |
|-------|--------------|--------------|------------------------|-------------------------|----------------------------------------|
|  V    |   V          |   V          |       V                |         V               |   V                                    |
|  V    |   V          |   F          |       V                |         V               |   V                                    |
|  V    |   F          |   F          |       F                |         F               |   V                                    |
|  V    |   F          |   V          |       V                |         V               |   V                                    |
|  F    |   V          |   V          |       F                |         F               |   V                                    |
|  F    |   F          |   V          |       F                |         F               |   V                                    |
|  F    |   V          |   F          |       F                |         F               |   V                                    |
|  F    |   F          |   F          |       F                |         F               |   V                                    |

Por distributiva

**Tautología**

### 4.f.

| p     | q            | r            | (q → r) | (p → r) | p → (q → r)  | (p → q) → (p → r)     | ((p → (q → r)) → ((p → q) → (p → r))) |
|-------|--------------|--------------|---------|---------|--------------|------------------------|------------------------------------------|
|  V    |   V          |   V          |   V     |   V     |      V       |       V                 |       V                                |
|  V    |   V          |   F          |   F     |   F     |      F       |       V                 |       V                                |
|  V    |   F          |   F          |   V     |   F     |      V       |       F                 |       F                                |
|  V    |   F          |   V          |   V     |   V     |      V       |       V                 |       V                                |
|  F    |   V          |   V          |   V     |   V     |      V       |       V                 |       V                                |
|  F    |   F          |   V          |   V     |   V     |      V       |       V                 |       V                                |
|  F    |   V          |   F          |   F     |   V     |      V       |       V                 |       V                                |
|  F    |   F          |   F          |   V     |   V     |      V       |       V                 |       V                                |

**Contingencia**

### 5.a.

| True | False | True → False | False → True |
|------|-------|--------------|--------------|
| V    | F     |     F        |  V           |

**False es más fuerte que True**

### 5.b.

| p    |     q |  (p ∧ q)     | (p ∨ q)      | (p ∧ q) → (p ∨ q) | (p ∨ q) → (p ∧ q) |
|------|-------|--------------|--------------|--------------------|-------------------|
| V    |   V   |    V         |    V         |        V           |        V          | 
| V    |   F   |    F         |    V         |        V           |        F          |
| F    |   V   |    F         |    V         |        V           |        F          |
| F    |   F   |    F         |    F         |        V           |        V          |

(p ∧ q) → (p ∨ q) es tautología
(p ∨ q) → (p ∧ q) es contingencia

**(p ∧ q) es más fuerte que (p ∨ q)**

### 5.c.

| p   | q | (p ∧ q) | p → (p ∧ q) | (p ∧ q) → p |
|-----|---|---------|-------------|-------------|
| V   | V | V       |    V        |  V          |
| V   | F | F       |    F        |  V          |
| F   | V | F       |    V        |  V          |
| F   | F | F       |    V        |  V          |

p → (p ∧ q) es contingencia
(p ∧ q) → p es tautología

**(p ∧ q) es más fuerte que p**

### 5.d.Falta subir (hecho en papel)

### 5.e.Falta subir (hecho en papel)

### 5.f.Falta subir (hecho en papel)

### 6.Falta subir (hecho en papel)

### 7.Falta subir (hecho en papel)

### 8.a.
- x ligada a ∀
- n, y, z libres

Con: n = 1, y = 2, z = 2

⇒ (0 ≤ x < 1 → x + 2 = 2)

Es verdadero para x ∈ {0}

### 8.b.
- x, y ligadas a ∀
- n, m, z libres

Con: n = 1, m = 1, z = 0

⇒ ((0 ≤ x < 1 ∧ 0 ≤ y < 1) → 0 + 0 = 0)

Es verdadero para x ∈ {0}, y ∈ {0}

### 8.c.
- j ligada a ∀

⇒ (∀j : Z)(0 ≤ j < 10 → j < 0)

Es falso ∀j

### 8.d. 
(∀<span style="color:orange">j</span> : Z)(j ≤ 0 → P(<span style="color:orange">j</span>)) ∧ P(<span style="color:green">j</span>)

- <span style="color:orange">j</span> es ligada a ∀
- <span style="color:green">j</span> es libre

Al no conocer P no se puede determinar un resultado.

### 9.a.

(∀i : Z)((0 ≤ i < 10) **∧** P(i))

Ejemplo: Si tomo i = -2 ⇒ (0 ≤ i < 10) es F, si tomo P(i) F → la formula es F pero debería poder ser V ya que no hay condición para cuando no se cumple (0 ≤ i < 10).

Solución: (∀i : Z)((0 ≤ i < 10) **⇒** P (i))

### 9.b.

(∃i : Z)((0 ≤ i < 10) **⇒** P(i))

Ejemplo:

Solución: (∃i : Z)((0 ≤ i < 10) **∧** P(i))

### 9.c.

(∀x : Z)((0 ≤ x < 10) → (P (x) ∧ Q(x)))

### 9.d.

¬((∃x : Z)(0 ≤ x < 10 ∧ P (x))) ∧ ¬((∃x : Z)(0 ≤ x < 10 ∧ Q(x)))

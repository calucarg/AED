
# Práctica 1

Para realizar el punto 3 utilicé la extensión de vscode "Fast Unicode Math Characters"

## Repaso de lógica proposicional

### 1.Falta subir

### 2.Falta subir

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
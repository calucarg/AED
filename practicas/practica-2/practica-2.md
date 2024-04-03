## 13.c.

proc divideAMas (in s : seq⟨ℤ⟩) : ℤ

    requiere {True}

    asegura {res ∈ s}

    asegura {(∃l : ℤ)(0 ≤ l < |s| ∧ s[l] mod res = 0)}

    asegura {¬(∃k : ℤ)( cantDiv(k,s) > cantdiv(res,s) )}

aux cantDiv (in a : ℤ, b : seq⟨ℤ⟩) { ∑(i=0,|s|-1)(IF b[i]%a=0 THEN 1 ELSE 0 FI)}

## 13.d.

proc (in l : seq⟨seq⟨ℤ⟩⟩) : seq⟨ℤ⟩
   
    requiere {True}
   
    asegura {(∃k : ℤ)(res ∈ l[k])}
   
    asegura {(∀i : ℤ)(0 ≤ i < |s|-1 →ₗ (∀j : ℤ)(((0 ≤ j < |s|-1) ∧ (i ≠ j)) →ₗ ¬(∃p : ℤ)(s[i][j] > res)))}

## 13.e.

proc partes(in l : seq⟨T⟩) : seq⟨seq⟨T⟩⟩

    requiere {todosDistintos(l)}

    asegura {|res| = $2^{|l|}$}

    asegura {(∀m : seq⟨T⟩)(0 ≤ m < |res| →ₗ (todosDistintos(res[m]) ∧ existeEn(res[m], l) ∧ ordenados(res[m],l)))}

pred todosDistintos(in l : seq⟨T⟩) {(∀i : ℤ)(0 ≤ i < |s| →ₗ (∀j : ℤ)(((0 ≤ j < |s|) ∧ (i ≠ j)) →ₗ s[i] ≠ s[j]))}

pred existeEn(in s : seq⟨T⟩, in d : seq⟨T⟩) {(∀g : ℤ)(0 ≤ g < |s|) →ₗ 
                                            (∃h : ℤ)(0 ≤ h < |d|) →ₗ s[g] = t[h]}

pred ordenados(in s : seq⟨T⟩, in d : seq⟨T⟩) {(∀g : ℤ)(0 ≤ g < |s|-1) →ₗ 
                                             (∃h : ℤ)(0 ≤ h < |d|-1 ∧ s[g] = t[h]) →ₗ s[g+1] = t[h+1]}

## 14.a.

a,b son in, no inout. está mal declarado el asegura.

proc sumar (in a, b : Z, inout c : Z)

requiere {True}

asegura {c = a + b}

## 14.b.

Está bien declarado.

## 14.c.

a = A₀ ∧ b = B₀ están tanto en el requiere como en el asegura, es válido pero redundante.

proc sumar (inout a, b: Z, inout c: Z)

requiere {a = A₀ ∧ b = B₀}

asegura {c = a + b}


## 15.a.

l es de tipo in, no inout

## 15.b.

l es de tipo in, no inout

## 15.c.

no definimos el valor inicial de l. Lo demás está bien.

## 15.d.

Está todo bien.

## 16.a.

No está teniendo en cuenta las posiciones pares

## 16.b.

No sabemos la longitud actual de L₀ en el asegura.

## 16.c.

l no es inout, es in.


## 16.alt.

proc duplicarPares (inout l: seq〈Z〉) : seq〈Z〉
    requiere {l = L₀}
    asegura {
        |l| = |L₀| ∧
        (∀i : Z)((0 ≤ i < |l| ∧ i%2 ≠ 0) →ₗ l[i] = L₀[i]) ∧
        (∀i : Z)((0 ≤ i < |l| ∧ i%2 = 0) →ₗ l[i] = 2 ∗ L₀[i])
        }

## 17.a.
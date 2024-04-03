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

proc todosDistintos(in l : seq⟨T⟩) : seq⟨seq⟨T⟩⟩

    requiere {sonDistintos(l)}

    asegura {|res| = $2^{|l|}$}

    asegura {(∀m : set⟨T⟩)()}

pred sonDistintos(in l : seq⟨T⟩) {(∀i : ℤ)(0 ≤ i < |s|-1 →ₗ (∀j : ℤ)(((0 ≤ j < |s|-1) ∧ (i ≠ j)) →ₗ s[i] ≠ s[j]))}
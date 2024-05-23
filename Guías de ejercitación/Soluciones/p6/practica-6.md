O(g) = {f| ∃ n0, c > 0 / n≥n0 ⇒ f ≤ c*g} n∈N

1.a.

qvq n^2−4n−2=O(n^2)

Tomo f=n^2−4n−2 y g=n^2, luego:

O(n^2) = {f| ∃ n_0, k > 0 / n≥n_0 ⇒ n^2−4n−2 ≤ k*n^2}
≡
O(n^2) = {f| ∃ n_0, k > 0 / n≥n_0 ⇒ −4n−2 ≤ k*n^2-n^2}
≡
O(n^2) = {f| ∃ n_0, k > 0 / n≥n_0 ⇒ −4n−2 ≤ (k-1)*n^2}
tomo k=1
≡
O(n^2) = {f| ∃ n_0, k > 0 / n≥n_0 ⇒ −4n−2 ≤ 0} y esto se cumple para todo n

1.b.

Si f ∈ O(n^k) → ∃ n0, c tq' f(n) ≤ c.n^k y qvq f(n) ≤ c'.n^(k+1), n0'≤ n
Y dado que f(n)≤ c.n^k ≤ c.n^(k+1) esto es particularmente cierto dado n0' = n0 ∧ c = c'

1.c.

Si f ∈ O(log n) ⇒ O(log n) = {f| ∃ n_0, k > 0 / n≥n_0 ⇒ f ≤ k*log(n)}

Y quiero ver que f∈ O(n) = {f| ∃ n0', k' > 0 / n≥n0' ⇒ f ≤ k'*n} y esto es cierto ya que:

si tomo n0' = n_0 ∧ k' = k y sabiendo que f ≤ k*log(n) ent f ≤ k*log(n) ≤ k*n ya que log(n) ≤ n para todo n0

2.a.

2^n ∈ O(1) = {2^n| ∃ n0, k > 0 / n≥n0 ⇒ 2^n ≤ k} pero esto es falso, ya que 2^n es creciente y no acotable por una constante k.

2.b.

O(n!) = {n| ∃ n0, k > 0 / n≥n_0 ⇒ n ≤ k*n!} y esto es cierto, por ejemplo, para k≥1 y cualquier n0

2.c.

O(n^n) = {n!| ∃ n0, k > 0 / n≥n0 ⇒ n! ≤ k*n^n}
⇔ n! ≤ k*n^n, tomo k = 1 y veo que n! ≤ n^n y esto es cierto ∀n≥n0≥1

2.d.

2^n = O(n!)?

O(n!) = {2^n| ∃ n0, c > 0 / n≥n0 ⇒ 2^n ≤ c*n!} pero esto es falso para un n suficientemente grande y cualquier c, n0

2.e.

Para todo i, j ∈ N, i · n = O(j · n)

Dado O(j.n) = {f| ∃ n0, c > 0 / n≥n0 ⇒ i.n ≤ c*j.n} basta ver que
i ≤ c*j y esto es cierto para algún c ≥ i/j y para todo n0

2.f.

Para todo k ∈ N, 2^k = O(1).

O(1) = {2^k| ∃ n0, c > 0 / n≥n0 ⇒ 2^k ≤ c} y esto es cierto para todo c ≥ 2^k

2.g.

log n = O(n)

O(n) = {log n| ∃ n0, c > 0 / n≥n0 ⇒ log(n) ≤ c*n}
y esto es cierto siempre

2.h.

n! = O(2^n)

O(2^n) = {n!| ∃ n0, c > 0 / n≥n0 ⇒ n! ≤ c*2^n} y esto es cierto tomando por ej n0 = 4 y c=1

2.i.

Si b=0 ent  n^5 + bn^3 = n^5 y qvq n^5 ∈ Θ(n^5) y esto es cierto ya que n^5≤n^5≤n^5

Pero qvq si b≠0 luego n^5 + bn^3 ̸∈ Θ(n^5) 
necesito c1,c2,n0 tq:
c1​⋅n^5≤n^5+bn^3≤c2​⋅n^5
≡
(c1-1).n^5≤bn^3≤(c2​-1).n^5
≡
(c1-1).n^2≤b≤(c2​-1).n^2 pero esto no puede ser dado que c1,c2>0 y no puedo acotar n^2 por una b constante, para el único caso que funciona es c1=c2=0 ent 0≤b≤0 ≡ b=0

2.j.

qvq O(g) = {(n^k)log(n)| ∃ n0, c > 0 / n≥n0 ⇒ (n^k)log(n) ≤ c*(n^k)*n}

vasta ver q (n^k)log(n) ≤ c*(n^k)*n ⇔ log(n) ≤ c*n y tomo c=1 ent es cierto para todo n≥n0

2.k.

O(f) = {f| ∃ n0, c > 0 / n≥n0 ⇒ f ≤ c*f}, es cierto para todo c≥1, n0

3.

Significa que f está acotada superiormente por g

si tenemos O(f ) ⊆ O(g) y O(g) ⊆ O(f ) ent tienen un crecimiento similar

O(g) = {f| ∃ n0, c > 0 / n≥n0 ⇒ f ≤ c*g} n∈N
Ω(g) = {f| ∃ n0, c > 0 / n≥n0 ⇒ f ≥ c*g} n∈N
Θ(g) = {f| ∃n0, c1, c2 > 0 / n≥n0 ⇒ c1*g ≤ f ≤ c2*g}

5.a.
O(n^2) ∩ Ω(n) = Θ(n^2)

O(n^2) ∩ Ω(n) ≡ 
{f| ∃ n0, c1 > 0 / n≥n0 ⇒ f ≤ c1*n^2} ∩ {f| ∃ n0, c2 > 0 / n≥n0 ⇒ f ≥ c2*n} ≡
{f| ∃ n0, c1, c2 > 0 / n≥n0 ⇒ c2*n ≤ f ≤ c1*n^2}
∧
Θ(n^2) = {f| ∃n0, k1, k2 > 0 / n≥n0 ⇒ k1*n^2 ≤ f ≤ k2*n^2}

y qvq O(n^2) ∩ Ω(n) = Θ(n^2) luego:

{f| ∃ n0, c1, c2 > 0 / n≥n0 ⇒ c2*n ≤ f ≤ c1*n^2} = 
{f| ∃ n0, k1, k2 > 0 / n≥n0 ⇒ k1*n^2 ≤ f ≤ k2*n^2} ≡

tomo c1=k2, c2=k1, luego:

{f| ∃ n0, k1, k2 > 0 / n≥n0 ⇒ k1*n ≤ k1*n^2 ≤ f ≤ k2*n^2}
la primera afirmación es concretamente cierta para todo n, luego:

{f| ∃ n0, k1, k2 > 0 / n≥n0 ⇒ k1*n^2 ≤ f ≤ k2*n^2} por lo tanto la afirmación es cierta

5.b.

Θ(n) ∪ Θ(n log n) = Ω(n log n) ∩ O(n)

Θ(n) = {f| ∃n0, k1, k2 > 0 / n≥n0 ⇒ c1*n ≤ f ≤ c2*n}
Θ(n log n) = {f| ∃n0, k3, k4 > 0 / n≥n0 ⇒ c1*n log n ≤ f ≤ c2*n log n}
Ω(n log n) = {f| ∃ n0, c1 > 0 / n≥n0 ⇒ f ≥ c1*n log n}
O(n) = {f| ∃ n0, c2 > 0 / n≥n0 ⇒ f ≤ c2*n}

tenemos que Θ(n) ∪ Θ(n log n) ≡ 
{f| ∃n0, k1, k2 > 0 / n≥n0 ⇒ k1*n ≤ f ≤ k2*n} ∪ {f| ∃n0, k3, k4 > 0 / n≥n0 ⇒ k3*n log n ≤ f ≤ k4*n log n} ≡
{f| ∃n0, k1, k2, k3, k4 > 0 / n≥n0 ⇒ k1*n ≤ f ≤ k2*n ∨ k3*n log n ≤ f ≤ k4*n log n}

y tenemos que:
Ω(n log n) ∩ O(n) ≡ {f| ∃ n0, c1, c2 > 0 / n≥n0 ⇒ c1*n log n ≤ f ≤ c2*n}

luego:

sup q k3*n log n ≤ f ≤ k4*n log n esto no implica c1*n log n ≤ f ≤ c2*n ya que:

si f ≤ k4*n log pero ¬(f ≤ c2*n) ent es falso.

5.c.

f ∈ O(g) ⇐⇒ O(f ) ⊆ O(g)
por definicion se que ⇒ se cumple, queda ver el ⇐

f ∈ O(g) ⇐ O(f) ⊆ O(g)?

f ∈ O(f) siempre, luego:

f ∈ O(f) ∧ O(f) ⊆ O(g) ⇒ f ∈ O(g) V

O(g) = {f| ∃ n0, c > 0 / n≥n0 ⇒ f ≤ c*g}
Ω(g) = {f| ∃ n0, c > 0 / n≥n0 ⇒ f ≥ c*g}
Θ(g) = {f| ∃n0, c1, c2 > 0 / n≥n0 ⇒ c1*g ≤ f ≤ c2*g}



5.d.

Si f ∈ Ω(g), entonces O(f) ∩ Ω(g) = O(g) ∩ Ω(f)

f ∈ Ω(g) ≡ Ω(g) = {f| ∃ n0, c1 > 0 / n≥n0 ⇒ f ≥ c1*g} 
f ∈ O(f) ≡ O(f) = {f| ∃ n0, c2 > 0 / n≥n0 ⇒ f ≤ c2*f}

luego:

O(f) ∩ Ω(g) ≡ {f| ∃ n0, c1,c2 > 0 / n≥n0 ⇒ c1*g ≤ f ≤ c2*f } y qvq es igual a:

Ω(f) = {f| ∃ n0, k1 > 0 / n≥n0 ⇒ f ≥ k1*f}
O(g) = {h| ∃ n0, k2 > 0 / n≥n0 ⇒ h ≤ k2*g} pero esto no es necesariamente cierto, ya que

f ∈ Ω(g) ̸⇒ f ∈ O(g)

REHACER LA PRUEBA!!
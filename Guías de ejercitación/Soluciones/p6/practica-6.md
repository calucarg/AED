$$O(g) = \{f| \exists n_0, c > 0 / n\geq n_0 \Rightarrow f \leq c*g\} n\in\mathbb{N}$$

$$1.a.$$

$$qvq\ n^2-4n-2=O(n^2)$$

$$Tomo\ f=n^2-4n-2\ y\ g=n^2,\ luego:$$

$$O(n^2) = \{f| \exists n_0, k > 0 / n\geq n_0 \Rightarrow n^2-4n-2 \leq k*n^2\}$$
$$\equiv$$
$$O(n^2) = \{f| \exists n_0, k > 0 / n\geq n_0 \Rightarrow -4n-2 \leq (k-1)*n^2\}$$
$$\equiv$$
$$O(n^2) = \{f| \exists n_0, k > 0 / n\geq n_0 \Rightarrow -4n-2 \leq (k-1)*n^2\}$$
$$tomo\ k=1$$
$$\equiv$$
$$O(n^2) = \{f| \exists n_0, k > 0 / n\geq n_0 \Rightarrow -4n-2 \leq 0\}\ y\ esto\ se\ cumple\ para\ todo\ n$$

$$1.b.$$

$$Si\ f \in O(n^k) \rightarrow \exists n0, c\ tq\ f(n) \leq c.n^k\ y\ qvq\ f(n) \leq c'.n^{k+1},\ n0'\leq n$$
$$Y\ dado\ que\ f(n)\leq c.n^k \leq c.n^{k+1}\ esto\ es\ particularmente\ cierto\ dado\ n0' = n0\ \land\ c = c'$$

$$1.c.$$

$$Si\ f \in O(\log n) \rightarrow O(\log n) = \{f| \exists n_0, k > 0 / n\geq n_0 \Rightarrow f \leq k*\log(n)\}$$

$$Y\ quiero\ ver\ que\ f\in O(n) = \{f| \exists n0', k' > 0 / n\geq n0' \Rightarrow f \leq k'*n\}\ y\ esto\ es\ cierto\ ya\ que:$$

$$Si\ tomo\ n0' = n_0\ \land\ k' = k\ y\ sabiendo\ que\ f \leq k*\log(n)\ ent\ f \leq k*\log(n) \leq k*n\ ya\ que\ \log(n) \leq n\ para\ todo\ n0$$

$$2.a.$$

$$2^n \in O(1) = \{2^n| \exists n0, k > 0 / n\geq n0 \Rightarrow 2^n \leq k\}\ pero\ esto\ es\ falso,\ ya\ que\ 2^n\ es\ creciente\ y\ no\ acotable\ por\ una\ constante\ k.$$

$$2.b.$$

$$O(n!) = \{n| \exists n0, k > 0 / n\geq n_0 \Rightarrow n \leq k*n!\}\ y\ esto\ es\ cierto,\ por\ ejemplo,\ para\ k\geq1\ y\ cualquier\ n0$$

$$2.c.$$

$$O(n^n) = \{n!| \exists n0, k > 0 / n\geq n0 \Rightarrow n! \leq k*n^n\}$$
$$\leftrightarrow n! \leq k*n^n,\ tomo\ k = 1\ y\ veo\ que\ n! \leq n^n\ y\ esto\ es\ cierto\ \forall n\geq n0\geq1$$

$$2.d.$$

$$2^n = O(n!)?$$

$$O(n!) = \{2^n| \exists n0, c > 0 / n\geq n0 \Rightarrow 2^n \leq c*n!\}\ pero\ esto\ es\ falso\ para\ un\ n\ suficientemente\ grande\ y\ cualquier\ c,\ n0$$

$$2.e.$$

$$Para\ todo\ i,\ j \in \mathbb{N},\ i \cdot n = O(j \cdot n)$$

$$Dado\ O(j.n) = \{f| \exists n0, c > 0 / n\geq n0 \Rightarrow i.n \leq c*j.n\}\ basta\ ver\ que$$
$$i \leq c*j\ y\ esto\ es\ cierto\ para\ algún\ c \geq i/j\ y\ para\ todo\ n0$$

$$2.f.$$

$$Para\ todo\ k \in \mathbb{N},\ 2^k = O(1).$$

$$O(1) = \{2^k| \exists n0, c > 0 / n\geq n0 \Rightarrow 2^k \leq c\}\ y\ esto\ es\ cierto\ para\ todo\ c \geq 2^k$$

$$2.g.$$

$$\log n = O(n)$$

$$O(n) = \{\log n| \exists n0, c > 0 / n\geq n0 \Rightarrow \log(n) \leq c*n\}$$
$$y\ esto\ es\ cierto\ siempre$$

$$2.h.$$

$$n! = O(2^n)$$

$$O(2^n) = \{n!| \exists n0, c > 0 / n\geq n0 \Rightarrow n! \leq c*2^n\}\ y\ esto\ es\ cierto\ tomando\ por\ ej\ n0 = 4\ y\ c=1$$

$$2.i.$$

$$Si\ b=0\ ent\ n^5 + bn^3 = n^5\ y\ qvq\ n^5 \in \Theta(n^5)\ y\ esto\ es\ cierto\ ya\ que\ n^5\leq n^5\leq n^5$$

$$Pero\ qvq\ si\ b\neq0\ luego\ n^5 + bn^3 \notin \Theta(n^5)$$
$$necesito\ c1,c2,n0\ tq:$$
$$c1\cdot n^5\leq n^5+bn^3\leq c2\cdot n^5$$
$$\equiv$$
$$(c1-1)\cdot n^5\leq bn^3\leq(c2-1)\cdot n^5$$
$$\equiv$$
$$(c1-1)\cdot n^2\leq b\leq(c2-1)\cdot n^2\ y\ esto\ no\ puede\ ser\ dado\ que\ c1,c2>0\ y\ no\ puedo\ acotar\ n^2\ por\ una\ b\ constante,\ para\ el\ único\ caso\ que\ funciona\ es\ c1=c2=0\ ent\ 0\leq b\leq0\ \equiv\ b=0$$

$$2.j.$$

$$qvq\ O(g) = \{(n^k)\log(n)| \exists n0, c > 0 / n\geq n0 \Rightarrow (n^k)\log(n) \leq c*(n^k)*n\}$$

$$vasta\ ver\ q\ (n^k)\log(n) \leq c*(n^k)*n\ \leftrightarrow\ \log(n) \leq c*n\ y\ tomo\ c=1\ ent\ es\ cierto\ para\ todo\ n\geq n0$$

$$2.k.$$

$$O(f) = \{f| \exists n0, c > 0 / n\geq n0 \Rightarrow f \leq c*f\},\ es\ cierto\ para\ todo\ c\geq1,\ n0$$

$$3.$$

$$Significa\ que\ f\ está\ acotada\ superiormente\ por\ g$$

$$si\ tenemos\ O(f ) \subseteq O(g)\ y\ O(g) \subseteq O(f )\ ent\ tienen\ un\ crecimiento\ similar$$

$$O(g) = \{f| \exists n0, c > 0 / n\geq n0 \Rightarrow f \leq c*g\}\ n\in\mathbb{N}$$
$$\Omega(g) = \{f| \exists n0, c > 0 / n\geq n0 \Rightarrow f \geq c*g\}\ n\in\mathbb{N}$$
$$\Theta(g) = \{f| \exists n0, c1, c2 > 0 / n\geq n0 \Rightarrow c1*g \leq f \leq c2*g\}$$

$$5.a.$$
$$O(n^2) \cap \Omega(n) = \Theta(n^2)$$

$$O(n^2) \cap \Omega(n) \equiv$$
$$\{f| \exists n0, c1 > 0 / n\geq n0 \Rightarrow f \leq c1*n^2\} \cap \{f| \exists n0, c2 > 0 / n\geq n0 \Rightarrow f \geq c2*n\} \equiv$$
$$\{f| \exists n0, c1, c2 > 0 / n\geq n0 \Rightarrow c2*n \leq f \leq c1*n^2\}$$
$$\land$$
$$\Theta(n^2) = \{f| \exists n0, k1, k2 > 0 / n\geq n0 \Rightarrow k1*n^2 \leq f \leq k2*n^2\}$$

$$y\ qvq\ O(n^2) \cap \Omega(n) = \Theta(n^2)\ luego:$$

$$\{f| \exists n0, c1, c2 > 0 / n\geq n0 \Rightarrow c2*n \leq f \leq c1*n^2\} =$$
$$\{f| \exists n0, k1, k2 > 0 / n\geq n0 \Rightarrow k1*n^2 \leq f \leq k2*n^2\} \equiv$$

$$tomo\ c1=k2,\ c2=k1\ luego:$$

$$\{f| \exists n0, k1, k2 > 0 / n\geq n0 \Rightarrow k1*n \leq k1*n^2 \leq f \leq k2*n^2\}$$
$$la\ primera\ afirmación\ es\ concretamente\ cierta\ para\ todo\ n,\ luego:$$

$$\{f| \exists n0, k1, k2 > 0 / n\geq n0 \Rightarrow k1*n^2 \leq f \leq k2*n^2\}\ por\ lo\ tanto\ la\ afirmación\ es\ cierta$$

$$5.b.$$

$$\Theta(n) \cup \Theta(n \log n) = \Omega(n \log n) \cap O(n)$$

$$\Theta(n) = \{f| \exists n0, k1, k2 > 0 / n\geq n0 \Rightarrow c1*n \leq f \leq c2*n\}$$
$$\Theta(n \log n) = \{f| \exists n0, k3, k4 > 0 / n\geq n0 \Rightarrow c1*n \log n \leq f \leq c2*n \log n\}$$
$$\Omega(n \log n) = \{f| \exists n0, c1 > 0 / n\geq n0 \Rightarrow f \geq c1*n \log n\}$$
$$O(n) = \{f| \exists n0, c2 > 0 / n\geq n0 \Rightarrow f \leq c2*n\}$$

$$tenemos\ que\ \Theta(n) \cup \Theta(n \log n) \equiv$$
$$\{f| \exists n0, k1, k2 > 0 / n\geq n0 \Rightarrow k1*n \leq f \leq k2*n\} \cup \{f| \exists n0, k3, k4 > 0 / n\geq n0 \Rightarrow k3*n \log n \leq f \leq k4*n \log n\} \equiv$$
$$\{f| \exists n0, k1, k2, k3, k4 > 0 / n\geq n0 \Rightarrow k1*n \leq f \leq k2*n \lor k3*n \log n \leq f \leq k4*n \log n\}$$

$$y\ tenemos\ que:$$
$$\Omega(n \log n) \cap O(n) \equiv \{f| \exists n0, c1, c2 > 0 / n\geq n0 \Rightarrow c1*n \log n \leq f \leq c2*n\}$$

$$luego:$$

$$\sup\ q\ k3*n \log n \leq f \leq k4*n \log n\ esto\ no\ implica\ c1*n \log n \leq f \leq c2*n\ ya\ que:$$

$$si\ f \leq k4*n \log\ pero\ \neg(f \leq c2*n)\ ent\ es\ falso.$$

$$5.c.$$

$$f \in O(g) \Leftrightarrow O(f ) \subseteq O(g)$$
$$por\ definicion\ se\ que\ \Rightarrow\ se\ cumple,\ queda\ ver\ el\ \Leftarrow$$

$$f \in O(g) \Leftarrow O(f) \subseteq O(g)?$$

$$f \in O(f) \ siempre,\ luego:$$

$$f \in O(f) \land O(f) \subseteq O(g) \Rightarrow f \in O(g)\ V$$

$$O(g) = \{f| \exists n0, c > 0 / n\geq n0 \Rightarrow f \leq c*g\}$$
$$\Omega(g) = \{f| \exists n0, c > 0 / n\geq n0 \Rightarrow f \geq c*g\}$$
$$\Theta(g) = \{f| \exists n0, c1, c2 > 0 / n\geq n0 \Rightarrow c1*g \leq f \leq c2*g\}$$

$$5.d.$$

$$Si\ f \in \Omega(g),\ entonces\ O(f) \cap \Omega(g) = O(g) \cap \Omega(f)$$

$$f \in \Omega(g) \equiv \Omega(g) = \{f| \exists n0, c1 > 0 / n\geq n0 \Rightarrow f \geq c1*g\}$$ 
$$f \in O(f) \equiv O(f) = \{f| \exists n0, c2 > 0 / n\geq n0 \Rightarrow f \leq c2*f\}$$

$$luego:$$

$$O(f) \cap \Omega(g) \equiv \{f| \exists n0, c1,c2 > 0 / n\geq n0 \Rightarrow c1*g \leq f \leq c2*f \}$$
$$\text{y qvq es igual a:}$$

$$\Omega(f) = \{f| \exists n0, k1 > 0 / n\geq n0 \Rightarrow f \geq k1*f\}$$
$$O(g) = \{h| \exists n0, k2 > 0 / n\geq n0 \Rightarrow h \leq k2*g\}$$
$$\text{pero esto no es necesariamente cierto, ya que}$$

$$f \in \Omega(g) \not\Rightarrow f \in O(g)$$

### Defs
$$O(g) = \{f| \exists n_0, c > 0 / n\geq n_0 \Rightarrow f \leq c*g\}\$$
$$\Omega(g) = \{f| \exists n_0, c > 0 / n\geq n_0 \Rightarrow f \geq c*g\}\$$
$$\Theta(g) = \{f| \exists n_0, c1, c2 > 0 / n\geq n_0 \Rightarrow c1*g \leq f \leq c2*g\}$$
$$n\in\mathbb{N}$$
### 5.d. Si f ∈ Ω(g), entonces O(f) ∩ Ω(g) = O(g) ∩ Ω(f)

f ∈ Ω(g) ∧ f ∈ O(f) ∧ f ∈ Ω(f)\\
¿f ∈ O(g)?

Quiero ver que  
1. O(f) ∩ Ω(g) ⊆ O(g) ∩ Ω(f) 
2. O(g) ∩ Ω(f) ⊆ O(f) ∩ Ω(g)

1. 
O(f)={f'∣ ∃n0,c1 >0/n≥n0 ⇒ f'≤c1∗f}
Ω(g)={g'∣ ∃n0,c2 >0/n≥n0 ⇒ g'≥c2∗g}

y se que f ∈ Ω(g), ent:
{f ∣ ∃n0,c3 n≥n0 ⇒ g ≤ f*c3}

en general tengo que:
h es mi intersección O(f) y Ω(g)
h ∈ O(f)={h ∣ ∃n1,c1 >0/ n≥n1 ⇒ h ≤ f*c1} 
h ∈ Ω(g)={h ∣ ∃n2,c2 >0/ n≥n2 ⇒ g*c2 ≤ h}
f ∈ Ω(g)={f ∣ ∃n3,c3 >0/ n≥n3 ⇒ g*c3 ≤ f}

y qvq que eso esté contenido en:

qvq h ∈ O(g) ={h | ∃n6,c6 >0/ n≥n6 ⇒ h ≤ c6*g}

y de mis afirmacion anterior saco que:

h ≤ f*c1
g*c3 ≤ f implica que h ≤ g*c3*c1

y tomando c6 = c3*c1 tengo que es cierto!

ahora qvq h ∈ Ω(f) ={h | ∃n7,c7 >0/ n≥n7 ⇒ c7*f ≤ h}

y tengo que g ≤ f/c3, luego:

g*c2 ≤ h ≡ f/c3*c2 ≤ h y en el caso c7 = c2/c3 entonces es cierto!!!

vemos la implicación contraria ahora:

h ∈ O(g) ={h | ∃n6,c6 >0/ n≥n6 ⇒ h ≤ c6*g}
h ∈ Ω(f) ={h | ∃n7,c7 >0/ n≥n7 ⇒ c7*f ≤ h}
f ∈ Ω(g) ={f | ∃n3,c3 >0/ n≥n3 ⇒ g*c3 ≤ f}

tengo que 
f ≤ h/c7
g ≤ f/c3
vemos si h ∈ O(f)={h ∣ ∃n1,c1 >0/ n≥n1 ⇒ h ≤ f*c1}

5.e.

Si f(n) < g(n) para todo n, entonces Θ(f) ≠ Θ(g)

demostración por contradicción:
Θ(f) = Θ(g) ≡ 
Θ(f)={g| ∃n0,c1,c2 >0/ n≥n0 ⇒ f*c1 ≤ g ≤ f*c2}
Θ(g)={f| ∃n0,k1,k2 >0/ n≥n0 ⇒ g*k1 ≤ f ≤ g*k2}
y tomando por ej, c1=1, c2=2

f < g ≤2f
pero f < g, luego:

g ≤ f ≤ 2g y f < g

pero g ≤ f y f < g no puede ser para ningún f y g por lo que es falso.

5.f.

Si f ∈O(g), entonces f ∗g ∈Θ(g)

tenemos que 
O(g)={f| ∃n1,c1 > 0 / n ≥ n1 ⇒ f≤c1*g}
O(g)={g| ∃n2,c2 > 0 / n ≥ n2 ⇒ g≤c2*g}
entonces f es como maximo g, si tengo h = f*g luego c3≤f≤c4 lo cual es falso

qvq f*g ∈ Θ(g)={h| ∃n3,c3,c4 > 0 / n ≥ n3 ⇒ g*c3≤h≤g*c4}

## 6-

a) n + m = O(nm)?

n, m ∈ N luego n+m ∈ N

O(nm)={n+m|∃n0,m0,c0 > 0 / n0 ≤ n ⇒ n+m ≤ c0*n*m}

y vemos por ej para c0=1, luego: n+m ≤ n*m y esto es cierto por ej para n0=2, m0=2

b) n + m5 = O(m5)

O(m5)={n+m5|∃n0,m0,c0 > 0 / n0 ≤ n ⇒ n+m5 ≤ c0*m5}

y vemos que n+m5 ≤ c0*m5 ≡ n ≤ (c0-1)*m5 ≡ n/m5 ≤ (c0-1) y a valores muy grandes eso tiende a 0 ≤ c0-1 y basta con c0=1 para que se cumpla!

c) nm = O(n + m)

O(n+m)={nm|∃n0,m0,c0 > 0 / n0 ≤ n ⇒ nm ≤ c0*(n+m)}

tenemos nm ≤ c0*n+c0*m y quedamos:

((n-c0)*m)/n ≤ c0 que tiende a m ≤ c0 lo cual es imposible!

d) m5 = O(n + m5)

O(n+m5)={nm|∃n0,m0,c0 > 0 / n0 ≤ n ⇒ m5 ≤ c0*(n+m5)}

m5 ≤ c0*(n+m5) ≡ m5 ≤ c0*n+c0*m5 y basta con ver para c0=1:

m5 ≤ n+m5 y esto es obviamente cierto

## 7.a.
 lim→+∞ a_n = ℓ ∈ R si ∀ε > 0. ∃n0 ∈N. ∀n > n0.|an −ℓ|< ε

a) 0 < ℓ < +∞ si y solo si f ∈Θ(g).

f ∈ θ(g) = {f | ∃n0,c1,c2 > 0 / n0 ≤ n ⇒ g*c1 ≤ f ≤ g*c2}

(⇐) dado que g*c1 ≤ f ≤ g*c2, div por g:

0 < c1 ≤ f/g ≤ c2 < +∞ lo que satisface 0 < lim→+∞ f/g < +∞ ≡ 0 < ℓ < +∞

(⇒) 
tenemos que 0 < ℓ < +∞ ⇒ lim→+∞ f/g = ℓ y por definición:

|f/g - ℓ| < ε ≡

f/g - ℓ < ε
-f/g + ℓ < ε ≡

ℓ - ε < f/g < ε + ℓ ≡ g(ℓ - ε) < gf/g < g(ℓ + ε) ≡ (ℓ - ε) < f < g(ℓ + ε) y si tomamos c1=(ℓ - ε),c2=(ℓ + ε) dado ℓ>0 y ℓ>ε

b) ℓ = +∞ si y s ́olo si f ∈Ω(g) y f ̸∈O(g)


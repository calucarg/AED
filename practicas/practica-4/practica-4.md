Ejercicio 1. Especificar en forma completa el TAD NumeroRacional que incluya al menos las operaciones aritmeticas basicas
(suma, resta, division, multiplicacion)

TAD NumeroRacional {
	obs numerador : Z
	obs denominador : Z

	pred igualdadObservacional (in r1 : Q, in r2 : Q) {
		r1.denominador*r2.numerador = r2.denominador*r1.numerador
	}

	proc crearRacional (in n : Z, in d : Z, out res : Q) {
		requiere{d ≠ 0}
		asegura{ res.numerador = n ∧ res.denominador = d }
	}

	proc suma (in r : Q, in s : Q, out res : Q) {
		requiere {True}
		asegura {res.numerador = r.numerador*s.denominador + s.numerador*r.denominador }
		asegura {res.denominador = r.denominador*s.denominador}
	}

	proc resta (in r : Q, in s : Q, out res : Q) {
	}

	proc multiplicacion (in r : Q, in s : Q, out res : Q) {
		requiere {s.denominador ≠ 0}
		requiere {r.denominador ≠ 0}
		asegura {res.numerador = s.numerador*r.numerador}
		asegura {res.denominador = s.denominador*r.denominador}
	}

	proc division (in r : Q, in s : Q, out res : Q) {
		requiere {s.numerador ≠ 0}
		asegura {res.numerador = r.numerador*s.denominador}
		asegura {res.denominador = r.denominador*s.numerador}
	}
}

Ejercicio 2. Especificar TADs para las siguientes figuras geometricas. Tiene que contener las operaciones rotar, trasladar y
escalar y una mas propuestas por usted.
a) Rectangulo (2D)
b) Esfera (3D)

2.a.
TAD Rectangulo {
	obs base : R
	obs altura : R
	obs centro : tupla<RxR>
	obs angulo : R

	proc crearRectangulo (in altura : R, in base : R, in centro : tupla<RxR>, in angulo : R) : Rectangulo  {
		requiere {altura ≥ 0}
		requiere {base ≥ 0}
		asegura {res.altura = altura}
		asegura {res.base = base}
		asegura {res.centro = centro}
		asegura {res.angulo = angulo}
	}

	proc trasladar (inout rect : Rectangulo, in posMover : tupla<RxR>) {
		requiere {rect = old(rect)}
		asegura {rect.centro_0 = old(rect).centro_0 + posMover_0}
		asegura {rect.centro_1 = old(rect).centro_1 + posMover_1}
		asegura {rect.base = old(rect).base ∧ rect.altura = old(rect).altura ∧ rect.angulo = old(rect).angulo}
	}

	proc escalar (inout rect : Rectangulo, in nuevaBase : R, in nuevaAltura : R) {
		requiere {rect = old(rect)}
		asegura {rect.base = nuevaBase}
		asegura {rect.altura = nuevaAltura}
		asegura {rect.centro = old(rect).centro ∧ rect.angulo = old(rect).angulo}
	}

	proc rotar (inout rect : Rectangulo, in nuevoAngulo : R) {
		requiere {rect = old(rect)}
		asegura {rect.angulo = nuevoAngulo}
		asegura {rect.base = old(rect).base ∧ rect.altura = old(rect).altura ∧ rect.centro = old(rect).centro}
	}
}

2.b.
TAD Esfera {
	obs centro : tupla<RxRxR>
	obs radio : R

	proc crearEsfera (in centro : tupla<RxRxR>, in radio : R) : Esfera{
		requiere{radio ≥ 0}
		asegura{res.centro = centro ∧ res.radio = radio}
	}

	proc escalar (inout bola : Esfera, in nuevoRadio : R) {
		requiere{bola = old(bola)}
		asegura{bola.radio = nuevoRadio}
		asegura{bola.centro = old(bola).centro}
	}

	proc trasladar (inout bola : Esfera, in nuevaPos : R) {
		requiere{bola = old(bola)}
		asegura{bola.centro = nuevaPos}
		asegura{bola.radio = nuevoRadio}
	}
}

3 

TAD DobleCola<T> {
	obs s : seq<T>

	proc crearDobleCola () : seq<T> {
		requiere{True}
		asegura{res.s = ⟨⟩}

	}

	proc encolarAdelante (inout lista : DobleCola<T>, in elem : T) {
		requiere{lista = old(lista)}
		asegura{lista.s = <e> + old(lista).s}
	}

	proc encolarAtras (inout lista : DobleCola<T>, in elem : T) {
		requiere{lista = old(lista)}
		asegura{lista.s = old(lista).s + <e>}
	}

	proc desencolar (inout lista : DobleCola<T>, out : T) {
		requiere{lista = old(lista)}
		requiere{|lista.s|>0}
		asegura{res = old(lista).s[(|old(lista).s-1)/2]}
		asegura{|lista.s| = |old(lista).s| - 1}
		asegura{IF |old(lista).s|%2 ≠ 0 THEN sinCentroNoPar(lista.s,old(lista).s)}
				ELSE sinCentroPar(lista.s,old(lista).s)
	}

	pred sinCentroNoPar (n: seq<T>, m: seq<T>) {
		(∀ k : Z)(0 ≤ k < (|m|)/2 ⟶L n[k] = m[k] ∧ n[|n|-k-1] = m[|m|-k-1])
	}

	pred sinCentroPar (n: seq<T>, m: seq<T>) {
		(∀ k : Z)(0 ≤ k < (|n|)/2 ⟶L n[k] = m[k]) ∧
		(∀ j : Z)(0 ≤ j < ((|n|)-1)/2 ⟶L n[|n|-j-1] = m[|m|-j-1])
	}
}


Ejercicio 6. Especifique los TADs indicados a continuacion pero utilizando los observadores propuestos:
a) Diccionario<K,V> observado con conjunto (de tuplas)
b) Conjunto<T> observado con funciones
c) Pila<T> observado con diccionarios
d) Punto observado con coordenadas polares

a.

TAD Diccionario<K,V> {
	obs data : conj<Tupla<KxV>>

	pred hayClave (d: Diccionario<K,V>, k: K){
		(∃<x,y>:<KxV>)(<x,y> ∈ d.data ∧ k = x)}

	proc diccionarioVacío(): Diccionario<K,V>
		asegura{res.data = {} }

	proc está(in d: Diccionario<K,V>, in k: K): bool
		asegura{res = True ⟷ hayClave(d,k)}

	proc definir(inout d: Diccionario<K,V>, in k: K, in v: V)
		requiere{d = old(d)}
		asegura{IF (∃<x,y>:<KxV>)(<x,y> ∈ old(d).data ∧ k = x) THEN d.data = (old(d).data - {<x,y>}) ∪ {<k,v>} 
				ELSE d.data = old(d).data ∪ {<k,v>} }
	
	proc obtener(in d: Diccionario<K,V>, in k: K): V
		requiere{hayClave(d,k)}
		asegura{(∃m:<KxV>)(m ∈ d.data ∧L (k = m1 ∧ res = m2))}

	proc borrar(inout d: Diccionario<K,V>, in k: K)
		requiere{hayClave(d,k)}
		requiere{d = old(d)}
		asegura{(∃m:<KxV>)(m ∈ old(d).data ∧L k = m1 ∧ d.data = old(d) - {m} )}

	proc definirRapido(inout d: Diccionario<K,V>, in k: K, in v: V)
		requiere{d = old(d)}
		requiere{¬(hayClave(old(d),k))}
		asegura{d.data = old(d).data ∪ {<k,v>} }

	proc tamaño(in d: Diccionario<K,V>): Z
		asegura{res = |d.data|}	
}

7.
a) Multiconjunto<T>
Tambi´en conocido como multiset o bag. Es igual a un conjunto pero con duplicados: cada elemento puede agregarse
m´ultiples veces. Tiene las mismas operaciones que el TAD Conjunto, m´as una operaci´on que indica la multiplicidad de
un elemento (la cantidad de veces que ese elemento se encuentra en la estructura). N´otese que si un elemento es eliminado
del multiconjunto, se reduce en 1 la multiplicidad

TAD Multiconjunto<T> {
	obs elems: Dict<K,Z>

	pred existe(e : T, d: Dict<K,Z>) {e ∈ d}

	proc conjVacio(): Multiconjunto<T> {
		asegura{res.elems = {} }
	}

	proc pertenece(in c: Multiconjunto<T>, in e: T): bool {
		asegura{res = true ⟷ e ∈ c.elems}
	}

	proc agregar(inout c: Multiconjunto<T>, in e: T) {
		requiere{c=old(c)}
		asegura{IF existe(e, old(c).elems) THEN c.elems = setKey(old(c).elems,e,old(c).elems[e] + 1)
				ELSE setKey(old(c).elems,e,1)}
	}

	proc sacar(inout c: Multiconjunto<T>, in e: T) {
		requiere{c=old(c)}
		asegura{IF existe(e, old(c).elems) THEN c.elems = delKey(old(c).elems,e)
				ELSE c.elems = old(c).elems}
	}

	proc unir(inout c: Multiconjunto<T>, in c′: Multiconjunto<T>) {
		requiere{c = old(c)}
		asegura{(∀k:K)(k ∈ c.elems ⟷ k ∈ old(c).elems ∨ k ∈ c')}
		asegura{(∀k:K)(IF k ∈ old(c).elems ∧ k ∈ c' THEN c.elems[k]=old(c).elems[k]+c'[k])}
		asegura{(∀k:K)(IF k ∈ old(c).elems ∧ ¬(k ∈ c') THEN c.elems[k]=old(c).elems[k])
		asegura{(∀k:K)(IF ¬(k ∈ old(c).elems) ∧ k ∈ c' THEN c'[k])
		}
	}

	proc restar(inout c: Multiconjunto<T>, in c′: Multiconjunto<T>) {
		requiere{c = old(c)}
		asegura{(∀k:K)(k ∈ c.elems ⟷ k∈old(c).elems ∧ k∈c' ∧L (old(c).elems[k]-c'[k])>0)}
		asegura{(∀k:K)(IF k∈old(c).elems ∧ k∈c' ∧L (old(c).elems[k]-c'[k])>0 THEN c.elems[k] = (old(c).elems[k]-c'[k]))}
	}

	proc intersecar(inout c: Multiconjunto<T>, in c′: Multiconjunto<T>)
		requiere{c = old(c)}
		asegura{}

	proc agregarRapido(inout c: Multiconjunto<T>, in e: T)

	proc tamaño(in c: Multiconjunto<T>): Z


	proc multiplicidad(in c: Multiconjunto<T>): Z {

	}
}
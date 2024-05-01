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


Ejercicio 4. Especifique el TAD DiccionarioConHistoria. El mismo guarda, para cada clave, todos los valores que se
asociaron con la misma a lo largo del tiempo (en orden).

TaD DiccionarioConHistoria {
	
}
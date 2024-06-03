## 4
Una estructura de representación podría ser una lista enlazada


Modulo BufferCircular<T> implementa Cola<T> {
    arr : array<T>
    inicio : int
    fin : int

    proc invRep(c : BufferCircular<T>) {
        0 ≤ c.inicio ≤ |c.arr| ∧ c.fin ≤ |c.arr| 
    }
    
    proc abs (c : BufferCircular<T>, c' : Cola<T>) {
        (∀i:Z)(0 ≤ i ≤ |c'.s| ⟶L 
        IF c.inicio + i < |c.arr| THEN c'.s[i] = c.arr[(c.inicio + i)]
        ELSE  c'.s[i] = c.arr[(c.inicio + i) - |c.arr|])
    }

    impl encolar (inout c : BufferCircular<T>, in e: T) : BufferCircular<T> {
        if ((c.fin + 1) % c.arr.length == c.inicio) {
            return c;
        } else {
            c.arr[c.fin] = e;
            if (c.fin < c.arr.length) {
                c.fin++;
            } else {
                c.fin = 0;
            }
        }
        return c;
    }

    impl desencolar (inout c : BufferCircular<T>) : BufferCircular<T> {
        c.arr[c.inicio] = null;
        if (c.inicio < c.arr.length) {
            c.inicio++;
        } else {
            c.inicio = 0;
        }
        return c;
    }
}

## 5
Modulo OrdPorInd implementa ConjArr {
    var datos : array<<int,int>>
    var indice0 : array<int>
    var indice1 : array<int>
    var largo : int
    //InvRep y FuncAbs en papel, buscarpor primera y 2da también

    impl agregar(inout c:OrdPorInd, in e:<int,int>) {
        c.datos[c.largo] = e;
        c.largo++;

        pos = c.largo - 1;
        primera = e[0];
        segunda = e[1];

        int i = 0;
        while (i < c.largo && primera < c.datos[c.indice0[i]]) {
        i++;
        }
        c.indice0 = insert(c.indice0,i,c.largo);

        int i = 0;
        while (i < c.largo && segunda < c.datos[c.indice1[i]]) {
        i++;
        }
        c.indice1 = insert(c.indice1,i,c.largo);
    }

    impl insert(arr:array<int>,pos:int,largo:int) : array<int> {
        for(int j = largo; j > pos; j--){
            arr[j] = arr[j-1];
        }
        arr[pos] = c.largo-1
    }

    impl sacar(inout c:OrdPorInd,in e:<<int,int>>) {
        int primera = e[0];
        int segunda = e[1];
        for(i = c.largo-1; 0 <= i && c.datos[c.indice0[i]][0] <= primera; i--) {
            c.indice0[i] = c.indice0[i-1];
        }
        for(j = c.largo-1; 0 <= j && c.datos[c.indice1[j]][0] <= segunda; j--) {
            c.indice1[j] = c.indice1[j-1];
        }
        c.largo--;
    }
}

## 5bis?

a.
invRep:
-todas las fechas distintas
-la suma de cada monto por producto es igual a el valor de la clave de ese producto en totalPorProducto y el ultimo monto es igual al valor de ultimoMonto. 
-producto y monto son iguales los de la mayor fecha con ultimoMonto

funcAbs:
-la suma de todos los valores para todo producto del obs es igual a la suma de cada tupla de ventas.
-producto existe en obs sii existe en ventas
-hay la misma cantidad de productos vendidos, todas las fechas son iguales, mismo monto entre el obs y ventas.
-en general, ver que para cada tupla hay un key+valor que lo representa en el obs

Modulo ComercioImpl implementa Comercio {
var ventas: SecuenciaImpl<tupla<Producto, Fecha, Monto>>
var totalPorProducto: DiccionarioImpl<Producto, Monto>
var ultimoPrecio: DiccionarioImpl<Producto, Monto>
}

pred invRep(c:ComercioImpl) {
    (∀f:Z)(0≤f<|c.ventas| →L ¬(∃p:Z)(0≤p<|c.ventas| ∧ p≠f ∧L c.ventas[f][1] = c.ventas[p][1])) ∧ (∀i:Z) 0≤i<|c.ventas| →L fechaMax(c.ventas[i][2],c.ventas) = true ↔
    c.ventas[i][0] = c.ultimoPrecio[0] ∧ c.ventas[i][1] = c.ultimoPrecio[1] ∧
    sumaTotal(c.ventas[0],totalPorProducto[0]) = totalPorProducto[1]
}

pred fechaMax(n int, arr:array<tupla<Producto, Fecha, Monto>>) {
    ¬(∃m:Z)(0≤m<|arr| ∧L m[1] > n)
}

aux sumaTotal(arr:<tupla<Producto, Fecha, Monto>>, producto:string):int {
    ∑(i=0)(|arr|-1)(IF producto = arr[0] THEN arr[2] ELSE 0 FI)}

pred Abs(c:ComercioImpl,c':Comercio){
    (∀i:Z)(∀s:string)(s ∈ c.ventas ↔ (∃p:Z)(s = c.ventas[p][0] ∧
    c'.ventasPorProducto[s][i][0] = c.ventas[p][1] ∧ c'.ventasPorProducto[s][i][1] = c.ventas[p][2])) ∧ (∀n:string)(cantProductosTad(c'.ventasPorProducto[n]) = cantProductosMod(c.ventas,n))
}

aux cantProductosTad(seq:seq<tupla<Fecha, Monto>>) : Z {(|seq|^2+|seq|)/2}

aux cantProductosMod(d:SecuenciaImpl<tupla<Producto, Fecha, Monto>>,n:int) : int {
    ∑(i=0)(|d|-1)(IF d[i][0] = n THEN 1 ELSE 0 FI)
}


## 6

pred Abs(c:PlantaImpl,c':Planta) {
    (∀n:alarma)(n ∈ c'.alarmas ↔ n ∈ c'.alarmas) ∧
    
}
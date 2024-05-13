package aed;

class ArregloRedimensionableDeRecordatorios implements SecuenciaDeRecordatorios {

    private Recordatorio[] _array = new Recordatorio[0];

    public ArregloRedimensionableDeRecordatorios() {
    }

    public ArregloRedimensionableDeRecordatorios(ArregloRedimensionableDeRecordatorios vector) {
        _array = vector._array;
    }

    public int longitud() {
        return _array.length;
    }

    public void agregarAtras(Recordatorio i) {
        Recordatorio[] nuevoArray = new Recordatorio[longitud()+1];
        for (int j = 0; j < longitud(); j++) {
            nuevoArray[j] = _array[j];
        }
        nuevoArray[longitud()] = i;
        _array = nuevoArray;
    }

    public Recordatorio obtener(int i) {
        return _array[i];
    }

    public void quitarAtras() {
        Recordatorio[] nuevoArray = new Recordatorio[longitud()-1];
        for (int i = 0; i < longitud()-1; i++) {
            nuevoArray[i] = _array[i];
        }
        _array = nuevoArray;
    }

    public void modificarPosicion(int indice, Recordatorio valor) {
        Recordatorio[] nuevoArray = new Recordatorio[longitud()];
        for (int i = 0; i < longitud(); i++) {
            if (i == indice) {
                nuevoArray[i] = valor;
            } else {
                nuevoArray[i] = _array[i];
            }
        }
        _array = nuevoArray;

    }

    public ArregloRedimensionableDeRecordatorios copiar() {
        return new ArregloRedimensionableDeRecordatorios(this);
    }

}

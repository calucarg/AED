package aed;

public class Fecha {

    private int _dia;
    private int _mes;

    public Fecha(int dia, int mes) {
        this._dia = dia;
        this._mes = mes;
    }

    public Fecha(Fecha fecha) {
        this._dia = fecha._dia;
        this._mes = fecha._mes;
    }

    public Integer dia() {
        return _dia;
    }

    public Integer mes() {
        return _mes;
    }

    public String toString() {
        StringBuffer aString = new StringBuffer();
        aString.append(_dia + "/" + _mes);
        return aString.toString();
    }

    @Override
    public boolean equals(Object otra) {
        boolean oen = (otra == null);
        boolean cd = otra.getClass() != this.getClass();
        if (oen || cd) {
            return false;
        }
        Fecha otraFecha = (Fecha) otra;
        return _dia == otraFecha._dia
            && _mes == otraFecha._mes;
        
    }

    public void incrementarDia() {
        if (this._dia == diasEnMes(_mes) && _mes < 12) {
            _dia = 1;
            _mes++;
        } else if (this._dia < diasEnMes(_mes)) {
            _dia++;
        }
        else {
            _dia = 1;
            _mes = 1;
        }
    }

    private int diasEnMes(int mes) {
        int dias[] = {
                // ene, feb, mar, abr, may, jun
                31, 28, 31, 30, 31, 30,
                // jul, ago, sep, oct, nov, dic
                31, 31, 30, 31, 30, 31
        };
        return dias[mes - 1];
    }

}

package aed;

public class Recordatorio {

    private String _mensaje;
    private Horario _horario;
    private Fecha _fecha;

    public Recordatorio(String mensaje, Fecha fecha, Horario horario) {
        this._mensaje = new String(mensaje);
        this._horario = new Horario(horario);
        this._fecha = new Fecha(fecha);
    }

    public Horario horario() {
        return new Horario(_horario);
    }

    public Fecha fecha() {
        return new Fecha(_fecha);
    }

    public String mensaje() {
        return new String(_mensaje);
    }

    @Override
    public String toString() {
        StringBuffer aString = new StringBuffer();
        aString.append(_mensaje + " @ " + _fecha + " " + _horario);
        return aString.toString();
    }

    @Override
    public boolean equals(Object otro) {
        boolean oen = (otro == null);
        boolean cd = otro.getClass() != this.getClass();
        if (oen || cd) {
            return false;
        }
        Recordatorio otroRecordatorio = (Recordatorio) otro;
        return _mensaje.equals(otroRecordatorio._mensaje)
                && _horario.equals(otroRecordatorio._horario)
                && _fecha.equals(otroRecordatorio._fecha);
    }
}

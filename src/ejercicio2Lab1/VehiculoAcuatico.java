package ejercicio2Lab1;

public class VehiculoAcuatico extends Vehiculo{
    private String tipo;
    private int capacidad;
    private Motor motor;
    private Velas velas;


    public VehiculoAcuatico(int velocidadActual, int velocidadMax, String tipo, int capacidad, Motor motor, Velas velas) {
        super(velocidadActual, velocidadMax);
        this.tipo=tipo;
        this.capacidad=capacidad;
        this.motor=motor;
        this.velas=velas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Velas getVelas() {
        return velas;
    }

    public void setVelas(Velas velas) {
        this.velas = velas;
    }

    @Override
    public String toString() {
        return "VehiculoAcuatico{" +
                "tipo='" + tipo + '\'' +
                ", capacidad=" + capacidad +
                ", motor=" + motor +
                ", velas=" + velas +
                ", velocidadActual=" + velocidadActual +
                ", velocidadMax=" + velocidadMax +
                '}';
    }
}

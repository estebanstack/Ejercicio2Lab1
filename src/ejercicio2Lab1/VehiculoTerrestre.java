package ejercicio2Lab1;

public class VehiculoTerrestre extends Vehiculo{
    private int cantidadLlantas;
    private String uso;
    private Motor motor;


    public VehiculoTerrestre(int velocidadActual, int velocidadMax, int cantidadLlantas, String uso, Motor motor) {
        super(velocidadActual, velocidadMax);
        this.cantidadLlantas=cantidadLlantas;
        this.uso=uso;
        this.motor=motor;
    }

    public int getCantidadLlantas() {
        return cantidadLlantas;
    }

    public void setCantidadLlantas(int cantidadLlantas) {
        this.cantidadLlantas = cantidadLlantas;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "VehiculoTerrestre{" +
                "cantidadLlantas=" + cantidadLlantas +
                ", uso='" + uso + '\'' +
                ", motor=" + motor +
                ", velocidadActual=" + velocidadActual +
                ", velocidadMax=" + velocidadMax +
                '}';
    }
}

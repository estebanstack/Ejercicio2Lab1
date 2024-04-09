package ejercicio2Lab1;

public class Velas {
    int velocidadActual;

    public Velas(int velocidadViento) {
        if((velocidadViento>80)||(velocidadViento<10)){
            this.velocidadActual=0;
        } else {
            this.velocidadActual = velocidadViento;
        }
    }

    @Override
    public String toString() {
        return "Velas{" +
                "velocidadActual=" + velocidadActual +
                '}';
    }
}

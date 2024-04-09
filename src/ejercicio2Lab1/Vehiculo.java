package ejercicio2Lab1;

public class Vehiculo {
    protected int velocidadActual;
    protected int velocidadMax;

    public Vehiculo(int velocidadActual, int velocidadMax) {
        this.velocidadActual = velocidadActual;
        this.velocidadMax = velocidadMax;
    }

    public void acelerar(int velocidad){
        if(velocidad>velocidadMax){
            System.out.println("La velocidad es imposible de alcanzar");
        }else {
            velocidadActual += velocidad;
        }
    }

    public void frenar(int velocidad){
        if((velocidadActual-velocidad)<0){
            System.out.println("No existe la velocidad negativa");
        } else{
            velocidadActual-=velocidad;
        }
    }

    public void mostrar(){
        System.out.println("La velocidad actual del vehiculos es: "+velocidadActual+ " y su velocidad maxima es: "
        +velocidadMax);
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "velocidadActual=" + velocidadActual +
                ", velocidadMax=" + velocidadMax +
                '}';
    }
}

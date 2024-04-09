package ejercicio2Lab1;

public class Motor {
    int numeroRevoluciones;

    Motor(int fuerza, int radio){
        this.numeroRevoluciones=fuerza*radio;
    }


    @Override
    public String toString() {
        return "Motor{" +
                "numeroRevoluciones=" + numeroRevoluciones +
                '}';
    }
}

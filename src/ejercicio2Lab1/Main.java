package ejercicio2Lab1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos=new ArrayList<>();

        Vehiculo vehiculo1=new VehiculoTerrestre(20,200, 4, "civil",
                new Motor(20,40));

        Vehiculo vehiculo2=new VehiculoTerrestre(30, 240, 4, "civil",
                new Motor(30,50));

        Vehiculo vehiculo3=new VehiculoTerrestre(35, 300, 6, "militar",
                new Motor(50,50));

        Vehiculo vehiculo4=new VehiculoAcuatico(50,260, "submarino",6,
                new Motor(30,55), new Velas(50));

        Vehiculo vehiculo5=new VehiculoAcuatico(45,230, "submarino",5,
                new Motor(50,40), new Velas(86));

        Vehiculo vehiculo6=new VehiculoAcuatico(60,300, "superficie",10,
                new Motor(60,50), new Velas(50));



        vehiculos.add(vehiculo1);
        vehiculos.add(vehiculo2);
        vehiculos.add(vehiculo3);
        vehiculos.add(vehiculo4);
        vehiculos.add(vehiculo5);
        vehiculos.add(vehiculo6);

        vehiculos.get(0).acelerar(100);
        vehiculos.get(0).frenar(50);
        vehiculos.get(1).acelerar(150);
        vehiculos.get(1).frenar(70);
        vehiculos.get(2).acelerar(250);
        vehiculos.get(2).frenar(114);
        vehiculos.get(3).acelerar(150);
        vehiculos.get(3).frenar(80);
        vehiculos.get(4).acelerar(145);
        vehiculos.get(4).frenar(112);
        vehiculos.get(5).acelerar(45);
        vehiculos.get(5).frenar(13);

        for (Vehiculo v: vehiculos) {
            System.out.println(v);
        }




    }
}

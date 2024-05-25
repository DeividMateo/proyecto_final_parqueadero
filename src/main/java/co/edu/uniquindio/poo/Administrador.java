package co.edu.uniquindio.poo;

public class Administrador extends Propietario {
    
    public Administrador(String nombre){
        super(nombre);
    }

    public void cambiarTarifa( Vehiculo vehiculo, double tarifa){

        vehiculo.getTipoVehiculo().setTarifa(tarifa);
        

    }

}
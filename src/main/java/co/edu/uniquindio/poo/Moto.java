package co.edu.uniquindio.poo;

public class Moto extends Vehiculo {

    private final String velocidadMaxima;

    public Moto(String placa, String modelo, String velocidadMaxima, TipoVehiculo tipoVehiculo, Propietario propietario) {
        super(placa, modelo, TipoVehiculo.MOTO_CLASICA, propietario);
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getVelocidadMaxima() {
        return velocidadMaxima;
    }

    
    
}

package co.edu.uniquindio.poo;

public abstract class Vehiculo {

    private final String placa;
    private final String modelo;
    private final TipoVehiculo tipoVehiculo;

    public Vehiculo(String placa, String modelo, TipoVehiculo tipoVehiculo) {
        this.placa = placa;
        this.modelo = modelo;
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }  
}

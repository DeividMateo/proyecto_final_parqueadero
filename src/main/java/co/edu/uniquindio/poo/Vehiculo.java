package co.edu.uniquindio.poo;

public abstract class Vehiculo {

    private final String placa;
    private final String modelo;
    private final TipoVehiculo tipoVehiculo;
    private final Propietario propietario;

    public Vehiculo(String placa, String modelo, TipoVehiculo tipoVehiculo, Propietario propietario) {
        this.placa = placa;
        this.modelo = modelo;
        this.tipoVehiculo = tipoVehiculo;
        this.propietario = propietario;
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

    public Propietario getPropietario() {
        return propietario;
    }  

    
}

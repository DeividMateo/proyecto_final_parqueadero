package co.edu.uniquindio.poo;

public enum TipoVehiculo {
    
    CARRO(5000.0),
    MOTO_CLASICA(1500.0),
    MOTO_HIBRIDA(1500.0);

    private final double tarifa;

    private TipoVehiculo(double tarifa) {
        this.tarifa = tarifa;
    }

    public double getTarifa() {
        return tarifa;
    }

}

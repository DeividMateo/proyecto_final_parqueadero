package co.edu.uniquindio.poo;

public enum TipoVehiculo {
    
    CARRO(0),
    MOTO_CLASICA(0),
    MOTO_HIBRIDA(0);

    private double tarifa;

    private TipoVehiculo(double tarifa) {
        this.tarifa = tarifa;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    

}

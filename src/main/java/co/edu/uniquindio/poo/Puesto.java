package co.edu.uniquindio.poo;


public class Puesto {

    private final Registro registro;
    private final Disponibilidad disponibilidad;
    private final Vehiculo vehiculo;
    
    public Puesto(Registro registro, Disponibilidad disponibilidad, Vehiculo vehiculo) {
        this.registro = registro;
        this.disponibilidad = disponibilidad;
        this.vehiculo = vehiculo;
    }

    

    public Registro getRegistro() {
        return registro;
    }

    public Disponibilidad getDisponibilidad() {
        return disponibilidad;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
       
    
}

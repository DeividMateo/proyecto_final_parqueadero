package co.edu.uniquindio.poo;

import java.time.LocalDateTime;

public class Registro {
    
    private final LocalDateTime HoraIngreso;
    private final LocalDateTime HoraSalida;
    private Puesto puesto;
    
    public Registro(LocalDateTime horaIngreso, LocalDateTime horaSalida, Puesto puesto) {
        HoraIngreso = horaIngreso;
        HoraSalida = horaSalida;
    }
    public LocalDateTime getHoraIngreso() {
        return HoraIngreso;
    }
    public LocalDateTime getHoraSalida() {
        return HoraSalida;
    }
    public Puesto getPuesto() {
        return puesto;
    }
    
    
}

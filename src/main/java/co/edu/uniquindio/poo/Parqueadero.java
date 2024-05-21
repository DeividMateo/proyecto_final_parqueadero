package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.Hashtable;
import java.util.LinkedList;

public class Parqueadero{
    
    private final int numeroMaximoFilas;
    private final int numeroMaximoColumnas;
    private final Collection<Propietario> propietarios;
    private final Collection<Registro> registros;
    private final Collection<Vehiculo> vehiculos;
    private final Hashtable<String, Puesto> puestos;
    
    public Parqueadero(int numeroMaximoFilas, int numeroMaximoColumnas) {
        this.numeroMaximoFilas = numeroMaximoFilas;
        this.numeroMaximoColumnas = numeroMaximoColumnas;
        this.propietarios = new LinkedList<>();
        this.registros = new LinkedList<>();
        this.vehiculos = new LinkedList<>();
        this.puestos = new Hashtable<>();
    }

    private void parquearVehiculo(int numeroMaximoColumnas, int numeroMaximoFilas, Vehiculo vehiculo, Registro registro){
        
    }

    public int getNumeroMaximoFilas() {
        return numeroMaximoFilas;
    }

    public int getNumeroMaximoColumnas() {
        return numeroMaximoColumnas;
    }

    public Collection<Propietario> getPropietarios() {
        return propietarios;
    }

    public Collection<Registro> getRegistros() {
        return registros;
    }

    public Collection<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public Hashtable<String, Puesto> getPuestos() {
        return puestos;
    }

    

    

    


    
}


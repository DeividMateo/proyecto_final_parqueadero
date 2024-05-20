package co.edu.uniquindio.poo;

import org.junit.jupiter.api.Test;

public class VehiculoTest {
    private static final Logger LOG = Logger.getLogger(VehiculoTest.class.getName());
    @Test

    public void datosCompletos(){
        LOG.info("Inicio Test prueba de datos completos");

      var Vehiculo = new Vehiculo("ABC123","2010",TipoVehiculo.CARRO, var propietario = new Propietario("Juan", "Perez", "1234567890"));
        assertEquals("ABC123" Vehiculo.placa());
        assertEquals("2010" Vehiculo.modelo());
        assertEquals(TipoVehiculo.CARRO, Vehiculo.tipo());
        assertEquals(Propietario.Vehiculo, propietario());

       LOG.INFO("Fin Test prueba de datos completos");
    

    }
}

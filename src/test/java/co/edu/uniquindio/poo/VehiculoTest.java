package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class VehiculoTest {
    private static final Logger LOG = Logger.getLogger(VehiculoTest.class.getName());
    @Test

    public void datosCompletos(){
            LOG.info("Inicio Test prueba de datos completos");

      Vehiculo vehiculo= new Vehiculo("ABC123","2010",TipoVehiculo.CARRO,);

            assertEquals("ABC123", vehiculo.getPlaca());
            assertEquals("2010", vehiculo.getModelo());
            assertEquals(TipoVehiculo.CARRO, vehiculo.getTipoVehiculo());
            assertEquals(, vehiculo.getPropietario());

         LOG.info("Fin Test prueba de datos completos");
    

    }
}

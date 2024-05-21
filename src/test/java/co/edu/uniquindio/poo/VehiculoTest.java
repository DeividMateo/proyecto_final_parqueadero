package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class VehiculoTest {
    private static final Logger LOG = Logger.getLogger(VehiculoTest.class.getName());
    @Test

    public void datosCompletos(){
            
        LOG.info("Inicio Test prueba de datos completos");

        var carro= new Carro("DQD19", "2020", TipoVehiculo.CARRO, new Propietario("Deivid"));

        assertEquals("DQD19", carro.getPlaca());
        assertEquals("2020", carro.getModelo());
        assertEquals(TipoVehiculo.CARRO, carro.getTipoVehiculo());
        assertEquals("Deivid" , carro.getPropietario().getNombre());

        LOG.info("Fin Test prueba de datos completos");
    

    }
}

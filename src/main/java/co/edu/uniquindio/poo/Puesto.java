package co.edu.uniquindio.poo;

import java.util.HashMap;
import java.util.Map;

public class Puesto {

    private final Registro registro;
       public static void main(String[] args) {
        Map<String,Puesto>mapaPuestos=new HashMap<>();
        mapaPuestos.put("1,1",new Puesto());
        mapaPuestos.put("1,2","Moto");
        mapaPuestos.put("1,3", "Moto");
        mapaPuestos.put("1,4", "Carro");
        mapaPuestos.put("1,5", "Carro");
        mapaPuestos.put("2,1", "Moto");
        mapaPuestos.put("2,2", "Carro");
        mapaPuestos.put("2,3", "Moto");
        mapaPuestos.put("2,4", "Carro");
        mapaPuestos.put("2,5", "Carro");
        

       
        
       }
    
}

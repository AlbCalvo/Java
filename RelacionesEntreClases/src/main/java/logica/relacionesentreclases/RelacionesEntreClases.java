package logica.relacionesentreclases;

import java.util.ArrayList;
import java.util.List;

public class RelacionesEntreClases {

    public static void main(String[] args) {
        
        // Accedemos a la lista de propietarios de un Auto.
        Auto aut = new Auto();
        aut.setId(1L);
        aut.setMarca("Seat");
        aut.setModelo("Panda");
        
        //Creamos la lista de propietarios k posteriormente enlazaremos con Auto.
        List<Propietario> listaPropietarios = new ArrayList<Propietario> ();
        Propietario prop1 = new Propietario ();
        Propietario prop2 = new Propietario ();
        // Informamos los valores de ambos propietarios.
        prop1.setId(35L);
        prop1.setNombre("Nombre prop 1");
        prop1.setApellido("Apellido prop 1");
        prop2.setId(23L);
        prop2.setNombre("Nombre prop 2");
        prop2.setApellido("Apellido prop 2");
        
        //Guardamos los dos propietarios a la lista, y luego asociarla a Auto.
        //Paso 1: Agregamos los propietarios a la ArrayList.
        listaPropietarios.add(prop1);
        listaPropietarios.add(prop2);
        //Paso 2: Asociamos el ArrayList a Auto.
        aut.setListaPropietarios(listaPropietarios);
        
        System.out.println(" Datos del vehículo: Marca " + aut.getMarca() + " Modelo: " + aut.getModelo() + 
                " tiene como propietarioos a " + aut.getListaPropietarios().toString());
        
    }
}

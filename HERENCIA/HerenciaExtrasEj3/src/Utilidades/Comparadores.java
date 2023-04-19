/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import entidades.Hotel;
import java.util.Comparator;

/**
 *
 * @author Carlitos
 */
public class Comparadores {
    public static Comparator<Hotel> compararPreciosHoteles = new Comparator<Hotel>(){
        @Override
        public int compare(Hotel t, Hotel t1) {
            return (int)t.getPrecioHabitaciones() - (int)t1.getPrecioHabitaciones();
        }
    };
      
    
}

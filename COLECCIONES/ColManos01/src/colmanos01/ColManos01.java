
package colmanos01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class ColManos01 {

    public static void main(String[] args) {
        
        ArrayList<Integer> Listado = new ArrayList();
        int x = 5;
        Listado.add(x);
        TreeSet<String> conjunto = new TreeSet();
        String s = " Topper";
        String a = "Culero";
        String b = "Sonso";
        conjunto.addAll(conjunto);
        HashMap<Integer, String> personas = new HashMap();
        int i = 5100544;
        String ss = " Angela, ";
        personas.put(i, ss);
        
        System.out.println("Listado: " + x);
        System.out.println("Conjunto: " + s+a+b);
        System.out.println("Nombre: " + ss + "DNI: " + i); 
        
        
        
    }
    
}

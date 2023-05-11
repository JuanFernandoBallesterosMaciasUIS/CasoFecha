package ejecutable;

import modelo.Fecha;

public class Test {
    public static void main(String[] args) {
        
        Fecha f1 = new Fecha(2, 10,1970);
        f1.setDia(2);
        f1.setMes(10);
        f1.setAnio(1970);


        System.out.println("Dia: " + f1.getDia());
        System.out.println("Mes: " + f1.getMes());
        System.out.println("Año: " + f1.getAnio() );
        System.out.println(f1);

        // Creación de otro objeto Fecha
        Fecha f2 = new Fecha(2, 10,1970);
        f2.setDia(2);
        f2.setMes(10);
        f2.setAnio(1970);
 
        System.out.println(f2);

        if(f1.equals(f2))
            System.out.println("Son iguales");
        else
            System.out.println("Son distintos");

  
    }    
}

package principiospo;

import java.util.Scanner;

public class Padre extends Familia{
    Scanner sc= new Scanner(System.in);

    private String ocupacion;

   //constructor
   public Padre(String apellidoPadre){
       this.apellidoPadre = apellidoPadre;
   }
    //getter and setter

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    //métodos
    public void crearPadre(){
        System.out.println("De un nombre al padre");
        nombrePadre= sc.nextLine();
    }
    public void verPadre(){
        System.out.println("Nombe del padre " +nombrePadre);
    }
}

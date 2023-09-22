package principiospo;

public class Tester {
    public static void main(String[] args) {
        Padre padre = new Padre("Solito");
        Padre carlos = new Padre("Acompañado");
        String nombrePadreQueMandaDato="Juan";
        padre.setNombrePadre(nombrePadreQueMandaDato);
        System.out.println(padre.getNombrePadre() + padre.getApellidoPadre());
        carlos.setNombrePadre(nombrePadreQueMandaDato);
        System.out.println(carlos.getNombrePadre() + " " + carlos.getApellidoPadre());
        padre.verPadre();
        padre.crearPadre();

        carlos.verPadre();
    }
}





















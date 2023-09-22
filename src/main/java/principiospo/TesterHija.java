package principiospo;

public class TesterHija {
    public static void main(String[] args) {
        Hijo hijamayor = new Hijo("Solita " , "Acomapñada");
        hijamayor.setNombrePadre("Juanita");
        String nombreHijaMayor = hijamayor.getNombrePadre();
        String apellidoPadreHijaMayor = hijamayor.getApellidoPadre();
        String apellidoMadreHijaMayor = hijamayor.getApellidoMadre();
        System.out.println(nombreHijaMayor + " " + apellidoPadreHijaMayor + " " + apellidoMadreHijaMayor);

    }
}

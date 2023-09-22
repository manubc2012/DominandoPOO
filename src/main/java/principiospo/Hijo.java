package principiospo;

public class Hijo extends Padre{
    private String apellidoMadre;

    public Hijo(String apellidoPadre, String apellidoMadre) {
        super(apellidoPadre);
        this.apellidoMadre = apellidoMadre;
    }

    public String getApellidoMadre() {
        return apellidoMadre;
    }

    public void setApellidoMadre(String apellidoMadre) {
        this.apellidoMadre = apellidoMadre;
    }

    //METODOS
}

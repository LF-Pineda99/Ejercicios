package productosElectronicos;

/**
 *
 * @author luis.cojom
 */
public class Tableta extends ProductosElectronicos{
    
    private double tamanoPantalla;
    private String resolucionPantalla;

    public double getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setTamanoPantalla(double tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public String getResolucionPantalla() {
        return resolucionPantalla;
    }

    public void setResolucionPantalla(String resolucionPantalla) {
        this.resolucionPantalla = resolucionPantalla;
    }
    
    
}

package ejercicio2;

/**
 * Clase que representa un cilindro
 * Además, implementa {@link Comparable} para poder ordenar cilindros según su volumen.
 */
public class Cilindro implements Comparable<Cilindro> {
    private int radio;
    private int altura;


    /**
     * Crea un nuevo cilindro con radio y altura dadas.
     *
     * @param radio radio del cilindro
     * @param altura altura del cilindro
     */
    public Cilindro(int radio, int altura) {
        this.radio = radio;
        this.altura = altura;
    }
    /**
     * Obtiene la altura del cilindro.
     *
     * @return altura del cilindro.
     */
    public int getAltura() {
        return altura;
    }

    /**
     * Modifica la altura del cilindro
     * @param altura nueva altura del cilindro
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }
    /**
     * Obtiene el radio del cilindro.
     *
     * @return radio del cilindro.
     */
    public int getRadio() {
        return radio;
    }
    /**
     * Modifica el radio del cilindro
     * @param radio nuevo radio del cilindro
     */
    public void setRadio(int radio) {
        this.radio = radio;
    }

    /**
     * Calcula el area del cilindro.
     * @return area total del cilindro
     */
    public double calcularAreaCilindro(){
        double areaLateral, areaBase;
        areaLateral = 2*Math.PI*getAltura()*getRadio();
        areaBase = Math.PI * (getRadio()*getRadio());
        return (2*areaBase)+areaLateral;
    }

    /**
     * Calcula el volumen del cilindro
     * @return volumen total del cilindro
     */
    public double calcularVolumenCilindro(){
        return Math.PI * (getRadio()*getRadio())*getAltura();
    }

    /**
     * Compara dos cilindros según su volumen total.
     *
     * @param o cilindro a comparar
     * @return valor negativo, cero o positivo según el área total
     */
    @Override
    public int compareTo(Cilindro o) {
        return Double.compare(this.calcularVolumenCilindro(),o.calcularVolumenCilindro());
    }

    /**
     * Devuelve una representación en texto del cilindro.
     *
     * @return cadena con radio, altura, volumen y area.
     */
    @Override
    public String toString() {
        return "ejercicio2.Cilindro{" +
                "Radio=" + radio +
                ", Altura=" + altura +
                "Volumen=" + this.calcularVolumenCilindro()+
                "Area=" + this.calcularAreaCilindro()+
                '}';
    }
}

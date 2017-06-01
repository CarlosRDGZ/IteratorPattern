package iteratorpattern;

public class Canal {
    
    private double frecuencia;
    private TipoCanal tipo;
    
    public Canal(double frecuencia, TipoCanal tipo){
        this.frecuencia = frecuencia;
        this.tipo = tipo;
    }

    public double getFrecuencia() {
        return frecuencia;
    }

    public TipoCanal getTipo() {
        return tipo;
    }
    
    @Override
    public String toString(){
        return "Frecuencia: " + frecuencia + ", Tipo: " + tipo;
    }
}

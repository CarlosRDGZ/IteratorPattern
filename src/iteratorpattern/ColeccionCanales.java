package iteratorpattern;

public interface ColeccionCanales {
    public void agregarCanal(Canal canal);
    
    public void removerCanal(Canal canal);
    
    public IteradorDeCanales iterador(TipoCanal tipo);
}

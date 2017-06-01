package iteratorpattern;

import java.util.ArrayList;
import java.util.List;

public class CanalesFM implements ColeccionCanales{
    private List<Canal> listaCanales;
    
    public CanalesFM() {
        listaCanales = new ArrayList();
    }
    
    @Override
    public void agregarCanal(Canal canal) {
        listaCanales.add(canal);
    }
    
    @Override
    public void removerCanal(Canal canal) {
        listaCanales.remove(canal);
    }
    
    @Override
    public IteradorDeCanales iterador(TipoCanal tipo) {
        return new IteradorFM(tipo, listaCanales);
    }
    
    private class IteradorFM implements IteradorDeCanales {
        private TipoCanal tipo;
        private List<Canal> canales;
        private int posicion;
        
        public IteradorFM(TipoCanal tipo, List<Canal> canales) {
            this.tipo = tipo;
            this.canales = canales;
        }
        
        @Override
        public boolean tieneSiguiente() {
            while(posicion < canales.size()) {
                
                Canal canal = canales.get(posicion);
                
                if(canal.getTipo().equals(tipo) ||
                    tipo.equals(TipoCanal.TODOS))
                {
                    return true;
                }
                else
                    posicion++;
            }
            return false;
        }
        
        @Override
        public Canal siguiente() {
            Canal canal = canales.get(posicion);
            posicion++;
            return canal;
        }
    }
}



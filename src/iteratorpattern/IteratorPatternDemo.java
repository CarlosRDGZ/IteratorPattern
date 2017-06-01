package iteratorpattern;

public class IteratorPatternDemo {

    public static void main(String[] args) {
        ColeccionCanales canalesFM = rellenarCanales();
        
        IteradorDeCanales iteradorBase = canalesFM.iterador(TipoCanal.TODOS);
        
        while(iteradorBase.tieneSiguiente())
            System.out.println(iteradorBase.siguiente().toString());
        
        System.out.println("\n**********************\n");
        
        IteradorDeCanales iteradorRock = canalesFM.iterador(TipoCanal.ROCK);
        
        while(iteradorRock.tieneSiguiente())
            System.out.println(iteradorRock.siguiente().toString());
    }
    
    private static ColeccionCanales rellenarCanales() {
        ColeccionCanales canales = new CanalesFM();
        
        canales.agregarCanal(new Canal(98.5, TipoCanal.POP));
        
        canales.agregarCanal(new Canal(99.5, TipoCanal.ROCK));
        
        canales.agregarCanal(new Canal(100.5, TipoCanal.POP));
        
        canales.agregarCanal(new Canal(101.5, TipoCanal.POP));
        
        canales.agregarCanal(new Canal(102.5, TipoCanal.HINDI));
        
        canales.agregarCanal(new Canal(103.5, TipoCanal.HINDI));
        
        canales.agregarCanal(new Canal(104.5, TipoCanal.ROCK));
        
        canales.agregarCanal(new Canal(105.5, TipoCanal.ROCK));
        
        canales.agregarCanal(new Canal(106.5, TipoCanal.ROCK));
        
        return canales;
    }
}

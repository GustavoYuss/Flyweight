/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightweight;

/**
 *
 * @author yusgu
 */
import java.util.HashMap;
import java.util.Map;


class FiguraFactory {
    private static final Map<String, Figura> figuras = new HashMap<>();
    
    public static Figura getFigura(String color, String tipo, int radio, int ancho, int alto) {
        String clave = color + tipo + radio + ancho + alto;
        Figura figura = figuras.get(clave);
        
        if (figura == null) {
            if (tipo.equalsIgnoreCase("circulo")) {
                figura = new Circulo(color, radio);
            } else if (tipo.equalsIgnoreCase("rectangulo")) {
                figura = new Rectangulo(color, ancho, alto);
            }
            
            figuras.put(clave, figura);
        }
        
        return figura;
    }
}

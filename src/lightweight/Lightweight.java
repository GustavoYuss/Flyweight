/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightweight;

/**
 *
 * @author yusgu
 */
public class Lightweight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figura circuloRojo1 = FiguraFactory.getFigura("rojo", "circulo", 10, 0, 0);
        circuloRojo1.dibujar();
        
        Figura circuloRojo2 = FiguraFactory.getFigura("rojo", "circulo", 20, 0, 0);
        circuloRojo2.dibujar();
        
        Figura rectanguloAzul1 = FiguraFactory.getFigura("azul", "rectangulo", 0, 70, 80);
        rectanguloAzul1.dibujar();
        
        Figura rectanguloAzul2 = FiguraFactory.getFigura("azul", "rectangulo", 0, 90, 100);
        rectanguloAzul2.dibujar();
        
        Figura rectanguloAzul3 = FiguraFactory.getFigura("azul", "rectangulo", 0, 90, 100);
        rectanguloAzul3.dibujar();
        
        System.out.println("Espacio en memoria");
        System.out.println(rectanguloAzul1);
        System.out.println(rectanguloAzul3);
        System.out.println(rectanguloAzul2);
    }
}
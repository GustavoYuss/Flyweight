/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightweight;

/**
 *
 * @author yusgu
 */
class Rectangulo implements Figura {
    private String color;
    private int ancho;
    private int alto;
    
    public Rectangulo(String color, int ancho, int alto) {
        this.color = color;
        this.ancho = ancho;
        this.alto = alto;
    }
    
    public void dibujar() {
        System.out.println("Dibujando un rectangulo de color " + color + ", ancho " + ancho + " y alto " + alto);
    }
}
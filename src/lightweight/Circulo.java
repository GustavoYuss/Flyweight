/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightweight;

/**
 *
 * @author yusgu
 */
class Circulo implements Figura {
    private String color;
    private int radio;
    
    public Circulo(String color, int radio) {
        this.color = color;
        this.radio = radio;
    }
    
    public void dibujar() {
        System.out.println("Dibujando un circulo de color " + color + " y radio " + radio);
    } 
}

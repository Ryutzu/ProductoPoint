/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Alumno
 */
public class PPunto {
    int Producto=0;

    public PPunto(Vector v1,Vector v2,int angle) {
        Producto=(int) (v1.getMagni()*v2.getMagni()*Math.cos(Double.parseDouble(String.valueOf(angle))));
    }
    public int getProducto() {
        return Producto;
    }

    public void setProducto(int Producto) {
        this.Producto = Producto;
    }
    
}

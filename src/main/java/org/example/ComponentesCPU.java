package org.example;
import java.util.HashSet;
import java.util.Scanner;
import java.util.HashMap;
public class ComponentesCPU {
    private String componentes;
    private String marca;
    private int cantidad;
    private double precio;

    public ComponentesCPU(String componentes,String marca,int cantidad,double precio ){
        this.componentes=componentes;
        this.marca=marca;
        this.cantidad=cantidad;
        this.precio=precio;
    }

    public String getComponentes() {
        return componentes;
    }

    public void setComponentes(String componentes) {
        this.componentes = componentes;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

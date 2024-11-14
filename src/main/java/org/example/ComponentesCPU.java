package org.example;

public class ComponentesCPU {
    private String componentes;
    private String marca;
    private String nombre;
    private int cantidad;
    private double precio;

    public ComponentesCPU(String componentes,String marca,int cantidad,double precio ){
        this.componentes=componentes;
        this.marca=marca;
        this.cantidad=cantidad;
        this.precio=precio;
    }

    public  double calcularCosto() {
        return cantidad * precio;
    }

    public String getComponentes() {
        return componentes;
    }


    public String getMarca() {
        return marca;
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


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

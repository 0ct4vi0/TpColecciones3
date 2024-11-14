package org.example;
import java.util.HashSet;
import java.util.Scanner;
import java.util.HashMap;
public class Computadora {
    private String marca;
    private String modelo;
    private HashSet<ComponentesCPU> componentes;

    public Computadora(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.componentes = new HashSet<>();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public HashSet<ComponentesCPU> getCompCPU() {
        return componentes;
    }

    public void setCompCPU(HashSet<ComponentesCPU> compCPU) {
        this.componentes = compCPU;
    }

    public void  agregarComponente(ComponentesCPU componente){
        componentes.add(componente);
    }

    public double CostoT() {
        double costoTotal = 0;
        for (ComponentesCPU c : componentes) {
            costoTotal += c.calcularCosto();
        }
        return costoTotal;
    }

    public double PrecioV() {
        double costoTotal = CostoT();
        if (costoTotal < 50000) {
            return costoTotal * 1.40;  // 40% de ganancia
        } else {
            return costoTotal * 1.30;  // 30% de ganancia
        }
    }


    public void mostrarInfo() {
        System.out.println("Marca: " + marca +
                "\t" + " | Modelo: " + modelo);
        System.out.println("---------------------------");
        System.out.println("Componentes:");
        System.out.println("Componente:  " + "   Marca:  " + "  Cantidad:  ");
        for (ComponentesCPU c : componentes) {
            System.out.println(c.getNombre()+" "+c.getMarca()+" "+c.getCantidad());
        }
        double costoTotal = CostoT();
        double precioVenta = PrecioV();
        System.out.println("Costo total de la computadora: " + costoTotal);
        System.out.println("Precio de venta sugerido: " + precioVenta);
    }

}

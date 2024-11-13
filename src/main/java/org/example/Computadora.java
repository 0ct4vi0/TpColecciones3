package org.example;
import java.util.HashSet;
import java.util.Scanner;
import java.util.HashMap;
public class Computadora {
    private String marca;
    private String modelo;
    private HashSet<ComponentesCPU> compCPU;

    public Computadora(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.compCPU = new HashSet<>();
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
        return compCPU;
    }

    public void setCompCPU(HashSet<ComponentesCPU> compCPU) {
        this.compCPU = compCPU;
    }
}

package com.robertramirez.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Empleado {

    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;

    public Empleado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial){
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public abstract Double ingresos();
    public abstract String toString();

}

package com.robertramirez.example;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmpleadoAsalariado extends Empleado{

    private Double salarioSemanal;

    public EmpleadoAsalariado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, Double salarioSemanal) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);

        if(salarioSemanal < 0.0) throw new IllegalArgumentException("El salario semanal debe ser >= 0.0");
        this.salarioSemanal = salarioSemanal;

    }

    @Override
    public Double ingresos() {
        return this.getSalarioSemanal();
    }

    @Override
    public String toString() {
        return String.format("empleado asalariado: %s %s %n" +
                        "numero de seguro social: %s %n" +
                        "salario semanal: %s ",
                        this.getPrimerNombre(), this.getApellidoPaterno(),
                        this.getNumeroSeguroSocial(), this.ingresos());
    }
}

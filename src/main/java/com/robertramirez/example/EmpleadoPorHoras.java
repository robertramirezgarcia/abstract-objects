package com.robertramirez.example;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmpleadoPorHoras extends Empleado {

    private Double sueldo;
    private Double horasTrabajadas;

    public EmpleadoPorHoras(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, Double sueldo, Double horasTrabajadas) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
        this.sueldo = sueldo;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public Double ingresos() {
        return horasTrabajadas <= 40.0  ? sueldo * horasTrabajadas : 40.0 * sueldo + (horasTrabajadas - 40 ) * sueldo * 1.5;
    }

    @Override
    public String toString() {
        return String.format("empleado por horas: %s %s %n" +
                        "numero de seguro social: %s %n" +
                        "sueldo por horas: %s ; horas trabajadas %s",
                this.getPrimerNombre(), this.getApellidoPaterno(),
                this.getNumeroSeguroSocial(), this.getSueldo(), this.getHorasTrabajadas());
    }
}

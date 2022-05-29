package com.robertramirez.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmpleadoPorComision extends Empleado{

    private Double tarifaComision;
    private Integer ventasBrutas;

    public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, Double tarifaComision, Integer ventasBrutas) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
        this.tarifaComision = tarifaComision;
        this.ventasBrutas = ventasBrutas;
    }

    @Override
    public Double ingresos() {
        return this.tarifaComision * this.ventasBrutas;
    }

    @Override
    public String toString() {
        return String.format("empleado por comision %s %s %n" +
                        "numero de seguro social: %s %n" +
                        "ventas brutas: %s ; tarifa de comision %s",
                this.getPrimerNombre(), this.getApellidoPaterno(),
                this.getNumeroSeguroSocial(), this.getVentasBrutas(), this.getTarifaComision());
    }
}

package com.robertramirez.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmpleadoBaseMasComision extends EmpleadoPorComision{
    private Double salarioBase;

    public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, Double salarioBase, Double tarifaComision, Integer ventasBrutas) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial, tarifaComision, ventasBrutas);
        this.salarioBase = salarioBase;
    }

    @Override
    public Double ingresos() {
        return super.ingresos() + salarioBase;
    }

    @Override
    public String toString() {
        return String.format("empleado por comision con salario base: %s %s %n" +
                        "numero de seguro social: %s %n" +
                        "ventas brutas: %s ;%n tarifa de comision %s;%n"+
                        "salario base: %s",
                this.getPrimerNombre(), this.getApellidoPaterno(),
                this.getNumeroSeguroSocial(), this.getVentasBrutas(), this.getTarifaComision(),
                this.getSalarioBase());
    }

}

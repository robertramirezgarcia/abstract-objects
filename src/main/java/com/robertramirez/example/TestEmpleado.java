package com.robertramirez.example;

public class TestEmpleado {
    public static void main(String[] args){
        Empleado emplAsala = new
                EmpleadoAsalariado("david", "ramirez", "NS1", 200.00);
        Empleado emplHoras = new
                EmpleadoPorHoras("robert", "garcia", "NS2", 5.0, 40.0);
        Empleado emplPorComision = new
                EmpleadoPorComision("juan", "perez", "NS3", 2.50, 20);
        Empleado emplBaseMasCom = new EmpleadoBaseMasComision("juan", "perez", "NS3", 200.00, 2.50, 20);

        System.out.println(String.format("Informacion:%n--------------%n%s%nIngreso: %s%n%n", emplAsala.toString(), emplAsala.ingresos()));
        System.out.println(String.format("Informacion:%n--------------%n%s%nIngreso: %s%n%n", emplHoras.toString(), emplHoras.ingresos()));
        System.out.println(String.format("Informacion:%n--------------%n%s%nIngreso: %s%n%n", emplPorComision.toString(), emplPorComision.ingresos()));
        System.out.println(String.format("Informacion:%n--------------%n%s%nIngreso: %s%n%n", emplBaseMasCom.toString(), emplBaseMasCom.ingresos()));

    }
}

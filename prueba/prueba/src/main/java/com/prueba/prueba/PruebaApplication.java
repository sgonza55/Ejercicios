package com.prueba.prueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PruebaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaApplication.class, args);
		//System.out.println("Hola Santi");

	}
	@GetMapping("/Santi") //http://localhost:8080/Santi
	public String empresas(@RequestParam(value ="empresas",defaultValue = "No hay empresa") String empresas) {
		empresa empresa = new empresa();
		empresa.setNombreEmpresa("Lugon");
		empresa.setDireccion("Cra 65a 99-158");
		empresa.setTelefono("3218888895");
		empresa.setNIT("103.526.896");

		String resumenEmpresa = (empresa.getNombreEmpresa()+ "-" + empresa.getDireccion() + "-" + empresa.getTelefono()
				+ "-" + empresa.getNIT());



		empleado empleado = new empleado();
		empleado.setNombre("Santiago Gonzalez");
		empleado.setRol("Supervisor");
		empleado.setCorreo("asd@hotmail.com");
		empleado.setNombreEmpresa("Lugon");

		String resumenEmpleado = (empleado.getNombre() + "-" + empleado.getCorreo() + "-" + empleado.getRol()
				+ "-" + empleado.getNombreEmpresa());


		MovimientoDinero Movimiento = new MovimientoDinero();
		Movimiento.setMonto(-155000);
		Movimiento.setConcepto("Recibo de Luz");
		Movimiento.setEmpleado("Santiago Gonzalez");

		String resumenMovimiento = (Movimiento.getMonto() + "-" + Movimiento.getConcepto() + "-"
			+ Movimiento.getEmpleado());


		empresas = resumenMovimiento;

		//Otra opcion es hacer el Request con ?name=SANTIAGO
		return String.format("Los datos de la empresa son: %s", empresas);
	}

}

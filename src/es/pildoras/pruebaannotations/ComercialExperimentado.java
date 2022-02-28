package es.pildoras.pruebaannotations;

import org.springframework.stereotype.Component;

//Esto es un Bean!!

@Component("ComercialExperimentado") //este es el nombre del bean que no tiene por qué ser igual al nombre de la clase
public class ComercialExperimentado implements Empleados {

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, vender y vendermas";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Esto esun informe generado por el comercial";
	}

}

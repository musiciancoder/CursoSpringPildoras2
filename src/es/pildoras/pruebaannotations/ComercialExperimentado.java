package es.pildoras.pruebaannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Esto es un Bean!!

@Component
public class ComercialExperimentado implements Empleados {

	public ComercialExperimentado() {}

	@Autowired //ojo que si hay solo un constructor como en este caso no es necesario usar autowired a partir de la version spring 4.3
	public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, vender y vendermas";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		//return "Esto es un informe generado por el comercial";
		return nuevoInforme.getInformeFinanciero();
	}
	private CreacionInformeFinanciero nuevoInforme;
}

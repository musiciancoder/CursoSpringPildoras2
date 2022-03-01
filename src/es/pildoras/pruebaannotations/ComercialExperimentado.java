package es.pildoras.pruebaannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//Esto es un Bean!!

@Component
public class ComercialExperimentado implements Empleados {


	//ejecucion de código despues de la creacion del Bean
	@PostConstruct //solo se puede usar con singleton, son void y no reciben argumentos
	public void ejecutaDespuesCreacion(){
		System.out.println("Ejecuta tras creacion de Bean");
	}

	//ejecucion de código despues de apagado contenedor Spring
	@PreDestroy //solo se puede usar con singleton
	public void ejecutaAntesDestruccion(){
		System.out.println("Ejecuta antes de destruccion");
	}

	public ComercialExperimentado() {}



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

	//iny de dependencias por campo de clase
	@Autowired
	@Qualifier("informeFinancieroTrim2") //bean id que debe utilizar, o sea informeFinancieroTrim2
	private CreacionInformeFinanciero nuevoInforme;
}

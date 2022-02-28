package es.pildoras.pruebaannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {
	
	public static void main(String [] args) {
		
		//leer el xml de configuracion
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("ApplicationContext.xml"
				);
		
		//pedir bean al contenedor
		Empleados Antonio = contexto.getBean("comercialExperimentado",Empleados.class);
		
		//usar el bean
		System.out.println(Antonio.getInforme());
		System.out.println(Antonio.getTareas());
		
		//cerrar el contexto
		contexto.close();
	}

}

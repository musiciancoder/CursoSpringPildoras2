package es.pildoras.pruebaannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

    public static void main(String[] args) {
        //leer el xml de configuracion (como tenemos una clase EmpleadosConfig no se ocupa)
        //ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        //leer el class de configuracion
        AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);

        //pedir bean al contenedor
/*        Empleados empleado=contexto.getBean("directorFinanciero", Empleados.class);

        System.out.println(empleado.getTareas());

        System.out.println(empleado.getInforme());*/

        DirectorFinanciero empleado = contexto.getBean("directorFinanciero",DirectorFinanciero.class);

        System.out.println("Email del director: " + empleado.getEmail());

        System.out.println("Nombre de la empresa:" + empleado.getNombreEmpresa());

        //cerrar el contexto
        contexto.close();
    }

}

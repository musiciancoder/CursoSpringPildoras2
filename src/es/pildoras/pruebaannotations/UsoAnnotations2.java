package es.pildoras.pruebaannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

    public static void main(String[] args) {
        //leer el xml de configuracion
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        //pedir bean al contenedor
        Empleados Antonio = contexto.getBean("comercialExperimentado", Empleados.class);

        Empleados Lucia = contexto.getBean("comercialExperimentado",Empleados.class);

        //¿apuntan al mismo objeto en memoria?

        if(Antonio==Lucia){
            System.out.println("Apuntan al mismo objeto en memoria");
            System.out.println(Antonio + "\n" + Lucia);
        }else {
            System.out.println("No apuntan al mismo objeto en memoria");
            System.out.println(Antonio + "\n" + Lucia);

        }

        //cerrar el contexto
        contexto.close();
    }

}

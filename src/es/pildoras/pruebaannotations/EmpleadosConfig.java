package es.pildoras.pruebaannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//Con esto prescindimos del applicationContext.xml
@Configuration
@ComponentScan("es.pildoras.pruebaannotations")
public class EmpleadosConfig {

    //definir el bean para informeFinancieroDtoCompras
    @Bean
    public CreacionInformeFinanciero informeFinancieroDtoCompras (){ //será el id del Bean inyectado
        return new InformeFinancieroDtoCompras();
    }

    //definir el bean para DirectorFinanciero e inyectar dependencias
    @Bean
    public Empleados directorFinanciero(){
        return new DirectorFinanciero(informeFinancieroDtoCompras());
    }

}

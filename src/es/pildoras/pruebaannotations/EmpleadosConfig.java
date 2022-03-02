package es.pildoras.pruebaannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//Con esto prescindimos del applicationContext.xml
@Configuration
@ComponentScan("es.pildoras.pruebaannotations")
//Para obtener valores de archivoexterno por medio de @Value en clase DirectorFinanciero
@PropertySource("classpath:datosEmpresa.propiedades")
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

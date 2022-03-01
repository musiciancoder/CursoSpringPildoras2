package es.pildoras.pruebaannotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//Con esto prescindimos del applicationContext.xml
@Configuration
@ComponentScan("es.pildoras.pruebaannotations")
public class EmpleadosConfig {
}

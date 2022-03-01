package es.pildoras.pruebaannotations;
import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim4 implements CreacionInformeFinanciero{
    @Override
    public String getInformeFinanciero() {
        return "Presentacion informe cierre de año";
    }
}

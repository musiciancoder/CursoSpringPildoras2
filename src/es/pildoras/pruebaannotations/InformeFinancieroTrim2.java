package es.pildoras.pruebaannotations;
import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim2 implements CreacionInformeFinanciero {
    @Override
    public String getInformeFinanciero() {
        return "Presentacion informe financiero catastrofico trim2";
    }
}

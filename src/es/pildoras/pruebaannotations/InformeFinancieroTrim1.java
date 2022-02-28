package es.pildoras.pruebaannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim1 implements CreacionInformeFinanciero{



    @Override
    public String getInformeFinanciero() {
        return "Presentacion de informe financiero trimestre 1";
    }


}

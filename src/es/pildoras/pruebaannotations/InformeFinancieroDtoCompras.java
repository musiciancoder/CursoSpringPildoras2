package es.pildoras.pruebaannotations;

public class InformeFinancieroDtoCompras implements CreacionInformeFinanciero{
    @Override
    public String getInformeFinanciero() {
        return "Informe financiero del departamento de compras a�o 2018";
    }
}

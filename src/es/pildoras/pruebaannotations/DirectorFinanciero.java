package es.pildoras.pruebaannotations;

public class DirectorFinanciero implements Empleados{

    //constructor para iny. dependencias
    public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
        this.informeFinanciero = informeFinanciero;
    }

    @Override
    public String getTareas() {
        return "Gestion y direccion de las operaciones financieras de la empresa";
    }

    @Override
    public String getInforme() {
        return informeFinanciero.getInformeFinanciero();
    }

    //para iny. dependencias
    private CreacionInformeFinanciero informeFinanciero;
}

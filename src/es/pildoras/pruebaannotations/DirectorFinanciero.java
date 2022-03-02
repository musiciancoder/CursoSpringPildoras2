package es.pildoras.pruebaannotations;

import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero implements Empleados{

    //constructor para iny. dependencias
    public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
        this.informeFinanciero = informeFinanciero;
    }

    //para obtener por medio de @Value el valor delarchivo externo
    public String getEmail() {
        return email;
    }

    //para obtener por medio de @Value el valor delarchivo externo
    public String getNombreEmpresa() {
        return nombreEmpresa;
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

    @Value("${email}")
    private String email; //no necesariamente tienen que coincidir los nombres del campo con los del value

    @Value("${nombreEmpresa}")
    private String nombreEmpresa;
}

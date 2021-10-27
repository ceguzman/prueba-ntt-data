package com.nttdata.examen.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(schema = "GCCOBRANZAS" , name = "COB_GESTOR")
public class CobGestor implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(length = 30)
    private String USUARIO_ID;

    @Column(name = "PRIMER_NOMBRE", length = 30, nullable = false)
    private String primerNombre;

    @Column(name = "SEGUNDO_NOMBRE", length = 30)
    private String segundoNombre;

    @Column(name = "PRIMER_APELLIDO", length = 30, nullable = false)
    private String primerApellido;

    @Column(name = "SEGUNDO_APELLIDO", length = 30)
    private String segundoApellido;

}

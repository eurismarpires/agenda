package com.eurismar.agenda.dominio;

import com.eurismar.agenda.dominio.Contato;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-12-14T04:56:45")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> Senha;
    public static volatile ListAttribute<Usuario, Contato> contatos;
    public static volatile SingularAttribute<Usuario, Long> id;
    public static volatile SingularAttribute<Usuario, String> Login;
    public static volatile SingularAttribute<Usuario, String> Nome;

}
package com.eurismar.agenda.dominio;

import com.eurismar.agenda.dominio.Contato;
import com.eurismar.agenda.dominio.MeioContato;
import com.eurismar.agenda.dominio.Usuario;
import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-12-14T04:56:45")
@StaticMetamodel(Contato.class)
public class Contato_ { 

    public static volatile SingularAttribute<Contato, Calendar> dataAniversario;
    public static volatile ListAttribute<Contato, Contato> contatos;
    public static volatile ListAttribute<Contato, MeioContato> meiosContatos;
    public static volatile SingularAttribute<Contato, String> nome;
    public static volatile SingularAttribute<Contato, Usuario> usuario;
    public static volatile SingularAttribute<Contato, Long> id;
    public static volatile SingularAttribute<Contato, String> cargo;
    public static volatile SingularAttribute<Contato, String> empresa;

}
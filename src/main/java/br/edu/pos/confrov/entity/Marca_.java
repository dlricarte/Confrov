package br.edu.pos.confrov.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-09-12T00:25:48.442-0400")
@StaticMetamodel(Marca.class)
public class Marca_ {
	public static volatile SingularAttribute<Marca, Long> id;
	public static volatile SingularAttribute<Marca, String> descricao;
	public static volatile SetAttribute<Marca, Modelo> modelo;
}

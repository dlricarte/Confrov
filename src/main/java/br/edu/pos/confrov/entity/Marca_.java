package br.edu.pos.confrov.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-09-10T10:41:28.425-0400")
@StaticMetamodel(Marca.class)
public class Marca_ {
	public static volatile SingularAttribute<Marca, Long> id;
	public static volatile SingularAttribute<Marca, String> descricao;
	public static volatile SetAttribute<Marca, Modelo> modelo;
}
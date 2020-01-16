package com.example.converter.entity;

import java.io.Serializable;

import javax.persistence.Transient;


public interface IEntidade<E extends Serializable, I extends Serializable> extends Serializable {
	@Transient
	Class<? extends E> getEntityClass();
	
	@Transient
	I getEntityIdObject();

	boolean isLoggable();
}

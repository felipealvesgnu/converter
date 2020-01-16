package com.example.converter.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@javax.persistence.Cacheable(true)
@Table(name = "tb_pais", uniqueConstraints = { @UniqueConstraint(columnNames = "cd_pais"),
    @UniqueConstraint(columnNames = "ds_pais") })
public class Pais implements java.io.Serializable, com.example.converter.entity.IEntidade<Pais,Integer> {

  private static final long serialVersionUID = 1L;
  private Integer id;
  private String codigo;
  private String descricao;
  private String sigla;

  public Pais() {

  }

  @Id
  @GeneratedValue(generator = "gen_pais")
  @Column(name = "id_pais", unique = true, nullable = false)
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  @Column(name = "cd_pais", length = 15)
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  @Column(name = "ds_pais", length = 500)
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  @Column(name = "ds_sigla", length = 2)
  public String getSigla() {
    return sigla;
  }

  public void setSigla(String sigla) {
    this.sigla = sigla;
  }

  @Override
  public String toString() {
    return getDescricao();
  }

  @Override
  @javax.persistence.Transient
  public Class<? extends Pais> getEntityClass() {
    return Pais.class;
  }

  @Override
  @javax.persistence.Transient
  public Integer getEntityIdObject() {
    return getId();
  }

  @Override
  @javax.persistence.Transient
  public boolean isLoggable() {
    return true;
  }

}

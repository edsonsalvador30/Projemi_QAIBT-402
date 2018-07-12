package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela COMPRAS
 * @generated
 */
@Entity
@Table(name = "\"COMPRAS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Compras")
public class Compras implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "descricao", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String descricao;

  /**
  * @generated
  */
  @Column(name = "preco", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double preco;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "data", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date data;

  /**
   * Construtor
   * @generated
   */
  public Compras(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Compras setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém descricao
   * return descricao
   * @generated
   */
  
  public java.lang.String getDescricao(){
    return this.descricao;
  }

  /**
   * Define descricao
   * @param descricao descricao
   * @generated
   */
  public Compras setDescricao(java.lang.String descricao){
    this.descricao = descricao;
    return this;
  }

  /**
   * Obtém preco
   * return preco
   * @generated
   */
  
  public java.lang.Double getPreco(){
    return this.preco;
  }

  /**
   * Define preco
   * @param preco preco
   * @generated
   */
  public Compras setPreco(java.lang.Double preco){
    this.preco = preco;
    return this;
  }

  /**
   * Obtém data
   * return data
   * @generated
   */
  
  public java.util.Date getData(){
    return this.data;
  }

  /**
   * Define data
   * @param data data
   * @generated
   */
  public Compras setData(java.util.Date data){
    this.data = data;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Compras object = (Compras)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}

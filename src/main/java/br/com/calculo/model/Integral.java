package br.com.calculo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "INTEGRAL")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Integral {

  @Column(name = "ID")
  @Id
  @GeneratedValue
  private Long id;

  @Column(name = "VALOR_UM")
  private Double valorUm;

  @Column(name = "VALOR_DOIS")
  private Double valorDois;
}

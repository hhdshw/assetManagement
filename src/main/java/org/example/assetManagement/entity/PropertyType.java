package org.example.assetManagement.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class PropertyType {

  @Id
//  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;//
  private String propertyTypeid;//1:社交2：理财、3：娱乐
  private String propertyTypename;

}

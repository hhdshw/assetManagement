package org.example.assetManagement.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class PropertyInfo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String propertyId;//资产账号
  private String userId;
  private String propertytypeId;//资产类别编号
  private String typeDescId;
  private String propertyPassword;//资产密码
  private String softPetname;
  private String createTime;
  private String updateTime;
  private String haeresEmail;
  private String haeresPhone;
  private String haeresName;
  private String haeresId;
  private String accessory;


}

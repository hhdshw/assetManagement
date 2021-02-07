package org.example.assetManagement.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class UserInfo {

  @Id
  private String userId;
  private String password;
  private String userName;
  private int userAge;
  private Date userBirthday;
  private String userSex;
  private String userPhone;
  private String userNatpl;
  private String userAddress;
  private String userEmail;
  private String emgContact;
  private String emgCtemail;
  private String accessory;

}

package com.ibm.idp.domain;

import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Data
@Table(name = "testuser")
public class UserEntity {
    
    @Schema(description = "User name", example = "Sam Smith", requiredMode = RequiredMode.REQUIRED)
    @Column
    private String username;
  
    @Schema(description = "User id", example = "Auto generated", requiredMode = RequiredMode.REQUIRED)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    
    @Schema(description = "Manager's serial number", example = "51222", requiredMode = RequiredMode.REQUIRED)
    @Column
    private String managerSerialNumber;
    
    @Schema(description = "User emailr", example = "sam.smith@ibm.com", requiredMode = RequiredMode.REQUIRED)
    @Column
    private String email;
    
    @Schema(description = "User's job responsibility", example = "Technology Engineer ", requiredMode = RequiredMode.REQUIRED)
    @Column
    private String job;
    
    @Schema(description = "Check if user is manager", example = "0: general user, 1: first stage manager, 2: second stage manager", requiredMode = RequiredMode.REQUIRED)
    @Column
    private Integer isManager;
    
    @Schema(description = "User's team name", example = "IBM Client Engineering")
    @Column
    private String team;
    
    public UserEntity (
        final String username,
        final int id,
        final String email,
        final String managerSerialNumber,
        final String job,
        final Integer isManager,
        final String team){
            this.username = username;
            this.id = id;
            this.email = email;
            this.managerSerialNumber = managerSerialNumber;
            this.job = job;
            this.isManager = isManager;
            this.team = team;
    }
}

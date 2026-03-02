package com.propertyManagement.propertyManagement.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name="User_Table")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(name="email",nullable = false)
    private String ownerEmail;
    private String ownerName;
    private String phone;
    private String password;

}

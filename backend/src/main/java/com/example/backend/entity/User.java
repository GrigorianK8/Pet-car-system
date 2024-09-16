package com.example.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String gender;

    @Column(name = "mobile")
    private String phoneNumber;

    private String email;
    private String password;
    private String userType;
    private boolean isEnabled;
}

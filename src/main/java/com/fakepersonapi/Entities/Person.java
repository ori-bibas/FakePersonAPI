package com.fakepersonapi.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "PERSON")
@Getter
@Setter
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String firstName;
    @Column
    private String lastName;

    @Transient
    private String age;
    @Transient
    private String emailAddress;
    @Transient
    private String phoneNumber;
    @Transient
    private Address address;

}
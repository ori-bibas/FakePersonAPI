package com.fakepersonapi.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "PERSON")
@Getter
@Setter
@ToString
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
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

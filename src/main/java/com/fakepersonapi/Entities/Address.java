package com.fakepersonapi.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "ADDRESS")
@Getter
@Setter
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String streetAddress;
    @Column
    private String city;
    @Column
    private String state;
    @Column
    private String zipCode;

}

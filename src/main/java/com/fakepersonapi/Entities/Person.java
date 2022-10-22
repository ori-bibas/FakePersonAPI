package com.fakepersonapi.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Person {

    @JsonIgnore
    private Long id;

    private String firstName;
    private String lastName;
    private String age;
    private String emailAddress;
    private String phoneNumber;
    private Address address;

}

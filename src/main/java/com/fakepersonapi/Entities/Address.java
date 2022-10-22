package com.fakepersonapi.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class Address {

    @JsonIgnore
    private Long id;

    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;

}

package com.example.springjpaexample;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Address {
    private String zipCode;
    private String city;
    private String street;

}

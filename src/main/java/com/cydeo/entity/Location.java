package com.cydeo.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Long latitude;
    private Long longitude;
    private String country;
    private String city;
    private String state;
    private String postalCode;
    private String address;


}

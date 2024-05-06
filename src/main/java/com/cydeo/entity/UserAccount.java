package com.cydeo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class UserAccount extends BaseEntity{

    @OneToOne(fetch = FetchType.LAZY)
    private AccountDetails accountDetails;

    private String email;
    private String password;
    private String username;



}

package com.example.BackendPro;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "member")
public class Member {

    @Id
    private String Id;
    @Column (length = 255, nullable = false)
    private String name;

    @Column (length = 255, nullable = false)
    private String number;

    @Column (length = 255, nullable = false)
    private String mail;

    @Column (length = 255, nullable = true)
    private String cust_type;

}
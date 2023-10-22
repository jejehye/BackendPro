package com.example.BackendPro;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "member")
public class MemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//자동생성
    private String Id;
    @Column (length = 255, nullable = false)
    private String name;

    @Column (length = 255, nullable = false)
    private String number;

    @Column (length = 255, nullable = false)
    private String mail;

    @Column (length = 255, nullable = true)
    private String cust_type;

    public MemberEntity (String mail , String name, String number) {
        this.Id=Id;
        this.name=name;
        this.number=number;
        this.mail=mail;
        this.cust_type="0";
    }

    public MemberEntity(){

    }

}
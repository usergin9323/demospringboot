package com.example.demospringboot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "tb_user")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String username;
    @Column
    private String password;
}

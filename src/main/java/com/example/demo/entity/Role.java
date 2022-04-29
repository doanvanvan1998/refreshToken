package com.example.demo.entity;

import com.example.demo.entity.DefineRole;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "roles")
@AllArgsConstructor
@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private DefineRole name;
    public Role() {
    }
    public Role(DefineRole name) {
        this.name = name;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public DefineRole getName() {
        return name;
    }
    public void setName(DefineRole name) {
        this.name = name;
    }

}

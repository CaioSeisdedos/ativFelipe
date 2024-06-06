package br.edu.uniara.dp2.malara.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.processing.Generated;
@Data
@Entity
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String role;

    private String sobrenome;

    public Employee(String name, String role, String sobrenome) {
        this.name = name;
        this.role = role;
        this.sobrenome = sobrenome;
    }
}

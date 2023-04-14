package com.bridgelabz.employeepayroll.model;

import com.bridgelabz.employeepayroll.dto.EmpDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class EmpData {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private double salary;

    public EmpData(EmpDTO empDTO) {
    }
}

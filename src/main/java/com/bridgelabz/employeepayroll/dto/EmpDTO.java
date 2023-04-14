package com.bridgelabz.employeepayroll.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.ToString;

@ToString
public class EmpDTO {
    @NotEmpty(message ="Name Cannot be Empty")
    public String name;
    @Min(value=500,message = "min Salary should be more than 500")
    public double salary;


}

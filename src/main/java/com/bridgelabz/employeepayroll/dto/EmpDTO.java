package com.bridgelabz.employeepayroll.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.NonNull;
import lombok.ToString;

@ToString
public class EmpDTO {
    @NonNull
    @Pattern(regexp = "^[A-Z]{1}[A-Za-z]{2,}$",message = "Name s Invalid e.g(A*****)")
    public String name;
    @Min(value=500,message = "min Salary should be more than 500")
    public double salary;


}

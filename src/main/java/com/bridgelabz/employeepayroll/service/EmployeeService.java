package com.bridgelabz.employeepayroll.service;

import com.bridgelabz.employeepayroll.dto.EmpDTO;
import com.bridgelabz.employeepayroll.model.EmpData;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    EmpData addEmployee(EmpDTO empDTO);

    Optional<EmpData> getEmployeeById(int id);

    List<EmpData> getDisplayAllEmployee();

    EmpData UpdateById(EmpDTO empDTO,int id);

    String deleteById(int id);

    String DeleteAll();
}

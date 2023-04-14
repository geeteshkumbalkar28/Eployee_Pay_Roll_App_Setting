package com.bridgelabz.employeepayroll.controller;

import com.bridgelabz.employeepayroll.dto.EmpDTO;
import com.bridgelabz.employeepayroll.dto.ResponseDTO;
import com.bridgelabz.employeepayroll.model.EmpData;
import com.bridgelabz.employeepayroll.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeePayrollController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/Save")
    public ResponseDTO addEmployee(@RequestBody EmpDTO empDTO){
        EmpData empData = employeeService.addEmployee(empDTO);
        ResponseDTO responseDTO = new ResponseDTO("Data Added Succesfully",empData);
        return responseDTO;
    }
    @GetMapping("/{id}")
    public ResponseDTO getEmployeeById(@PathVariable int id){
        Optional<EmpData> empData = employeeService.getEmployeeById(id);
        ResponseDTO responseDTO = new ResponseDTO("Eployee Data Found",empData);
        return responseDTO;
    }

    @GetMapping("/")
    public ResponseDTO getAllEmployee(){
        List<EmpData> empData = employeeService.getDisplayAllEmployee();
        ResponseDTO responseDTO =new ResponseDTO("Eployee Data Found",empData);
        return responseDTO;
    }
    @PutMapping("Edit/{id}")
    public EmpData editEmployee(@RequestBody EmpDTO empDTO,@PathVariable int id){
        EmpData empData = employeeService.UpdateById(empDTO,id);
        return empData;
    }
    @DeleteMapping("/Delete/{id}")
    public String deleteUserData(@PathVariable int id){
        String employeData=employeeService.deleteById(id);

        return employeData;
    }
    @DeleteMapping("/DeleteAll")
    public String deleteAllUser(){
        String employeeData = employeeService.DeleteAll();
        return employeeData;
    }


}

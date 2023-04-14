package com.bridgelabz.employeepayroll.dto;

import com.bridgelabz.employeepayroll.model.EmpData;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
public class ResponseDTO {
    private String message;
    private Object data;

    public ResponseDTO(String message, Object data) {
        this.message = message;
        this.data = data;
    }

}

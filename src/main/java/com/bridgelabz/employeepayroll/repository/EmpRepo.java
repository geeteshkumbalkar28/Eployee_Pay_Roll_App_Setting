package com.bridgelabz.employeepayroll.repository;

import com.bridgelabz.employeepayroll.model.EmpData;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepo extends JpaRepository <EmpData,Integer>{
}

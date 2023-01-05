package cn.edu.njfu.zyf.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import cn.edu.njfu.zyf.model.ScoreSheet;
 
public interface ScoreSheetRepository extends CrudRepository<ScoreSheet, Long>{
 
    @Query(value = "select t from score_sheet t where t.userEmployeeNumber = :employeeNumber")
    ScoreSheet findByEmployeeNumber(@Param("employeeNumber")String employeeNumber);
    
    @Query(value = "select t from score_sheet t where t.userEmployeeNumber = :employeeNumber and t.userPassword = :password")
    ScoreSheet findByEmployeeNumberAndPassword(@Param("employeeNumber")String employeeNumber,
            @Param("password")String password);
}

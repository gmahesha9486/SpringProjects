package com.mkyong.customer.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


public class EmployeeDao {  
	
	
private JdbcTemplate jdbcTemplate;  
  
public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
    this.jdbcTemplate = jdbcTemplate;  
}  
  

@Transactional
public int saveEmployee(Employee e){  
	
    String query="insert into employee values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')";  
    //jdbcTemplate.update(query);
    
    query="insert into employee values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"','"+e.getId()+"')";  	
     
    saveEmployee123(e);
    int ret = jdbcTemplate.update(query); 
    return ret;
}  

@Transactional(propagation=Propagation.REQUIRES_NEW)
public int saveEmployee123(Employee e){  
	
	String query="insert into employee values('220','"+e.getName()+"','"+e.getSalary()+"')";  
    System.out.println("============================test========================"); 
    return jdbcTemplate.update(query);  
    
} 

public int updateEmployee(Employee e){  
    String query="update employee set  name='"+e.getName()+"',salary='"+e.getSalary()+"' where id='"+e.getId()+"' ";  
    return jdbcTemplate.update(query);  
}  
public int deleteEmployee(Employee e){  
    String query="delete from employee where id='"+e.getId()+"' ";  
    return jdbcTemplate.update(query);  
}  
  
}  
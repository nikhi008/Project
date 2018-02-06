package Dao;

import org.springframework.jdbc.core.JdbcTemplate;

import Bean.Emp;

public class EmpDao
{
	JdbcTemplate template;  
	  
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}  
	public int save(Emp p){  
	    String sql="insert into ee(name,salary,designation)values('"+p.getName()+"','"+p.getSalary()+"','"+p.getDesignation()+"')";  
	    return template.update(sql);  
	}  

}

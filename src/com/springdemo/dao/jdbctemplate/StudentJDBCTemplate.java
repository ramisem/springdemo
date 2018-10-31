package com.springdemo.dao.jdbctemplate;

import java.util.List;
import javax.sql.DataSource;

import com.springdemo.dao.StudentDAO;
import com.springdemo.dao.mapper.StudentMapper;
import com.springdemo.model.StudentModel;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }
    public void create(int id,String name, Integer age) {
        String SQL = "insert into Student (id,name, age) values (?,?, ?)";
        jdbcTemplateObject.update( SQL, id,name, age);
        System.out.println("Created Record Name = " + name + " Age = " + age);
        return;
    }
    public StudentModel getStudent(Integer id) {
        String SQL = "select * from Student where id = ?";
        StudentModel student = jdbcTemplateObject.queryForObject(SQL,
                new Object[]{id}, new StudentMapper());

        return student;
    }
    public List<StudentModel> listStudents() {
        String SQL = "select * from Student";
        List <StudentModel> students = jdbcTemplateObject.query(SQL, new StudentMapper());
        return students;
    }
    public void delete(Integer id) {
        String SQL = "delete from Student where id = ?";
        jdbcTemplateObject.update(SQL, id);
        System.out.println("Deleted Record with ID = " + id );
        return;
    }
    public void update(Integer id, Integer age){
        String SQL = "update Student set age = ? where id = ?";
        jdbcTemplateObject.update(SQL, age, id);
        System.out.println("Updated Record with ID = " + id );
        return;
    }
}

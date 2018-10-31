package com.springdemo.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.springdemo.model.StudentModel;
import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<StudentModel> {
    public StudentModel mapRow(ResultSet rs, int rowNum) throws SQLException {
        StudentModel student = new StudentModel();
        student.setId(rs.getInt("id"));
        student.setName(rs.getString("name"));
        student.setAge(rs.getInt("age"));

        return student;
    }
}
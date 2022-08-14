package com.example.cruddemo.service;

import com.example.cruddemo.entity.Department;

import java.util.List;

public interface DepartmentService {

   public Department saveDepartment(Department department);


   public List<Department> fetchDepartmentList();

   public Department fetchDepartmenById(Long departmentId);

   public void deleteDepartmentById(Long departmentId);

   public Department updateDepartment(Long departmentId, Department department);

   public Department fetchDepartmenByName(String departmentName);
}

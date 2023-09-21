package com.mhb.spring_demo.Service;


import com.mhb.spring_demo.Entity.Department;

import java.util.List;

public interface DepartmentService {
     public Department saveDept(Department dept);


     public List<Department> getDepts();

    public Department getById(Long id);

    void delById(Long id);

    List<Department> updateById(Department d, Long id);

    Department getDeptsByName(String dname);
}



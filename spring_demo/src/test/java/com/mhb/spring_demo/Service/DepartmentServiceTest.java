package com.mhb.spring_demo.Service;

import com.mhb.spring_demo.Entity.Department;
import com.mhb.spring_demo.Repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class DepartmentServiceTest {

    @MockBean
    private DepartmentRepository deptRepo;
    @Autowired
    private DepartmentService deptService;

    @BeforeEach
    void setUp() {
    Department dept = Department.builder().departmentID(1L).departmentCode("IT-06").
            departmentName("IT").departmentAddress("MUM").build();

        Mockito.when(deptService.getDeptsByName("IT")).thenReturn(dept);


    }
    //@Disabled
    @Test
    @DisplayName("get by Dept name Test Case")
    public void whenDeptNameFound_thenDepartmentFound(){

        String deptName = "IT";

        Department name = deptService.getDeptsByName(deptName);

        assertEquals(deptName, name.getDepartmentName());
    }



    
}
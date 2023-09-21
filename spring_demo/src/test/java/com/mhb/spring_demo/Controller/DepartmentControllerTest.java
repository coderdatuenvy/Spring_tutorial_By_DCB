package com.mhb.spring_demo.Controller;

import com.mhb.spring_demo.Entity.Department;
import com.mhb.spring_demo.Service.DepartmentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static javax.swing.UIManager.get;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@WebMvcTest(DepartmentController.class)
class DepartmentControllerTest {
    @Autowired
    private MockMvc mockmvc ;

    @MockBean
    private DepartmentService deptser;

    private Department d1;

    @BeforeEach
    void setUp(){
          this.d1 =  Department.builder()
                .departmentID(1L).departmentAddress("IT-MUM")
                .departmentName("IT")
                .departmentCode("IT-09")
                .departmentID(1L)
                .build();
    }



    @Test
    void searchById() throws Exception {
        Department d = Department.builder()
                .departmentID(1L).departmentAddress("IT-MUM")
                .departmentName("IT")
                .departmentCode("IT-09")
                .build();

        Mockito.when(deptser.getById(1L)).thenReturn(d1);

        mockmvc.perform(MockMvcRequestBuilders.get("/depts/1")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk());


        ;
    }

    @Test
    void updateById() {


    }


}
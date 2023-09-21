package com.mhb.spring_demo.Repository;

import com.mhb.spring_demo.Entity.Department;
import com.mhb.spring_demo.Service.DepartmentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.web.bind.annotation.DeleteMapping;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class DepartmentRepositoryTest {

    @Autowired
    private TestEntityManager tem;

    @MockBean
    private DepartmentService Ds;

    @BeforeEach
    void setUp() {
        Department dept = Department.builder()
                .departmentName("IT").departmentAddress("IT - Delhi")
                .departmentCode("IT-DEL").build();

        tem.persist(dept);
    }

    @Test
    void testwhenIdAvailableDeptFound(){
        Department d = Ds.getById(1L);
        assertEquals(d.getDepartmentName(), "IT"  );
    }
}
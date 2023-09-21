package com.mhb.spring_demo.Controller;

import com.mhb.spring_demo.Entity.Department;
import com.mhb.spring_demo.Service.DepartmentService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService deptService;
    private final Logger log = LoggerFactory.getLogger( DepartmentController.class);
    @PostMapping("/dept")
    public Department saveDept(@Valid @RequestBody Department dept){
        log.info("Inside DepartmentController.saveDept ");
       return deptService.saveDept(dept);
    }

    @GetMapping("/dept")
    public List<Department> getDepts(){
        log.info("Inside DepartmentController.getDepts ");
         return deptService.getDepts();

    }

    @GetMapping("/dept/{id}")
    public Department searchById(@PathVariable("id") Long Id){
        log.info("Inside DepartmentController.searchById ");
        return deptService.getById(Id);

    }

    @DeleteMapping("/dept/{id}")
    public void delById(@PathVariable(value = "id") Long Id){
        log.info("Inside DepartmentController.searchById ");
        deptService.delById(Id);
    }
    @PutMapping("/dept/{id}")
    public List<Department> updateById(@Valid @RequestBody Department d , @PathVariable(value = "id") Long Id){
        log.info("Inside DepartmentController.searchById ");
        return deptService.updateById(d,Id);    }

    @GetMapping("/dept/name/{name}")
    public Department getByDeptName(@PathVariable(value = "name") String deptname){
        return deptService.getDeptsByName(deptname);

    }


}
package com.mhb.spring_demo.Service;

import com.mhb.spring_demo.*;
import com.mhb.spring_demo.Entity.*;
import com.mhb.spring_demo.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService {
@Autowired
    private DepartmentRepository deptRepository;
    @Override
     public Department saveDept(Department dept) {

       return this.deptRepository.save(dept);

    }

    @Override
    public List<Department> getDepts() {
        return this.deptRepository.findAll();
    }

    @Override
    public Department getById(Long id) {
        return deptRepository.findById(id).get();
    }

    @Override
    public void delById(Long id) {
         deptRepository.deleteById(id);
    }

    @Override
    public List<Department> updateById(Department d, Long id) {
        Department deptbyid =  deptRepository.findById(id).get();

        if (Objects.nonNull(deptbyid.getDepartmentName()) && !"".equalsIgnoreCase(d.getDepartmentName())){
            deptbyid.setDepartmentName(d.getDepartmentName());
        }
        if (Objects.nonNull(deptbyid.getDepartmentAddress()) && !"".equalsIgnoreCase(d.getDepartmentAddress())){
            deptbyid.setDepartmentAddress(d.getDepartmentAddress());
        }
        if (Objects.nonNull(deptbyid.getDepartmentCode()) && !"".equalsIgnoreCase(d.getDepartmentCode())){
            deptbyid.setDepartmentCode(d.getDepartmentCode());
        }

+.
        deptRepository.save(deptbyid);
        return deptRepository.findAll();

    }

    @Override
    public Department getDeptsByName(String deptname) {
        return deptRepository.findByDepartmentNameIgnoreCase(deptname);
    }
}

package com.mhb.spring_demo.Repository;
import java.util.List;
import com.mhb.spring_demo.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

    //MAGIC OF JPA : SEWAI FINDBYID KOI AUR FIELD K LIYE DEFAULT FUNCTION AVALAIBLE NAHI
    // JPA ME AGAR HAM SIRF NAMING CONVENTION FOLLOW KRE
    // LIKE findBy YA deleteBY AND FOLLOWED BY FIELD NAME CAMELCASE ME TO BINA DEFINE KRE HAM
    // WO FIELD PE DB OPERATION JPA SE BORROW KR SAKTE
//    public Department findByDepartmentName(String Name);
    public Department findByDepartmentNameIgnoreCase(String Name);
}

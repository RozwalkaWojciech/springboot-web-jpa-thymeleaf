package spring.springbootwebjpathymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.springbootwebjpathymeleaf.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

package com.devcamp.employeerestapi.controller;

import com.devcamp.employeerestapi.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
public class EmployeeController {

    @GetMapping("/employees")
    public ArrayList<Employee> getEmployees() {
        // subTask 4: Khởi tạo 3 đối tượng nhân viên
        Employee emp1 = new Employee(1, "Tran", "Khu", 1000);
        Employee emp2 = new Employee(2, "Nguyen", "Van A", 1500);
        Employee emp3 = new Employee(3, "Le", "Thi B", 2000);

        // In ra console sử dụng toString
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());

        // subTask 5: Thêm vào ArrayList mới
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

        return employeeList;
    }
}

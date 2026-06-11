package com.cg.eis.service;

import com.cg.eis.bean.Employee;
import java.util.HashMap;
import java.util.Map;

public class EmployeeServiceImpl implements EmployeeService {

    private HashMap<Integer, Employee> empMap = new HashMap<>();

    public void addEmployee(Employee emp) {
        empMap.put(emp.getId(), emp);
    }

    public void deleteEmployee(int id) {
        empMap.remove(id);
    }

    public void displayByScheme(String scheme) {
        for (Map.Entry<Integer, Employee> entry : empMap.entrySet()) {
            if (entry.getValue().getInsuranceScheme()
                    .equalsIgnoreCase(scheme.trim())) {
                System.out.println(entry.getValue());
            }
        }
    }

    public void displayAll() {
        for (Employee emp : empMap.values()) {
            System.out.println(emp);
        }
    }
}
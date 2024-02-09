package com.sripathi.EmployeeServiceModule;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmployeeService {
	
		@Autowired
		private EmployeeRepository repo;
		
		public void save(Employee employ)
		{
			repo.save(employ);
		}
		
		public List<Employee> getAllEmployee()
		{
			return repo.findAll();
		}
		
		public Employee getEmployeeById(Integer id) 
		{
			return repo.findById(id).orElse(null);
		}
		
		public void deleteEmployee(Integer id)
		{
			repo.deleteById(id);
		}

		public void updateEmployee(Integer id , Employee updatedEmployee)
		{
			Employee existingEmployee = repo.findById(id).orElse(null);
			if (existingEmployee != null)
			{
				existingEmployee.setFirstName(updatedEmployee.getFirstName());
				existingEmployee.setLastName(updatedEmployee.getLastName());
				existingEmployee.setAddress(updatedEmployee.getAddress());
				existingEmployee.setContactNo(updatedEmployee.getContactNo());
				existingEmployee.setEmailId(updatedEmployee.getEmailId());
				existingEmployee.setRole(updatedEmployee.getRole());
				existingEmployee.setSalaryPerMonth(updatedEmployee.getSalaryPerMonth());
				repo.save(existingEmployee);
			}
		}
}

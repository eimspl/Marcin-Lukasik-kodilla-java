package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchFacadeTestSuite {
    @Autowired
    SearchFacade searchFacade;
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testFindCompanies() {
        // Given
        Company microsoftCompany = new Company("Microsoft Company");
        Company linuxCompany = new Company("Linux Company");
        Company zusCompany = new Company("ZUS Company Entertainment");

        // When
        companyDao.save(microsoftCompany);
        companyDao.save(linuxCompany);
        companyDao.save(zusCompany);
        List<Company> companies = searchFacade.findCompanies("ter");

        // Then
        Assert.assertEquals(1, companies.size());

        // Cleanup
        try {
            companyDao.delete(microsoftCompany);
            companyDao.delete(linuxCompany);
            companyDao.delete(zusCompany);
        } catch (Exception e) {
            // Do nothing
        }
    }

    @Test
    public void testFindEmployees() {
        // Given
        Employee adamJacob = new Employee("Adam", "Jacob");
        Employee kristoferElJackson = new Employee("Kristofer", "El Jackson");
        Employee penelopeStalk = new Employee("Penelope", "Stalk");

        // When
        employeeDao.save(adamJacob);
        employeeDao.save(kristoferElJackson);
        employeeDao.save(penelopeStalk);
        List<Employee> employees = searchFacade.findEmployees("son");

        // Then
        Assert.assertEquals(1, employees.size());

        // Cleanup
        try {
            employeeDao.delete(adamJacob);
            employeeDao.delete(kristoferElJackson);
            employeeDao.delete(penelopeStalk);
        } catch (Exception e) {
            // Do nothing
        }
    }
}
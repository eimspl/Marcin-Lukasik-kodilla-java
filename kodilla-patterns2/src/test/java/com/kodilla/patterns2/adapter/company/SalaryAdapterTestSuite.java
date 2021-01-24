package com.kodilla.patterns2.adapter.company;

import com.kodilla.patterns2.adapter.company.oldhrsystem.Workers;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SalaryAdapterTestSuite {
    @Test
    public void testTotalSalary() throws Exception {
        //given
        Workers workers = new Workers();
        SalaryAdapter salaryAdapter = new SalaryAdapter();
        //when
        double totalSalary = salaryAdapter.totalSalary(workers.getWorkers(), workers.getSalaries());
        //then
        System.out.println(totalSalary);
        assertEquals(totalSalary, 120550.0, 0);
    }
}
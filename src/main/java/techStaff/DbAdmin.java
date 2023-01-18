package techStaff;

import staff.Employee;

public class DbAdmin extends Employee {

    public DbAdmin(String name, int niNumber, int salary){
        super(name, niNumber, salary);
    }
    public double payBonus(){
        return super.getSalary() * 0.01;
    }
}



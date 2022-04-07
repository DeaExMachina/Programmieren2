package at.campus02;

import java.util.Arrays;

public class DemoEmp {
    public static void main(String[] args) {

        Employee hansi = new Employee(1, "Hansi Huber", 1500.60, "Accounting");
        Employee susi = new Employee(2, "Susi Sonnenschein", 2410.79, "Management");
        Employee willi = new Employee(3, "Willi Wilson", 2222.22, "Management");

        EmployeeManager mgr = new EmployeeManager();

        mgr.addEmployee(hansi);
        mgr.addEmployee(susi);
        mgr.addEmployee(willi);

        System.out.println(mgr.findByEmpNumber(3));
        System.out.println(mgr.findByDepartment("Management"));
        System.out.println(mgr.findByMaxSalary());

        //Vergleich, ob beide in der gleichen Abteilung arbeiten
        System.out.println(susi.compareDepartment(willi));
        System.out.println(hansi.compareDepartment(susi));

    }
}

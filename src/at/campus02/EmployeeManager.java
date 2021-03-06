package at.campus02;

import java.util.ArrayList;


public class EmployeeManager {

    private ArrayList<Employee> employees; //= new ArrayList<>(); -->oder im Konstruktor machen:

    //Konstruktor:
    public EmployeeManager() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public Employee findByEmpNumber(int number) {
        for (Employee empi : employees) {
            if (empi.getEmpNumber() == number) {
                return empi;
            }
            }
        return null;
        }

        //Hilfs-ArrayList in der Methode erstellen und danach ausgeben (hier erg genannt)
        public ArrayList<Employee> findByDepartment (String department) {
        ArrayList<Employee> erg = new ArrayList<>();

        for(Employee e : employees){
            if (e.getDepartment().equals(department)){
                erg.add(e);
            }
        }
        return erg;
        }

        public Employee findByMaxSalary () {
            Employee highestE = null;
            double highestSalary = 0; //oder -1

            for (Employee e : employees) {
                if (e.getSalary() > highestSalary) {
                    highestSalary = e.getSalary();
                    highestE = e;
                }
            }

            return highestE;
        }

    }


package at.campus02.uebungen2;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {

    List <Employee> employees;

    public EmployeeManager(){
         employees = new ArrayList<>();
    }

    public void addEmployee(Employee e){
        employees.add(e);

    }
//
//    public Employee findByEmpNumber (int number){
//
//    }




}



//
//        – Employee findByEmpNumber(int number) ... soll den Mitarbeiter
//        basierend auf seiner Mitarbeiternummer finden. Falls diese nicht existiert,
//        soll null zurück geliefert werden.
//        – ArrayList<Employee> findByDepartment(String department)
//        ... soll alle Mitarbeiter finden, welche in der angegebenen
//        Abteilung arbeiten.
//        – Employee findByMaxSalary() ... soll den Mitarbeiter mit dem höchsten
//        Gehalt finden, falls mehrere mit dem gleichen Gehalt vorhanden, soll
//        der zuerst gefundene Mitarbeiter geliefert werden
//        Schreiben Sie auch eine einfache DemoEmp Klasse samt main Methode, in welcher
//        Sie einige Employee Objekte instanzieren sowie die Funktionalität des
//        EmployeeManager zeigen
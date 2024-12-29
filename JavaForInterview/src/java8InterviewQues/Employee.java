package java8InterviewQues;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String departmentName;
    private int yearOfJoining;
    private double salary;
    private static List<Employee> employeeList = new ArrayList<Employee>();

    public Employee(int id, String name, int age, String gender, String departmentName, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.departmentName = departmentName;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public static void main(String[] args){
        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        // Ques01: How many male and female employee are there in organisation
        Map<String, Long> noOfMaleAndFemaleEmployee = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println("No Of Male and Female Employee:" + noOfMaleAndFemaleEmployee);
        System.out.println("==================================");

        // Ques02: Print name of all department of Organization
        System.out.println("Print name of all department of organisation");
        employeeList.stream().map(Employee::getDepartmentName).distinct().forEach(System.out::println);
        System.out.println("==================================");

        // Ques03:What is the avg age of male and female employee
        System.out.println("Avg age of male and female Employee");
        Map<String, Double> avgAgeOfMaleAndFemaleEmp = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println("avgAgeOfMaleAndFemaleEmp =" + avgAgeOfMaleAndFemaleEmp);
        System.out.println("==================================");

        // Ques04:Get details of highest paid employee in the organisation
        System.out.println("Highest paid employee in the organisation");
        Optional<Employee> highestPaidEmployee = employeeList.stream()
                .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
        Employee highPaidEmployee = highestPaidEmployee.get();
        System.out.println("==================================");
        System.out.println("ID : " + highPaidEmployee.getId());
        System.out.println("Name : " + highPaidEmployee.getName());
        System.out.println("Age : " + highPaidEmployee.getAge());
        System.out.println("Gender : " + highPaidEmployee.getGender());
        System.out.println("Department : " + highPaidEmployee.getDepartmentName());
        System.out.println("Year Of Joining : " + highPaidEmployee.getYearOfJoining());
        System.out.println("Salary : " + highPaidEmployee.getSalary());
        System.out.println("==================================");

        // Ques05:Get the name of all employee who joined after 2015
        System.out.println("Name of all employee who joined after 2015");
        employeeList.stream().filter(x -> x.getYearOfJoining() > 2015).map(Employee::getName)
                .forEach(System.out::println);
        System.out.println("==================================");

        // Ques06:Count the no of employee in each department
        System.out.println("Number of employee in each department");
        Map<String, Long> noOfEmpInEachDept = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartmentName, Collectors.counting()));
        System.out.println(noOfEmpInEachDept);
        System.out.println("==================================");

        // Ques07:What is the average salary of each department
        System.out.println("Average salary of each department");
        Map<String, Double> avgSalaryOfEachDepartment = employeeList.stream().collect(
                Collectors.groupingBy(Employee::getDepartmentName, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgSalaryOfEachDepartment);
        System.out.println("==================================");

        // Ques08:Get the detail of youngest employee in the Product Development
        // Department
        System.out.println("Details of youngest employee in the department");
        Optional<Employee> whetherYoungEmployee = employeeList.stream()
                .filter(x -> x.getGender() == "Male" && x.getDepartmentName() == "Product Development")
                .min(Comparator.comparingInt(Employee::getAge));
        Employee youngEmployee = whetherYoungEmployee.get();
        System.out.println("ID : " + youngEmployee.getId());
        System.out.println("Name : " + youngEmployee.getName());
        System.out.println("Age : " + youngEmployee.getAge());
        System.out.println("Year Of Joinging : " + youngEmployee.getYearOfJoining());
        System.out.println("Salary : " + youngEmployee.getSalary());
        System.out.println("==================================");

        // Ques09:Who has the most work experience in the department
        System.out.println("most work experience in the department");
        Optional<Employee> ifMostExp = employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining))
                .findFirst();
        Employee mostExpEmployee = ifMostExp.get();
        System.out.println("ID : " + mostExpEmployee.getId());
        System.out.println("Name : " + mostExpEmployee.getName());
        System.out.println("Age : " + mostExpEmployee.getAge());
        System.out.println("Gender : " + mostExpEmployee.getGender());
        System.out.println("Age : " + mostExpEmployee.getDepartmentName());
        System.out.println("Year Of Joinging : " + mostExpEmployee.getYearOfJoining());
        System.out.println("Salary : " + mostExpEmployee.getSalary());
        System.out.println("==================================");

        // Ques10:How many male and female employees are there in the sales and
        // marketing team?
        System.out.println(" male and female employees are there in the sales and marketing team?");
        Map<String, Long> noOfMaleAndFemaleEmpinSalesAndMarkTeam = employeeList.stream()
                .filter(x -> x.getDepartmentName() == "Sales And Marketing")
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(noOfMaleAndFemaleEmpinSalesAndMarkTeam);
        System.out.println("==================================");

        // Ques11:What is the avg salary of male and female employee
        System.out.println("Avg Salary of male and Female emp");
        Map<String, Double> avgSalOfMaleFemaleEmp = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgSalOfMaleFemaleEmp);
        System.out.println("==================================");

        // Ques12:List down name of all employee in each department
        System.out.println("Name of all employee in each department");
        Map<String,List<Employee>> nameAllEmployee = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartmentName));
        Set<Map.Entry<String, List<Employee>>> entrySet = nameAllEmployee.entrySet();

        for (Map.Entry<String, List<Employee>> entry : entrySet)
        {
            System.out.println("--------------------------------------");
            System.out.println("Employees In " + entry.getKey() + " : ");
            System.out.println("--------------------------------------");
            List<Employee> list = entry.getValue();
            for (Employee e : list) {
                System.out.println(e.getName());
            }
        }
        System.out.println("==================================");

        // Ques13:What is the average salary and total salary of whole organisation
        System.out.println("Avg Salary of Whole Organisation");
        DoubleSummaryStatistics employeeSalaryStatistics = employeeList.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("Average Salary = " + employeeSalaryStatistics.getAverage());
        System.out.println("Total Salary = " + employeeSalaryStatistics.getSum());
        System.out.println("==================================");

        // Ques14:Separate the employees who are younger or equal to 25 years from those
        // employees who are older than 25 years.
        System.out.println("Name of employee with greator and less than 25 Years");
        Map<Boolean, List<Employee>> partitionByAge = employeeList.stream()
                .collect(Collectors.partitioningBy(x -> x.getAge() > 25));
        Set<Map.Entry<Boolean, List<Employee>>> entrySet1 = partitionByAge.entrySet();
        for (Map.Entry<Boolean, List<Employee>> entry : entrySet1) {
            if (entry.getKey()) {
                System.out.println("Employee older than 25 years :");
            } else {
                System.out.println("Employee younger than or equal to 25 years");
            }
            System.out.println("------------------------------------");
            List<Employee> list = entry.getValue();
            for (Employee e : list) {
                System.out.println(e.getName());
            }
        }
        System.out.println("==================================");

        // Ques15:Who is the oldest employee in the organization? What is his age and
        // which department he belongs to?
        System.out.println("Oldest Employee , Age , Department");
        Optional<Employee> oldestEmployeeWrapper = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
        Employee oldestEmployee = oldestEmployeeWrapper.get();

        System.out.println("Name : " + oldestEmployee.getName());

        System.out.println("Age : " + oldestEmployee.getAge());

        System.out.println("Department : " + oldestEmployee.getDepartmentName());
        System.out.println("==================================");




    }
}

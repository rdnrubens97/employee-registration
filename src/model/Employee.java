package model;


import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Rubens
 */
public class Employee {
    
    private static Integer numberOfUsers = 0;
    private Integer id = 0;
    private String name;
    private String birthDate;
    private Double salary;    
    
    //CONSTRUCTOR
    public Employee() {        
    }  
    
    public Employee(String name, String birthDate, Double salary) {
        this.id = numberOfUsers + 1;
        this.name = name;
        this.birthDate = birthDate;
        this.salary = salary;
        numberOfUsers += 1;
    }  
       
    public Integer getAge(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDate = LocalDate.parse(this.birthDate, dateTimeFormatter);
        LocalDate today = LocalDate.now(); 
        return Period.between(birthDate, today).getYears();
    }

    //GETERS AND SETTERS    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    
    
    
}

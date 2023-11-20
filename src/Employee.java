/* DOĞANAY BALABAN 1220505057 */
public class Employee extends Member {
    /* Tutulması gereken fieldlar, member'ı içeriyor. */
    private Integer employeeID;
    private String employeeName;
    private Integer employeeAge;
    private Double employeeSalary;
    private String employeeTask;

    /* Yapıcı metot */
    Employee(Integer employeeID, String employeeName, Integer employeeAge, Double employeeSalary, String employeeTask) {
        super(employeeID, employeeName, employeeAge);
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.employeeSalary = employeeSalary;
        this.employeeTask = employeeTask;
    }

    /* Encapsulate işlemi */
    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    public Double getEmployeeSalary() {
        return employeeSalary;
    }

    public String getEmployeeTask() {
        return employeeTask;
    }


    public String getEmployeeName() {
        return employeeName;
    }

    public Integer getEmployeeAge() {
        return employeeAge;
    }
}

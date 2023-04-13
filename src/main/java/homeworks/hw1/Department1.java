package homeworks.hw1;

// Отдел (с полями Название, Количество сотрудников, Фирма).
public class Department1 extends Firma{
    private String departmentName;
    private int employeeCounter;
    private Firma firma;


    public Department1(String departmentName, int employeeCounter, Firma firma) {
        this.departmentName = departmentName;
        this.employeeCounter = employeeCounter;
        this.firma = firma;
    }

    public Department1() {
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getEmployeeCounter() {
        return employeeCounter;
    }

    public void setEmployeeCounter(int employeeCounter) {
        this.employeeCounter = employeeCounter;
    }
}

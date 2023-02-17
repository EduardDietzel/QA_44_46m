package javaPro.lesson2HWObzor;

public class Department {
    private String departmentName;

    private Company company;
//    private String companyName; так лучше не писать в данном случае. У нас есть связь между файлами

    public Department(String departmentName, Company company) {
        this.departmentName = departmentName;
        this.company = company;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}

package javaPro.lesson2HWObzor;

public class Company {

    private String companyName;

    public Company() {
        this.companyName = "noname";
    }

    public Company(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Company{" + "companyName='" + companyName + '\'' + '}';
    }
}

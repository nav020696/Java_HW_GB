package clinic;

public abstract class Personal {
    protected String fullName;
    protected String telephone;
    protected String jobTitle;

    public Personal(String fullName, String telephone, String jobTitle) {
        this.fullName = fullName;
        this.telephone = telephone;
        this.jobTitle = jobTitle;
    }

    public String getFullName() {
        return fullName;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return String.format("Должность: %s, ФИО: %s, Телефон: %s", jobTitle, fullName, telephone);
    }

}

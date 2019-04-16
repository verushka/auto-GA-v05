package spaces.alain.domain;

public class Incident {
    private String name;
    private String description;
    private String date;
    private String type;
    private String severity;

    private String employeeId;


    public Incident() {
    }

    public Incident(String name, String description, String date, String type, String severity, String employeeId) {
        this.name = name;
        this.description = description;
        this.date = date;
        this.type = type;
        this.severity = severity;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}

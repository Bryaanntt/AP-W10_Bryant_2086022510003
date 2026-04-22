package studentprofil.com.studentprofil;

public class Course {

    private String name;
    private String code;
    private int credits;
    private String grade;

    public Course(String name, String code, int credits, String grade) {
        this.name    = name;
        this.code    = code;
        this.credits = credits;
        this.grade   = grade;
    }

    public String getName()    { return name; }
    public String getCode()    { return code; }
    public int    getCredits() { return credits; }
    public String getGrade()   { return grade; }

    public void setName(String name)      { this.name = name; }
    public void setCode(String code)      { this.code = code; }
    public void setCredits(int credits)   { this.credits = credits; }
    public void setGrade(String grade)    { this.grade = grade; }

    // Custom method
    public double getGpaPoints() {
        return switch (grade) {
            case "A+" -> 4.0;
            case "A"  -> 3.7;
            case "B+" -> 3.4;
            case "B"  -> 3.0;
            case "C+" -> 2.3;
            case "C"  -> 2.0;
            default   -> 0.0;
        };
    }
}
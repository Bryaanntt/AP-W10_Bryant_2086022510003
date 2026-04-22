package studentprofil.com.studentprofil;

public class Student {

    private String name;
    private String nim;
    private String major;
    private String bio;

    public Student(String name, String nim, String major, String bio) {
        this.name  = name;
        this.nim   = nim;
        this.major = major;
        this.bio   = bio;
    }

    public String getName()  { return name; }
    public String getNim()   { return nim; }
    public String getMajor() { return major; }
    public String getBio()   { return bio; }

    public void setName(String name)   { this.name = name; }
    public void setNim(String nim)     { this.nim = nim; }
    public void setMajor(String major) { this.major = major; }
    public void setBio(String bio)     { this.bio = bio; }

    // Custom method
    public String getSummary() {
        return name + " (" + nim + ") - " + major;
    }
}
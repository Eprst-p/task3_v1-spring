package io.singh1114.springboottut.standard;

public class Standard {
    private String standard;
    private String section;
    private String classTeacher;

    public Standard(String standard, String section, String classTeacher) {
        super();
        this.standard = standard;
        this.section = section;
        this.classTeacher = classTeacher;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getClassTeacher() {
        return classTeacher;
    }

    public void setClassTeacher(String classTeacher) {
        this.classTeacher = classTeacher;
    }
}

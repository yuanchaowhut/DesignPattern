package cn.com.example.prototype.demo1;

/**
 * Created by yuanchao on 2018/4/2.
 */
public class Resume {
    private String name;
    private String sex;
    private int age;
    private String school;
    private String education;
    private String workExperience;

    public Resume() {

    }

    public Resume(String name, String sex, int age, String school, String education, String workExperience) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.school = school;
        this.education = education;
        this.workExperience = workExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", school='" + school + '\'' +
                ", education='" + education + '\'' +
                ", workExperience='" + workExperience + '\'' +
                '}';
    }
}

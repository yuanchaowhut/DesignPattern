package cn.com.example.prototype.demo2;

/**
 * Created by yuanchao on 2018/4/2.
 */
public class Resume implements Prototype {
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

    @Override
    public Object clone() {
        //浅表复制：副本和原型都指向同一个对象，原型和副本任何一个进行设置行为,都会导致其他实例一起变化.
        Resume r = this;
        return r;
    }

    @Override
    public Object cloneDeep() {
        //深层复制：会创建一个新的对象，这个对象的所有属性和原型一样。原型以及每一个副本均指向自己的对象，可以分别进行设置，互相不影响。
        Resume r = new Resume();
        r.name = this.name;
        r.sex = this.sex;
        r.age = this.age;
        r.school = this.school;
        r.education = this.education;
        r.workExperience = this.workExperience;
        return r;
    }
}

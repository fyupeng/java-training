package cn.fyupeng.pojo;

/**
 * @Auther: fyp
 * @Date: 2022/8/30
 * @Description:
 * @Package: cn.fyupeng.pojo
 * @Version: 1.0
 */
public class Student {
    private String id;
    private String name;
    private String sex;

    public Student() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}

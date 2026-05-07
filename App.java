public class App {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("陳小明");
        s1.setAge(20);
        s1.setMajor("醫資學程");
        s1.print();

        System.out.println();

        Student s2 = new Student()
                .setName("林雅婷")
                .setAge(21)
                .setMajor("智慧資安");
        s2.print();
    }
}

class Student {
    private String name;
    private int age;
    private String major;

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public Student setAge(int age) {
        this.age = age;
        return this;
    }

    public Student setMajor(String major) {
        this.major = major;
        return this;
    }

    public void print() {
        System.out.println("姓名：" + name + "，年齡：" + age + "，科系：" + major);
    }
}

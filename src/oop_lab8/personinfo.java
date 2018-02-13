package oop_lab8;

public class personinfo {
    public static void main(String[] args) {
        Student student = new Student(
                "1939900299434",
                "sasiwan",
                "Fermale",
                "21",
                "359211110033",
                "IS Management Technology");
        System.out.println(student.toString());

        System.out.println(student.getName());

    }
    {
        Employee employee = new Employee("1234","poiatkan","20000" );
        System.out.println(employee.toString());


    }
}
}

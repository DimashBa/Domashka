public class HomeWork {
    public static void main(String[] args){
            Employee[] empCorp = new Employee[5];
        empCorp[0] = new Employee("Ivanov Ivan", "Engineer", "ivan434@mail.com", "87473292242", 5000, 41);
        empCorp[1] = new Employee("Kasymov Sanzhar", "Pilot", "kasymov@gmail.com", "8747665624", 60000, 53);
        empCorp[2] = new Employee("Korovkin Semen", "teacher", "semen228@mail.com", "87770559648", 29000, 42);
        empCorp[3] = new Employee("Bainazarov Nail", "Deputat", "han001@mail.com", "87777777077", 100000, 35);
        empCorp[4] = new Employee("Hamarov Damir", "Boss", "hamarov_ogon@mail.com", "87770222342", 10000, 47);

        for (Employee employee : empCorp)
            if (employee.getAge() > 40)employee.info();
        System.out.println(empCorp);
    }
}
  class Employee {
      private String fullName;
      private String position;
      private String email;
      private String phone;
      private int salary;
      private int age;

    public Employee (String fullName, String position, String email,String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.printf("Employee %s, position: %s,email: %s, phone: %s, salary: %s, age: %d\n",
                this.fullName,
                this.position,
                this.email,
                this.phone,
                this.salary,
                this.age);

    }

    public int getAge(){
        return age;
    }
    @Override
    public String toString(){
        return (fullName+ "\n-" +position+ "\n-" +email+ "\n-" +phone+ "\n-" +salary+ "\n-" + age);
    }




}

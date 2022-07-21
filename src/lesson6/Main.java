package lesson6;

public class Main {

    public static void main(String[] args) {
//Необходимо создать класс Person с полями: имя, возраст, пол. Класс должен иметь метод - getName, метод возвращает имя с префиксом “Mr. ”
// если пол указан как мужской и префикс “Mrs. ” если женский.
        Person person1 = new Person("Raja", 28, "Famale");
        Person person2 = new Person("Sergey", 34, "Male");
        Person person3 = new Person("Igor", 28, "Male");
        Person person4 = new Person("Kate", 23, "Famale");

        System.out.println(person1.getName());
        System.out.println(person2.getName());
        System.out.println(person3.getName());
        System.out.println(person4.getName());

        Employee[] employees = new Employee[4];

        Employee Raja = new Employee("Raja", 28, "Famale", 5000);
        Employee Sergey = new Employee("Sergey", 34, "Male", 2500.37);
        Employee Igor = new Employee("Igor", 28, "Male", 8000);
        Employee Kate = new Employee("Kate", 23, "Famale", 6000.88);

        employees[0] = Kate;
        employees[1] = Igor;
        employees[2] = Sergey;
        employees[3] = Raja;

        Salary salary = new Salary();
        System.out.println("Sum of salary " + salary.getSum(employees));
    }
}

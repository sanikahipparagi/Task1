import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamClassEmployee {

    public static void main(String[] args) {
        List<Emplyoee> list = new ArrayList<>();
        list.add(new Emplyoee("Ram",45,45000,"123 Street A"));
        list.add(new Emplyoee("Rahul",35,55000,"156 Street J"));
        list.add(new Emplyoee("Sonu",40,45000,"345 Street B"));
        list.add(new Emplyoee("Sam",28,30000,"567 Street G"));
        list.add(new Emplyoee("Joey",55,65000,"123 Street F"));

        List<String> filteredEmployees = list.stream()
                .filter(emp -> emp.getAge() > 30 && emp.getSalary() < 50000)
                .map(Emplyoee::getName)
                .collect(Collectors.toList());

        System.out.println("Employees with age > 30 and salary < 50k: " + filteredEmployees);

        List<Emplyoee> sortedEmployee = list.stream()
                .sorted(Comparator.comparing(Emplyoee::getName)
                .thenComparing(Emplyoee::getAge))
                .collect(Collectors.toList());

        sortedEmployee.forEach(emp -> System.out.println(emp));

    }
}

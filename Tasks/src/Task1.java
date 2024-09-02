import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Emplyoee{

    private String name;
    private int age;
    private double salary;
    private String address;

    public Emplyoee(String name,int age,double salary,String address){
        this.name=name;
        this.age = age;
        this.salary = salary;
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }


    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                '}';
    }


}

public class Task1 {

    public static void main(String[] args) {

        List<Emplyoee> li = new ArrayList<>();
        li.add(new Emplyoee("Ram",45,45000,"123 Street A"));
        li.add(new Emplyoee("Rahul",35,55000,"156 Street J"));
        li.add(new Emplyoee("Sonu",40,45000,"345 Street B"));
        li.add(new Emplyoee("Sam",28,30000,"567 Street G"));
        li.add(new Emplyoee("Joey",55,65000,"123 Street F"));


//        Iterator
        Iterator<Emplyoee> itr = li.iterator();
        while(itr.hasNext()){
            System.out.println("Iterator : " + itr.next().getName());
        }
//for loop
        for(int i=0;i<li.size();i++){
            System.out.println("For loop : " + li.get(i).getName());
        }

//        for each
        for(Emplyoee obj : li){
            System.out.println("For each : " + obj.getName());
        }

//        while loop
        int index = 0;
        while(index<li.size()){
            System.out.println("While loop : " + li.get(index).getName());
            index++;
        }





    }
}

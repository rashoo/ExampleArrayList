import java.util.ArrayList;
import java.util.List;

public class ExampleArrayList {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Raju", "Kumar", 5984));
        employeeList.add(new Employee("Diana", "Sanchez", 5980));
        employeeList.add(new Employee("Brenda", "Mendez", 5975));

        /*employeeList.forEach(employee -> System.out.println(employee));

        System.out.println(employeeList.get(0));
        System.out.println("");

        employeeList.set(2, new Employee("Amitesh", "Kumar", 5990));
        employeeList.forEach(employee -> System.out.println(employee));*/

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for(int i=0; i<employeeArray.length; i++){
       //     System.out.println(employeeArray[i]);
        }
        for(Employee i: employeeArray){
            System.out.println(i);
        }
    }
}

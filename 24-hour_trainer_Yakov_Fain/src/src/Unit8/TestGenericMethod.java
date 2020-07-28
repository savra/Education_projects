package Unit8;

import java.util.ArrayList;
import java.util.List;

public class TestGenericMethod {
    List<Employee> employeeList;

    public TestGenericMethod() {
        employeeList = new ArrayList<>();
    }

    public void test(List<RetiredEmployee> retiredEmployees) {
        employeeList.addAll(retiredEmployees);
    }

    public static void main(String[] args) {
        TestGenericMethod genericMethod = new TestGenericMethod();

        RetiredEmployee d = new RetiredEmployee("ss");

        List<RetiredEmployee> retiredEmployeeList = new ArrayList<>();
        retiredEmployeeList.add(new RetiredEmployee("Sergey"));
        retiredEmployeeList.add(new RetiredEmployee("Ivan"));
        retiredEmployeeList.add(new RetiredEmployee("Andrey"));
        genericMethod.test(retiredEmployeeList);

        genericMethod.employeeList.forEach((Employee e) -> System.out.println("genericMethod " + e.getName()));

        retiredEmployeeList.forEach((RetiredEmployee e) -> System.out.println("retiredEmployeeList " + e.getName()));
        retiredEmployeeList.clear();
        retiredEmployeeList.forEach((RetiredEmployee e) -> System.out.println("retiredEmployeeList " + e.getName()));

        genericMethod.employeeList.forEach((Employee e) -> System.out.println("genericMethod " + e.getName()));
    }
}

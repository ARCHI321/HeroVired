import java.util.*;

public class CollectionsExample {
    public static void main(String args[]){
    CollectionsExample coll  = new CollectionsExample();
    List<Integer> temp  = coll.testMethod();
//    if(temp instanceof ArrayList){
//        System.out.print("ArrrayList");
//    }
//    if(temp instanceof LinkedList){
//        System.out.print("LinkedList");
//    }

    }
    private List testMethod(){
        List<Integer> list1 = new ArrayList<>(10);
//        Long currentTime1 = System.currentTimeMillis();
//        list.add(1);
//        list.add(2);
//        list.add(1,3);
//        list.add(1,3);
//        list.add(1,3);
//        Long timeDiff1 = System.currentTimeMillis() - currentTime1;
//        System.out.println("Total Time Taken 1:::" + timeDiff1);
//
//        Long currentTime2 = System.currentTimeMillis();
//        List<Integer> list1 = new LinkedList<>();
//        list1.add(3);
//        list1.add(4);
//        list1.add(1,5);
//        list1.add(1,5);
//        list1.add(1,5);
//        Long timeDiff2 = System.currentTimeMillis() - currentTime2;
//        System.out.print("Total Time Taken 2:::" + timeDiff2);
//
//
//        Stack stc = new Stack();
//        stc.add(10);
//        stc.add(20);
//        stc.add(30);
//        stc.remove(1);
//        stc.pop();
//        System.out.print(stc);

        SortedSet<Employee> tempSet1 = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (o1.name+o1.age).compareTo(o2.name+o2.age) ;
            }
        });
        Set<Employee> tempSet = new HashSet<>();
        Employee e7 = new Employee(39, "Amit4"); ;
        Employee e4 = new Employee(40, "Amit4"); ;
        Employee e5 = new Employee(34, "Amit5"); ;
        Employee e6 = new Employee(29, "Amit5.5"); ;
        Employee e1 = new Employee(30, "Amit1");
        Employee e2 = new Employee(31, "Amit2"); ;
        Employee e3 = new Employee(32, "Amit3"); ;


        tempSet.add(e2);
        tempSet.add(e4);
        tempSet.add(e5);
        tempSet.add(e1);
        tempSet.add(e3);
        tempSet.add(e6);
        tempSet.add(e7);

//        Collections.sort(tempSet,new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return (o1.name+o1.age).compareTo(o2.name+o2.age) ;
//            }
//        });
//        for(Employee emp : tempSet ){
//            System.out.println(emp);
//        }



        return list1;
    }

    class Person {

    }

    class Employee extends Person{
        int age ;
        String name ;
        Employee(int age, String name){
            this.age = age;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return age == employee.age &&
                    Objects.equals(name, employee.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(age, name);
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}

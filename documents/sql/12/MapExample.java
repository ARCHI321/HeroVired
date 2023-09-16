import java.util.*;

public class MapExample {
   public static void main(String args[]){
       Map<String,Integer> map = new LinkedHashMap<>();
       map.put("Test3",3);
       map.put("Test1",2);
       map.put("Test2",1);


       for (String key:map.keySet() ) {
           System.out.println(key+":"+map.get(key));
       }

       List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());


       Comparator<Map.Entry<String, Integer>> valueComparator = (entry1, entry2) ->
               entry1.getValue().compareTo(entry2.getValue());

       Collections.sort(entryList, valueComparator);

       for (Map.Entry entry :entryList ) {
           System.out.println(entry.getKey()+":"+entry.getValue());
       }
       }


   }

    class Employee1 {
        int age ;
        String name ;
        Employee1(int age, String name){
            this.age = age;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CollectionsExample.Employee employee = (CollectionsExample.Employee) o;
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


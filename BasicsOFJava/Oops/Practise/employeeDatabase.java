// Online Java Compiler
// Use this editor to write, compile and run your Java code online
package BasicsOFJava.Oops.Practise;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

class employee {
    private HashMap<Integer, List<String>> db = new HashMap<Integer, List<String>>();
    private int emp_id = 1;

    employee() {
        db.put(1, Arrays.asList("Archisman", "MAT", "80000", "785642"));
        db.put(2, Arrays.asList("Riwtik", "MAT", "60000", "7856434"));
    }

    public void getEmpName(int emp_id) {
        System.out.println(db.get(emp_id).get(0));
    }

    public void getEmpDept(int emp_id) {
        System.out.println(db.get(emp_id).get(1));
    }

    public void getEmpSalary(int emp_id) {
        System.out.println(db.get(emp_id).get(2));
    }

    public void getEmpPhone(int emp_id) {
        System.out.println(db.get(emp_id).get(3));
    }

    public void setEmpName(int emp_id, String empname) {
        List<String> ar = db.get(emp_id);
        ar.set(0, empname);
    }

    public void setEmpDept(int emp_id, String empDept) {
        List<String> ar = db.get(emp_id);
        ar.set(1, empDept);

    }

    public void setEmpSalary(int emp_id, String empSalary) {
        List<String> ar = db.get(emp_id);
        ar.set(2, empSalary);
    }

    public void setEmpPhone(int emp_id, String empPhone) {
        List<String> ar = db.get(emp_id);
        ar.set(3, empPhone);
    }
}

public class employeeDatabase {
    public static void main(String[] args) {
        System.out.println("Before change");
        System.out.println();
        employee emp = new employee();
        emp.getEmpName(2);
        emp.getEmpDept(2);
        emp.getEmpSalary(2);
        emp.getEmpPhone(2);

        emp.setEmpName(2, "Ritwik C");
        System.out.println();
        System.out.println("After change");
        System.out.println();
        emp.getEmpName(2);
        emp.getEmpDept(2);
        emp.getEmpSalary(2);
        emp.getEmpPhone(2);
    }
}

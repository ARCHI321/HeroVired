package BasicsOFJava.Oops.Graded;

import java.util.*;
import java.util.Scanner;

class appointment {
    private HashMap<String, List<String>> visitorsdb = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    appointment() {
        visitorsdb.put("101", Arrays.asList("Debdutta Das", "234456457", "Dr Debashish Guha", "14:30"));
    }
}

public class AppointmentManagementSystem {
    public static void main(String[] args) {

    }
}

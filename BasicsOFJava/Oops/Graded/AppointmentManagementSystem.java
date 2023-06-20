package BasicsOFJava.Oops.Graded;

import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

class database {
    protected HashMap<String, List<String>> visitorsdb = new HashMap<>();
    protected HashMap<String, List<String>> timeSlotsdb = new HashMap<>();
    protected HashMap<String, List<String>> doctorsdb = new HashMap<>();
    private String visitors_id = "103";

    public void addData() {
        visitorsdb.put("101",
                Arrays.asList("18/06/23", "Deb Dasgupta", "23445456757", "Dr Samita Nandi", "16:30", "350"));
        visitorsdb.put("102",
                Arrays.asList("19/06/23", "Debdutta Das", "234456457", "Dr Debashish Guha", "14:30", "300"));

        doctorsdb.put("D101", Arrays.asList("Dr Debashish Guha", "14:30", "1", "15:30", "0", "300"));
        doctorsdb.put("D102", Arrays.asList("Dr Samita Nandi", "16:30", "0", "18:30", "0", "350"));
        doctorsdb.put("D103", Arrays.asList("Dr Asmita Sircar", "15:30", "0", "400"));
        doctorsdb.put("D104", Arrays.asList("Dr Rupa Ganguly", "16:30", "0", "17:30", "0", "18:00", "0", "400"));

        timeSlotsdb.put("16:30", Arrays.asList("D104", "D102"));
        timeSlotsdb.put("14:30", Arrays.asList("D101"));
        timeSlotsdb.put("15:30", Arrays.asList("D102", "D101"));
        timeSlotsdb.put("18:30", Arrays.asList("D102"));
        timeSlotsdb.put("17:30", Arrays.asList("D104"));
        timeSlotsdb.put("18:00", Arrays.asList("D104"));
    }

    public String getVisitorsId() {
        return (visitors_id);
    }

    public void setVisitorsId(String v) {
        visitors_id = v;
    }
}

abstract class appointmentAdmin extends database {

    abstract void getAllVisitors();

    abstract void addNewVisitor();

    abstract void editVisitor();

}

abstract class appointmentVisitor extends database {
    abstract void bookAppointment();

    abstract void editAppointment(String a);

}

class AppointmentManagementSystemAdmin extends appointmentAdmin {

    Scanner sc = new Scanner(System.in);

    void getAllVisitors() {
        for (String k : visitorsdb.keySet()) {
            System.out.println(visitorsdb.get(k));
        }
    }

    void addNewVisitor() {
        int newVisitorId = Integer.parseInt(getVisitorsId().trim());
        setVisitorsId(Integer.toString(newVisitorId + 1));
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy");
        LocalDateTime now = LocalDateTime.now();
        String date = dtf.format(now);
        System.out.print("Enter Visitor name : ");
        String name = sc.nextLine();
        System.out.print("Enter Visitor phone number : ");
        String phone = sc.nextLine();
        String d_name = "", fees = "", timeSlot = "";
        int flag = 0;
        do {
            System.out.print("Enter Time slot : (14:30 , 16:30 , 15:30 , 16:30 , 17:30 ,18:30 , 18:00) : ");
            timeSlot = sc.nextLine();

            if (timeSlotsdb.keySet().contains(timeSlot)) {
                List<String> availableDoctors = timeSlotsdb.get(timeSlot);
                HashMap<String, String> availableDoctorsChoose = new HashMap<>();
                for (String doc_id : availableDoctors) {
                    if (doctorsdb.get(doc_id).contains(timeSlot)) {
                        int index = doctorsdb.get(doc_id).indexOf(timeSlot);
                        if (doctorsdb.get(doc_id).get(index + 1).equals("0")) {
                            availableDoctorsChoose.put(doc_id, doctorsdb.get(doc_id).get(0));
                            flag = 1;
                        }
                    }
                }
                if (flag == 0) {
                    System.out.println("Doctor not available at that time slot. Choose another time slot");
                } else {
                    for (String a : availableDoctorsChoose.keySet()) {
                        System.out.println(a + "-" + availableDoctorsChoose.get(a));
                    }
                    System.out.print("Choose doctor(from above ids) : ");
                    String doctorChoice = sc.nextLine();
                    d_name = doctorsdb.get(doctorChoice).get(0);
                    fees = doctorsdb.get(doctorChoice).get(doctorsdb.get(doctorChoice).size() - 1);
                    int index = doctorsdb.get(doctorChoice).indexOf(timeSlot);
                    doctorsdb.get(doctorChoice).set(index + 1, "1");

                }

            } else {
                System.out.println("Not a correct time slot. Choose from the list");
            }
        } while (flag == 0);

        List<String> appo = new ArrayList<String>();
        String visitors_id = getVisitorsId();
        appo.add(date);
        appo.add(name);
        appo.add(phone);
        appo.add(d_name);
        appo.add(timeSlot);
        appo.add(fees);
        visitorsdb.put(visitors_id, appo);
        for (String a : visitorsdb.keySet()) {
            System.out.println(visitorsdb.get(a));
        }

    }

    void editVisitor() {
        for (String a : visitorsdb.keySet()) {
            System.out.println(a + "-" + visitorsdb.get(a));
        }
        System.out.print("Enter visitor id : ");
        String v_id = sc.nextLine();

        System.out.println(visitorsdb.get(v_id));

        System.out.println("1.Vistor's Name    2. Visitor's Phone    3.Time slot");
        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                System.out.print("Enter updated name : ");
                String name = sc.nextLine();
                visitorsdb.get(v_id).set(1, name);
                break;
            case 2:
                System.out.print("Enter updated phone number : ");
                String phone = sc.nextLine();
                visitorsdb.get(v_id).set(2, phone);
                break;
            case 3:
                System.out.print("Enter Updated Time slot : (14:30 , 16:30 , 15:30 , 16:30 , 17:30 ,18:30 , 18:00) : ");
                String time_slot = sc.nextLine();
                int flag = 0;
                String d_name = "", fees = "";
                if (timeSlotsdb.keySet().contains(time_slot)) {
                    List<String> availableDoctors = timeSlotsdb.get(time_slot);
                    HashMap<String, String> availableDoctorsChoose = new HashMap<>();
                    for (String doc_id : availableDoctors) {
                        if (doctorsdb.get(doc_id).contains(time_slot)) {
                            int index = doctorsdb.get(doc_id).indexOf(time_slot);
                            if (doctorsdb.get(doc_id).get(index + 1).equals("0")) {
                                availableDoctorsChoose.put(doc_id, doctorsdb.get(doc_id).get(0));
                                flag = 1;
                            }
                        }
                    }
                    if (flag == 0) {
                        System.out.println("Doctor not available at that time slot. Choose another time slot");
                    } else {
                        for (String a : availableDoctorsChoose.keySet()) {
                            System.out.println(a + "-" + availableDoctorsChoose.get(a));
                        }
                        System.out.print("Choose doctor(from above ids) : ");
                        String doctorChoice = sc.nextLine();
                        d_name = doctorsdb.get(doctorChoice).get(0);
                        fees = doctorsdb.get(doctorChoice).get(doctorsdb.get(doctorChoice).size() - 1);
                        int index = doctorsdb.get(doctorChoice).indexOf(time_slot);
                        doctorsdb.get(doctorChoice).set(index + 1, "1");

                    }

                    visitorsdb.get(v_id).set(3, d_name);
                    visitorsdb.get(v_id).set(4, time_slot);
                    visitorsdb.get(v_id).set(5, fees);

                    break;

                }
        }
    }

    void callAdmin() {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        addData();
        do {

            System.out.println("1. All visitors list     2. Add a new visitor    3. Edit a visitor details");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    getAllVisitors();
                    break;
                case 2:
                    addNewVisitor();

                    break;
                case 3:
                    editVisitor();
                    break;
            }
            System.out.print("Do you want to continue(1/0) : ");
            ans = sc.nextInt();
        } while (ans == 1);
    }
}

class AppointmentManagementSystemVisitor extends appointmentVisitor {
    Scanner sc = new Scanner(System.in);

    void bookAppointment() {
        int newVisitorId = Integer.parseInt(getVisitorsId().trim());
        setVisitorsId(Integer.toString(newVisitorId + 1));
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy");
        LocalDateTime now = LocalDateTime.now();
        String date = dtf.format(now);
        System.out.print("Enter Visitor name : ");
        String name = sc.nextLine();
        System.out.print("Enter Visitor phone number : ");
        String phone = sc.nextLine();
        String d_name = "", fees = "", timeSlot = "";
        int flag = 0;
        do {
            System.out.print("Enter Time slot : (14:30 , 16:30 , 15:30 , 16:30 , 17:30 ,18:30 , 18:00) : ");
            timeSlot = sc.nextLine().trim();
            if (timeSlotsdb.keySet().contains(timeSlot)) {
                List<String> availableDoctors = timeSlotsdb.get(timeSlot);
                HashMap<String, String> availableDoctorsChoose = new HashMap<>();
                for (String doc_id : availableDoctors) {
                    if (doctorsdb.get(doc_id).contains(timeSlot)) {
                        int index = doctorsdb.get(doc_id).indexOf(timeSlot);
                        if (doctorsdb.get(doc_id).get(index + 1).equals("0")) {
                            availableDoctorsChoose.put(doc_id, doctorsdb.get(doc_id).get(0));
                            flag = 1;
                        }
                    }
                }
                if (flag == 0) {
                    System.out.println("Doctor not available at that time slot. Choose another time slot");
                } else {
                    for (String a : availableDoctorsChoose.keySet()) {
                        System.out.println(a + "-" + availableDoctorsChoose.get(a));
                    }
                    System.out.print("Choose doctor(from above ids) : ");
                    String doctorChoice = sc.nextLine();
                    d_name = doctorsdb.get(doctorChoice).get(0);
                    fees = doctorsdb.get(doctorChoice).get(doctorsdb.get(doctorChoice).size() - 1);
                    int index = doctorsdb.get(doctorChoice).indexOf(timeSlot);
                    doctorsdb.get(doctorChoice).set(index + 1, "1");

                }

            } else {
                System.out.println("Not a correct time slot. Choose from the list");
            }
        } while (flag == 0);

        List<String> appo = new ArrayList<String>();
        String visitors_id = getVisitorsId();
        appo.add(date);
        appo.add(name);
        appo.add(phone);
        appo.add(d_name);
        appo.add(timeSlot);
        appo.add(fees);
        visitorsdb.put(visitors_id, appo);
        System.out.println(visitorsdb.get(visitors_id));

    }

    void editAppointment(String v_id) {

        System.out.println(visitorsdb.get(v_id));

        System.out.println("1.Vistor's Name    2. Visitor's Phone    3.Time slot");
        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                System.out.print("Enter updated name : ");
                String name = sc.nextLine();
                visitorsdb.get(v_id).set(1, name);
                break;
            case 2:
                System.out.print("Enter updated phone number : ");
                String phone = sc.nextLine();
                visitorsdb.get(v_id).set(2, phone);
                break;
            case 3:
                System.out.print(
                        "Enter Updated Time slot : (14:30 , 16:30 , 15:30 , 16:30 , 17:30 ,18:30 , 18:00) : ");
                String time_slot = sc.nextLine();
                int flag = 0;
                String d_name = "", fees = "";
                if (timeSlotsdb.keySet().contains(time_slot)) {
                    List<String> availableDoctors = timeSlotsdb.get(time_slot);
                    HashMap<String, String> availableDoctorsChoose = new HashMap<>();
                    for (String doc_id : availableDoctors) {
                        if (doctorsdb.get(doc_id).contains(time_slot)) {
                            int index = doctorsdb.get(doc_id).indexOf(time_slot);
                            if (doctorsdb.get(doc_id).get(index + 1).equals("0")) {
                                availableDoctorsChoose.put(doc_id, doctorsdb.get(doc_id).get(0));
                                flag = 1;
                            }
                        }
                    }
                    if (flag == 0) {
                        System.out.println("Doctor not available at that time slot. Choose another time slot");
                    } else {
                        for (String a : availableDoctorsChoose.keySet()) {
                            System.out.println(a + "-" + availableDoctorsChoose.get(a));
                        }
                        System.out.print("Choose doctor(from above ids) : ");
                        String doctorChoice = sc.nextLine();
                        d_name = doctorsdb.get(doctorChoice).get(0);
                        fees = doctorsdb.get(doctorChoice).get(doctorsdb.get(doctorChoice).size() - 1);
                        int index = doctorsdb.get(doctorChoice).indexOf(time_slot);
                        doctorsdb.get(doctorChoice).set(index + 1, "1");

                    }

                    visitorsdb.get(v_id).set(3, d_name);
                    visitorsdb.get(v_id).set(4, time_slot);
                    visitorsdb.get(v_id).set(5, fees);
                    System.out.println(visitorsdb.get(v_id));
                    break;

                }
        }
    }

    void callVisitor() {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        addData();
        do {

            System.out.println("1. Book an appointment   2. Edit a appointment details");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    bookAppointment();
                    break;
                case 2:
                    editAppointment(getVisitorsId());
                    break;
                default:
                    System.out.println("wong choice");
            }
            System.out.print("Do you want to continue(1/0) : ");
            ans = sc.nextInt();
        } while (ans == 1);
    }
}

public class AppointmentManagementSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Visitor   2.Admin");
        System.out.print("who are you ? ");
        int person = sc.nextInt();
        database db = new database();
        db.addData();
        switch (person) {
            case 1:
                AppointmentManagementSystemVisitor visitor = new AppointmentManagementSystemVisitor();
                visitor.callVisitor();
                break;
            case 2:
                AppointmentManagementSystemAdmin admin = new AppointmentManagementSystemAdmin();
                admin.callAdmin();
                break;
            default:
                System.out.println("Wrong choice");

        }

    }
}
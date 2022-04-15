package edu.sjsu.assignment3;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * This is the main class where I test all of my classes.
 */
public class Main {

    /**
     * @param args Regular psvm.
     * This method is where I implement all of my classes and test them.
     */
    public static void main(String[] args) {
	// write your code here
        LocalDate startDate = LocalDate.parse("2022-01-27");
        LocalDate endDate = LocalDate.parse("2022-05-18");

        LocalDate testDate1 = LocalDate.parse("2022-01-27");
        LocalDate testDate2 = LocalDate.parse("2022-03-18");
        LocalDate testDate3 = LocalDate.parse("2022-05-27");

        Appointment appointment = new OnetimeAppointment("Class starts", startDate);
        System.out.println(appointment.occursOn(testDate1));
        System.out.println(appointment.occursOn(testDate2));
        System.out.println(appointment.occursOn(testDate3));
        System.out.println("");

        Appointment appointment2 = new DailyAppointment ("Class starts", startDate, endDate);
        System.out.println(appointment2.occursOn(testDate1));
        System.out.println(appointment2.occursOn(testDate2));
        System.out.println(appointment2.occursOn(testDate3));
        System.out.println("");

        Appointment appointment3 = new MonthlyAppointment("Meeting", startDate, endDate);
        System.out.println(appointment3.occursOn(testDate1));
        System.out.println(appointment3.occursOn(testDate2));
        System.out.println(appointment3.occursOn(testDate3));
        System.out.println("");

        LocalDate startDate2 = LocalDate.parse("2022-02-16");
        LocalDate endDate2 = LocalDate.parse("2022-05-16");

        Appointment a1 = new OnetimeAppointment("Class Starts", startDate);
        Appointment a2 = new DailyAppointment("Class", startDate,endDate);
        Appointment a3 = new DailyAppointment("Assignments", startDate2,endDate2);
        Appointment a4 = new MonthlyAppointment("A meeting", startDate, endDate);
        Appointment a5 = new MonthlyAppointment("A meeting", startDate2, endDate);

        Appointment[] listAppointments = {a1,a2,a3,a4,a5};
        Arrays.sort(listAppointments);
        System.out.println("Sort by Dates First: "+ Arrays.toString(listAppointments));
        Arrays.sort(listAppointments, new DesComparator());
        System.out.println("Sort by Description First: " + Arrays.toString(listAppointments));



    }
}

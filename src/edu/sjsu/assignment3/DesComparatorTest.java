package edu.sjsu.assignment3;

import org.junit.Test;

import java.time.LocalDate;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * This class is to test the Description Comparator. It makes sure that an array of Appointment objects are sorted by description first, then start date, and finally end date.
 */
public class DesComparatorTest {

    /**
     * This tests the compare method used to sort Appointments by the criteria stated in the class description.
     */
    @Test
    public void compare() {
        LocalDate startDate = LocalDate.parse("2022-01-27");
        LocalDate endDate = LocalDate.parse("2022-05-18");
        LocalDate startDate2 = LocalDate.parse("2022-02-16");
        LocalDate endDate2 = LocalDate.parse("2022-05-16");

        Appointment a1 = new OnetimeAppointment("Class Starts", startDate);
        Appointment a2 = new DailyAppointment("Class", startDate,endDate);
        Appointment a3 = new DailyAppointment("Assignments", startDate2,endDate2);
        Appointment a4 = new MonthlyAppointment("A meeting", startDate, endDate);
        Appointment a5 = new MonthlyAppointment("A meeting", startDate2, endDate);

        Appointment[] listAppointments = {a1,a2,a3,a4,a5};
        Arrays.sort(listAppointments, new DesComparator());

        assertArrayEquals(new Appointment[]{a4, a5, a3, a2, a1},listAppointments);
    }
}
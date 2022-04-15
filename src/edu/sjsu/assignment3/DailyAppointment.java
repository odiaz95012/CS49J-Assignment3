package edu.sjsu.assignment3;

import java.time.LocalDate;

/**
 * This is a subclass of the Appointment class. This creates a daily appointment.
 */
public class DailyAppointment extends Appointment{
    /**
     * @param description The Appointment's description.
     * @param startDate The Appointment's start date.
     * @param endDate The Appointment's end date.
     */
    public DailyAppointment(String description, LocalDate startDate, LocalDate endDate) {
        super(description, startDate, endDate);
    }

    /**
     * @param date The other Appointment date being compared.
     * @return Returns true if the input date is between the start and end date (inclusively). If it isn't then it returns false.
     */
    @Override
    public boolean occursOn(LocalDate date) {
        return betweenStartAndEnd(date);
    }
}

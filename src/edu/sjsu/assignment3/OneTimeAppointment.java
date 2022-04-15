package edu.sjsu.assignment3;

import java.time.LocalDate;

/**
 * This is a subclass of the Appointment class. It creates a One Time Appointment.
 */
public class OneTimeAppointment extends Appointment{
    /**
     * @param description This is the description of the Appointment.
     * @param startDate This is the start date of the Appointment. Since this is a one time appointment, the end date is the same as the start date.
     */
    public OneTimeAppointment(String description, LocalDate startDate) {
        // Because this is a one time appointment, start date should be the same as end date
        super(description, startDate, startDate);
    }

    /**
     * @param date The other Appointment date being compared.
     * @return Returns true if the input is the exact same as the start date of appointment. If not, then it returns false.
     */
    @Override
    public boolean occursOn(LocalDate date) {
        return date.isEqual(getStartDate());
    }
}

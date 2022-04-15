package edu.sjsu.assignment3;

import java.time.LocalDate;

/**
 * This is a subclass of the Appointment class. It creates a monthly appointment.
 */
public class MonthlyAppointment extends Appointment{
    /**
     * @param description This is the description for the type of Appointment.
     * @param startDate This is the start date of the Appointment.
     * @param endDate This is the end date of the Appointment.
     * This constructs a Monthly Appointment object.
     */
    public MonthlyAppointment(String description, LocalDate startDate, LocalDate endDate) {
        super(description, startDate, endDate);
    }
    /**
     * @param date The other Appointment date being compared.
     * @return Returns true if the input date is between the start and end date (inclusively)
     * AND the day of month of the input date is the same as the start date's day of month of the appointment
     */
    @Override
    public boolean occursOn(LocalDate date) {
        // checks if the input is between the start and end date (inclusively) AND the day of month
        // of the input date is the same as the start date's day of month
        if(betweenStartAndEnd(date) && date.getDayOfMonth() == this.getStartDate().getDayOfMonth()){
            return true;
        }
        return  false;
    }

}

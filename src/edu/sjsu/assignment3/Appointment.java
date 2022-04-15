package edu.sjsu.assignment3;

import java.time.LocalDate;

/**
 * This is the superclass. This creates an Appointment, either a One Time Appointment, Daily Appointment, or Monthly Appointment.
 * This superclass also implements a comparator to compare Appointments by their start date, then their end date, and finally their descriptions.
 */
public abstract class Appointment implements Comparable<Appointment>{
    private final String description;
    private final LocalDate startDate;
    private final LocalDate endDate;

    /**
     * @param description This is the description for the type of Appointment.
     * @param startDate This is the start date of the Appointment.
     * @param endDate This is the end date of the Appointment.
     * This constructs an Appointment object.
     */
    public Appointment(String description, LocalDate startDate, LocalDate endDate) {
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    /**
     * @param other This is the other Appointment object being compared.
     * @return This method returns the Appointment with the earliest start date if they differ.
     *  If the start dates are the same then it returns the Appointment with the earliest end date.
     *  If the end dates are the same then it returns the Appointment with the description that occurs first alphabetically.
     */
    @Override
    public int compareTo(Appointment other){
        if(!this.startDate.isEqual(other.startDate)) return this.startDate.compareTo(other.getStartDate()); // need to return the startDate that occurs first
        else if (!this.endDate.isEqual(other.endDate)) return this.endDate.compareTo(other.endDate); // need to return the endDate that occurs first if they have the same startDate
        else return this.description.compareTo(other.description); // if start dates and end dates are the same, then sort by description
    }

    /**
     * This is an abstract method that is defined in each subclass.
     * @param date The other Appointment date being compared.
     * @return Returns true or false.
     */
    public abstract boolean occursOn(LocalDate date);

    /**
     * @return Returns the Appointment's description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return Returns the Appointment's start date.
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /**
     * @return Returns the Appointment's end date.
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /**
     * This is a concrete helper method to check if the input date is between the start and end date (inclusively).
     * @param date This is the other Appointment date being compared.
     * @return Returns true if the input date is between the start and end date (inclusively) or returns false if it is not.
     */
    public boolean betweenStartAndEnd(LocalDate date){
        // checks if the input is between the start and end date (inclusively)
        if(date.isEqual(getStartDate()) || date.isAfter(getStartDate()) &&  date.isBefore(getEndDate()) || date.isEqual(getEndDate())){
            return true;
        }
        return false;
    }

    /**
     * @return Returns the Description followed by the start date and end date of an Appointment.
     */
    @Override
    public String toString(){
        return this.getDescription() + " " + this.getStartDate() + " " +this.getEndDate();
    }



}

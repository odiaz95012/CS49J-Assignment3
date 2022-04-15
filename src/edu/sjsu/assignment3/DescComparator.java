package edu.sjsu.assignment3;

import java.util.Comparator;

/**
 * This is a class to compare Appointment objects by the Appointment's description first, then start date, and finally the end date.
 */
public class DescComparator implements Comparator<Appointment> {
    /**
     * @param o1 The first Appointment being compared.
     * @param o2 The second Appointment being compared.
     * @return Returns the Appointment which has the lowest alphabetical value (sorts alphabetically).
     * If the descriptions match, then it returns the Appointment with the earliest start date.
     * If the descriptions and start dates match, then it returns the Appointment  with the earliest end date.
     */
    @Override
    public int compare(Appointment o1, Appointment o2) {
        // if the descriptions are different, then sort by description
        if(!o1.getDescription().equals(o2.getDescription())) return o1.getDescription().compareTo(o2.getDescription());
        //if descriptions are the same, then sort by start date
        else if(!o1.getStartDate().isEqual(o2.getStartDate())) return o1.getStartDate().compareTo(o2.getStartDate());
        // if description and start dates are the same, then sort by end date
        else return o1.getEndDate().compareTo(o2.getEndDate());
    }
}

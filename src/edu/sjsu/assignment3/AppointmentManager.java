package edu.sjsu.assignment3;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class AppointmentManager extends TreeSet<Appointment>{

    public boolean addAppointment(Appointment appointment){
        // check if appointment doesn't already exist
        if (!this.contains(appointment)){
            this.add(appointment);
            return true;
        }
        // if the appointment already exists then we can't add it
        else return false;
    }
    public boolean deleteAppointment(Appointment appointment){
        // if the appointment doesn't exist then we can't delete it
        if(!this.contains(appointment)) return false;
        this.remove(appointment);
        return true;
    }
    public void printAppointments(){
        Iterator<Appointment> iterator = this.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next().toString());
    }




}

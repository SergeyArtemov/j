package ru.job4j.professions;

import java.util.ArrayList;

/**
 * Класс доктор. Created by serge_000 on 29.06.2017.
 */
public class Doctor extends Profession {
    private String speciality;
    private String specialization;
    public ArrayList<String> listOfPatient;

    public Doctor(){
        listOfPatient = new ArrayList<>();
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void treatPatient(String patient){
        listOfPatient.add(patient);
    }

    public ArrayList<String> GiveAllPatients(){
        return listOfPatient;
    }
}

package ru.job4j.professions;

import java.util.ArrayList;

/**
 * Класс доктор. Created by serge_000 on 29.06.2017.
 */
public class Doctor extends Profession {

    /**
     *
     */
    private String speciality;
    /**
     *
     */
    private String specialization;
    /**
     *
     */
    private ArrayList<Patient> listOfPatient;

    /**
     *
     * @return **listOfPatient**
     */
    public ArrayList<Patient> getListOfPatient() {
        return this.listOfPatient;
    }

    /**
     *
     */
    public Doctor() {
        listOfPatient = new ArrayList<>();
    }

    /**
     *
     * @return **speciality**
     */
    public String getSpeciality() {
        return speciality;
    }

    /**
     *
     * @param speciality **speciality**
     */
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    /**
     *
     * @return **specialization**
     */
    public String getSpecialization() {
        return specialization;
    }

    /**
     *
     * @param specialization **specialization**
     */
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    /**
     *
     * @param patient **patient**
     * @return ****
     */
    public String treatPatient(Patient patient) {
        listOfPatient.add(patient);
        return this.getTheName() + " лечит(-ил) " + patient.getTheName();
    }

    /**
     *
     * @return **listOfPatient**
     */
    public ArrayList<Patient> giveAllPatients() {
        return this.listOfPatient;
    }
}

package ru.job4j.professions;

import java.util.ArrayList;

/**
 * Класс Инженер. Created by serge_000 on 29.06.2017.
 */
public class Engineer extends Profession {
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
    private ArrayList<Project> listOfProject;

    /**
     *
     * @return **listOfProject**
     */
    public ArrayList<Project> getListOfProject() {
        return this.listOfProject;
    }

    /**
     *
     */
    public Engineer() {
        listOfProject = new ArrayList<>();
    }

    /**
     *
     * @param project **project**
     * @return ****
     */
    public String workOnProject(Project project) {
        listOfProject.add(project);
        return this.getTheName() + " участвовал в проекте " + project.getName();
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
     * @param speciality **speciality**
     */
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    /**
     *
     * @return **speciality**
     */
    public String getSpeciality() {
        return speciality;
    }
}
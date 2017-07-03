package ru.job4j.professions;

import java.util.ArrayList;

/**
 * Класс Инженер. Created by serge_000 on 29.06.2017.
 */
public class Engineer extends Profession {
    private String speciality;
    private String specialization;
    public ArrayList<Project> listOfProject;

    public Engineer(){
        listOfProject = new ArrayList<>();
    }

    public String workOnProject(Project project){
        listOfProject.add(project);
        return this.getTheName() + " участвовал в проекте " + project.getName();
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }


    public String getSpeciality() {
        return speciality;
    }
}
package ru.job4j.professions;

/**
 * Базовый класс Профессии.  Created by serge_000 on 28.06.2017.
 */
public class Profession {
    private String theName;
    private String phone;
    private boolean readyToMove;
    private String graduateFrom;
    private String numbOfDiploma;
    private String jobCurrent;
    private String jobPrevious;

    public String getTheName() {
        return theName;
    }

    public void setTheName(String theName) {
        this.theName = theName;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isReadyToMove() {
        return this.readyToMove;
    }

    public void setReadyToMove(boolean readyToMove) {
        this.readyToMove = readyToMove;
    }

    public String getGraduateFrom() {
        return graduateFrom;
    }

    public void setGraduateFrom(String graduateFrom) {
        this.graduateFrom = graduateFrom;
    }

    public String getNumbOfDiploma() {
        return numbOfDiploma;
    }

    public void setNumbOfDiploma(String numbOfDiploma) {
        this.numbOfDiploma = numbOfDiploma;
    }


    public String getJobCurrent() {
        return jobCurrent;
    }

    public String getJobPrevious() {
        return jobPrevious;
    }

    public void getJob(String job){
        jobCurrent = job;
    }

    public void quitJob() {
        jobPrevious = jobCurrent;
        jobCurrent = null;
    }
}

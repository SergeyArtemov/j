package ru.job4j.professions;

/**
 * Базовый класс Профессии.  Created by serge_000 on 28.06.2017.
 */
public class Profession {
    /**
     * theName.
     */
    private String theName;
    /**
     * phone.
     */
    private String phone;
    /**
     * readyToMove.
     */
    private boolean readyToMove;
    /**
     * graduateFrom.
     */
    private String graduateFrom;
    /**
     * numbOfDiploma.
     */
    private String numbOfDiploma;
    /**
     * jobCurrent.
     */
    private String jobCurrent;
    /**
     * jobPrevious.
     */
    private String jobPrevious;

    /**
     *
     * @return **theName**
     */
    public String getTheName() {
        return theName;
    }

    /**
     *
     * @param theName **theName**
     */
    public void setTheName(String theName) {
        this.theName = theName;
    }

    /**
     *
     * @return **phone**
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     *
     * @param phone **phone**
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     *
     * @return **readyToMove**
     */
    public boolean isReadyToMove() {
        return this.readyToMove;
    }

    /**
     *
     * @param readyToMove **readyToMove**
     */
    public void setReadyToMove(boolean readyToMove) {
        this.readyToMove = readyToMove;
    }

    /**
     *
     * @return **graduateFrom**
     */
    public String getGraduateFrom() {
        return graduateFrom;
    }

    /**
     *
     * @param graduateFrom **graduateFrom**
     */
    public void setGraduateFrom(String graduateFrom) {
        this.graduateFrom = graduateFrom;
    }

    /**
     *
     * @return **numbOfDiploma**
     */
    public String getNumbOfDiploma() {
        return numbOfDiploma;
    }

    /**
     *
     * @param numbOfDiploma **numbOfDiploma**
     */
    public void setNumbOfDiploma(String numbOfDiploma) {
        this.numbOfDiploma = numbOfDiploma;
    }


    /**
     *
     * @return **jobCurrent**
     */
    public String getJobCurrent() {
        return jobCurrent;
    }

    /**
     *
     * @return **jobPrevious**
     */
    public String getJobPrevious() {
        return jobPrevious;
    }

    /**
     *
     * @param job **job**
     */
    public void getJob(String job) {
        jobCurrent = job;
    }

    /**
     *
     */
    public void quitJob() {
        jobPrevious = jobCurrent;
        jobCurrent = null;
    }
}

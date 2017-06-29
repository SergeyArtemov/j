package ru.job4j.professions;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test Profession.
 *
 * @author Sergey Artemov (mailto:sergeyartemov@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class ProfessionTest {
  @Test
    public void whenAddTwoPatientsThenGiveListOfTwoPatients(){
      Doctor doctorIvanov = new Doctor();
      doctorIvanov.setTheName("Иванов И.И.");
      doctorIvanov.treatPatient("Семенов С.С.");
      doctorIvanov.treatPatient("Васильев В.В.");

      ArrayList<String> expected = new ArrayList<>();
      expected.add("Семенов С.С.");
      expected.add("Васильев В.В.");

      assertThat(doctorIvanov.listOfPatient,is(expected));
    }

    @Test
    public void whenAddTwoProjectThenGiveListOfTwoProjects(){
      Engineer engineerIvanov = new Engineer();
      engineerIvanov.setTheName("Иванов И.И.");
      engineerIvanov.workOnProject("Проект1");
      engineerIvanov.workOnProject("Проект2");

      ArrayList<String> expected = new ArrayList<>();
      expected.add("Проект1");
      expected.add("Проект2");

      assertThat(engineerIvanov.listOfProject,is(expected));
    }

  @Test
  public void whenAddTwoSchoolClassThenGiveListOfTwoSchoolClass(){
    Teacher teacherIvanov = new Teacher();
    teacherIvanov.setTheName("Иванов И.И.");
    teacherIvanov.teachClass("2А");
    teacherIvanov.teachClass("4Б");

    ArrayList<String> expected = new ArrayList<>();
    expected.add("2А");
    expected.add("4Б");

    assertThat(teacherIvanov.listOfClass,is(expected));
  }

  @Test
  public void whenChangeJobThenChangeFielfdsOfTheObject(){
    Teacher teacherIvanov = new Teacher();
    teacherIvanov.setTheName("Иванов И.И.");
    teacherIvanov.getJob("Школа 14");
    teacherIvanov.quitJob();
    teacherIvanov.getJob("Школа 29");

    assertThat(teacherIvanov.getJobCurrent()+teacherIvanov.getJobPrevious(),is("Школа 29"+"Школа 14"));
  }
}

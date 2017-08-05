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
  /**
   * Test.
   */
  @Test
    public void whenAddTwoPatientsThenGiveListOfTwoPatients() {
      Doctor doctorIvanov = new Doctor();
      doctorIvanov.setTheName("Иванов И.И.");
      Patient pat1 = new Patient("Семенов С.С.");
      doctorIvanov.treatPatient(pat1);
      Patient pat2 = new Patient("Васильев В.В.");
      doctorIvanov.treatPatient(pat2);

      ArrayList<Patient> expected = new ArrayList<>();
      expected.add(pat1);
      expected.add(pat2);

      assertThat(doctorIvanov.getListOfPatient(), is(expected));
    }
  /**
   * Test.
   */
  @Test
  public void whenDoctorTreatPatientThenGetMessageAboutThis() {
    Doctor doctorIvanov = new Doctor();
    doctorIvanov.setTheName("Иванов И.И.");
    Patient pat1 = new Patient("Семенов С.С.");
    doctorIvanov.treatPatient(pat1);

    assertThat(doctorIvanov.treatPatient(pat1), is("Иванов И.И. лечит(-ил) Семенов С.С."));
  }
  /**
   * Test.
   */
    @Test
    public void whenAddTwoProjectThenGiveListOfTwoProjects() {
      Engineer engineerIvanov = new Engineer();
      engineerIvanov.setTheName("Иванов И.И.");

      Project proj1 = new Project("Проект1");
      Project proj2 = new Project("Проект2");

      engineerIvanov.workOnProject(proj1);
      engineerIvanov.workOnProject(proj2);

      ArrayList<Project> expected = new ArrayList<>();
      expected.add(proj1);
      expected.add(proj2);

      assertThat(engineerIvanov.getListOfProject(), is(expected));
    }
  /**
   * Test.
   */
  @Test
  public void whenEnginerWorkOnProjectThenGetMessageAboutThis() {
    Engineer engineerIvanov = new Engineer();
    engineerIvanov.setTheName("Иванов И.И.");

    Project proj1 = new Project("Проект1");

    assertThat(engineerIvanov.workOnProject(proj1), is("Иванов И.И. участвовал в проекте Проект1"));
  }
  /**
   * Test.
   */
  @Test
  public void whenAddTwoSchoolClassThenGiveListOfTwoSchoolClass() {
    Teacher teacherIvanov = new Teacher();
    teacherIvanov.setTheName("Иванов И.И.");

    SchoolClass class1 = new SchoolClass("2А");
    teacherIvanov.teachClass(class1);
    SchoolClass class2 = new SchoolClass("4Б");
    teacherIvanov.teachClass(class2);

    ArrayList<SchoolClass> expected = new ArrayList<>();
    expected.add(class1);
    expected.add(class2);

    assertThat(teacherIvanov.getListOfClass(), is(expected));
  }
  /**
   * Test.
   */
  @Test
  public void whenTeacherTeacClassThenGetMessageAboutThis() {
    Teacher teacherIvanov = new Teacher();
    teacherIvanov.setTheName("Иванов И.И.");

    SchoolClass class1 = new SchoolClass("2А");

    assertThat(teacherIvanov.teachClass(class1), is("Иванов И.И. учит(-ил) класс 2А"));
  }
  /**
   * Test.
   */
  @Test
  public void whenChangeJobThenChangeFielfdsOfTheObject() {
    Teacher teacherIvanov = new Teacher();
    teacherIvanov.setTheName("Иванов И.И.");
    teacherIvanov.getJob("Школа 14");
    teacherIvanov.quitJob();
    teacherIvanov.getJob("Школа 29");

    assertThat(teacherIvanov.getJobCurrent() + teacherIvanov.getJobPrevious(), is("Школа 29" + "Школа 14"));
  }
}

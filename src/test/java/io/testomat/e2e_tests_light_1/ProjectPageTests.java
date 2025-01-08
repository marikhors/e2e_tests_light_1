package io.testomat.e2e_tests_light_1;

import io.testomat.e2e_tests_light_1.web.pages.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProjectPageTests extends BaseTest {


    private static final ProjectsPage projectsPage = new ProjectsPage();
    private static final SignInPage signInPage = new SignInPage();
    private static final AutomotiveProjectPage automotiveProjectPage = new AutomotiveProjectPage();
    private static final ListViewPage listViewPage = new ListViewPage();
    static String username = env.get("USERNAME");
    static String password = env.get("PASSWORD");
    private final ProjectPage projectPage = new ProjectPage();
    String targetProjectName = "Manufacture light";
    String automotiveProject = "Automotive, Baby & Music";

    @BeforeAll
    static void openTestomatAndLogin() {
        signInPage.open();
        signInPage.loginUser(username, password);
        projectsPage.signInSuccess();
    }

    @BeforeEach
    void openProjectsPage() {
        projectsPage.open();
        projectsPage.isLoaded();
    }

    @Test
    public void userCanFindProjectWithTests() {
        projectsPage.isLoaded();
        projectsPage.searchForProject(targetProjectName);
        projectsPage.selectProject(targetProjectName);
        projectPage.isLoaded(targetProjectName);
    }


  /*  @Test
    public void totalNumberOfProjectsTest() {

        projectsPage.searchForProject(targetProjectName);

        var targetProject = projectsPage.countOfProjectsShouldBeEqualTo(1).first();

        projectsPage.countOfTestsCasesShouldBeEqualTo(targetProject, 0);
        projectsPage.totalCountOfProjectsIsVisible();

        var totalProjects = projectsPage.getTotalCountOfTestCases();
        var actualCountOfTotalTests = parseIntegerFromString(totalProjects);
        Assertions.assertTrue(actualCountOfTotalTests > 100);
    }
*/

    @Test
    public void verifyListViewTest() {
        projectsPage.isLoaded();
        listViewPage.selectListView();
        projectsPage.isLoaded();
        automotiveProjectPage.selectAutomotiveProject(automotiveProject);
        listViewPage.titleOfAutomotiveProject(automotiveProject);
    }

    @Test
    public void verifyReadMeDocTest() {
        projectsPage.isLoaded();
        automotiveProjectPage.searchForAutomotiveProject(automotiveProject);
        automotiveProjectPage.selectAutomotiveProject(automotiveProject);
        automotiveProjectPage.clickOnReadMeButton();
        automotiveProjectPage.clickOnIGotItButton();
    }
}

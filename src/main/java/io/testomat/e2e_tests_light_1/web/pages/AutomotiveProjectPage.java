package io.testomat.e2e_tests_light_1.web.pages;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class AutomotiveProjectPage {
    public void searchForAutomotiveProject(String automotiveProject) {
        $("#search").setValue(automotiveProject);
    }
    public void selectAutomotiveProject(String automotiveProject) {
        $(byText(automotiveProject)).click();
    }
    public void clickOnReadMeButton() {
        $("#ember40").click();
    }
    public void clickOnIGotItButton() {
        $("#ember66").click();
    }
}

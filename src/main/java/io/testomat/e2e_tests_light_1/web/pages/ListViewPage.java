package io.testomat.e2e_tests_light_1.web.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ListViewPage {

    public void selectListView() {
        $("#table-icon").click();
    }
    public void titleOfAutomotiveProject(String automotiveProject) {
       $("h2").shouldHave(text("Automotive, Baby & Music"));
    }
}

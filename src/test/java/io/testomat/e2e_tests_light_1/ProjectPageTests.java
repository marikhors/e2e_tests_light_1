package io.testomat.e2e_tests_light_1;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ProjectPageTests {

    @Test
    public void findProjectWithTests() {
        open("https://app.testomat.io/");
        //login user
        $("#content-desktop #user_email").setValue("mkhorsun13@gmail.com");
        $("#content-desktop #user_password").setValue("CD6YMHG!tn5!pcS");
        $("#content-desktop #user_remember_me").click();
        $("#content-desktop [name=commit]").click();
        $(".common-flash-success").shouldBe(Condition.visible);

        //search project
        $("#search").setValue("manufacture light");
        //select project
        $(byText("Manufacture light")).click();
        sleep(10000);
        //wait for project
        $("h2").shouldHave(Condition.text("Manufacture light"));
    }

    @Test
    public void verifyListView() {
        open("https://app.testomat.io/");
        $("#table-icon").click();
        sleep(10000);
        $(byText("Automotive, Baby & Music")).click();
        $("h2").shouldHave(Condition.text("Automotive, Baby & Music"));

    }

    @Test
    public void verifyReadMeDoc() {
        open("https://app.testomat.io/projects/automotive-baby-music/");
        $("#ember40").click();
        $("#ember66").click();

    }
}

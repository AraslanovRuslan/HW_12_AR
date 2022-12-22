package com.rus;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GitEnterprise_HW_12 {

    @Test
    void entepriseTests(){
        open("https://github.com/");
        $(".header-menu-wrapper").$(byText("Solutions")).hover();
        $$(".HeaderMenu-dropdown-link").findBy(text("Enterprise")).click();
        $(".col-9-max").shouldHave(text("Build like the best"));
    }
}

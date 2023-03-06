import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class test1 extends ChromeRunner {
    @Test
    public void Homework4(){
        $("#small-searchterms").shouldBe(Condition.visible).click();
        $("#clear-basket-button");
        $(byText("ფილიალები")).click();
        $(byName("Address"));
        $("#googleMap").click();
        $(byText("შეიყვანეთ მისამართი")).shouldNot(Condition.visible);
        open("https://zoommer.ge/");
        $(byLinkText("<a href=https://zoommer.ge/mobilurebi-2?orderby=30"));
        $(byClassName("n-cart-title")).shouldNot(Condition.visible);
}}

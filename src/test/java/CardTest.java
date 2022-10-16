
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class CardTest {
    @Test
    void testApplication() {
        open("http://localhost:9999");


        $("[data-test-id = 'name'] input").setValue("Михаил");
        $("[data-test-id  = 'phone'] input").setValue("+79278889988");
        $("span.checkbox__box").click();
        $("span.button__text").click();

        $(withText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.")).shouldBe(Condition.visible);

    }
}
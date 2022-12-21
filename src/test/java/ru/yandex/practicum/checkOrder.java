package ru.yandex.practicum;

import org.junit.Assert;
import org.junit.Test;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class checkOrder extends BaseUiTest_one_session {

    @Test
    public void checkOrderUpButton() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickOrderUpButton();
        OrderPage orderPage = new OrderPage(webDriver);
        mainPage.clickCookieButton();
        orderPage.inputName("Сергей");
        orderPage.inputSurname("Шеховцов");
        orderPage.inputAdress("бульвар Маршала Рокоссовского, 17");
        orderPage.inputUnderground("Бульвар Рокоссовского");
        orderPage.clickUnderground(orderPage.UdergroundRokossovskyBoulevard);
        orderPage.inputPhone("89163122488");
        orderPage.clickButtonFurther(); // Кнопка Далее
        orderPage.insertDates("25.09.2022");
        orderPage.clickEmptySpace();
        orderPage.clickRentalPeriod();
        orderPage.clickThreeDay(); // 3 дня
        orderPage.clickBlackPearl(); // Черный жемчуг
        orderPage.clickButtonOrderMiddle(); // Заказать
        orderPage.clickYesButtonConfirmOrder(); // Кнопка ДА
        boolean isDisplayed = orderPage.displayingButtonViewOrder();
        Assert.assertTrue("Кнопка 'Посмотреть статус' не найдена", isDisplayed);
    }

    @Test
    public void checkOrderMiddleButton() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickCookieButton();
        mainPage.clickOrderMiddleButton();
        OrderPage orderPage = new OrderPage(webDriver);
        orderPage.inputName("Никита");
        orderPage.inputSurname("Данилов");
        orderPage.inputAdress("Колымажный переулок 8");
        orderPage.inputUnderground("Свиблово");
        orderPage.clickUnderground(orderPage.UdergroundSviblovo);
        orderPage.inputPhone("89163122488");
        orderPage.clickButtonFurther();
        orderPage.insertDates("25.09.2022");
        orderPage.clickEmptySpace();
        orderPage.clickRentalPeriod();
        orderPage.clickTwoDay(); // 2 дня
        orderPage.clickGrayHopelessness(); // Серая безысходность
        orderPage.writeCommentСourier("Код домофона - 6661");
        orderPage.clickButtonOrderMiddle(); // Заказать
        orderPage.clickYesButtonConfirmOrder(); // Кнопка ДА
        boolean isDisplayed = orderPage.displayingButtonViewOrder();
        Assert.assertTrue("Кнопка 'Посмотреть статус' не найдена", isDisplayed);
    }

}

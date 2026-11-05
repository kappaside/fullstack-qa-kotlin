package ru.Monastyrskiy.qa

import com.codeborne.selenide.Condition.text
import com.codeborne.selenide.Selenide.*
import org.junit.jupiter.api.Test

class SaucedemoTest {

    @Test
    fun `successful login to saucedemo`() {
        // 1. Открываем сайт
        open("https://www.saucedemo.com/")

        // 2. Вводим логин и пароль
        `$`("#user-name").setValue("standard_user")
        `$`("#password").setValue("secret_sauce")

        // 3. Кликаем на кнопку Login
        `$`("#login-button").click()

        // 4. Проверяем, что залогинились (ищем заголовок Products)
        `$`(".title").shouldHave(text("Products"))
    }

    @Test
    fun `failed login with wrong password`() {
        // 1. Открываем сайт
        open("https://www.saucedemo.com/")

        // 2. Вводим логин и пароль
        `$`("#user-name").setValue("standard_user")
        `$`("#password").setValue("pupalupa")

        // 3. Кликаем на кнопку Логин
        `$`("#login-button").click()

        // 4. Проверяем текст алерта при неправильно введенных данных
        `$`("[data-test='error']").shouldHave(text("Epic sadface: Username and password do not match any user in this service"))

    }
}
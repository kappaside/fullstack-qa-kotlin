package ru.Monastyrskiy.qa

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class FirstTest {

    @Test
    fun `smoke check - junit works`() {
        val sum = 2 + 2
        assertEquals(4, sum, "JUnit не работает или математика сломалась")
    }

    @Test
    fun `validation error message contains expected text`() {
        val actualErrorMessage = "Epic sadface: Username and password do not match any user in this service"

        assertTrue(
            actualErrorMessage.contains("password", ignoreCase = true),
            "Ожидали, что в сообщении есть слово 'password', а получили: $actualErrorMessage"
        )
    }
}
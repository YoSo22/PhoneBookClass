import junit.framework.TestCase

class PhoneBookTest : TestCase() {
    var books = PhoneBook(mutableListOf(Person("Andrew", listOf("12341")),Person("Den", listOf("123455","1444"))))

    fun testAddPerson() {
        kotlin.test.assertEquals(mutableListOf(
                Person("Andrew", listOf("12341")),
                Person("Den", listOf("123455","1444")),
                Person("Men", listOf("1455"))),
                books.addPerson("Men","1455"))
    }

    fun testDeletePerson(){
        kotlin.test.assertEquals(mutableListOf(
                Person("Andrew", listOf("12341"))),
                books.deletePerson("Den"))
    }

    fun testAddPhoneNumber(){
        kotlin.test.assertEquals(mutableListOf(
                Person("Andrew", listOf("12341","233")),
                Person("Den", listOf("123455","1444"))),
                books.addPhoneNumber("Andrew","233"))
    }

    fun testDeletePhoneNumber(){
        kotlin.test.assertEquals(mutableListOf(
                Person("Andrew", listOf("12341")),
                Person("Den", listOf("123455"))),
                books.deletePhoneNumber("Den","1444"))
    }

    fun testSearchPhoneNumbersBasedOnName(){
        kotlin.test.assertEquals(listOf("12341"),books.searchPhoneNumbersBasedOnName("Andrew"))
        kotlin.test.assertEquals(listOf("123455","1444"),books.searchPhoneNumbersBasedOnName("Den"))
    }

    fun testSearchPeronBasedOnNumber(){
        kotlin.test.assertEquals("Andrew",books.searchPeronBasedOnNumber("12341"))
        kotlin.test.assertEquals("Den",books.searchPeronBasedOnNumber("123455"))
        kotlin.test.assertEquals("Den",books.searchPeronBasedOnNumber("1444"))
    }
}
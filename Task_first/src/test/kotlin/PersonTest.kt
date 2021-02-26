import junit.framework.TestCase

class PersonTest : TestCase() {
    val man = Person("Den", listOf("123455","1444"))

    fun testTestGetName() {
        kotlin.test.assertEquals("Den",man.getName())
    }

    fun testGetNumberList() {
        kotlin.test.assertEquals(listOf("123455","1444"), man.getNumberList())
    }


    fun testAddNumber() {
        kotlin.test.assertEquals(Person("Den", listOf("123455","1444","122")),man.addNumber("122"))
    }


    fun testRemoveNumber() {
        kotlin.test.assertEquals(Person("Den", listOf("123455")), man.removeNumber("1444"))
    }
}
import org.jetbrains.annotations.NotNull

data class Person(val person_name: String, var phone_numbers: List<String>){
    private var personname: String = person_name
    private var numberList:List<String> = phone_numbers


    // Получить имя
    fun getName(): String {
        return personname
    }

    // Получить номер
    fun getNumberList(): List<String> {
        return numberList
    }

    // Добавить номер
    fun addNumber(number:String): Person {
        var result = Person(person_name = person_name, phone_numbers = phone_numbers + listOf(number))
        return result
    }

    // Удалить номер
    fun removeNumber(number: String): Person {
        var result = Person(person_name = person_name, phone_numbers = phone_numbers - listOf(number))
        return result
    }
}
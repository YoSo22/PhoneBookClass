import org.jetbrains.annotations.NotNull

class Person(@NotNull person_name: String, phone_numbers: List<String>){
    private var personname: String = person_name
    private var numberList = phone_numbers

    // Получить имя
    fun getName(): String {
        return personname
    }

    // Получить номер
    fun getNumberList(): List<String> {
        return numberList
    }

    // Добавить номер
    fun addNumber(number:String) {
        numberList.plus(number)
    }

    // Удалить номер
    fun removeNumber(number: String){
        numberList.minus(number)
    }
}
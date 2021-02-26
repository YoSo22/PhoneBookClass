// Вариант 4 -- телефонная книга [Kotlin]
// Хранит список людей и номеров их телефонов. У каждого человека может быть более
// одного номера телефона.
// Методы: добавление / удаление человека, добавление / удаление телефона для
// заданного человека, поиск номера(ов) телефона по заданному имени человека, поиск
// человека по заданному номеру телефона. Телефон задаётся последовательностью символов из цифр, +, *, #, -.

class PhoneBook(List: MutableList<Person>) {
    private val books = List

    // Добавление человека в книгу
    public fun addPerson(name: String, phoneNumber: String) {
        books.plus(Person(name, listOf(phoneNumber)))
    }

    // Удаление человека из книги
    public fun deletePerson(name: String){
        for(i in books){
            if(i.getName() == name) books.remove(i)
        }

    }

    // Добавление номера для человека
    public fun addPhoneNumber(name: String, phoneNumber: String) {
        for(i in books){
            if(i.getName() == name) i.addNumber(phoneNumber)
        }
    }

    // Удаление номера из книги для человека
    public fun deletePhoneNumber(name: String, phoneNumber: String){
        for(i in books){
            if(i.getName() == name) i.removeNumber(phoneNumber)
        }
    }

    // Поиск номера по человеку
    public fun searchPhoneNumbersBasedOnName(name: String): List<String> {
        var result = emptyList<String>()
        for(i in books){
            if(i.getName() == name) result = i.getNumberList()

        }
        return result
    }

    // Поиск человека по номеру
    public fun searchPeronBasedOnNumber(phoneNumber: String): String? {
        var result: String? = null
        for(i in books){
            if(i.getNumberList().contains(phoneNumber)) result = i.getName()
        }
        return result
    }

}
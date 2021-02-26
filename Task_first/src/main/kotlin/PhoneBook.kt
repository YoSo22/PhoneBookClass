// Вариант 4 -- телефонная книга [Kotlin]
// Хранит список людей и номеров их телефонов. У каждого человека может быть более
// одного номера телефона.
// Методы: добавление / удаление человека, добавление / удаление телефона для
// заданного человека, поиск номера(ов) телефона по заданному имени человека, поиск
// человека по заданному номеру телефона. Телефон задаётся последовательностью символов из цифр, +, *, #, -.

data class PhoneBook (var List: MutableList<Person>) {
    private var books = List

    // Добавление человека в книгу
    public fun addPerson(name: String, phoneNumber: String): MutableList<Person> {
        books.plusAssign(Person(name, listOf(phoneNumber)))
        return books
    }

    // Удаление человека из книги
    public fun deletePerson(name: String): MutableList<Person> {
        var del = Person(null.toString(), emptyList())
        for(i in books){
            if(i.getName() == name) del = i
        }
        books.minusAssign(del)
        return books
    }

    // Добавление номера для человека
    public fun addPhoneNumber(name: String, phoneNumber: String): MutableList<Person> {
        var numb = -1
        var result = books
        for(i in books){
            numb += 1
            if(i.getName() == name) books[numb] = i.addNumber(phoneNumber)
        }

        return books
    }

    // Удаление номера из книги для человека
    public fun deletePhoneNumber(name: String, phoneNumber: String): MutableList<Person> {
        var numb = -1
        for(i in books){
            numb += 1
            if(i.getName() == name) books[numb] = i.removeNumber(phoneNumber)
        }
        return books
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
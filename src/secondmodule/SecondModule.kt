package secondmodule

/**
    Напишите тест на любую тему. Пользователь должен вводить номер варианта из предложенных ответов.
    Придумайте минимум 5 вопросов. Вывод результата тестирования должен происходить через оператор when,
    в виде текстового комментария (прим: «Ваши знания истории на крепкую четверку»).
 */
fun task7() {
    var count: Int = 0
    var answ: String
    var isAnsw1 = false
    var isAnsw2 = false
    var isAnsw3 = false
    var isAnsw4 = false
    var isAnsw5 = false
    println("Давайте начнем наш тест по астрономии")
    while (!isAnsw1) {
        println("Вопрос 1: Как называется галактика в которой мы живем?")
        println("a) Млечный путь")
        println("b) Андромеда")
        println("c) Сигара")
        println("d) Южная Вертушка")
        answ = readLine().toString()
        println("Ваш ответ: $answ")
        when (answ) {
            "a" -> {
                println("Правильно!")
                count++
                isAnsw1 = true
            }
            "b" -> {
                println("Вы не правы...")
                isAnsw1 = true

            }
            "c" -> {
                println("Вы не правы...")
                isAnsw1 = true
            }
            "d" -> {
                println("Вы не правы...")
                isAnsw1 = true
            }
            else -> {
                println("Вы точно на этот вопрос отвечаете? попробуйте еще раз...")
            }
        }
    }

    while (!isAnsw2) {
        println("Вопрос 2: Фобос и Деймос спутники какой планеты?")
        println("a) Юпитер")
        println("b) Марс")
        println("c) Сатурн")
        println("d) Нептун")
        answ = readLine().toString()
        println("Ваш ответ: $answ")
        when (answ) {
            "a" -> {
                println("Вы не правы...")
                isAnsw2 = true
            }
            "b" -> {
                println("Правильно!")
                count++
                isAnsw2 = true

            }
            "c" -> {
                println("Вы не правы...")
                isAnsw2 = true
            }
            "d" -> {
                println("Вы не правы...")
                isAnsw2 = true
            }
            else -> {
                println("Вы точно на этот вопрос отвечаете? попробуйте еще раз...")
            }
        }
    }

    while (!isAnsw3) {
        println("Вопрос 3: У какой планеты есть кольца?")
        println("a) Земля")
        println("b) Меркурий")
        println("c) Нептун")
        println("d) Уран")
        answ = readLine().toString()
        println("Ваш ответ: $answ")
        when (answ) {
            "a" -> {
                println("Вы не правы...")
                isAnsw3 = true
            }
            "b" -> {
                println("Вы не правы...")
                isAnsw3 = true

            }
            "c" -> {
                println("Вы не правы...")
                isAnsw3 = true
            }
            "d" -> {
                println("Правильно!")
                count++
                isAnsw3 = true
            }
            else -> {
                println("Вы точно на этот вопрос отвечаете? попробуйте еще раз...")
            }
        }
    }

    while (!isAnsw4) {
        println("Вопрос 4: На какои спутнике есть жидкий океан?")
        println("a) Луна")
        println("b) Деймос")
        println("c) Титан")
        println("d) Европа")
        answ = readLine().toString()
        println("Ваш ответ: $answ")
        when (answ) {
            "a" -> {
                println("Вы не правы...")
                isAnsw4 = true
            }
            "b" -> {
                println("Вы не правы...")
                isAnsw4 = true

            }
            "c" -> {
                println("Правильно!")
                count++
                isAnsw4 = true
            }
            "d" -> {
                println("Вы не правы...")
                isAnsw4 = true
            }
            else -> {
                println("Вы точно на этот вопрос отвечаете? попробуйте еще раз...")
            }
        }
    }

    while (!isAnsw5) {
        println("Вопрос 5: Кто просрал РосКосмос?")
        println("a) Рогозин")
        println("b) Рогозин")
        println("c) Рогозин")
        println("d) Рогозин")
        answ = readLine().toString()
        println("Ваш ответ: $answ")
        when (answ) {
            "a" -> {
                println("Правильно!")
                count++
                isAnsw5 = true
            }
            "b" -> {
                println("Правильно!")
                count++
                isAnsw5 = true

            }
            "c" -> {
                println("Правильно!")
                count++
                isAnsw5 = true
            }
            "d" -> {
                println("Правильно!")
                count++
                isAnsw5 = true
            }

        }
    }

    when (count) {
        1 -> {
            println("Все очень плохо!!! Открывай учебник, ютуб, википедию и зубри!")
        }
        2 -> {
            println("Неудовлетворительно! Зубри учебник")
        }
        3 -> {
            println("Троечка,так и быть, прошел, но YouTube посмотреть придется..")
        }
        4 -> {
            println("Неплохо, подучить бы дополнительный материал, и прям красота!")
        }
        5 -> {
            println("Отличник, он и в африке отличник! Молодец!")
        }
    }
}

/**
    Напишите программу для расчета дохода по вкладу. Пользователь вводит сумму вклада, длительность вклада (количество месяцев)
    и ежемесячный процент по вкладу. Программа выводит в консоль информацию по каждому месяцу отдельно.
    Информация отображает: на сколько будет увеличиваться вклад в этом месяце и итоговую сумму вклада в данном месяце.
 */
fun task8() {
    var totalSum: Double
    var income: Double
    println("Добро пожаловать в наш Банк!\nВведите сумму желаемого вклада")
    var sum: Int = readLine().toString().toInt()
    totalSum = sum.toDouble()
    println("Хорошо, на какой срок Вы бы хотели оформить вклад?")
    var period: Int = readLine().toString().toInt()
    println("Отлично! А под какой процент Вы бы хотели оформить вклад? В пределах разумного, разумеется...")
    var proc: Int = readLine().toString().toInt()
    println("Итак... Вы офрмляете вклад на сумму $sum рублей под $proc процентов на срок $period месяцев, ознакомьтесь с рассчетом:")
    println("Месяц\tДоход\t\t\tОбщая сумма ")
    for(n in 1..period) {
        income = totalSum * (proc.toDouble()/100)
        totalSum += income
        println("$n\t\t${"%.2f".format(income)}\t\t\t${"%.2f".format(totalSum)}")
    }
}

/**
    Создайте многомерный массив, где в первом массиве хранится названия каких-либо стран,
    в следующем столицы данных стран и в последнем массиве используемая денежная единица.
    Сохраните информацию минимум по 3 странам и выведите в консоль в виде:
    Страна          Столица        Валюта
 */
fun task9() {
    val table: Array<Array<Int>> = Array(3, { Array(5, {0}) })
    var countries: Array<Array<String>> = Array(3,  { Array(3, {"0"})})
    countries[0] = arrayOf("Россия", "Москва", "Рубль")
    countries[1] = arrayOf("Украина", "Киев  ", "Гривна")
    countries[2] = arrayOf("Китай", "Пекин ", "Юань")
    println("Страна\tСтолица\tВалюта")
    for(item in countries){
        for(ite in item){
            print("$ite\t")
        }
        println()
    }
}

/**
    Напишите программу для хранения названия городов. Пользователь может сделать 4 действия:
    - Добавить название города в программу.  
    - Посмотреть в консоли список всех добавленных городов
    - Посмотреть список добавленных городов без повторений
    - Выход из программы
    Для хранения используйте коллекцию типа List.
 */
var cities: ArrayList<String> = arrayListOf()
var isWork = true
fun task10() {
    println("Я Ваш справочник, готов служить Вам, мой повелитель")
    while(isWork){
        println("Какую команду желаете выполнить?")
        println("Список доступных команд:\n1) add - Добавить город\n2) getAll - получить все добавленные записи\n3) getUnical - получить уникальные записи\n4) #quit - завершить работу" )
        var command: String = readLine().toString()
        when(command) {
            "add" -> {
                addCity()
            }
            "getAll" -> {
                getAllCities()
            }
            "getUnical" -> {
                getAllUnicalCity()
            }
            "#quit" -> {
                isWork = false
            }
            else -> {
                println("Команды $command не существует")
            }
        }
    }
}
fun addCity() {
    println("Введите название города:")
    var cityName: String = readLine().toString()
    cities.add(cityName)
}
fun getAllCities() {
    for(city in cities){
        println(city)
    }
}
fun getAllUnicalCity(){
    var citiesSet: MutableSet<String> = mutableSetOf()
    for(city in cities){
        citiesSet.add(city)
    }
    for(city in citiesSet) {
        println(city)
    }
}

/**
    Напишите программу, в которой будет храниться информация по рабочим местам
    (при запуске программа создает несколько  записей).
    Используйте коллекцию map для хранения информации. Номера рабочих мест это ключи коллекции,
    а значение — это ФИО сотрудника, занимающего данное место.
    Добавьте несколько сотрудников в коллекцию и добавьте возможность для пользователя
    узнать кто занимает рабочее месте по его номеру
 */
var workspaces: MutableMap<String, String> = mutableMapOf("A1" to "Jhon Smith", "B1" to "Sara Konor", "C3" to "Bart Simpson")
fun task11() {
    var isWork = true;
    while(isWork){
        println("""Чтобы получить информацию о рабочих местах, введите команду "workspaces"""")
        println("""Чтобы добавить информацию о рабочем месте, введите команду "add"""")
        println("Закончить работу - #quit")
        var command: String = readLine().toString()
        when(command) {
            "add" -> {
                addWorkspace()
            }
            "workspaces" -> {
                getAllWorkspaces()
            }
            "#quit" -> {
                isWork = false
            }
            else -> {
                println("Команды $command не существует")
            }
        }
    }

}
fun addWorkspace() {
    println("Введите номер рабочего места")
    var workspaceNum: String = readLine().toString()
    println("Введите имя сотрудника")
    var employee: String = readLine().toString()
    workspaces.put(workspaceNum, employee)
    println("Запись добавлена")
}
fun getAllWorkspaces() {
    for(workspace in workspaces){
        println("За рабочим местом ${workspace.key} сидит ${workspace.value}")
    }
}
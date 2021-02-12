package exam

import java.io.File

fun example(inputName: String): Int {
    if ("ultimate question" in File(inputName).readText().toLowerCase()) {
        return 42
    }
    throw IllegalStateException()
}

// Пожалуйста добавьте необходимые параметры,
// тип результата, и измените имя функции (Shift+F6)

fun myExamTask(inputName: String, racer: String): String {
    var finalSumm = 0
    var testing = racer
    var time = 0
    var disclamer1 = " "
    var disclamer2 = ", "

    for (lineA in File(inputName).readLines()) {
    println("LINE $lineA")
        if (lineA.contains(Regex("""^(Гран-при)+"""))){
        time += 1}
        if (lineA.contains(Regex("""${testing}+"""))&& time == 1) {
            val perem = lineA.split(disclamer2,disclamer1)
            var pi =perem.lastIndex
            finalSumm += perem[pi].toInt()
            time -= 1
                }

    }

    val final = racer + " " + finalSumm.toString()
    return final
}
/*
Гран-при Австралии
Хэмилтон, Мерседес, 8
Боттас, Мерседес, 6
Леклер, Феррари, 3
Феттель, Феррари, 2
Ферстапен, Ред Булл, 1

Гран-при России
Албон, Ред Булл, 8
Хэмилтон, Мерседес, 5
Феттель, Феррари, 4
Леклер, Феррари, 2
Боттас, Мерседес, 1
*/
// 1 победитесль в град-при
// читать построчно
// если ганд-при то счетчик +1
// поисск имени ( пройти по строчкам)
// если нашел имя то присваивается переменная  в итоге которой будте массив слов [name,mark,number]
// взять число из массива и приплючовать к имеющемуся
//
public fun main()
{
    val exam: Exam = Exam()

    print("Введите имя студента:")
    exam.studentname= readln()

    print("Введите предмет:")
    exam.subject=readln()

    print("Введите дату экзамена:")
    exam.date=readln()

    print("Введите оценку от 0 до 5:")
    exam.estimation=readln().toByte()



    fun getExamInfo() {
        println("Экзамен по "+exam.subject+" будет "+exam.date)
    }
    fun getExamMark() {
        println(exam.studentname+" сдаёт экзамен по "+exam.subject)
    }
    fun getStudentExam() {
        println(exam.studentname+" получает за экзамен "+exam.estimation)
    }

}
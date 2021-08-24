class ProblemC {

    fun main() {

        val n = readInt()
        val inputData: List<Int> = readListInt().sorted()
        var numberOfTasks = 0

        for(i in 1 until n step 2) {
            numberOfTasks += (inputData[i] - inputData[i-1])
        }

        println(numberOfTasks)

    }

}

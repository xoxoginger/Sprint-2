class ProblemA {

    fun main() {
        val numOfQueries = readInt()
        var coordinate = 0L
        var outputData: MutableList<Long> = mutableListOf<Long>()

        for(i in 0 until numOfQueries) {
            val inputData: List<Long> = readListLong()
            val a = inputData[0]
            val b = inputData[1]
            val k = inputData[2]

            coordinate = if(k % 2 == 0L) (a * (k / 2) - b * (k / 2))
                         else (a * ((k + 1) / 2) - b * ((k - 1) / 2))

            outputData.add(coordinate)
        }

        for(i in 0 until numOfQueries)
            println(outputData[i])
    }

}

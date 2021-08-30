class ProblemB {

    fun main() {
        val numOfQueries = readInt()
        var outputData: MutableList<String> = mutableListOf<String>()

        for (i in 0 until numOfQueries) {
            val inputData: List<Int> = readListInt()
            val n = inputData[0]
            val k = inputData[1]
            val charCode = 'a'.code //toByte().toInt()
            var charCounter = 0
            var str = ""

            for (j in 0 until n) {
                str += (charCode + charCounter).toChar()
                if (charCounter < k - 1)
                    charCounter++
                else
                    charCounter = 0
            }
            outputData.add(str)
        }

        for(i in 0 until numOfQueries)
            println(outputData[i])
    }

}

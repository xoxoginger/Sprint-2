class ProblemD {

    fun main() {

        val numOfQueries = readInt()
    for(i in 0 until numOfQueries) {
        val numberOfClients = readInt()
        val inputData: List<Long> = readListLong()
        var m = 0L

        for(j in 0 until numberOfClients) {
            var tempM = 0L
            for(k in 0 until numberOfClients) {
                if(inputData[k] >= inputData[j])
                    tempM += inputData[j]
            }
            if(m < tempM)
                m = tempM
        }
        println(m)
    }


    }

}

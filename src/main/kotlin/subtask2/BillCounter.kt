package subtask2

class BillCounter {

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var sum=0
        var answer="Bon Appetit"
        for (i in bill.indices)
            if (i!=k)
                sum+=bill[i]
        if (sum/2!=b)
            answer= (b-sum/2).toString()
        return answer
    }
}

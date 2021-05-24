package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        var happyList=mutableListOf<Int>()
        for (i in sadArray)
            happyList.add(i)
        var x=0
        while (x==0) {
            happyList=sadToHappy( happyList)
            x=checkIfHappy(happyList)
        }

        val happyArray= IntArray(happyList.size)
        for (i in happyArray.indices)
            happyArray[i]=happyList[i]
        return happyArray
    }

    private fun checkIfHappy(happyList: MutableList<Int>):Int {

        for (i in happyList.indices)
            if (i != 0 && i != happyList.size - 1)
                if (happyList[i - 1] + happyList[i + 1] < happyList[i])
                    return 0
        return 1
    }

    private fun sadToHappy( sadArray: MutableList<Int>): MutableList<Int> {
        var happyList = mutableListOf<Int>()
        for (i in sadArray.indices) {
            if (i != 0 && i != sadArray.size - 1) {

                if (sadArray[i - 1] + sadArray[i + 1] > sadArray[i])
                    happyList.add(sadArray[i])
            } else happyList.add(sadArray[i])
        }
        return happyList
    }
}

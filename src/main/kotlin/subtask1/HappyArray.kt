package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        var happyList = sadArray.toMutableList()
        var condition = 0
        while (condition == 0) {
            happyList = sadToHappy(happyList)
            condition = checkIfHappy(happyList)
        }

        return happyList.toIntArray()
    }

    private fun checkIfHappy(happyList: MutableList<Int>):Int {

        for (i in happyList.indices)
            if (i != 0 && i != happyList.size - 1)
                if (happyList[i - 1] + happyList[i + 1] < happyList[i])
                    return 0
        return 1
    }

    private fun sadToHappy( sadArray: MutableList<Int>): MutableList<Int> {
        val happyList = mutableListOf<Int>()
        for (i in sadArray.indices) {
            if (i != 0 && i != sadArray.size - 1) {
                if (sadArray[i - 1] + sadArray[i + 1] > sadArray[i])
                    happyList.add(sadArray[i])
            }
            else happyList.add(sadArray[i])
        }
        return happyList
    }
}

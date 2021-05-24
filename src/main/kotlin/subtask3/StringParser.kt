package subtask3

class StringParser {

    fun getResult(inputString: String): Array<String> {
        var str: String
        val resultList = mutableListOf<String>()
        for (i in inputString.indices) {
            when (inputString[i]) {
                '<' -> {
                    var count = 0
                    str = inputString.substring(i + 1)
                    for (j in str.indices) {
                        if (str[j] == '<') count++
                        if (str[j] == '>' && count == 0) {
                            resultList.add(str.substring(0, j))
                            break
                        } else if (str[j] == '>' && count > 0) count--
                    }
                }

                '(' -> {
                    var count = 0
                    str = inputString.substring(i + 1)
                    for (j in str.indices) {
                        if (str[j] == '(') count++
                        if (str[j] == ')' && count == 0) {
                            resultList.add(str.substring(0, j))
                            break
                        } else if (str[j] == ')' && count > 0) count--
                    }
                }
                '[' -> {
                    var count = 0
                    str = inputString.substring(i + 1)
                    for (j in str.indices) {
                        if (str[j] == '[') count++
                        if (str[j] == ']' && count == 0) {
                            resultList.add(str.substring(0, j))
                            break
                        } else if (str[j] == '[' && count > 0) count--
                    }
                }
            }
        }
        return resultList.toTypedArray()
    }
}

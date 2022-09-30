fun summator(map: Map<Int, Int>): Int {
    var total = 0
    for (sum in map) {
        if (sum.key % 2 == 0) {
            total += sum.value
        }
    }
    return total
}
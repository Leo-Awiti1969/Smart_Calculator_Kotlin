fun containsKeyAndValue(map: Map<String, String>, value: String): Boolean {
    var result = false
    for (ma in map) {
        result = ma.key != value && ma.value != value
    }
    return result
}
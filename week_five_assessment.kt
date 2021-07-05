fun main() {
    skipVowel("It was an ecstatic victory for the blues yesterday")
}

fun skipVowel(words: String) {
    for (char in words) {
        if (char == 'a'
            || char == 'A'
            || char == 'e'
            || char == 'E'
            || char == 'i'
            || char == 'I'
            || char == 'o'
            || char == 'O'
            || char == 'u'
            || char == 'U'
        ) {
            continue
        }
        print(char)
    }
}

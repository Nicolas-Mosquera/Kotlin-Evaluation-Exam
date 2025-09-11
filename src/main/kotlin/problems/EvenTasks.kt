// src/main/kotlin/problems/EvenTasks.kt
package problems

object EvenTasks {

    /**
     * TODO
     * Cuenta cuántas vocales (a, e, i, o, u) hay en el texto, sin distinguir mayúsculas.
     * No cuenta vocales acentuadas para mantenerlo simple (á, é, í, ó, ú no se consideran).
     * Ejemplos:
     *  - countVowels("Hola") -> 2
     *  - countVowels("") -> 0
     */
    fun countVowels(text: String): Int {
        val vowels = setOf('a', 'e', 'i', 'o', 'u')
        return text.lowercase().count { it in vowels }
        //return -1
    }

    /**
     * TODO
     * Determina si una palabra/frase es palíndromo ignorando mayúsculas y
     * caracteres no alfanuméricos (espacios, signos, etc.).
     * Ejemplos:
     *  - isPalindrome("reconocer") -> true
     *  - isPalindrome("Anita lava la tina") -> true
     *  - isPalindrome("kotlin") -> false
     */
    fun isPalindrome(word: String): Boolean {
        val cleaned = word.lowercase().filter { it.isLetterOrDigit() }
        return cleaned == cleaned.reversed()
        //return false
    }
}

package br.com.christian.developersplace.util

fun <T : Any, R> T?.notNull(f: (it: T) -> R): R? {
    if (this != null) return f(this)
    return null
}

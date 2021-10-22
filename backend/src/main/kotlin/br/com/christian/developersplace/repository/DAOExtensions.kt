package br.com.christian.developersplace.repository

inline fun <reified T> DAO.getReference(id: Any): T {
    return getReference(T::class.java, id)
}

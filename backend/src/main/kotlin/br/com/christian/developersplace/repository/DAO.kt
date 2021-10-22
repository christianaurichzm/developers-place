package br.com.christian.developersplace.repository

import com.querydsl.jpa.impl.JPAQueryFactory
import org.springframework.stereotype.Repository
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@Repository
class DAO {

    @PersistenceContext
    private lateinit var em: EntityManager

    fun <E> find(clazz: Class<E>, id: Any): E {
        return this.em.find(clazz, id)
    }

    fun persist(entity: Any) {
        this.em.persist(entity)
    }

    fun queryFactory(): JPAQueryFactory {
        return JPAQueryFactory(this.em)
    }
}

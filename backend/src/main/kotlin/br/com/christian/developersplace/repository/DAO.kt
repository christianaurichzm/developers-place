package br.com.christian.developersplace.repository

import com.querydsl.jpa.impl.JPAQueryFactory
import org.springframework.stereotype.Repository
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@Repository
class DAO {

    @PersistenceContext
    private lateinit var entityManager: EntityManager

    fun queryFactory(): JPAQueryFactory {
        return JPAQueryFactory(entityManager)
    }

}

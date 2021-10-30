package br.com.christian.developersplace.command

import br.com.christian.developersplace.graphql.input.DeveloperQueryInput
import br.com.christian.developersplace.model.Developer
import br.com.christian.developersplace.model.QDeveloper.developer
import br.com.christian.developersplace.repository.DAO
import br.com.christian.developersplace.util.notNull
import com.querydsl.jpa.impl.JPAQuery
import org.springframework.stereotype.Repository

@Repository
class DevelopersQuery(private val dao: DAO) {

    fun execute(input: DeveloperQueryInput): List<Developer> {
        val query: JPAQuery<Developer> = this.dao.queryFactory().selectFrom(developer)

        input.name.notNull {
            query.where(developer.name.containsIgnoreCase(it))
        }

        return query.fetch()
    }
}
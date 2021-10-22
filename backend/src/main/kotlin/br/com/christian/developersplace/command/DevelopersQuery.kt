package br.com.christian.developersplace.command

import br.com.christian.developersplace.graphql.input.DeveloperQueryInput
import br.com.christian.developersplace.model.Developer
import br.com.christian.developersplace.model.QDeveloper.developer
import br.com.christian.developersplace.repository.DAO
import org.springframework.stereotype.Repository

@Repository
class DevelopersQuery(private val dao: DAO) {

    fun execute(input: DeveloperQueryInput): List<Developer> {
        return this.dao.queryFactory()
            .selectFrom(developer)
            .where(developer.name.containsIgnoreCase(input.name))
            .fetch()
    }
}
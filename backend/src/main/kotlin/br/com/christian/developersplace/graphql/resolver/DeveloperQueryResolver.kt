package br.com.christian.developersplace.graphql.resolver

import br.com.christian.developersplace.model.Developer
import br.com.christian.developersplace.service.DeveloperService
import graphql.kickstart.tools.GraphQLQueryResolver
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class DeveloperQueryResolver : GraphQLQueryResolver {

    @Autowired
    lateinit var developerService: DeveloperService

    fun developers(): List<Developer> {
        return developerService.getDevelopers()
    }
}
package br.com.christian.developersplace.resolver

import br.com.christian.developersplace.service.DeveloperService
import br.com.christian.developersplace.model.Developer
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
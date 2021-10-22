package br.com.christian.developersplace.graphql.resolver

import br.com.christian.developersplace.graphql.input.DeveloperInput
import br.com.christian.developersplace.model.Developer
import br.com.christian.developersplace.service.DeveloperService
import graphql.kickstart.tools.GraphQLMutationResolver
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
class DeveloperMutationResolver : GraphQLMutationResolver {

    @Autowired
    lateinit var developerService: DeveloperService

    @Transactional
    fun saveDeveloper(input: DeveloperInput): Developer {
        return developerService.setDeveloper(input)
    }
}
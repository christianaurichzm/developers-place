package br.com.christian.developersplace.service

import br.com.christian.developersplace.command.DeveloperSave
import br.com.christian.developersplace.command.DevelopersQuery
import br.com.christian.developersplace.graphql.input.DeveloperInput
import br.com.christian.developersplace.model.Developer
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
class DeveloperService(private val developersQuery: DevelopersQuery, private val developerSave: DeveloperSave) {

    fun getDevelopers(): List<Developer> {
        return developersQuery.execute()
    }

    @Transactional
    fun setDeveloper(input: DeveloperInput): Developer {
        return developerSave.execute(input)
    }
}
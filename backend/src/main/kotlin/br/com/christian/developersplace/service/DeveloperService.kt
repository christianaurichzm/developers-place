package br.com.christian.developersplace.service

import br.com.christian.developersplace.command.DevelopersQuery
import br.com.christian.developersplace.model.Developer
import org.springframework.stereotype.Component

@Component
class DeveloperService(private val developersQuery: DevelopersQuery) {

    fun getDevelopers(): List<Developer> {
        return developersQuery.execute()
    }

}
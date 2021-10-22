package br.com.christian.developersplace.command

import br.com.christian.developersplace.graphql.input.DeveloperInput
import br.com.christian.developersplace.model.Developer
import br.com.christian.developersplace.repository.DAO
import org.springframework.stereotype.Repository

@Repository
class DeveloperSave(private val dao: DAO) {

    fun execute(input: DeveloperInput): Developer {
        val developer = Developer()
        developer.name = input.name
        this.dao.persist(developer)
        return developer
    }
}
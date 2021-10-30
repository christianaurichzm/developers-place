package br.com.christian.developersplace.command

import br.com.christian.developersplace.graphql.input.DeveloperInput
import br.com.christian.developersplace.model.Developer
import br.com.christian.developersplace.repository.DAO
import br.com.christian.developersplace.repository.getReference
import br.com.christian.developersplace.util.notNull
import org.springframework.stereotype.Repository

@Repository
class DeveloperSave(private val dao: DAO) {

    fun execute(input: DeveloperInput): Developer {
        val developer = input.id.notNull {
            this.dao.getReference<Developer>(it)
        } ?: Developer()

        input.name.notNull {
            developer.name = it
        }

        this.dao.persist(developer)

        return developer
    }
}
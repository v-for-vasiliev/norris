package io.dotanuki.demos.norris

import io.dotanuki.demos.norris.di.applicationModule
import io.dotanuki.norris.domain.di.restInfrastructureModule
import io.dotanuki.norris.facts.di.factsModule
import org.kodein.di.conf.ConfigurableKodein

object DependenciesSetup {

    val container by lazy {
        ConfigurableKodein(mutable = true).apply {
            modules.forEach { addImport(it) }
        }
    }

    private val modules = listOf(
        applicationModule,
        restInfrastructureModule,
        factsModule
    )
}
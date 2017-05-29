package com.github.mrrobbins.pluralsight.kotlindemo.provider

import java.security.Security

data class ProviderDetails(val providerName: String, val name: String)

class Providers {

    fun getProviders() = Security.getProviders().toList();

    fun getAllProviderDetails(filter: String): List<ProviderDetails> {
        return Security.getProviders().flatMap {
            provider ->
            provider.entries
                    .filter { it.key.toString().contains(filter, true) }
                    .map { ProviderDetails(provider.name, it.key.toString()) }
        }

    }

    fun getAllProviderDetailsFirstAttempt(filter: String): List<ProviderDetails> {
        val providers = Security.getProviders();
        val listOfProviders = mutableListOf<ProviderDetails>()

        providers.forEach {
            provider ->
            val providerDetailsList = provider.entries
                    .filter { it.key.toString().contains(filter, true) }
                    .map { ProviderDetails(provider.name, it.key.toString()) }
            listOfProviders += providerDetailsList
        }

        return listOfProviders
    }

    // similar convention to javacode static methods
    companion object {
        fun getProviders() = Security.getProviders().toList();
    }
}

fun main(args: Array<String>) {
    val providers = Providers()
    val details = providers.getAllProviderDetails("Random")

    details.forEach { println(it) }
}
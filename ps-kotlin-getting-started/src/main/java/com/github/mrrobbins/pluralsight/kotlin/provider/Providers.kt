package com.github.mrrobbins.pluralsight.kotlin.provider

import java.security.Security


class Providers {

    fun getProviders() = Security.getProviders().toList();

    // similar convention to java static methods
    companion object {
        fun getProviders() = Security.getProviders().toList();
    }
}
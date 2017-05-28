package com.github.mrrobbins.pluralsight.kotlin

import java.security.Security

fun getProviders() = Security.getProviders().toList();
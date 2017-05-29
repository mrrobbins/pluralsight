import com.github.mrrobbins.pluralsight.kotlin.provider.Providers
import java.security.Provider

fun main(args: Array<String>) {
    val programmer = "Matt"
    println("hello $programmer! Let's run some kotlin code...\n")

    listProviders(Providers().getProviders()) // instance method call

    listProviders(Providers.getProviders()) // companion object method call

    // using biconsumer lambda
    listAllProviders {
        key, value ->
        println("\t---- $key: $value")
    }
}

private fun listProviders(providers: List<Provider>) {
    println("Java Security Providers:")
    providers.forEach({ provider -> println(provider.name); provider.forEach({ key, value -> println("\t $key: $value") }) })
}

fun listAllProviders(fn: (String, String) -> Unit) {
    val allProviders = Providers.getProviders()

    for (provider in allProviders) {
        println(provider.name)
        provider.forEach { key, value -> fn(key.toString(), value.toString()) }
    }
}


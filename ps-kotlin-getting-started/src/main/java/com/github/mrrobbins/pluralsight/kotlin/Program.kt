import com.github.mrrobbins.pluralsight.kotlin.provider.Providers
import java.security.Provider

fun main(args: Array<String>) {
    val programmer = "Matt";
    println("hello $programmer! Let's run some kotlin code...\n")

    listProviders(Providers().getProviders()) // instance method call

    listProviders(Providers.getProviders()); // companion object method call
}

private fun listProviders(providers: List<Provider>) {
    println("Java Security Providers:")
    providers.forEach({ provider -> println(provider.name); provider.forEach({ key, value -> println("\t $key: $value") }) })
}


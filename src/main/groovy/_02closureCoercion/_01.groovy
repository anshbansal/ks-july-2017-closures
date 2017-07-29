package _02closureCoercion
// if you have something which has single abstract method (SAM) their instance could be created via closures
interface Predicate<T> {
    boolean accept(T obj)
}

abstract class Greeter {
    abstract String getName()
    void greet() {
        println "Hello, $name"
    }
}

Predicate filter = { String it -> it.contains 'G' } as Predicate
assert filter.accept('Groovy')

Greeter greeter = { 'Groovy' } as Greeter
greeter.greet()
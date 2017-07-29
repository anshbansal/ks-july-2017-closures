package _02closureCoercion
//The as operator is actually optional so below ones work
Predicate filter = { String it -> it.contains 'G' }
assert filter.accept('Groovy')

Greeter greeter = { 'Groovy' }
greeter.greet()
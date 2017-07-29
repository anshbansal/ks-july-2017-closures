package _02closureCoercion
// It means that you can create an instance of a abstract class with
// the one missing method replaced with method from another class or a static method

static boolean doFilter(String s) { s.contains('G') }

//Hopefully everyone knows what .& does. Right?
Predicate filter = this.&doFilter
assert filter.accept('Groovy')

Greeter greeter = GroovySystem.&getVersion
greeter.greet()

package _02closureCoercion
// In addition to SAM types, a closure can be coerced to any type and in particular interfaces.
// Let’s define the following interface:

interface FooBar {
    int foo()
    void bar()
}

def impl = { println 'ok'; 123 } as FooBar

assert impl.foo() == 123
println impl.bar()
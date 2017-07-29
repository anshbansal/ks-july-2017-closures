package _02closureCoercion
// But it is also possible to coerce a closure to any class.
// For example, we can replace the interface that we defined with class without changing the assertions:

class FooBar2 {
    int foo() { 1 }
    void bar() { println 'bar' }
}

def impl = { println 'ok'; 123 } as FooBar2

assert impl.foo() == 123
println impl.bar()
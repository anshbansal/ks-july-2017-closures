package _01defineAndUseClosures

//you don't have to give types to the parameters just like groovy
Closure<?> withoutTypes = { a, b ->
    a + b
}
println(withoutTypes(2, 3))
println(withoutTypes("aseem", "bansal"))
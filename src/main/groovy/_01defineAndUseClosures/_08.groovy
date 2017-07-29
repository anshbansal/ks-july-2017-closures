package _01defineAndUseClosures

Closure<Integer> multiplier = { Integer a, Integer b ->
    a * b
}

//Closures can access the variables from the scope where they were defined
Closure<Integer> secretFormula = { int a, int b ->
    //multiplier was defined outside the closure secretFormula
    // but in the same scope so we can use them
    multiplier(a, b) + multiplier(a, 2 * b)
}
println(secretFormula(2, 3))
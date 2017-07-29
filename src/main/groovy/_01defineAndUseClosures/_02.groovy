package _01defineAndUseClosures

//let's see another example
Closure<Integer> multiplier = { Integer a, Integer b ->
    a * b
}

println(multiplier(7, 3))
package _01defineAndUseClosures

//A block of code that you can use just like a method
Closure<Integer> adder = { Integer a, Integer b ->
    a + b
}

println(adder(7, 3))
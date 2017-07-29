package _01defineAndUseClosures

Closure<Integer> adder = { Integer a, Integer b ->
    a + b
}

//you may sometimes see this happening too.
// So closures have a call method. actually more than 1 call method
println(adder.call(2, 3))
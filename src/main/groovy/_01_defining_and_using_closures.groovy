
//A block of code that you can use just like a method
Closure<Integer> adder = { Integer a, Integer b ->
    a + b
}

println(adder(7, 3))
println("*" * 30)



//let's see another example
Closure<Integer> multiplier = { Integer a, Integer b ->
    a * b
}

println(multiplier(7, 3))
println("*" * 30)



//if you don't define any parameters you get a implicit parameter
Closure<?> returner = {
    it
}

println(returner(23))
println(returner("Aseem"))
println("*" * 30)



//but if you do this then you won't get the implicit parameter
Closure<?> noParameter = { ->
    98
}

println(noParameter())
println("*" * 30)



//you don't have to give types to the parameters just like groovy
Closure<?> withoutTypes = { a, b ->
    a + b
}
println(withoutTypes(2, 3))
println(withoutTypes("aseem", "bansal"))
println("*" * 30)



//we can use closures without setting it to a variable
//so we generally use anonymous closures (I made up this term just now so if you search don't expect to find articles on anonymous closures)
List<Integer> list = [1, 2, 3, 4, -1, 5, 6, 7]

println list.takeWhile { it > 0 }
println("*" * 30)



//but then when would should you set closure to be a variable?
// when it is reusable like the above one
Closure<Boolean> isPositive = { it > 0 }

println list.takeWhile(isPositive)
println list.findAll(isPositive)
println list.dropWhile(isPositive)
println("*" * 30)
//See good reuse?



//The above brings us to a major point
// Closures can be passed as arguments to other methods, closures
// Saw that above?
// let's see it once again

//isPositive has been passed as a parameter
println list.findAll(isPositive)
println("*" * 30)



//Closures can access the variables from the scope where they were defined
Closure<Integer> secretFormula = { int a, int b ->
    //multiplier was defined outside the closure secretFormula
    // but in the same scope so we can use them
    multiplier(a, b) + multiplier(a, 2 * b)
}
println(secretFormula(2, 3))
println("*" * 30)





//you may sometimes see this happening too.
// So closures have a call method. actually more than 1 call method
println(adder.call(2, 3))
println("*" * 30)




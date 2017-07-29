package _01defineAndUseClosures

List<Integer> list = [1, 2, 3, 4, -1, 5, 6, 7]
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
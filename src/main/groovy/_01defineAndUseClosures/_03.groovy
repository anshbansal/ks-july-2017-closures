package _01defineAndUseClosures

//if you don't define any parameters you get a implicit parameter
Closure<?> returner = {
    it
}

println(returner(23))
println(returner("Aseem"))
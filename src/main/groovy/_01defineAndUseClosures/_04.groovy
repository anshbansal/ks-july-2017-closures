package _01defineAndUseClosures

//but if you do this then you won't get the implicit parameter
Closure<?> noParameter = { ->
    98
}

println(noParameter())
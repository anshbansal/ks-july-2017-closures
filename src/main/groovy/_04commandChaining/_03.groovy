package _04commandChaining

// how is this related to closures?
// you can use command chaining with closures to make some DSLs

show = {println it}
square_root = {Math.sqrt(it)}
cube = { Number n ->
    n ** 3
}

def please(action) {

    [the: {what ->
        [of: {n -> action(what(n))}]
    }]
}


please show the square_root of 100
please show the cube of 100
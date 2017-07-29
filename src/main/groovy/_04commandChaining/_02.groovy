package _04commandChaining


// DSL back stuff - will be filled with domain rules
class Then {
    Then then(def direction) {
        new Then()
    }
}

Then turn(def direction) {
    new Then()
}

def left = {}
def right = {}


//Using DSL
// equivalent to: turn(left).then(right)
turn left then right


/*
// equivalent to: take(2.pills).of(chloroquinine).after(6.hours)
take 2.pills of chloroquinine after 6.hours

// equivalent to: paint(wall).with(red, green).and(yellow)
paint wall with red, green and yellow

// with named parameters too
// equivalent to: check(that: margarita).tastes(good)
check that: margarita tastes good

// with closures as parameters
// equivalent to: given({}).when({}).then({})
given { } when { } then { }
*/
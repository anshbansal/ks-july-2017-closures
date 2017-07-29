package _03closureDelgationCreateDSL

class Person {
    String name
}
class Thing {
    String name
}

def p = new Person(name: 'Norman')
def t = new Thing(name: 'Teapot')

def upperCasedName = { delegate.name.toUpperCase() }

upperCasedName.delegate = p
//upperCasedName.delegate = t
println(upperCasedName())


/*

//Not very different from having a local variable, right? No as delegate need not be a local variable

def target = p
def upperCasedNameUsingVar = { target.name.toUpperCase() }
assert upperCasedNameUsingVar() == 'NORMAN'
*/

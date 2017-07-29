package _03closureDelgationCreateDSL

class Person2 {
    String name
    def pretty = { "My name is $name" }

}
class Thing2 {
    String name
}

def p = new Person2(name: 'Sarah')
def t = new Thing2(name: 'Teapot')

assert p.pretty() == 'My name is Sarah'
p.pretty.delegate = t
assert p.pretty() == 'My name is Sarah'

p.pretty.resolveStrategy = Closure.DELEGATE_FIRST
assert p.toString() == 'My name is Teapot'

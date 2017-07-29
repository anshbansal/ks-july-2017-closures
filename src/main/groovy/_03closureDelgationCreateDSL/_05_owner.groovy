package _03closureDelgationCreateDSL

class EnclosedInInnerClass2 {
    class Inner2 {
        Closure cl = {owner}
    }

    void run() {
        def inner = new Inner2()
        assert inner.cl() == inner
    }
}

new EnclosedInInnerClass2().run()
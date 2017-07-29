package _03closureDelgationCreateDSL

class EnclosedInInnerClass {
    class Inner {
        Closure cl = {this}
    }

    void run() {
        def inner = new Inner()
        assert inner.cl() == inner
    }
}

new EnclosedInInnerClass().run()
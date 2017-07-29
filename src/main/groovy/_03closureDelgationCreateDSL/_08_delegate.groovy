package _03closureDelgationCreateDSL

class EnclosedInInnerClass3 {
    class Inner3 {
        Closure cl = {delegate}
    }

    void run() {
        def inner = new Inner3()
        assert inner.cl() == inner
    }
}

new EnclosedInInnerClass3().run()
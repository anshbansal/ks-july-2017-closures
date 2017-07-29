package _03closureDelgationCreateDSL
//owner is similar to this except it returns the direct enclosing object - class or closure

class Enclosing2 {
    void run() {
        //Just changed this with owner and the method with corresponding owner method
        def whatIsThisObject = { getOwner() }
        assert whatIsThisObject() == this

        Closure whatIsThis = { owner }
        assert whatIsThis() == this
    }
}

new Enclosing2().run()
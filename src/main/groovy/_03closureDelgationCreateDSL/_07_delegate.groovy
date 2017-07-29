package _03closureDelgationCreateDSL
//this/owner specify where it is defined while delegate is user defined

class Enclosing3 {
    void run() {
        //Just changed this with owner and the method with corresponding owner method
        def whatIsThisObject = { getDelegate() }
        assert whatIsThisObject() == this

        Closure whatIsThis = { delegate }
        assert whatIsThis() == this
    }
}

new Enclosing3().run()
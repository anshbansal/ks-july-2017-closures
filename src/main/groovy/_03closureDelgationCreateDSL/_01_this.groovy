package _03closureDelgationCreateDSL
/*
We are going to understand difference between this, owner and delegate in various scopes
- Inside a class
- Inside a nested class
- Inside another closure

Usually people say Closure is lambda there are differences
As we proceed we will see some of the differences between lambda/closure also
 */

class Enclosing {
    void run() {
        //Closure has instance methods while lambda does not
        def whatIsThisObject = { getThisObject() }
        assert whatIsThisObject() == this

        Closure whatIsThis = { this }
        assert whatIsThis() == this
    }
}

new Enclosing().run()
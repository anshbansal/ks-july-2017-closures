package _03closureDelgationCreateDSL

class NestedClosures {
    void run() {
        def nestedClosures = {
            def cl = {this}
            cl()
        }
        assert nestedClosures() == this
    }
}

new NestedClosures().run()
package _03closureDelgationCreateDSL

class NestedClosures2 {
    void run() {
        def nestedClosures = {
            def cl = {owner}
            cl()
        }
        assert nestedClosures() == nestedClosures
    }
}

new NestedClosures2().run()
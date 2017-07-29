package _03closureDelgationCreateDSL

class NestedClosures3 {
    void run() {
        def enclosed = {
            { -> delegate }.call() //What will be the owner this closure?
        }
        assert enclosed() == enclosed //Same as owner
    }
}

new NestedClosures3().run()
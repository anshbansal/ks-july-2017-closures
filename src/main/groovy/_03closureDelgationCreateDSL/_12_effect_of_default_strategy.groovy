package _03closureDelgationCreateDSL

Closure doStuff = {
    int a = it * 2;

    Closure print = {
        println a
    }
    return print
}

print(doStuff(23).owner)


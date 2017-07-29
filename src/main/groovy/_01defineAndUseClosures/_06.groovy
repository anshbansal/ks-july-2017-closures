package _01defineAndUseClosures

//we can use closures without setting it to a variable
//so we generally use anonymous closures (I made up this term just now so if you search don't expect to find articles on anonymous closures)
List<Integer> list = [1, 2, 3, 4, -1, 5, 6, 7]

println list.takeWhile { it > 0 }
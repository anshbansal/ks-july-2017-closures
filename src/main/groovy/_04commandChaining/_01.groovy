package _04commandChaining

// you don't have to use brackets everywhere in groovy

int add(int a, int b) {
    a + b
}

//this is same as add(2, 3)
int c = add 2, 3

println(c)
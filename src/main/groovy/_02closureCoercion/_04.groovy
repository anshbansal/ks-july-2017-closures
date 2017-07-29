package _02closureCoercion
//We can thus use closures wherever you have SAM as method parameters
public <T> List<T> filter(List<T> source, Predicate<T> predicate) {
    source.findAll { predicate.accept(it) }
}

assert filter(['Java','Groovy'], { it.contains 'G'}) == ['Groovy']


// When would you see so many things with single abstract methods?
// Java 8 - A whole lot of them actually. See the below
// https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
// So we can use closure wherever we can use lambdas in Java 8

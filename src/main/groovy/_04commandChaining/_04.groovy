package _04commandChaining

import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.Future
import java.util.concurrent.TimeUnit

//another example

Closure show = {
    println "** $it"
}

class Response {
    String text
    void and(action) {
        action(text)
    }
}

Response hit(String url) {
    new Response(text: url.toURL().text)
}

def parallel(int number, Closure closure) {
    ExecutorService executorService = Executors.newFixedThreadPool(number)
    List<Future> futures =  []
    number.times {
        futures << executorService.submit(closure)
    }
    futures.each { future ->
        future.get(10, TimeUnit.SECONDS)
    }
    executorService.shutdown()
}


//you write the files above once only based on your requirements
// and then just write things like the below

parallel 10, {
    hit "http://www.google.com" and show
}


// if you have used gradle this is one way that type of DSLs can be created
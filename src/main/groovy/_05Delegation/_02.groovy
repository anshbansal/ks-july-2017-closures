package _05Delegation

class BodySpec2 {
    void p(String paragraph) {
        println "p: $paragraph"
    }
}

class EmailSpec2 {
    void from(String from) { println "From: $from"}
    void to(String... to) { println "To: $to"}
    void subject(String subject) { println "Subject: $subject"}
    void body(@DelegatesTo(strategy=Closure.DELEGATE_ONLY, value=BodySpec2) Closure body) {
        def bodySpec = new BodySpec()
        def code = body.rehydrate(bodySpec, this, this)
        code.resolveStrategy = Closure.DELEGATE_ONLY
        code()
    }
}


def email(@DelegatesTo(strategy=Closure.DELEGATE_ONLY, value=EmailSpec2) Closure cl) {
    def email = new EmailSpec2()
    def code = cl.rehydrate(email, this, this)
    code.resolveStrategy = Closure.DELEGATE_ONLY
    code()
}


void sendEmail() {
    email {
        from 'dsl-guru@mycompany.com'
        to 'john.doe@waitaminute.com'
        subject 'The pope has resigned!'
        body {
            p 'Really, the pope has resigned!'
        }
    }
}

sendEmail()

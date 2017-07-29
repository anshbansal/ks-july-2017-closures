package _03closureDelgationCreateDSL
/*
Taken and improved from
    https://github.com/anshbansal/intellimeet-nov/blob/master/src/main/groovy/com/ttnd/im/Demo02_Closure_Delegate.groovy
 */

public class Validations {
    private Closure delegatedBy
    List<String> errors = []

    Validations(delegatedBy) {
        this.delegatedBy = delegatedBy
    }

    private <T> T getValueByName(String name) {
        (T) delegatedBy.owner."$name"
    }

    private void minConstraint(Map rangeMap, String name) {
        if (!rangeMap.min) {
            return
        }
        int propertyValue = getValueByName(name)
        int min = rangeMap.min
        if (propertyValue < min) {
            errors.add("$name is less than $min")
        }
    }

    private void maxConstraint(Map rangeMap, String name) {
        if (!rangeMap.max) {
            return
        }
        int propertyValue = getValueByName(name)
        int max = rangeMap.max
        if (propertyValue > max) {
            errors.add("$name is greater than $max")
        }

    }

    def methodMissing(String name, args) {

        println("${name}, ${args}")

        Map rangeMap = args[0]
        minConstraint(rangeMap, name)
        maxConstraint(rangeMap, name)
    }

    boolean isValid() {
        delegatedBy()
        errors.size() == 0
    }
}

public trait ConstraintValidatable {
    private Validations validations = _getValidations(constraints)

    static Validations _getValidations(Closure constraints) {
        Validations validations = new Validations(constraints)
        constraints.delegate = validations
        constraints.resolveStrategy = Closure.DELEGATE_FIRST
        return validations
    }

    boolean isValid() {
        constraints.isValid()
    }

    List<String> getErrors() {
        constraints.getErrors()
    }
}

class ClosureHuman1 implements ConstraintValidatable {
    int age
    int salary

    def constraints = {
        age max: 23, min: 5
        salary max: 10000
    }
}


ClosureHuman1 human1 = new ClosureHuman1(
        age: 23,
        salary: 10000
)
println human1.isValid()
println human1.errors

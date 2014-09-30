package grails.play

class Employee extends Person {
    String employeeNumber
    String companyName
    static mapping = {
        discriminator value: '42', type: 'integer', column: 'type'
//        formula: - some sql expression to evaluate value
    }
}
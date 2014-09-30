package grails.play

class Engine {
    String manufacturer
    Integer numberOfCylinders

//    static belongsTo = [car: Car] // foreign key will be added to engine table
    // also means cascade deletes. Car is deleted -> engine will also be deleted

    static constraints = {
    }
}

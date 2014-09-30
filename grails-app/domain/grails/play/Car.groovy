package grails.play

class Car {

    String make
    String model
//    Engine engine

    static hasOne = [engine: Engine] // foreign key will be in engine table
//    if commented, there will not be created indexes/constraints for engine. only foreign key

//    static embedded = ['engine'] // adds all the fields from engine to car table.
// But it also created engine table. I switched off the hasOne option

    static constraints = {
    }
}

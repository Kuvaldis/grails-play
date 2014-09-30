package grails.play

class Artist {

    String name

    static hasMany = [albums: Album, instruments: Instrument]

    static constraints = {
    }
}

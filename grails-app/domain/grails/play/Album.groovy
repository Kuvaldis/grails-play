package grails.play

class Album {

    String title
    static hasMany = [songs: Song]

    static constraints = {
    }
}

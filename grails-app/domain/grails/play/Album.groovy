package grails.play

class Album {

    String title
    static hasMany = [songs: Song]
    static belongsTo = [artist: Artist]

    static mapping = {
        songs cascade: 'delete'
        /*
        can be all, merge, save-update,
delete, lock, refresh, evict, replicate, and all-delete-orphan
         */
    }
}

package org.example

fun main(){
    val list= listOf(
        Trumpet(8000),
        MusicPlayer(),
    )
    for (Playable in list){
        if(Playable is Instrument){
            Playable.tune()
        }
        Playable.play()
    }
}
package fr.eseo.ld.android.cp.filmposter.ui.viewmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import fr.eseo.ld.android.cp.filmposter.ui.model.Movie


class MovieViewModel : ViewModel() {


    private val _movie = mutableStateOf<Movie?>(null)
    public var movie : State<Movie?> = _movie


    fun fetchMovie(title:String) {
        val exampleMovie = Movie(
            title = "Star Wars",
            poster = "https://m.media-amazon.com/images/M/MV5BOTA5NjhiOTAtZWM0ZC00MWNhLThiMzEtZDFkOTk2OTU1ZDJkXkEyXkFqcGdeQXVyMTA4NDI1NTQx._V1_SX300.jpg"
        )
        _movie.value = exampleMovie
    }




}
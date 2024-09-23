// MoviePosterScreen.kt
package fr.eseo.ld.android.cp.filmposter.ui.view


import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import fr.eseo.ld.android.cp.filmposter.R
import fr.eseo.ld.android.cp.filmposter.ui.theme.FilmPosterTheme
import fr.eseo.ld.android.cp.filmposter.ui.viewmodel.MovieViewModel


@Composable
fun MoviePosterScreen(modifier: Modifier = Modifier) {

    val viewModel : MovieViewModel = MovieViewModel()

    Column(
        modifier = modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Top,
    ) {
        SearchBar(viewModel)
        PosterContent(viewModel)
    }
}

@Composable
fun SearchBar(viewModel: MovieViewModel) {
    var movieTitle by remember{mutableStateOf("")}

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .background(MaterialTheme.colorScheme.primary)
    ) {
        TextField(
            value = movieTitle,
            maxLines = 1,
            singleLine = true,
            onValueChange = {
                movieTitle = it
            },
            modifier = Modifier
                .fillMaxWidth(),
            placeholder = { Text(
                text = stringResource(id = R.string.movie_title),
                color = MaterialTheme.colorScheme.onPrimary,
                style = MaterialTheme.typography.titleMedium,
            )},
            textStyle = TextStyle(
                color = colorResource(id = R.color.white),
                fontFamily = MaterialTheme.typography.titleMedium.fontFamily,
                fontWeight = MaterialTheme.typography.titleMedium.fontWeight,
                fontSize = MaterialTheme.typography.titleMedium.fontSize,
            ),
            trailingIcon = {
                IconButton(
                    onClick = {
                        viewModel.fetchMovie("toto")
                    }
                ) {
                    Icon(
                        imageVector = Icons.Filled.Search,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.onPrimary,
                    )
                }

            },
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedContainerColor = MaterialTheme.colorScheme.primary,
                unfocusedLabelColor = MaterialTheme.colorScheme.onBackground,
                focusedLabelColor = MaterialTheme.colorScheme.onBackground,
                cursorColor = MaterialTheme.colorScheme.onPrimary,
                focusedBorderColor = Color.Transparent,
            ),
        )
    }
}


@Composable
fun PosterContent(viewModel: MovieViewModel) {
    val movie by viewModel.movie

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color.White),
    ) {
        if(movie != null){
            Log.d("FILM","not null"+movie?.poster)
            Image(
                painter = rememberImagePainter(
                    data = movie!!.poster,
                    builder = {
                        placeholder(R.drawable.ic_launcher_foreground)
                        error(R.drawable.ic_launcher_foreground)
                    }
                ),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Fit
            )
        }else {
            Log.d("FILM","null")
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Fit,
            )
        }
    }
}

@Preview
@Composable
fun MoviePosterScreenPreview() {
    FilmPosterTheme {
        MoviePosterScreen()
    }
}


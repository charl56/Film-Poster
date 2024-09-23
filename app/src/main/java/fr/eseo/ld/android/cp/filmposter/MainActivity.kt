// MainActivity.kt
package fr.eseo.ld.android.cp.filmposter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import fr.eseo.ld.android.cp.filmposter.ui.view.MoviePosterScreen
import fr.eseo.ld.android.cp.filmposter.ui.view.HeaderScreen
import fr.eseo.ld.android.cp.filmposter.ui.theme.FilmPosterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FilmPosterTheme {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MaterialTheme.colorScheme.primary)
                ) {
                    HeaderScreen(modifier = Modifier.fillMaxWidth())
                    MoviePosterScreen(modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MainPreview() {
    FilmPosterTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.primary),

        ) {
            HeaderScreen(modifier = Modifier.fillMaxWidth())
            MoviePosterScreen(modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
            )
        }
    }
}
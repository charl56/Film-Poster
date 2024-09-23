// HeaderScreen.kt
package fr.eseo.ld.android.cp.filmposter.ui.view

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.eseo.ld.android.cp.filmposter.R
import fr.eseo.ld.android.cp.filmposter.ui.theme.FilmPosterTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HeaderScreen(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier
            .statusBarsPadding()
            .fillMaxWidth()
            .height(50.dp),
            color = MaterialTheme.colorScheme.primary,
    ) {
        SimpleComposeAppBar()
    }
}

@Composable
private fun SimpleComposeAppBar(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = stringResource(id = R.string.app_name),
            modifier = Modifier.padding(start = 16.dp, top = 8.dp, bottom = 8.dp),
            color = MaterialTheme.colorScheme.onPrimary,
            style = MaterialTheme.typography.titleLarge
        )
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HeaderScreenPreview() {
    FilmPosterTheme {
        HeaderScreen()
    }
}

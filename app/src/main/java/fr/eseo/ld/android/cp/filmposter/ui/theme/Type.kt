package fr.eseo.ld.android.cp.filmposter.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import fr.eseo.ld.android.cp.filmposter.R


private val myCustomFont = FontFamily(
    Font(R.font.chilispepper),
)

public val customFontFamily = FontFamily(
    Font(R.font.michelin, FontWeight.Normal)
)

// Set of Material typography styles to start with
val Typography = Typography(

    titleLarge = TextStyle(
        fontFamily = FontFamily(Font(R.font.michelin)),
        fontWeight = FontWeight.Thin,
        fontSize = 20.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),

    titleMedium = TextStyle(
        fontFamily = FontFamily(Font(R.font.michelin)),
        fontWeight = FontWeight.Thin,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.25.sp
    ),

    titleSmall = TextStyle(
        fontFamily = FontFamily(Font(R.font.michelin)),
        fontWeight = FontWeight.Thin,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.4.sp
    ),





    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)

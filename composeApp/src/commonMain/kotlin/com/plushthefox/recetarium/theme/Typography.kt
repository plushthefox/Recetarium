package com.plushthefox.recetarium.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontVariation
import androidx.compose.ui.text.font.FontWeight
import recetarium.composeapp.generated.resources.Res
import recetarium.composeapp.generated.resources.roboto_bold
import recetarium.composeapp.generated.resources.roboto_regular
import recetarium.composeapp.generated.resources.roboto_variable
import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.Font

object BodyMediumVFConfig {
    const val WEIGHT = 400
    const val WIDTH = 100f
}

object HeadlineLargeVFConfig {
    const val WEIGHT = 700
    const val WIDTH = 100f

}

@Composable
fun AppTypography(): Typography {
    val bodyMediumFamily = FontFamily(
        Font(
            Res.font.roboto_variable,
            variationSettings = FontVariation.Settings(
                FontVariation.weight(BodyMediumVFConfig.WEIGHT),
                FontVariation.width(BodyMediumVFConfig.WIDTH),
            )
        )
    )
    val headlineLargeFamily = FontFamily(
        Font(
            Res.font.roboto_variable,
            variationSettings = FontVariation.Settings(
                FontVariation.weight(HeadlineLargeVFConfig.WEIGHT),
                FontVariation.width(HeadlineLargeVFConfig.WIDTH)
            )
        )
    )
    return Typography(
        headlineLarge = TextStyle(
            fontFamily = headlineLargeFamily,
            fontSize = 28.sp,

            ),
        bodyMedium = TextStyle(
            fontFamily = bodyMediumFamily,
            fontSize = 14.sp,
        ),
    )
}
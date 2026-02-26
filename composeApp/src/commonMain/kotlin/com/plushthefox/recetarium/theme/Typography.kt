package com.plushthefox.recetarium.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontVariation
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.Font
import recetarium.composeapp.generated.resources.Res
import recetarium.composeapp.generated.resources.montagu_slab_variable
import recetarium.composeapp.generated.resources.roboto_variable

object BodyMediumVFConfig {
    const val WEIGHT = 400
}

object HeadlineLargeVFConfig {
    const val WEIGHT = 600
}

object HeadlineMediumVFConfig {
    const val WEIGHT = 500
}


@Composable
fun appTypography(): Typography {
    val bodyMediumFamily = FontFamily(
        Font(
            Res.font.roboto_variable,
            variationSettings = FontVariation.Settings(
                FontVariation.weight(BodyMediumVFConfig.WEIGHT),
            )
        )
    )
    val headlineLargeFamily = FontFamily(
        Font(
            Res.font.montagu_slab_variable,
            variationSettings = FontVariation.Settings(
                FontVariation.weight(HeadlineLargeVFConfig.WEIGHT),
            )
        )
    )
    val headlineMediumFamily = FontFamily(
        Font(
            resource = Res.font.montagu_slab_variable,
            variationSettings = FontVariation.Settings(
                FontVariation.weight(HeadlineMediumVFConfig.WEIGHT),
            )
        )
    )
    return Typography(
        headlineLarge = TextStyle(
            fontFamily = headlineLargeFamily,
            fontSize = 32.sp

        ),
        headlineMedium = TextStyle(
            fontFamily = headlineMediumFamily,
            fontSize = 24.sp
        ),
        bodyMedium = TextStyle(
            fontFamily = bodyMediumFamily,
            fontSize = 16.sp

        ),

    )
}
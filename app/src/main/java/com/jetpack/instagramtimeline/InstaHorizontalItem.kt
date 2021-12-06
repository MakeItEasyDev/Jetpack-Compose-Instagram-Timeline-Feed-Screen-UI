package com.jetpack.instagramtimeline

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jetpack.instagramtimeline.ui.theme.Shapes

@Composable
fun InstaHorizontalItem(
    img: Int,
    profileName: String
) {
    val colorList = listOf(
        Color.Red,
        Color.Red,
        Color.Yellow,
    )

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Card(
            elevation = 4.dp,
            shape = Shapes.large,
            modifier = Modifier
                .padding(start = 5.dp, end = 5.dp),
            border = BorderStroke(2.dp, brush = Brush.linearGradient(colors = colorList))
        ) {
            Image(
                painter = painterResource(id = img),
                contentDescription = "Profile Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(74.dp)
                    .padding(5.dp)
                    .clip(CircleShape)
            )
        }
        Text(
            text = profileName,
            color = Color.Black,
            fontFamily = FontFamily.SansSerif,
            fontSize = 12.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
    }
}




















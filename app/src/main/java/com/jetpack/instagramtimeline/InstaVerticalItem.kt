package com.jetpack.instagramtimeline

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jetpack.instagramtimeline.ui.theme.Shapes

@Composable
fun InstaVerticalItem(
    name: String,
    img: Int,
    post: Int,
    likeCount: Int,
    commentCount: Int,
    putTime: Int
) {
    val colorList = listOf(
        Color.Red,
        Color.Red,
        Color.Yellow,
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 5.dp)
                .height(56.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Card(
                elevation = 4.dp,
                shape = Shapes.large,
                modifier = Modifier,
                border = BorderStroke(1.dp, brush = Brush.linearGradient(colors = colorList))
            ) {
                Image(
                    painter = painterResource(id = img),
                    contentDescription = "ProfileImage",
                    modifier = Modifier
                        .size(40.dp)
                        .padding(3.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
            }

            Text(
                text = name,
                modifier = Modifier.padding(start = 10.dp),
                fontSize = 14.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Bold
            )

            Image(
                painter = painterResource(id = R.drawable.ic_more),
                contentDescription = "MoreOptions",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(16.dp)
                    .padding(end = 10.dp),
                alignment = Alignment.CenterEnd
            )
        }

        Image(
            painter = painterResource(id = post),
            contentDescription = "PostImage",
            modifier = Modifier
                .height(400.dp)
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )

        Row(
            modifier = Modifier
                .height(46.dp)
                .fillMaxWidth()
                .padding(start = 5.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_baseline_favorite_border_24),
                contentDescription = "Favourite",
                modifier = Modifier
                    .size(36.dp)
                    .padding(4.dp)
                    .clip(RoundedCornerShape(40))
            )
            Image(
                painter = painterResource(id = R.drawable.comment_icon),
                contentDescription = "Comments",
                modifier = Modifier
                    .size(33.dp)
                    .padding(4.dp)
                    .rotate(280f)
            )
            Image(
                painter = painterResource(id = R.drawable.ic_message),
                contentDescription = "Message",
                modifier = Modifier
                    .size(34.dp)
                    .padding(4.dp)
                    .rotate(17.6f)
            )
            Image(
                painter = painterResource(id = R.drawable.ic_baseline_bookmark_border_24),
                contentDescription = "BookMark",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 8.dp)
                    .height(28.dp),
                alignment = Alignment.CenterEnd
            )
        }

        Text(
            text = "$likeCount likes",
            modifier = Modifier
                .padding(start = 10.dp),
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "View all $commentCount comment",
            modifier = Modifier
                .padding(start = 10.dp),
            color = Color.Gray,
            fontSize = 13.sp
        )
        Text(
            text = "$putTime minutes ago",
            modifier = Modifier
                .padding(start = 10.dp, bottom = 16.dp),
            color = Color.Gray,
            fontSize = 11.sp
        )

        Divider(modifier = Modifier.height(0.6.dp), color = Color(0xFFECECEC))
    }
}


















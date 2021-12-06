package com.jetpack.instagramtimeline

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.jetpack.instagramtimeline.model.getHorizontalList
import com.jetpack.instagramtimeline.model.getVerticalList
import com.jetpack.instagramtimeline.ui.theme.InstagramTimelineTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InstagramTimelineTheme {
                Surface(color = MaterialTheme.colors.background) {
                    Column(modifier = Modifier.fillMaxSize()) {
                        InstagramTimeline()
                    }
                }
            }
        }
    }
}

@Composable
fun TopBar() {
    TopAppBar(
        title = {
            Image(
                painter = painterResource(id = R.drawable.ic_instagram_logo),
                contentDescription = "Insta Logo",
                modifier = Modifier.height(42.dp)
            )
        },
        actions = {
            IconButton(onClick = { }) {
                Image(
                    painter = painterResource(id = R.drawable.ic_outline_add_box_24),
                    contentDescription = "Add",
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(10.dp)
                        .size(20.dp)
                        .align(CenterVertically)
                )
            }
            IconButton(onClick = { }) {
                Image(
                    painter = painterResource(id = R.drawable.ic_message),
                    contentDescription = "Chat",
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(10.dp)
                        .size(20.dp)
                        .rotate(17.6f)
                )
            }
        },
        backgroundColor = Color.White
    )
}

@Composable
fun InstagramTimeline() {
    Scaffold(
        topBar = {
            TopBar()
        },
        content = {
            LazyColumn {
                item {
                    Spacer(modifier = Modifier.padding(10.dp))
                }
                item {
                    LazyRow {
                        items(getHorizontalList.size) { index ->
                            InstaHorizontalItem(getHorizontalList[index].img ?: 0, getHorizontalList[index].name!!)
                        }
                    }
                }
                item {
                    Divider(modifier = Modifier
                        .padding(top = 10.dp)
                        .height(0.6.dp), color = Color(0xFFECECEC))
                }
                items(getVerticalList.size) { index ->
                    InstaVerticalItem(
                        getVerticalList[index].name!!,
                        getVerticalList[index].img!!,
                        getVerticalList[index].post!!,
                        getVerticalList[index].likeCount!!,
                        getVerticalList[index].commentCount!!,
                        getVerticalList[index].putTime!!
                    )
                }
            }
        },
        bottomBar = {
            BottomNavigation(
                backgroundColor = Color.White
            ) {
                BottomNavigationItem(
                    selected = true,
                    onClick = { },
                    alwaysShowLabel = true,
                    icon = {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_baseline_home_24),
                            contentDescription = "Home"
                        )
                    }
                )
                BottomNavigationItem(
                    selected = false,
                    onClick = { },
                    alwaysShowLabel = false,
                    icon = {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_baseline_search_24),
                            contentDescription = "Search"
                        )
                    }
                )
                BottomNavigationItem(
                    selected = false,
                    onClick = { },
                    alwaysShowLabel = false,
                    icon = {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_outline_ondemand_video_24),
                            contentDescription = "Video"
                        )
                    }
                )
                BottomNavigationItem(
                    selected = false,
                    onClick = { },
                    alwaysShowLabel = false,
                    icon = {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_baseline_favorite_border_24),
                            contentDescription = "Favourite"
                        )
                    }
                )
                BottomNavigationItem(
                    selected = false,
                    onClick = { },
                    alwaysShowLabel = false,
                    icon = {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_baseline_person_outline_24),
                            contentDescription = "Profile"
                        )
                    }
                )
            }
        }
    )
}














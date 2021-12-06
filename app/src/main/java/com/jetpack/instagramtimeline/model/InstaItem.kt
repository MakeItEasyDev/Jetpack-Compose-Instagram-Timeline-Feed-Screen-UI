package com.jetpack.instagramtimeline.model

import com.jetpack.instagramtimeline.R

data class InstaItem(
    var name: String? = null,
    var img: Int? = null,
    var post: Int? = null,
    var likeCount: Int? = null,
    var commentCount: Int? = null,
    var putTime: Int? = null
)

val getHorizontalList = listOf(
    InstaItem("Apple", R.drawable.apple),
    InstaItem("Banana", R.drawable.banana),
    InstaItem("Cherries", R.drawable.cherries),
    InstaItem("Dates", R.drawable.dates),
    InstaItem("EggFruit", R.drawable.eggfruit),
    InstaItem("Fig", R.drawable.fig),
    InstaItem("Grapes", R.drawable.grapes),
    InstaItem("HackBerry", R.drawable.hackberry)
)

val getVerticalList = listOf(
    InstaItem("Apple", R.drawable.apple, R.drawable.apple, 10, 20, 30),
    InstaItem("Banana", R.drawable.banana, R.drawable.banana, 11, 21, 31),
    InstaItem("Cherries", R.drawable.cherries, R.drawable.cherries, 12, 22, 32),
    InstaItem("Dates", R.drawable.dates, R.drawable.dates, 13, 23, 33),
    InstaItem("EggFruit", R.drawable.eggfruit, R.drawable.eggfruit, 14, 24, 34),
    InstaItem("Fig", R.drawable.fig, R.drawable.fig, 15, 25, 35),
    InstaItem("Grapes", R.drawable.grapes, R.drawable.grapes, 16, 26, 36),
    InstaItem("HackBerry", R.drawable.hackberry, R.drawable.hackberry, 17, 27, 37)
)














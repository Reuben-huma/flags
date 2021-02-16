package eu.tutorials.flags.model

import androidx.annotation.DrawableRes

data class Flag(@DrawableRes val image: Int, val options: List<String>, val answer: String)

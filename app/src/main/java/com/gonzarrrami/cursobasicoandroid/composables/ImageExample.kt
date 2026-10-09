package com.gonzarrrami.cursobasicoandroid.composables

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.gonzarrrami.cursobasicoandroid.R

@Preview
@Composable
fun ImageExample(){
    Image(painter = painterResource(id = R.drawable.minion),
    contentDescription = "minion con una radio"
    )
}
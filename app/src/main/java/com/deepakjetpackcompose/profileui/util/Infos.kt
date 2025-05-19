package com.deepakjetpackcompose.profileui.util

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.deepakjetpackcompose.profileui.R
import com.deepakjetpackcompose.profileui.ui.theme.descText

@Preview
@Composable
fun Infos(modifier: Modifier = Modifier) {

    Row (modifier = modifier.fillMaxWidth()){
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(30.dp)
                .clip(CircleShape)
                .clickable {  }
                .border(1.dp, descText,CircleShape)
        ){
            Icon(
                painter = painterResource(R.drawable.score),
                contentDescription = null,
                tint = descText,
                modifier = Modifier.size(15.dp)
            )
        }
    }

}
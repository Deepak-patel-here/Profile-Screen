package com.deepakjetpackcompose.profileui.util

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.deepakjetpackcompose.profileui.R
import com.deepakjetpackcompose.profileui.ui.theme.boldText
import com.deepakjetpackcompose.profileui.ui.theme.circleEdit
import com.deepakjetpackcompose.profileui.ui.theme.descText

@Preview
@Composable
fun ProfilePic(modifier: Modifier = Modifier) {

    Row (modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp),
        verticalAlignment = Alignment.CenterVertically){

        Image(
            painter = painterResource(R.drawable.profilepic),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(CircleShape)
                .size(80.dp)
        )
        Spacer(Modifier.width(20.dp))

        Column (modifier = Modifier.weight(weight = 1f)){
            Text("Sung jin woo", style = TextStyle(
                color = boldText,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            ))
            Spacer(Modifier.height(7.dp))
            Text("member since Dec, 2020",
                style = TextStyle(
                    color = descText,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Normal
                ))
        }
        EditButton()
    }

}

@Composable
fun EditButton(modifier: Modifier = Modifier) {

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .size(56.dp)
            .clip(CircleShape)
            .clickable {  }
            .border(1.dp, circleEdit,CircleShape)
    ){
        Icon(
            painter = painterResource(R.drawable.draw),
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier.size(24.dp)
        )
    }
    
}
package com.deepakjetpackcompose.profileui.util

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.deepakjetpackcompose.profileui.R
import com.deepakjetpackcompose.profileui.ui.theme.boldText
import com.deepakjetpackcompose.profileui.ui.theme.descText


@Composable
fun Infos(img:Int,name:String,price:String,isShow:Boolean,modifier: Modifier = Modifier) {
    Row (modifier = modifier.fillMaxWidth().padding(vertical = 10.dp),
        verticalAlignment = Alignment.CenterVertically){
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(30.dp)
                .clip(CircleShape)
                .clickable {  }
                .border(1.dp, descText,CircleShape)
        ){
            Icon(
                painter = painterResource(img),
                contentDescription = null,
                tint = descText,
                modifier = Modifier.size(15.dp)
            )
        }
        Spacer(Modifier.width(5.dp))
        Row (modifier= Modifier.weight(1f)){
            Text(
                name,
                style = TextStyle(
                    color = boldText,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal
                )
            )
            Spacer(Modifier.width(5.dp))

            if (isShow) {
                Icon(
                    painter = painterResource(R.drawable.fullstop),
                    contentDescription = null,
                    tint = Color.Green,
                    modifier = Modifier.size(15.dp)
                )
                Spacer(Modifier.width(7.dp))
                Text(
                    "REFRESH AVAILABLE",
                    style = TextStyle(
                        color = Color.Green,
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Normal
                    )
                )
            }
        }

        Text(price,
            style = TextStyle(
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal
            )
        )
        Spacer(Modifier.width(7.dp))

        Icon(
            painter = painterResource(R.drawable.rightarrow),
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier.size(24.dp)
        )
    }

}
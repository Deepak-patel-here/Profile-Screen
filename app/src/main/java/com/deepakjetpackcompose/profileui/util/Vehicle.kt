package com.deepakjetpackcompose.profileui.util

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import com.deepakjetpackcompose.profileui.ui.theme.circleEdit
import com.deepakjetpackcompose.profileui.R
import com.deepakjetpackcompose.profileui.ui.theme.descText
import com.deepakjetpackcompose.profileui.ui.theme.major
import com.deepakjetpackcompose.profileui.ui.theme.vehicle

@Preview
@Composable
fun Vehicle(modifier: Modifier = Modifier) {

    Row (modifier = modifier
        .fillMaxWidth()
        .height(130.dp)
        .background(vehicle)
        .border(1.dp, Color(0xFF252425), RoundedCornerShape(0.dp))
        .padding(15.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center){

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .clickable {  }
                .border(1.dp, Color.White,CircleShape)
        ){
            Icon(
                painter = painterResource(R.drawable.car),
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier.size(20.dp)
            )
        }

        Spacer(Modifier.width(20.dp))
        Column {
            Text("get to know your vehicles, inside out",
                style = TextStyle(
                    color = descText,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal
                ))
            Spacer(Modifier.height(10.dp))
            Row (verticalAlignment = Alignment.CenterVertically){
                Text("CRED garage",
                    style = TextStyle(
                        color = major,
                        fontSize =18.sp,
                        fontWeight = FontWeight.Normal
                    ))
                Spacer(Modifier.width(15.dp))
                Icon(
                    painter = painterResource(R.drawable.rightarrow),
                    contentDescription = null,
                    tint = major,
                    modifier= Modifier.size(24.dp)
                )
            }
        }
    }
    
}
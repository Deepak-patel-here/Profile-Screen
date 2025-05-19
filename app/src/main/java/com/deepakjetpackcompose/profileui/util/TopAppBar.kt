package com.deepakjetpackcompose.profileui.util

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.deepakjetpackcompose.profileui.R

@Preview
@Composable
fun TopAppBar(modifier: Modifier = Modifier) {

    Row (modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp),
        verticalAlignment = Alignment.CenterVertically){
        IconButton(onClick = {}) {
            Icon(
                painter = painterResource(R.drawable.arrow),
                contentDescription = null,
                tint = Color.White
            )
        }

        Spacer(modifier = Modifier.width(15.dp))
        Text("Profile",
            color = Color.White,
            fontSize = 18.sp,
            modifier = Modifier.weight(1f)
        )
        OutlinedButton(onClick = {}) {
            Row (verticalAlignment = Alignment.CenterVertically){
                Icon(
                    painter = painterResource(R.drawable.msg),
                    contentDescription = null,
                    tint = Color.LightGray,
                    modifier = Modifier.size(25.dp)
                )
                Spacer(Modifier.width(5.dp))
                Text("Support", color = Color.LightGray, fontSize = 14.sp)
            }
        }
    }

}
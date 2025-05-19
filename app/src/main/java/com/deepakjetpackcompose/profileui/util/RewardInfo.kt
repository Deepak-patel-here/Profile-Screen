package com.deepakjetpackcompose.profileui.util

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.deepakjetpackcompose.profileui.ui.theme.boldText
import com.deepakjetpackcompose.profileui.ui.theme.descText
import com.deepakjetpackcompose.profileui.ui.theme.major


@Composable
fun RewardInfo(title:String,desc:String,modifier: Modifier = Modifier) {
    Row (verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.fillMaxWidth().padding(vertical = 10.dp)){
        Column(modifier = Modifier.weight(1f)) {
            Text(title,
                style = TextStyle(
                    color = major,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal
                ))
            Spacer(Modifier.height(5.dp))
            Text("$desc",
                style = TextStyle(
                    color = descText,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal
                ))
        }
        Icon(
            imageVector = Icons.Default.KeyboardArrowRight,
            contentDescription = null,
            tint = major,
            modifier = Modifier.size(30.dp)
        )

    }
    
}
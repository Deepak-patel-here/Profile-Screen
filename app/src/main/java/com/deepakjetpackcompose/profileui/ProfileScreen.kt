package com.deepakjetpackcompose.profileui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.deepakjetpackcompose.profileui.ui.theme.bg
import com.deepakjetpackcompose.profileui.ui.theme.bg2
import com.deepakjetpackcompose.profileui.ui.theme.descText
import com.deepakjetpackcompose.profileui.util.Infos
import com.deepakjetpackcompose.profileui.util.ProfilePic
import com.deepakjetpackcompose.profileui.util.TopAppBar
import com.deepakjetpackcompose.profileui.util.Vehicle

@Preview
@Composable
fun ProfileScreen(modifier: Modifier = Modifier) {
    Column (modifier=modifier.fillMaxSize()){
        Column (modifier = Modifier
            .fillMaxWidth()
            .background(bg)
            .padding(start = 20.dp, end = 16.dp)
        ){
            TopAppBar()
            ProfilePic()
            Vehicle(modifier = Modifier.padding(top = 10.dp))
            Spacer(Modifier.height(20.dp))
            Infos(R.drawable.score, name = "credit score","757", isShow = true)
            Divider(Modifier.fillMaxWidth().alpha(0.3f))
            Infos(R.drawable.rupee, name = "lifetime cashback","3", isShow = false)
            Divider(Modifier.fillMaxWidth().alpha(0.3f))
            Infos(R.drawable.wallet, name = "bank balance","check", isShow = false)
            Spacer(Modifier.height(20.dp))
            
        }
        Column(
            modifier = modifier
                .fillMaxWidth()
                .background(bg2)
                .padding(start = 20.dp, end = 16.dp)
        ) {

            Text("YOUR REWARDS & BENEFITS",
                style = TextStyle(
                    color = descText,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Normal,
                ),
                modifier= Modifier.alpha(0.7f)
            )
        }
    }


}
package com.deepakjetpackcompose.profileui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.deepakjetpackcompose.profileui.ui.theme.bg
import com.deepakjetpackcompose.profileui.util.ProfilePic
import com.deepakjetpackcompose.profileui.util.TopAppBar
import com.deepakjetpackcompose.profileui.util.Vehicle

@Preview
@Composable
fun ProfileScreen(modifier: Modifier = Modifier) {
    Column (modifier = modifier.fillMaxSize().background(bg).padding(start = 20.dp, end = 16.dp)){
        TopAppBar()
        ProfilePic()
        Vehicle(modifier = Modifier.padding(top = 10.dp))
    }

}
package com.example.miprimeraapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.miprimeraapp.navigation.AppScreens

@Composable
fun TextScreen(navController: NavController, message: MyMessage) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier= Modifier
            .fillMaxSize()
            .background(Color.White)
            .border(5.dp, Color.Black)
            .clickable{navController.navigate(AppScreens.MainScreen.route)}
    ) {
        Image(
            painter = painterResource(id = message.image),
            contentDescription = null,
            modifier = Modifier
                .size(64.dp)
        )
        Text(
            message.welcome,
            color = Color.Black
        )
    }
}
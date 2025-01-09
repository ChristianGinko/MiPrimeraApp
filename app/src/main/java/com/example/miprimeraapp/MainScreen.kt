package com.example.miprimeraapp

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.miprimeraapp.Lista.messages
import com.example.miprimeraapp.navigation.AppScreens

@Composable
fun MainScreen() {
        MyMessages(messages)
}

@Composable
fun MyComponent (
    message: MyMessage,
    onItemClick: (MyMessage) -> Unit) {
    Row(modifier = Modifier
        .background(Color.Gray)
        .border(5.dp, Color.Black)
        .padding(20.dp)
        .fillMaxWidth()
        .clickable{onItemClick(message)}
    ) {
        MyImage(message)
        Spacer(modifier = Modifier.width(100.dp))
        MyText(message)
    }
}

data class MyMessage(val image: Int, val title: String, val welcome: String)

@Composable
fun MyMessages(messages: List<MyMessage>) {
    // Get the current Context
    val context = LocalContext.current
    LazyColumn(
        modifier = Modifier
            .padding(
                top = 30.dp,
                bottom = 50.dp
            )
    ) {
        items(messages) { message ->
            MyComponent(
                message = message,
                onItemClick = {
                    // Use the context from LocalContext
                    Toast.makeText(context, message.welcome, Toast.LENGTH_SHORT).show()
                }
            )
        }
    }
}

@Composable
fun MyImage (message: MyMessage) {
    Image(
        painter = painterResource(message.image),
        contentDescription = null,
        modifier = Modifier
            .size(64.dp)
            .clip(CircleShape),
    )
}

@Composable
fun MyText (message: MyMessage) {
    Column() {
        Text(
            message.title,
            color = Color.Black,
            modifier = Modifier
        )
    }
}

@Preview(showBackground=true)
@Composable
fun MainScreenPreview(){
    MainScreen()
}

@Preview(showBackground=true)
@Composable
fun MyComponentPreview(){
    MyMessages(messages)
}
package com.example.miprimeraapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

private val messages: List<MyMessage> = listOf(
    MyMessage(R.drawable.new_jedi_order,"New Jedi Order"),
    MyMessage(R.drawable.separatists,"Separatists"),
    MyMessage(R.drawable.sith_empire,"Sith Empire"),
    MyMessage(R.drawable.rebel_alliance,"Rebel Alliance"),
    MyMessage(R.drawable.new_republic,"New Republic"),
    MyMessage(R.drawable.galactic_republic,"Galactic Republic"),
    MyMessage(R.drawable.old_republic,"Old Republic"),
    MyMessage(R.drawable.mandalorians,"Mandalorians"),
    MyMessage(R.drawable.black_sun,"Black Sun"),
    MyMessage(R.drawable.galactic_senate,"Galactic Senate"),
    MyMessage(R.drawable.galactic_empire,"Galactic Empire"),
    MyMessage(R.drawable.orden_jedi,"Jedi Order")
)

@Composable
fun MainScreen() {
        MyMessages(messages)
}

@Composable
fun MyComponent (message: MyMessage) {
    Row(modifier = Modifier
        .background(Color.Gray)
        .border(5.dp, Color.Black)
        .padding(20.dp)
        .fillMaxWidth()
    ) {
        MyImage(message)
        Spacer(modifier = Modifier.width(100.dp))
        MyText(message)
    }
}

data class MyMessage(val image: Int, val title: String)

@Composable
fun MyMessages (messages: List<MyMessage>) {
    LazyColumn(
        modifier = Modifier
            .padding (
                top=30.dp,
                bottom=50.dp
            )
    ){
        items(messages) {message ->
            MyComponent(message)
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
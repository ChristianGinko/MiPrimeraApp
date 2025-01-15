/*
package com.example.miprimeraapp

import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

object Lista {
    val messages = listOf(
        MyMessage(R.drawable.new_jedi_order,"New Jedi Order", "¡Bienvenido a la Nueva Orden Jedi!"),
        MyMessage(R.drawable.separatists,"Separatists", "¡Bienvenido a los Separatistas!"),
        MyMessage(R.drawable.sith_empire,"Sith Empire", "¡Bienvenido al Imperio Sith!"),
        MyMessage(R.drawable.rebel_alliance,"Rebel Alliance", "¡Bienvenido a la Alianza Rebelde!"),
        MyMessage(R.drawable.new_republic,"New Republic", "¡Bienvenido a la Nueva República!"),
        MyMessage(R.drawable.galactic_republic,"Galactic Republic", "¡Bienvenido a la República Galáctica!"),
        MyMessage(R.drawable.old_republic,"Old Republic", "¡Bienvenido a la Vieja República!"),
        MyMessage(R.drawable.mandalorians,"Mandalorians", "¡Bienvenido a los Mandalorianos!"),
        MyMessage(R.drawable.black_sun,"Black Sun", "¡Bienvenido al Sol Negro!"),
        MyMessage(R.drawable.galactic_senate,"Galactic Senate", "¡Bienvenido al Senado Galáctico!"),
        MyMessage(R.drawable.galactic_empire,"Galactic Empire", "¡Bienvenido al Imperio Galáctico!"),
        MyMessage(R.drawable.orden_jedi,"Jedi Order", "¡Bienvenido a la Orden Jedi!")
    )
}

fun parseJsonToMessages(jsonString: String): List<MyMessage> {
    return Json.decodeFromString(jsonString)
}

fun main() {
    val json = """
        [
            {"image": "new_jedi_order", "title": "New Jedi Order", "welcome": "¡Bienvenido a la Nueva Orden Jedi!"},
            {"image": "separatists", "title": "Separatists", "welcome": "¡Bienvenido a los Separatistas!"},
            {"image": "sith_empire", "title": "Sith Empire", "welcome": "¡Bienvenido al Imperio Sith!"},
            {"image": "rebel_alliance", "title": "Rebel Alliance", "welcome": "¡Bienvenido a la Alianza Rebelde!"},
            {"image": "new_republic", "title": "New Republic", "welcome": "¡Bienvenido a la Nueva República!"},
            {"image": "galactic_republic", "title": "República Galáctica", "welcome": "¡Bienvenido a la República Galáctica!"},
            {"image": "old_republic", "title": "Old Republic", "welcome": "¡Bienvenido a la Vieja República!"},
            {"image": "mandalorians", "title": "Mandalorians", "welcome": "¡Bienvenido a los Mandalorianos!"},
            {"image": "black_sun", "title": "Black Sun", "welcome": "¡Bienvenido al Sol Negro!"},
            {"image": "galactic_senate", "title": "Galactic Senate", "welcome": "¡Bienvenido al Senado Galáctico!"},
            {"image": "galactic_empire", "title": "Galactic Empire", "welcome": "¡Bienvenido al Imperio Galáctico!"},
            {"image": "orden_jedi", "title": "Jedi Order", "welcome": "¡Bienvenido a la Orden Jedi!"}
        ]
    """

    val messages = parseJsonToMessages(json)
    messages.forEach { println(it) }
}
*/
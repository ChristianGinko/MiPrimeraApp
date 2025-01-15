import android.content.Context
import com.example.miprimeraapp.MyMessage
import org.json.JSONArray
import org.json.JSONObject

fun loadMessages(context: Context): List<MyMessage> {
    val json = """[
  {
    "image": "new_jedi_order",
    "title": "New Jedi Order",
    "welcome": "¡Bienvenido a la Nueva Orden Jedi!"
  },
  {
    "image": "separatists",
    "title": "Separatists",
    "welcome": "¡Bienvenido a los Separatistas!"
  },
  {
    "image": "sith_empire",
    "title": "Sith Empire",
    "welcome": "¡Bienvenido al Imperio Sith!"
  },
  {
    "image": "rebel_alliance",
    "title": "Rebel Alliance",
    "welcome": "¡Bienvenido a la Alianza Rebelde!"
  },
  {
    "image": "new_republic",
    "title": "New Republic",
    "welcome": "¡Bienvenido a la Nueva República!"
  },
  {
    "image": "galactic_republic",
    "title": "Galactic Republic",
    "welcome": "¡Bienvenido a la República Galáctica!"
  },
  {
    "image": "old_republic",
    "title": "Old Republic",
    "welcome": "¡Bienvenido a la Vieja República!"
  },
  {
    "image": "mandalorians",
    "title": "Mandalorians",
    "welcome": "¡Bienvenido a los Mandalorianos!"
  },
  {
    "image": "black_sun",
    "title": "Black Sun",
    "welcome": "¡Bienvenido al Sol Negro!"
  },
  {
    "image": "galactic_senate",
    "title": "Galactic Senate",
    "welcome": "¡Bienvenido al Senado Galáctico!"
  },
  {
    "image": "galactic_empire",
    "title": "Galactic Empire",
    "welcome": "¡Bienvenido al Imperio Galáctico!"
  },
  {
    "image": "orden_jedi",
    "title": "Jedi Order",
    "welcome": "¡Bienvenido a la Orden Jedi!"
  }
]""" // Coloca tu JSON aquí
    val jsonArray = JSONArray(json)
    val messages = mutableListOf<MyMessage>()

    for (i in 0 until jsonArray.length()) {
        val obj = jsonArray.getJSONObject(i)
        val imageName = obj.getString("image")
        val imageRes = context.resources.getIdentifier(imageName, "drawable", context.packageName)
        val title = obj.getString("title")
        val welcome = obj.getString("welcome")

        messages.add(MyMessage(image = imageRes, title = title, welcome = welcome))
    }

    return messages
}

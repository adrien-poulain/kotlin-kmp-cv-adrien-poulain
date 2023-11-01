
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import elements.Contact
import elements.Experiences
import elements.Formations
import elements.Infos
import elements.Interests
import elements.Languages
import elements.ProfileImage
import elements.Skills
import org.jetbrains.compose.resources.ExperimentalResourceApi

@OptIn(ExperimentalResourceApi::class)
@Composable
fun App() {
    Row {
        Column (
            modifier = Modifier
                .widthIn(235.dp)
                .fillMaxHeight()
                .background(Color.LightGray)
                .padding(10.dp)
        ) {
            ProfileImage()
            Spacer(Modifier.height(10.dp))
            Contact()
            Spacer(Modifier.height(10.dp))
            Languages()
            Spacer(Modifier.height(10.dp))
            Skills()
            Spacer(Modifier.height(10.dp))
            Interests()
        }
        Spacer(Modifier.width(10.dp))
        Column (
            modifier = Modifier.padding(end = 10.dp)
        ) {
            Row (
                modifier = Modifier
                .align(Alignment.End)
            ) {
                Infos()
            }
            Spacer(Modifier.height(10.dp))
            Divider(
                modifier = Modifier.fillMaxWidth().height(1.dp),
                color = Color.LightGray
            )
            Spacer(Modifier.height(10.dp))
            Experiences()
            Divider(
                modifier = Modifier.fillMaxWidth().height(1.dp),
                color = Color.LightGray
            )
            Spacer(Modifier.height(10.dp))
            Formations()
        }
    }
}

expect fun getPlatformName(): String
package elements

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Experiences() {
    val experiencesList = CVDatas.adrienCV.experiences.sortedByDescending { it.anneeFin }
    Column {
        Text(
            text = "Expériences :".uppercase(),
            fontSize = 16.sp,
            style = TextStyle(fontWeight = FontWeight.Bold)
        )
        Spacer(Modifier.height(5.dp))
        experiencesList.forEach { experience ->
            Row {
                Text(experience.poste + " ")
                Text(
                    text = "(" + experience.anneeDebut.toString() + " - " + experience.anneeFin.toString() + ")",
                    color = Color.DarkGray,
                    style = TextStyle(fontStyle = FontStyle.Italic)
                )
            }
            Text(
                text = experience.description,
                color = Color.Gray,
                fontSize = 12.sp,
                modifier = Modifier.padding(start = 5.dp)
            )
            Spacer(Modifier.height(10.dp))
        }
    }
}
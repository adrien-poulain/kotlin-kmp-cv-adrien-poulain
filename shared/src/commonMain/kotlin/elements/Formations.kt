package elements

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
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
fun Formations() {
    val formationsList = CVDatas.adrienCV.formations.sortedByDescending { it.annee }
    Column {
        Text(
            text = "Formations :".uppercase(),
            fontSize = 16.sp,
            style = TextStyle(fontWeight = FontWeight.Bold)
        )
        Spacer(Modifier.height(5.dp))
        formationsList.forEach { formation ->
            Row {
                Text(formation.diplome + " ")
                Text(
                    text =  "(" + formation.annee.toString() + ")",
                    color = Color.DarkGray,
                    style = TextStyle(fontStyle = FontStyle.Italic)
                )
            }
            Spacer(Modifier.height(5.dp))
        }
    }
}
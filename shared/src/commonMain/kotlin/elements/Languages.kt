package elements

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Languages() {
    val listLanguage = CVDatas.adrienCV.langages.sortedByDescending { it.percentage }
    Column {
        Text(
            text = "Langues :".uppercase(),
            fontSize = 14.sp,
            style = TextStyle(fontWeight = FontWeight.Bold)
        )
        Spacer(Modifier.height(5.dp))
        listLanguage.forEach{ language ->
            Text(language.nom)
            Spacer(Modifier.height(2.dp))
            LinearProgressIndicator(
                progress = language.getFloat(),
                color = Color.Blue
            )
            Spacer(Modifier.height(5.dp))
        }
    }
}
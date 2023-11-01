package elements

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Interests() {
    val interestList = CVDatas.adrienCV.interets
    Column {
        Text(
            text = "Centres d'intérêt :".uppercase(),
            fontSize = 14.sp,
            style = TextStyle(fontWeight = FontWeight.Bold)
        )
        Spacer(Modifier.height(5.dp))
        interestList.forEach { interet ->
            Text(interet.nom)
        }
    }
}
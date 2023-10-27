package elements

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun Infos() {
    Column {
        Text(
            text = (CVDatas.adrienCV.prenom + " " + CVDatas.adrienCV.nom).uppercase(),
            fontSize = 22.sp,
            style = TextStyle(fontWeight = FontWeight.Bold),
            modifier = Modifier.align(Alignment.End)
        )
        Text(
            text = CVDatas.adrienCV.calculerAge().toString() + " ans",
            modifier = Modifier.align(Alignment.End)
        )
    }
}
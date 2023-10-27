package elements

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun Interests() {
    val interestList = CVDatas.adrienCV.interets
    Column {
        interestList.forEach { interet ->
            Text(interet.nom)
        }
    }
}
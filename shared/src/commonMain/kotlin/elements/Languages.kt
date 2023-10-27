package elements

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun Languages() {
    val listLanguage = CVDatas.adrienCV.langages
    Column {
        listLanguage.forEach{ language ->
            Text(language.nom)
        }
    }
}
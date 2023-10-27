package elements

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun Contact() {
    Column {

        Text(CVDatas.adrienCV.numeroTelephone)
        Text(CVDatas.adrienCV.email)
        Text(CVDatas.adrienCV.adresse)
        Text(CVDatas.adrienCV.linkedin)
    }
}
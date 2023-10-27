package elements

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun Skills() {
    val listSkills = CVDatas.adrienCV.competences
    Column {
        listSkills.forEach { skill ->
            Text(skill.nom)
        }
    }
}
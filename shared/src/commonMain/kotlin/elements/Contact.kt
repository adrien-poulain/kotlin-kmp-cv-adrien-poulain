package elements

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Contact() {
    Column {
        Text(
            text = "Contact :".uppercase(),
            fontSize = 14.sp,
            style = TextStyle(fontWeight = FontWeight.Bold)
        )
        Spacer(Modifier.height(5.dp))
        Row {
            Icon(
                contentDescription = null,
                imageVector = Icons.Default.Call,
                tint = Color.Gray,
                modifier = Modifier.size(20.dp)
            )
            Spacer(Modifier.width(4.dp))
            Text(CVDatas.adrienCV.numeroTelephone)
        }
        Row {
            Icon(
                contentDescription = null,
                imageVector = Icons.Default.Email,
                tint = Color.Gray,
                modifier = Modifier.size(20.dp)
            )
            Spacer(Modifier.width(4.dp))
            Text(CVDatas.adrienCV.email)
        }
        Row {
            Icon(
                contentDescription = null,
                imageVector = Icons.Default.LocationOn,
                tint = Color.Gray,
                modifier = Modifier.size(20.dp)
            )
            Spacer(Modifier.width(4.dp))
            Text(CVDatas.adrienCV.adresse)
        }
        Row {
            Icon(
                contentDescription = null,
                imageVector = Icons.Default.Share,
                tint = Color.Gray,
                modifier = Modifier.size(20.dp)
            )
            Spacer(Modifier.width(4.dp))
            Text(CVDatas.adrienCV.linkedin)
        }
    }
}
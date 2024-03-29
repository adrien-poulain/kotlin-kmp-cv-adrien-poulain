package elements

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun ProfileImage() {
    Box(
        modifier = Modifier
            .size(160.dp)
    ) {
        Image(
            painter = painterResource("adrien_poulain.jpg"),
            contentDescription = null,
            modifier = Modifier
                .size(160.dp)
                .fillMaxSize()
                .graphicsLayer {
                    clip = true
                },
            contentScale = ContentScale.Crop
        )
    }
}
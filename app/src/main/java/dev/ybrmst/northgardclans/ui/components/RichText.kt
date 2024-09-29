package dev.ybrmst.northgardclans.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.InlineTextContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.PlaceholderVerticalAlign
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.ybrmst.northgardclans.domains.shared.AnnotatedText

@Composable
fun RichText(
  text: AnnotatedText,
  modifier: Modifier = Modifier,
  style: TextStyle = MaterialTheme.typography.bodySmall,
) {
  val inlineContent =
    if (text.res == null) emptyMap()
    else {
      text.res.mapValues { (_, resId) ->
        InlineTextContent(
          placeholder = Placeholder(
            width = 16.sp,
            height = 16.sp,
            placeholderVerticalAlign = PlaceholderVerticalAlign.Center
          ),
          children = {
            Image(
              imageVector = ImageVector.vectorResource(id = resId),
              contentDescription = null,
              modifier = Modifier.size(16.dp)
            )
          }
        )
      }
    }

  Text(
    text = text.toAnnotatedString(),
    inlineContent = inlineContent,
    style = style,
    modifier = modifier
  )
}

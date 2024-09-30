package dev.ybrmst.northgardclans.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.InlineTextContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.PlaceholderVerticalAlign
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import dev.ybrmst.northgardclans.domains.shared.AnnotatedText

@Composable
fun RichText(
  text: AnnotatedText,
  modifier: Modifier = Modifier,
  color: Color = MaterialTheme.colorScheme.onSurface,
  style: TextStyle = MaterialTheme.typography.bodySmall,
) {
  val inlineContent =
    text.res?.mapValues { (name, resId) ->
      InlineTextContent(
        placeholder = Placeholder(
          width = 16.sp,
          height = 16.sp,
          placeholderVerticalAlign = PlaceholderVerticalAlign.Top
        ),
        children = {
          Image(
            painter = painterResource(id = resId),
            contentDescription = name,
            modifier = Modifier.fillMaxSize()
          )
        }
      )
    } ?: emptyMap()

  Text(
    text = text.toAnnotatedString(),
    inlineContent = inlineContent,
    style = style,
    color = color,
    modifier = modifier
  )
}

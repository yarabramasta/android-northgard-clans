package dev.ybrmst.northgardclans.domains.shared

import androidx.compose.foundation.text.appendInlineContent
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp

class AnnotatedText(
  private val text: String,
  val res: Map<String, Int>? = null
) {
  fun toAnnotatedString(): AnnotatedString {
    if (res == null) return AnnotatedString(text)

    return buildAnnotatedString {
      text.split(" ").forEach { word ->
        if (res.containsKey(word)) {
          append(" ")
          withStyle(style = SpanStyle(fontSize = 0.sp)) {
            appendInlineContent(word, "[$word]")
          }
          append(" ")
        } else {
          append("$word ")
        }
      }
    }
  }
}

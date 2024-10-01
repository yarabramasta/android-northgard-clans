package dev.ybrmst.northgardclans.ui.composables.clan

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AssistChip
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.ybrmst.northgardclans.data.db.clans
import dev.ybrmst.northgardclans.domains.clan.ClanPreviewData
import dev.ybrmst.northgardclans.ui.composables.RichText
import dev.ybrmst.northgardclans.ui.theme.AppTheme

@Composable
fun ClanPreviewCard(clan: ClanPreviewData, modifier: Modifier = Modifier) {
  return ListItem(
    headlineContent = {
      Text(
        text = clan.nickname,
        color = MaterialTheme.colorScheme.primary
      )
    },
    supportingContent = { Text(text = clan.name) },
    overlineContent = {
      RichText(
        text = clan.warchief,
        color = MaterialTheme.colorScheme.outline,
      )
    },
    leadingContent = {
      Image(
        painter = painterResource(id = clan.emblem),
        contentDescription = clan.name,
        modifier = Modifier.size(56.dp)
      )
    },
    trailingContent = {
      if (clan.isDlc()) {
        AssistChip(
          onClick = {/*TODO*/ },
          shape = RoundedCornerShape(99.dp),
          label = {
            Text(
              text = "DLC Clan",
              style = MaterialTheme
                .typography
                .labelSmall
                .copy(fontSize = 10.sp)
            )
          }
        )
      }
    },
    modifier = modifier
  )
}

@Preview(showBackground = true)
@Composable
fun ClanPreviewCardPreview() {
  val clan = clans.last().toPreviewData()

  AppTheme {
    ClanPreviewCard(clan = clan)
  }
}

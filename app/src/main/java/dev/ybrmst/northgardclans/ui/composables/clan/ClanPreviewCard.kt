package dev.ybrmst.northgardclans.ui.composables.clan

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AssistChip
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.ybrmst.northgardclans.data.db.clans
import dev.ybrmst.northgardclans.domains.clan.ClanPreviewData
import dev.ybrmst.northgardclans.domains.clan.GameBundleType
import dev.ybrmst.northgardclans.ui.composables.RichText
import dev.ybrmst.northgardclans.ui.theme.AppTheme

@Composable
fun ClanPreviewCard(clan: ClanPreviewData, modifier: Modifier = Modifier) {
  return Card(
    shape = RoundedCornerShape(8.dp),
    modifier = modifier,
  ) {
    Column(
      modifier = Modifier.padding(16.dp),
    ) {
      Row(
        verticalAlignment = Alignment.CenterVertically,
      ) {
        Image(
          painter = painterResource(clan.emblem),
          contentDescription = clan.name,
          modifier = Modifier
            .size(48.dp)
        )
        Column(modifier = Modifier.padding(start = 16.dp, end = 32.dp)) {
          Text(
            text = clan.nickname,
            style = MaterialTheme.typography.titleLarge,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.padding(bottom = 4.dp),
          )
          Text(
            text = clan.name,
            style = MaterialTheme.typography.bodyMedium,
          )
        }

        if (clan.bundleType == GameBundleType.DLC) {
          AssistChip(
            shape = RoundedCornerShape(99.dp),
            onClick = {},
            label = {
              Text(
                text = "DLC",
                style = MaterialTheme.typography.bodySmall.copy(
                  fontSize = 10.sp
                ),
              )
            },
          )
        }
      }
    }
  }
}

@Preview(showBackground = true)
@Composable
fun ClanPreviewCardPreview() {
  val clan = clans.last().toPreviewData()

  AppTheme {
    ClanPreviewCard(clan = clan)
  }
}
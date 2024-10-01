package dev.ybrmst.northgardclans.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import dev.ybrmst.northgardclans.data.db.clans
import dev.ybrmst.northgardclans.domains.clan.Clan
import dev.ybrmst.northgardclans.ui.composables.RichText
import dev.ybrmst.northgardclans.ui.composables.clan.ClanPreviewCard
import dev.ybrmst.northgardclans.ui.theme.AppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ClanDetailScreen(clan: Clan) {

  Scaffold(
    topBar = {
      Box(modifier = Modifier.height(160.dp)) {
        Image(
          painter = painterResource(id = clan.banner),
          contentDescription = clan.name,
          contentScale = ContentScale.FillBounds,
          alignment = Alignment.TopCenter,
          modifier = Modifier
            .fillMaxWidth()
            .height(160.dp)
        )
        TopAppBar(
          title = { },
          navigationIcon = {
            IconButton(onClick = { }) {
              Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                contentDescription = "Back"
              )
            }
          },
          colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Transparent,
            scrolledContainerColor = MaterialTheme.colorScheme.background
          ),
          modifier = Modifier
            .fillMaxWidth()
            .zIndex(1f),
        )
      }
    },
    modifier = Modifier.fillMaxSize(),
  ) { innerPadding ->
    LazyColumn(
      modifier = Modifier
        .fillMaxSize()
        .padding(innerPadding)
    ) {
      item {
        Spacer(modifier = Modifier.size(16.dp))
        ClanPreviewCard(clan = clan.toPreviewData())
        Column(
          modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .padding(bottom = 16.dp)
        ) {
          Spacer(modifier = Modifier.size(8.dp))
          Text(
            text = clan.description,
            style = MaterialTheme.typography.labelSmall,
            color = MaterialTheme.colorScheme.outline,
          )
          Spacer(modifier = Modifier.size(24.dp))
          Text(
            text = "Clan Traits",
            style = MaterialTheme
              .typography
              .titleLarge,
            color = MaterialTheme.colorScheme.primary,
          )
          Spacer(modifier = Modifier.size(8.dp))
          RichText(
            text = clan.trait,
            style = MaterialTheme.typography.bodyMedium,
          )
          Spacer(modifier = Modifier.size(24.dp))
          Text(
            text = "Relic",
            style = MaterialTheme
              .typography
              .titleLarge,
            color = MaterialTheme.colorScheme.primary,
          )
          Spacer(modifier = Modifier.size(8.dp))
          RichText(
            text = clan.relic,
            style = MaterialTheme.typography.bodyMedium,
          )
          Spacer(modifier = Modifier.size(24.dp))
          Text(
            text = "Starter Bonuses",
            style = MaterialTheme
              .typography
              .titleLarge,
            color = MaterialTheme.colorScheme.primary,
          )
          Spacer(modifier = Modifier.size(8.dp))
          Column {
            for (bonus in clan.bonuses) {
              Row {
                Text(text = "⭐", style = MaterialTheme.typography.labelSmall)
                Spacer(modifier = Modifier.size(8.dp))
                RichText(
                  text = bonus,
                  style = MaterialTheme.typography.bodyMedium,
                )
              }
              Spacer(modifier = Modifier.size(4.dp))
            }
          }
        }
      }
    }
  }
}

@Preview(
  showBackground = true,
  showSystemUi = true
)
@Composable
fun ClanDetailScreenPreview() {
  val clan = clans.find { it.nickname === "Lyngbakr" }

  AppTheme {
    ClanDetailScreen(clan = clan!!)
  }
}
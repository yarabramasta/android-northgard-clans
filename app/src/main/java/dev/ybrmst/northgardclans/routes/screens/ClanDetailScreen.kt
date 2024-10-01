package dev.ybrmst.northgardclans.routes.screens

import android.content.Context
import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.rounded.Share
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import androidx.core.content.ContextCompat.startActivity
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import dev.ybrmst.northgardclans.data.db.clans
import dev.ybrmst.northgardclans.domains.clan.Clan
import dev.ybrmst.northgardclans.ui.composables.RichText
import dev.ybrmst.northgardclans.ui.composables.clan.ClanPreviewCard
import dev.ybrmst.northgardclans.ui.theme.AppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ClanDetailScreen(navController: NavController, clan: Clan) {
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
            IconButton(onClick = { navController.navigateUp() }) {
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
          actions = {
            ShareButton(clan, context = LocalContext.current)
          },
          modifier = Modifier
            .fillMaxWidth()
            .zIndex(1f),
        )
      }
    },
    modifier = Modifier.fillMaxSize(),
  ) { innerPadding ->
    LazyColumn(
      contentPadding = PaddingValues(16.dp),
      modifier = Modifier
        .fillMaxSize()
        .padding(innerPadding)
    ) {
      item {
        Spacer(modifier = Modifier.size(16.dp))
        ClanPreviewCard(clan = clan.toPreviewData())
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
      }
      items(clan.bonuses) { bonus ->
        Row(modifier = Modifier.padding(bottom = 4.dp)) {
          Text(text = "⭐", style = MaterialTheme.typography.labelSmall)
          Spacer(modifier = Modifier.size(8.dp))
          RichText(
            text = bonus,
            style = MaterialTheme.typography.bodyMedium,
          )
        }
      }
    }
  }
}

@Composable
fun ShareButton(clan: Clan, context: Context) {
  val shareText =
    "Check out *${clan.nickname}* ${clan.name} in *Northgard Clans* app!\n\n_${clan.description}_"
  val shareIntent = Intent(Intent.ACTION_SEND).apply {
    type = "text/plain"
    putExtra(Intent.EXTRA_TEXT, shareText)
  }

  IconButton(onClick = { startActivity(context, shareIntent, null) }) {
    Icon(
      imageVector = Icons.Rounded.Share,
      contentDescription = "Share"
    )
  }
}

@Preview(
  showBackground = true,
  showSystemUi = true
)
@Composable
fun ClanDetailScreenPreview() {
  val navController = rememberNavController()
  val clan = clans.find { it.nickname == "Lyngbakr" }!!

  AppTheme {
    ClanDetailScreen(
      navController = navController,
      clan = clan
    )
  }
}
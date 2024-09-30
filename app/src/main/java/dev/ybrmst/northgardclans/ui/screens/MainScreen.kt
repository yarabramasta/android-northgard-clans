package dev.ybrmst.northgardclans.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.ybrmst.northgardclans.R
import dev.ybrmst.northgardclans.ui.composables.clan.ClanPreviewCard
import dev.ybrmst.northgardclans.ui.states.ClanViewModel
import dev.ybrmst.northgardclans.ui.theme.AppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
  viewModel: ClanViewModel
) {
  val clans by viewModel.clans.observeAsState(initial = emptyList())

  Scaffold(
    topBar = {
      TopAppBar(
        title = {
          Image(
            painter = painterResource(id = R.drawable.ic_northgard_logo_full),
            contentDescription = "Official Northgard Logo",
            modifier = Modifier.width(80.dp)
          )
        },
        actions = {
          IconButton(onClick = { /*TODO*/ }) {
            Icon(
              imageVector = Icons.Rounded.AccountCircle,
              contentDescription = "About Me",
            )
          }
        }
      )
    },
    modifier = Modifier.fillMaxSize(),
  ) { innerPadding ->
    LazyColumn(
      contentPadding = PaddingValues(16.dp),
      modifier = Modifier
        .fillMaxWidth()
        .padding(innerPadding),
    ) {
      item {
        Text(
          text = "Northgard Clans",
          style = MaterialTheme
            .typography
            .headlineLarge
            .copy(fontWeight = FontWeight.Bold),
          color = MaterialTheme.colorScheme.primary,
          modifier = Modifier.padding(bottom = 8.dp)
        )
        Text(
          text = "This is a list of clans that available in Northgard. Click on a clan to see more details.",
          color = MaterialTheme.colorScheme.outline,
          modifier = Modifier.padding(bottom = 16.dp)
        )
      }
      items(clans) { clan ->
        ClanPreviewCard(clan = clan.toPreviewData())
      }
    }
  }
}

@Preview(
  showBackground = true,
  showSystemUi = true
)
@Composable
fun MainScreenPreview() {
  AppTheme {
    MainScreen(viewModel = ClanViewModel())
  }
}
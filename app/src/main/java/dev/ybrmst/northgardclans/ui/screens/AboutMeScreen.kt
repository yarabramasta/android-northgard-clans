package dev.ybrmst.northgardclans.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.ybrmst.northgardclans.R
import dev.ybrmst.northgardclans.ui.theme.AppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutMeScreen() {
  Scaffold(
    topBar = {
      TopAppBar(
        title = {
          Text(text = "About Me")
        },
        navigationIcon = {
          IconButton(onClick = { }) {
            Icon(
              imageVector = Icons.AutoMirrored.Filled.ArrowBack,
              contentDescription = "Back"
            )
          }
        }
      )
    },
    modifier = Modifier.fillMaxSize(),
  ) { innerPadding ->
    Column(
      verticalArrangement = Arrangement.Center,
      horizontalAlignment = Alignment.CenterHorizontally,
      modifier = Modifier
        .fillMaxSize()
        .padding(innerPadding)
        .padding(16.dp)
    ) {
      Image(
        painter = painterResource(id = R.drawable.img_dicoding_profile_photo),
        contentDescription = "Yara Bramasta| Dicoding",
        contentScale = ContentScale.FillWidth,
        alignment = Alignment.TopCenter,
        modifier = Modifier
          .size(80.dp)
          .shadow(
            120.dp,
            shape = CircleShape,
            spotColor = MaterialTheme.colorScheme.primary
          )
          .clip(CircleShape)
      )
      Spacer(modifier = Modifier.size(24.dp))
      Text(
        text = "Yara Bramasta",
        style = MaterialTheme
          .typography
          .headlineMedium
          .copy(fontWeight = FontWeight.Bold),
        color = MaterialTheme.colorScheme.primary,
      )
      Spacer(modifier = Modifier.size(8.dp))
      Text(
        text = "yarabram111@gmail.com",
        color = MaterialTheme.colorScheme.outline,
      )
    }
  }
}

@Preview(
  showBackground = true,
  showSystemUi = true
)
@Composable
fun AboutMeScreenPreview() {
  AppTheme {
    AboutMeScreen()
  }
}
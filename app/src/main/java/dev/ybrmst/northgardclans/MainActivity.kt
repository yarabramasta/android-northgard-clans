package dev.ybrmst.northgardclans

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import dev.ybrmst.northgardclans.routes.MainNavGraph
import dev.ybrmst.northgardclans.ui.states.ClanViewModel
import dev.ybrmst.northgardclans.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
  private val clanViewModel by viewModels<ClanViewModel>()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    installSplashScreen()
    enableEdgeToEdge()
    setContent {
      AppTheme {
        MainNavGraph(viewModel = clanViewModel)
      }
    }
  }
}

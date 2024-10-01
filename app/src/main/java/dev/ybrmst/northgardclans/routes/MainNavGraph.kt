package dev.ybrmst.northgardclans.routes

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.ybrmst.northgardclans.routes.screens.AboutMeScreen
import dev.ybrmst.northgardclans.routes.screens.ClanDetailScreen
import dev.ybrmst.northgardclans.routes.screens.HomeScreen
import dev.ybrmst.northgardclans.ui.states.ClanViewModel

sealed class Screen(val route: String) {
  data object Home : Screen("home")

  data object Details : Screen("details/{nickname}") {
    fun createRoute(nickname: String) = "details/${nickname}"
  }

  data object About : Screen("about")
}

@Composable
fun MainNavGraph(viewModel: ClanViewModel) {
  val navController = rememberNavController()

  NavHost(navController = navController, startDestination = Screen.Home.route) {
    composable(Screen.Home.route) {
      HomeScreen(navController = navController, viewModel = viewModel)
    }
    composable(Screen.Details.route) { backstackEntry ->
      val nickname = backstackEntry.arguments?.getString("nickname") ?: ""
      val clan = viewModel.getClanDetail(nickname = nickname)
      ClanDetailScreen(navController = navController, clan = clan)
    }
    composable(Screen.About.route) { AboutMeScreen(navController = navController) }
  }
}
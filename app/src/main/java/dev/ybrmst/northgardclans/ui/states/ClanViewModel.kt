package dev.ybrmst.northgardclans.ui.states

import androidx.lifecycle.ViewModel
import dev.ybrmst.northgardclans.data.repo.clan.ClanRepositoryImpl
import dev.ybrmst.northgardclans.domains.clan.Clan

class ClanViewModel : ViewModel() {
  private lateinit var _clans: List<Clan>

  private lateinit var repo: ClanRepositoryImpl


  init {
    if (!::repo.isInitialized) repo = ClanRepositoryImpl()
    refresh()
  }

  private fun refresh() {
    _clans = repo.fetchClans()
  }
}
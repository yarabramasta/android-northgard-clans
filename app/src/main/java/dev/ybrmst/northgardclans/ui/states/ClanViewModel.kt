package dev.ybrmst.northgardclans.ui.states

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dev.ybrmst.northgardclans.data.repo.clan.ClanRepositoryImpl
import dev.ybrmst.northgardclans.domains.clan.Clan

class ClanViewModel : ViewModel() {
  private var _clans = MutableLiveData(emptyList<Clan>())

  private lateinit var repo: ClanRepositoryImpl

  val clans: LiveData<List<Clan>> = _clans

  init {
    if (!::repo.isInitialized) repo = ClanRepositoryImpl()
    refresh()
  }

  private fun refresh() {
    _clans.value = repo.fetchClans().shuffled()
  }

  fun getClanDetail(nickname: String): Clan {
    return repo.fetchClanDetail(nickname)!!
  }
}

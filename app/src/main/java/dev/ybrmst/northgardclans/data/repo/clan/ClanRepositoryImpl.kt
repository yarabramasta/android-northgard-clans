package dev.ybrmst.northgardclans.data.repo.clan

import dev.ybrmst.northgardclans.data.db.clans
import dev.ybrmst.northgardclans.domains.clan.Clan
import dev.ybrmst.northgardclans.domains.repo.ClanRepository

class ClanRepositoryImpl : ClanRepository() {
  override fun fetchClans(): List<Clan> = clans

  override fun fetchClanDetail(nickname: String): Clan? =
    clans.find {
      it.nickname == nickname
    }
}

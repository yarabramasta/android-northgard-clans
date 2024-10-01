package dev.ybrmst.northgardclans.domains.repo

import dev.ybrmst.northgardclans.domains.clan.Clan

abstract class ClanRepository {
  abstract fun fetchClans(): List<Clan>

  abstract fun fetchClanDetail(nickname: String): Clan?
}

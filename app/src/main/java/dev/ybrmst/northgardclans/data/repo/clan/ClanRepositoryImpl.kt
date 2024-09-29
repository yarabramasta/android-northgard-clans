package dev.ybrmst.northgardclans.data.repo.clan

import dev.ybrmst.northgardclans.data.db.clans
import dev.ybrmst.northgardclans.domains.clan.Clan
import dev.ybrmst.northgardclans.domains.clan.ClanPreviewData
import dev.ybrmst.northgardclans.domains.repo.ClanRepository

class ClanRepositoryImpl : ClanRepository() {
  override fun getClans(): List<Clan> = clans

  override fun getClansPreviewData(): List<ClanPreviewData> =
    clans.map { clan ->
      ClanPreviewData(
        nickname = clan.name,
        name = clan.name,
        emblem = clan.emblem,
        warchief = clan.warchief,
        bundleType = clan.bundleType,
      )
    }
}

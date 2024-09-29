package dev.ybrmst.northgardclans.domains.repo

import dev.ybrmst.northgardclans.domains.clan.Clan
import dev.ybrmst.northgardclans.domains.clan.ClanPreviewData

abstract class ClanRepository {
  abstract fun getClans(): List<Clan>

  abstract fun getClansPreviewData(): List<ClanPreviewData>
}

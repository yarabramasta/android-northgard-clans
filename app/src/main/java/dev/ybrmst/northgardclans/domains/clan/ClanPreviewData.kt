package dev.ybrmst.northgardclans.domains.clan

data class ClanPreviewData(
  val nickname: String,
  val name: String,
  val emblem: Int,
  val bundleType: GameBundleType,
)

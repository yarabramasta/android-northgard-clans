package dev.ybrmst.northgardclans.domains.clan

import dev.ybrmst.northgardclans.domains.shared.AnnotatedText

data class ClanPreviewData(
  val nickname: String,
  val name: String,
  val emblem: Int,
  val warchief: AnnotatedText,
  val bundleType: GameBundleType,
)

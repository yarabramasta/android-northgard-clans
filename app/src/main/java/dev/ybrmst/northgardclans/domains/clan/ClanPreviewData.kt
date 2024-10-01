package dev.ybrmst.northgardclans.domains.clan

import dev.ybrmst.northgardclans.domains.shared.AnnotatedText

data class ClanPreviewData(
  val nickname: String,
  val name: String,
  val warchief: AnnotatedText,
  val emblem: Int,
  val bundleType: GameBundleType,
) {
  fun isDlc(): Boolean = bundleType == GameBundleType.DLC
}

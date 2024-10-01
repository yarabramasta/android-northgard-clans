package dev.ybrmst.northgardclans.domains.clan

import androidx.annotation.DrawableRes
import dev.ybrmst.northgardclans.domains.shared.AnnotatedText

data class Clan(
  val nickname: String,
  val name: String,
  val warchief: AnnotatedText,
  val trait: AnnotatedText,
  val description: String,
  val bundleType: GameBundleType,
  val bonuses: List<AnnotatedText>,
  val relic: AnnotatedText,
  @DrawableRes val emblem: Int,
  @DrawableRes val banner: Int,
) {
  fun toPreviewData(): ClanPreviewData {
    return ClanPreviewData(
      nickname = nickname,
      name = name,
      warchief = warchief,
      emblem = emblem,
      bundleType = bundleType,
    )
  }
}

enum class GameBundleType {
  BASE,
  DLC,
}
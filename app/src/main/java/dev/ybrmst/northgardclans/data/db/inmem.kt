package dev.ybrmst.northgardclans.data.db

import dev.ybrmst.northgardclans.R
import dev.ybrmst.northgardclans.domains.clan.Clan
import dev.ybrmst.northgardclans.domains.clan.GameBundleType
import dev.ybrmst.northgardclans.domains.shared.AnnotatedText

val clans = listOf(
  Clan(
    nickname = "Eikthyrnir",
    name = "The Clan of the Stag",
    warchief = AnnotatedText(
      text = "Led by [brand] Brand ",
      res = mapOf("[brand]" to R.drawable.ic_unit_warchief_brand)
    ),
    trait = AnnotatedText(
      text = "This clan can achieve [fame] Fame rather quickly while having access to more resources as a solid foundation to kickstart a settlement.",
      res = mapOf(
        "[fame]" to R.drawable.ic_resource_fame
      )
    ),
    description = "The Clan of the Stag. Proud of their legacy of astonishing achievements, they are renowned as much for their honorable and regal manner as their harsh justice and unyielding strength. Valuing wealth and fame, they are highly ambitious expansionists",
    bundleType = GameBundleType.BASE,
    bonuses = listOf(
      AnnotatedText(
        text = "You Start with +75 [food] Food, [wood] Wood, and [krowns] Krowns.",
        res = mapOf(
          "[food]" to R.drawable.ic_resource_food,
          "[wood]" to R.drawable.ic_resource_wood,
          "[krowns]" to R.drawable.ic_resource_krowns
        )
      ),
      AnnotatedText(
        text = "The Hall of Skalds replaces the Brewery and produces additional [fame] Fame.",
        res = mapOf(
          "[fame]" to R.drawable.ic_resource_fame
        )
      ),
      AnnotatedText(
        text = "You gain 50% more [fame] Fame and [happiness] Happiness from your territory.",
        res = mapOf(
          "[fame]" to R.drawable.ic_resource_fame,
          "[happiness]" to R.drawable.ic_resource_happiness
        )
      ),
    ),
    relic =
    AnnotatedText(
      text = "[hlidskjalf] Hlidskjalf : Allows you to recruit [einherjar] Einherjar at Hlidskjalf. Powerful units consuming more [food] Food but whose strength increases with the clan's [fame] Fame.",
      res = mapOf(
        "[hlidskjalf]" to R.drawable.ic_relic_hlidskjalf,
        "[einherjar]" to R.drawable.ic_unit_einherjar,
        "[food]" to R.drawable.ic_resource_food,
        "[fame]" to R.drawable.ic_resource_fame
      )
    ),
    emblem = R.drawable.img_clan_emblem_stag,
    banner = R.drawable.img_clan_banner_stag
  ),
  Clan(
    nickname = "Heidrun",
    name = "The Clan of the Goat",
    warchief = AnnotatedText(
      text = "Led by [harvald] Harvald ",
      res = mapOf(
        "[harvald]" to R.drawable.ic_unit_warchief_harvald
      )
    ),
    trait = AnnotatedText(
      text = "The clan excels in prospering with minimal space, enhancing areas with extra building space, and trading excess [food] Food for significant [krowns] Kröwns income, creating a strong economy.",
      res = mapOf(
        "[food]" to R.drawable.ic_resource_food,
        "[krowns]" to R.drawable.ic_resource_krowns
      )
    ),
    description = "The Clan of the Goat. When it comes to surviving in the dangerous conditions and building sturdy settlements, the Clan of the Goat has no rival. They will endure the harshest of winters and even prosper. Self-sufficient survivalists, they work hard to make the most of every inch of their territory. Adaptable and resilient, they will be right at home on Northgard.",
    bundleType = GameBundleType.BASE,
    bonuses = listOf(
      AnnotatedText(
        text = "Start with 1 [sheep] Sheep and can build two Sheepfolds.",
        res = mapOf(
          "[sheep]" to R.drawable.ic_resource_sheep
        )
      ),
      AnnotatedText(
        text = "Your clan gets 20% more production through feasts.",
      )
    ),
    relic =
    AnnotatedText(
      text = "[eldhrumnir] Eldhrumnir : +20% [feast] Feast bonus, -50% [feast] Feast cost. Your units regenerate health during a [feast] Feast. You can build an additional Sheepfold.",
      res = mapOf(
        "[eldhrumnir]" to R.drawable.ic_relic_eldhrumnir,
        "[feast]" to R.drawable.ic_resource_feast
      )

    ),
    emblem = R.drawable.img_clan_emblem_goat,
    banner = R.drawable.img_clan_banner_goat
  ),
  Clan(
    nickname = "Fenrir",
    name = "The Clan of the Wolf",
    warchief = AnnotatedText(
      text = "Led by [egil] Egil ",
      res = mapOf(
        "[egil]" to R.drawable.ic_unit_warchief_egil
      )
    ),
    description = "The Clan of the Wolf. Aggressive, protective of their freedom and more than a little reckless. They are well prepared to face the dangers of Northgard and use their combined might and mobility to leave little chance to all but the most resilient.",
    bundleType = GameBundleType.BASE,
    trait = AnnotatedText(
      text = "Emphasizes military prowess, warriors provide [food] Food, [krowns] Kröwns, and [happiness] happiness through fighting, with low food consumption. Conquering new territory is aided by increased [attack_power] Attack Power outside friendly territory and Berserker's dominion ability.",
      res = mapOf(
        "[food]" to R.drawable.ic_resource_food,
        "[krowns]" to R.drawable.ic_resource_krowns,
        "[happiness]" to R.drawable.ic_resource_happiness,
        "[attack_power]" to R.drawable.ic_resource_attack_power
      )
    ),
    bonuses = listOf(
      AnnotatedText(
        text = "You gain [meat] Meat whenever you slay an animal; [meat] 12 for a [fox] fox, [meat] 15 for a [wolf] Wolf, [meat] 90 for [brundr] Brundr or [kaelinn] Kaelinn [meat] 120 for a [brown_bear] Brown Bear or [kaija] Kaija, the Armored Bear and [meat] 135 for a [giant_boar] Giant Boar",
        res = mapOf(
          "[meat]" to R.drawable.ic_resource_meat,
          "[fox]" to R.drawable.ic_unit_fox,
          "[wolf]" to R.drawable.ic_unit_wolf,
          "[brundr]" to R.drawable.ic_unit_brundr,
          "[kaelinn]" to R.drawable.ic_unit_kaelinn,
          "[brown_bear]" to R.drawable.ic_unit_brown_bear,
          "[kaija]" to R.drawable.ic_unit_kaija,
          "[giant_boar]" to R.drawable.ic_unit_giant_boar
        )
      ),
      AnnotatedText(
        text = "Your military units consume 30% less [food] Food and military unit grant [happiness] Happiness",
        res = mapOf(
          "[food]" to R.drawable.ic_resource_food,
          "[happiness]" to R.drawable.ic_resource_happiness
        )
      ),
      AnnotatedText(
        text = "Whenever you have no military units, the first unit recruited is free (excluding the Warchief). Following units cost starts at [krowns] 25 Kröwns",
        res = mapOf(
          "[krowns]" to R.drawable.ic_resource_krowns
        )
      ),
    ),
    relic = AnnotatedText(
      text = "[horn_of_managarm] Horn of Managarm : Summons up to 3 White Wolves under your control for [food] 50 Food each, with the cost being reduced by half if you build it in a Wolf Den tile. You can summon them every 2 months. 3 is the total maximum number; if you summon 3 wolves and lose 2 of them, next time the Horn of Managarm is off cooldown you will be able to summon only 2 wolves.",
      res = mapOf(
        "[horn_of_managarm]" to R.drawable.ic_relic_horn_of_managarm,
        "[food]" to R.drawable.ic_resource_food
      )
    ),
    emblem = R.drawable.img_clan_emblem_wolf,
    banner = R.drawable.img_clan_banner_wolf
  ),
  Clan(
    nickname = "Huginn and Muninn",
    name = "The Clan of the Raven",
    warchief = AnnotatedText(
      text = "Led by [liv] Liv ",
      res = mapOf(
        "[liv]" to R.drawable.ic_unit_warchief_liv
      )
    ),
    description = "The Clan of the Raven. Great explorers and merchants, their mighty fleet allowed them to be the first to land on Northgard. They are strong trade partners if you don't mind their constant scheming. Brash and swift, they will often be found roaming where you least expect them.",
    bundleType = GameBundleType.BASE,
    trait = AnnotatedText(
      text = "[krowns] Kröwns and Harbors are central, enabling excessive money production. Colonization and exploration are paid for, giving an edge. [happiness] Happiness is abundant, making the military nearly unstoppable.",
      res = mapOf(
        "[krowns]" to R.drawable.ic_resource_krowns,
        "[happiness]" to R.drawable.ic_resource_happiness
      )
    ),
    bonuses = listOf(
      AnnotatedText(
        text = "You can spend [krowns] Kröwns to colonize new zones",
        res = mapOf(
          "[krowns]" to R.drawable.ic_resource_krowns
        )
      ),
      AnnotatedText(
        text = "Harbor replaces Longship Dock"
      ),
      AnnotatedText(
        text = "You gain [lore] Lore when you scout new zones and [fame] Fame when you discover Neutral Factions and enemy Town Halls.",
        res = mapOf(
          "[lore]" to R.drawable.ic_resource_lore,
          "[fame]" to R.drawable.ic_resource_fame
        )
      )
    ),
    relic = AnnotatedText(
      text = "[naglfar] Naglfar : Allows you to send two Son of Hrymr to raid coastal tiles.",
      res = mapOf(
        "[naglfar]" to R.drawable.ic_relic_naglfar
      )
    ),
    emblem = R.drawable.img_clan_emblem_raven,
    banner = R.drawable.img_clan_banner_raven
  ),
  Clan(
    nickname = "Bjarki",
    name = "The Clan of the Bear",
    warchief = AnnotatedText(
      text = "Led by [borgild] Borgild ",
      res = mapOf(
        "[borgild]" to R.drawable.ic_unit_warchief_borgild
      )
    ),
    description = "The Clan of the Bear. Stalwart protector of the land, the Clan of Bjarki is home to the most resilient warriors. Hailing from the northern reaches of the realm, they are also very well suited to survive the harsh winters of Northgard.",
    bundleType = GameBundleType.BASE,
    trait = AnnotatedText(
      text = "The Clan of the Bear is a balanced and adaptable clan. Late game Shield Bearers from this clan are a force to be reckoned with, especially if fighting during winter.",

      ),
    bonuses = listOf(
      AnnotatedText(
        text = "[food] Food and [wood] Firewood penalties in winter are reduced by 30%.",
        res = mapOf(
          "[food]" to R.drawable.ic_resource_food,
          "[wood]" to R.drawable.ic_resource_wood
        )
      ),
      AnnotatedText(
        text = "You can summon [kaija] Kaija, the Armored Bear at your [warband] Military Camp for [krowns] 40 Kröwns and [food] 40 Food. It regenerates and produces food near fish.",
        res = mapOf(
          "[kaija]" to R.drawable.ic_unit_kaija,
          "[warband]" to R.drawable.ic_resource_warband,
          "[krowns]" to R.drawable.ic_resource_krowns,
          "[food]" to R.drawable.ic_resource_food
        )
      ),
      AnnotatedText(
        text = "Instead of having reduced power, your [warband] Military units gain a 10% resistance bonus during winter.",
        res = mapOf(
          "[warband]" to R.drawable.ic_resource_warband
        )
      ),
    ),
    relic = AnnotatedText(
      text = "[scabbard_of_gram] Scabbard of Gram : Your Warchief wields the sword Gram. Enemies hit by Gram are frozen, along with the area around them. Gives +10% attack, +10% defense to Borgild.",
      res = mapOf(
        "[scabbard_of_gram]" to R.drawable.ic_relic_scabbard_of_gram
      )
    ),
    emblem = R.drawable.img_clan_emblem_bear,
    banner = R.drawable.img_clan_banner_bear
  ),
  Clan(
    nickname = "Slidrugtanni",
    name = "The Clan of the Boar",
    warchief = AnnotatedText(
      text = "Led by [svarn] Svarn ",
      res = mapOf(
        "[svarn]" to R.drawable.ic_unit_warchief_svarn
      )
    ),
    description = "The Clan of the Boar. A reclusive clan once forgotten by their brethren but recently rediscovered, the Clan of the Boar is both mystical and untamed. Their understanding of the world is unmatched, as are their boorish and primitive ways.",
    bundleType = GameBundleType.BASE,
    trait = AnnotatedText(
      text = "Clan of the Boar excels at gathering lore points and is less dependent on stone. They also receive greater benefit from the Altar of Kings and forest tiles.",
    ),
    bonuses = listOf(
      AnnotatedText(
        text = "The Mender's Hut replaces the Healer's Hut. [mender] Menders produce [lore] 1 Lore while not healing instead of food.",
        res = mapOf(
          "[mender]" to R.drawable.ic_unit_mender,
          "[lore]" to R.drawable.ic_resource_lore
        )
      ),
      AnnotatedText(
        text = "Can Colonize neutral zones with wildlife for an extra cost. Wolves and Brown Bears in the colonized zones become friendly and won't attack your units.",
      ),
      AnnotatedText(
        text = "Each additional territory gives +2 max population.",
      ),
      AnnotatedText(
        text = "Unlocking new knowledge gives +5 [fame] Fame bonus.",
        res = mapOf(
          "fame" to R.drawable.ic_resource_fame
        )
      )
    ),
    relic = AnnotatedText(
      text = "[mask_of_gullinbursti] Mask of Gullinbursti : Produce +6 [food] Food. You can pay 150 [lore] Lore to summon one [giant_boar] Giant Boar. It is controllable as long as it is not in combat.",
      res = mapOf(
        "[mask_of_gullinbursti]" to R.drawable.ic_relic_mask_of_gullinbursti,
        "[food]" to R.drawable.ic_resource_food,
        "[lore]" to R.drawable.ic_resource_lore,
        "[giant_boar]" to R.drawable.ic_unit_giant_boar
      )
    ),
    emblem = R.drawable.img_clan_emblem_boar,
    banner = R.drawable.img_clan_banner_boar
  ),
  Clan(
    nickname = "Sváfnir",
    name = "The Clan of the Snake",
    warchief = AnnotatedText(
      text = "Led by [signy] Signy ",
      res = mapOf(
        "[signy]" to R.drawable.ic_unit_warchief_signy
      )
    ),
    description = "The Clan of the Snake. Cunning and deceitful, the Snake has little regard for fame or honor. Members of the clan prefer working in the shadows and using guerilla tactics rather than open warfare.",
    bundleType = GameBundleType.DLC,
    trait = AnnotatedText(
      text = "This Clan benefits from harassment tactics and an aggressive hit and run playstyle. Additionally, the Stolen Lore allows adaptability for otherwise adverse situations."
    ),
    bonuses = listOf(
      AnnotatedText(
        text = "You start with your warchief, the young Signy."
      ),
      AnnotatedText(
        text = "The Skirmisher Camp is an exclusive building of the clan, it allows to recruit Skirmishers that can go through neutrals foes without being detected."
      ),
      AnnotatedText(
        text = "The clan doesn't have access to [fame] Fame. Signy grows up, getting stronger and unlocking new abilities instead.",
        res = mapOf(
          "[fame]" to R.drawable.ic_resource_fame
        )
      ),
      AnnotatedText(
        text = "You can use scorched earth to gain military advantage and steal resources from neutral zones. You can burn zones as Signy grows stronger"
      )
    ),
    relic = AnnotatedText(
      text = "[gungnir] Gungnir : All military units get 10% dodge chance. Unlocks the [stealth] Stealth ability for all your military units.",
      res = mapOf(
        "[gungnir]" to R.drawable.ic_relic_gungnir,
        "[stealth]" to R.drawable.ic_resource_stealth
      )
    ),
    emblem = R.drawable.img_clan_emblem_snake,
    banner = R.drawable.img_clan_banner_snake
  ),
  Clan(
    nickname = "Nidhogg",
    name = "The Clan of the Dragon",
    warchief = AnnotatedText(
      text = "Led by [surtr] Surtr ",
      res = mapOf(
        "[surtr]" to R.drawable.ic_unit_warchief_surtr
      )
    ),
    description = "The Clan of the Dragon. The most outlandish of all clans, the Dragons follow ancient customs and embrace freakish traditions. They use sacrifice and slavery to further their goals, often earning the other clans' distrust.",
    bundleType = GameBundleType.DLC,
    trait = AnnotatedText(
      text = "The clan grows stronger with time, aided by early expansion, [dragonkin] Dragonkin recruitment, and [thrall] slaves sacrifices for bonuses, while [fame] fame boosts the essence gauge for constant advantages.",
      res = mapOf(
        "[dragonkin]" to R.drawable.ic_unit_dragonkin,
        "[thrall]" to R.drawable.ic_unit_thrall,
        "[fame]" to R.drawable.ic_resource_fame
      )
    ),
    bonuses = listOf(
      AnnotatedText(
        text = "Your Civilians can go into neutral territory."
      ),
      AnnotatedText(
        text = "No [happiness] Happiness or production penalty for being wounded.",
        res = mapOf(
          "happiness" to R.drawable.ic_resource_happiness
        )
      ),
      AnnotatedText(
        text = "You start with a Sacrificial Pyre. You can build a Dragonkin Altar instead of other military camps."
      ),
      AnnotatedText(
        text = "Start with 2 [thrall] Thralls and only 3 [villager] Villagers. You can buy thralls from your Longship Docks.",
        res = mapOf(
          "[thrall]" to R.drawable.ic_unit_thrall,
          "[villager]" to R.drawable.ic_unit_villager
        )
      )
    ),
    relic = AnnotatedText(
      text = "[skull_of_hrungnir] Skull of Hrungnir : Summon an [draconic_jotunn] Draconic Jötunn.",
      res = mapOf(
        "[skull_of_hrungnir]" to R.drawable.ic_relic_skull_of_hrungnir,
        "[draconic_jotunn]" to R.drawable.ic_unit_draconic_jotunn
      )
    ),
    emblem = R.drawable.img_clan_emblem_dragon,
    banner = R.drawable.img_clan_banner_dragon
  ),
  Clan(
    nickname = "Svadilfari",
    name = "The Clan of the Horse",
    warchief = AnnotatedText(
      text = "Led by [brok] Brok and [eitria] Eitria ",
      res = mapOf(
        "[brok]" to R.drawable.ic_unit_warchief_brok,
        "[eitria]" to R.drawable.ic_unit_warchief_eitria
      )
    ),
    description = "Led by Brok and Eitria, two spirited siblings, the Clan of the Horse are a quiet and sturdy people. They are also recognized by all as the best craftsmen of the known world.",
    bundleType = GameBundleType.DLC,
    trait = AnnotatedText(
      text = "The clan excels in versatility, with [eitria] Eitria and [brok] Brok mining [stone] Stone, [iron] Iron, and improving [forge_tools] Forge Tools and Relics. Fast [lore] Lore progression and two [upgrade_buildings] upgrades relics enhance development and adaptability.",
      res = mapOf(
        "[eitria]" to R.drawable.ic_unit_warchief_eitria,
        "[brok]" to R.drawable.ic_unit_warchief_brok,
        "[stone]" to R.drawable.ic_resource_stone,
        "[iron]" to R.drawable.ic_resource_iron,
        "[forge_tools]" to R.drawable.ic_resource_forge_tools,
        "[lore]" to R.drawable.ic_resource_lore,
        "[upgrade_buildings]" to R.drawable.ic_resource_upgrade_buildings
      )
    ),
    bonuses = listOf(
      AnnotatedText(
        text = "Eitria and Brok are the 2 clan Warchiefs, they can be recruited in the Forge, instead of the usual Military Camps, for [krowns] 150 Kröwns, no [iron] Iron needed",
        res = mapOf(
          "[krowns]" to R.drawable.ic_resource_krowns,
          "[iron]" to R.drawable.ic_resource_iron
        )
      ),
      AnnotatedText(
        text = "The Clan does not have access to Mines, Miners or Smiths"
      ),
      AnnotatedText(
        text = "Your Warchiefs can build, repair, mine and forge 20% faster"
      ),
      AnnotatedText(
        text = "[volunds_forge] Völund's Forge replaces the regular Forge",
        res = mapOf(
          "[volunds_forge]" to R.drawable.ic_building_volunds_forge
        )
      )
    ),
    relic = AnnotatedText(
      text = "[dainsleif_and_tyrfing] Dainsleif & Tyrfing : Gives your warchiefs, Eitria and Brok [health] +20% Health, [attack_power] +20% Attack Power, [defense] +20% Def, +20% mining and +20% forge speed.",
      res = mapOf(
        "[dainsleif_and_tyrfing]" to R.drawable.ic_relic_dainsleif_and_tyrfing,
        "[health]" to R.drawable.ic_resource_health,
        "[attack]" to R.drawable.ic_resource_attack_power,
        "[defense]" to R.drawable.ic_resource_defense
      )
    ),
    emblem = R.drawable.img_clan_emblem_horse,
    banner = R.drawable.img_clan_banner_horse
  ),
  Clan(
    nickname = "Lyngbakr",
    name = "The Clan of the Kraken",
    warchief = AnnotatedText(
      text = "Led by [kara] Kàra ",
      res = mapOf(
        "[kara]" to R.drawable.ic_unit_warchief_kara
      )
    ),
    description = "The Clan of the Kraken knows firsthand how dangerous the sea can be. They worship the gigantic Creature, fearing its brutal might, honoring its instinctual knowledge, and using its powers when he deigns to bestow them.",
    bundleType = GameBundleType.DLC,
    trait = AnnotatedText(
      text = "The clan thrives near shores with stable [food] Food and [krowns] Kröwns, while [wyrd] Wyrd grows as the settlement expands. [happiness] Happiness from the [seeress] Seeress' enables powerful armies, including [valkyrie] Valkyrie and [spectral_warrior] Spectral Warrior.",
      res = mapOf(
        "[food]" to R.drawable.ic_resource_food,
        "[krowns]" to R.drawable.ic_resource_krowns,
        "[wyrd]" to R.drawable.ic_resource_wyrd,
        "[seeress]" to R.drawable.ic_unit_seeress,
        "[valkyrie]" to R.drawable.ic_unit_valkyrie,
        "[spectral_warrior]" to R.drawable.ic_unit_spectral_warrior
      )
    ),
    bonuses = listOf(
      AnnotatedText(
        text = "You can't build [longship_dock] Longship Dock and Trade Victory is not available to you but your Fishing Cabins are 20% more effective and can be used on lakes and the sea.",
        res = mapOf(
          "[longship_dock]" to R.drawable.ic_building_longship_dock
        )
      ),
      AnnotatedText(
        text = "Colonization and building costs on non-coastal zone are 50% more expensive and units attack power is reduced by [attack_power] -30% Attack Power.",
        res = mapOf(
          "[attack_power]" to R.drawable.ic_resource_attack_power
        )
      ),
      AnnotatedText(
        text = "You start with 1 [spectral_warrior] Spectral Warrior. You can have more by building Hörgr and having negative [wyrd] Wyrd",
        res = mapOf(
          "[spectral_warrior]" to R.drawable.ic_unit_spectral_warrior,
          "[wyrd]" to R.drawable.ic_resource_wyrd
        )
      ),
      AnnotatedText(
        text = "The [brewery] Brewery is replaced by the [horgr] Hörgr to assign female villagers into [seeress] Seeress'. The [seeress] Seeress' produce [happiness] Happiness and [wyrd] Wyrd.",
        res = mapOf(
          "[brewery]" to R.drawable.ic_building_brewery,
          "[horgr]" to R.drawable.ic_building_horgr,
          "[seeress]" to R.drawable.ic_unit_seeress,
          "[wyrd]" to R.drawable.ic_resource_wyrd,
          "[happiness]" to R.drawable.ic_resource_happiness
        )
      ),
      AnnotatedText(
        text = "[wyrd] Wyrd may be used to activate special abilities. And to turn a [seeress] Seeress' into a [valkyrie] Valkyrie. When producing positive you get sent new villagers.",
        res = mapOf(
          "[wyrd]" to R.drawable.ic_resource_wyrd,
          "[seeress]" to R.drawable.ic_unit_seeress,
          "[valkyrie]" to R.drawable.ic_unit_valkyrie
        )
      )
    ),
    relic = AnnotatedText(
      text = "[edda_of_vor] Edda of Vör : You can force the Kraken's Event. During Kraken's event, if any boat is destroyed you will receive resources.",
      res = mapOf(
        "[edda_of_vor]" to R.drawable.ic_relic_edda_of_vor
      )
    ),
    emblem = R.drawable.img_clan_emblem_kraken,
    banner = R.drawable.img_clan_banner_kraken
  ),
  Clan(
    nickname = "Himminbrjotir",
    name = "The Clan of the Ox",
    warchief = AnnotatedText(
      text = "Led by [torfin] Torfin ",
      res = mapOf(
        "[torfin]" to R.drawable.ic_unit_warchief_torfin
      )
    ),
    description = "Led by Torfin, an ancient leader who returned to help his progeny, the Clan of the Ox is known for its tremendous might and unrelenting devotion to its ancestors. While they may not be the fastest starters, once they've gained some momentum, they can crush anyone and anything in their way.",
    bundleType = GameBundleType.DLC,
    trait = AnnotatedText(
      text = "The Clan of the Ox excels in military power, with the strong yet costly [torfin] Torfin. Strategic use of resources is crucial to maintain his strength and ensure his survival.",
      res = mapOf(
        "[torfin]" to R.drawable.ic_unit_warchief_torfin
      )
    ),
    bonuses = listOf(
      AnnotatedText(
        text = "Your Warchief is the powerful [torfin] Torfin. He can find [ancestral_equipment] Ancestral equipment from Ancient battlegrounds and equip them to become even stronger.",
        res = mapOf(
          "[torfin]" to R.drawable.ic_unit_warchief_torfin,
          "[ancestral_equipment]" to R.drawable.ic_resource_ancestral_equipment
        )
      ),
      AnnotatedText(
        text = "Torfin's Throne produces [lore] +2 Lore while Torfin is not summoned",
        res = mapOf(
          "[lore]" to R.drawable.ic_resource_lore
        )
      ),
      AnnotatedText(
        text = "Your units are tougher, larger and eat 10% more than the other clans."
      ),
      AnnotatedText(
        text = "Your units have a [attack_power] +15% attack power and defence bonus."
      ),
      AnnotatedText(
        text = "Specialized civilian units have a +40% base production bonus, except loremasters."
      ),
      AnnotatedText(
        text = "Non-upgraded buildings can hold only one unit, and houses hold fewer people."
      )
    ),
    relic = AnnotatedText(
      text = "[aegir] Aegir : [torfin] Torfin can use Provocation : All enemy units and towers target Torfin Torfin during a short period and his defense is increased by 100% for 6 seconds.",
      res = mapOf(
        "[aegir]" to R.drawable.ic_relic_aegir,
        "[torfin]" to R.drawable.ic_unit_warchief_torfin
      )
    ),
    emblem = R.drawable.img_clan_emblem_ox,
    banner = R.drawable.img_clan_banner_ox
  ),
  Clan(
    nickname = "Brundr and Kaelinn",
    name = "The Clan of the Lynx",
    warchief = AnnotatedText(
      text = "Led by [mielikki] Mielikki ",
      res = mapOf(
        "[mielikki]" to R.drawable.ic_unit_warchief_mielikki
      )
    ),
    description = "Led by Mielikki, the Beastmaster, the Clan of the Lynx have an exceptional connection with nature. Proud Hunters, their excellent archery skills and unique luring technique are more than enough to ensure the ongoing prosperity of their people.",
    bundleType = GameBundleType.DLC,
    trait = AnnotatedText(
      text = "The clan commands the powerful lynxes [brundr] Brundr and [kaelinn] Kaelinn, adopted as cubs, who serve as the leader's eyes and a formidable force in battle.",
      res = mapOf(
        "[brundr]" to R.drawable.ic_unit_brundr,
        "[kaelinn]" to R.drawable.ic_unit_kaelinn
      )
    ),
    bonuses = listOf(
      AnnotatedText(
        text = "Earn [hunting_trophies] Hunting Trophies on animal kills.",
        res = mapOf(
          "[hunting_trophies]" to R.drawable.ic_resource_hunting_trophies
        )
      ),
      AnnotatedText(
        text = "You can summon [brundr] Brundr and [kaelinn] Kaelinn to your Training Camp.",
        res = mapOf(
          "[brundr]" to R.drawable.ic_unit_brundr,
          "[kaelinn]" to R.drawable.ic_unit_kaelinn
        )
      ),
      AnnotatedText(
        text = "[mielikki] Mielikki the Beastmaster is weaker than other warchiefs but does not cost iron.",
        res = mapOf(
          "[mielikki]" to R.drawable.ic_unit_warchief_mielikki,
          "[iron]" to R.drawable.ic_resource_iron
        )
      ),
      AnnotatedText(
        text = "The [archery_range] Archery Range replaces the [axe_thrower_camp] Axe Thrower Camp. The [tracker] Trackers they train are ranged units shooting a wide variety of arrows.",
        res = mapOf(
          "[archery_range]" to R.drawable.ic_building_archery_range,
          "[axe_thrower_camp]" to R.drawable.ic_building_axe_thrower_camp,
          "[tracker]" to R.drawable.ic_unit_tracker
        )

      ),
      AnnotatedText(
        text = "The Paths of the Hunter replaces the Military paths. Spend [hunting_trophies] Hunting Trophies to unlock powerful abilities for [brundr] Brundr, [kaelinn] Kaelinn and the [tracker] Trackers.",
        res = mapOf(
          "[hunting_trophies]" to R.drawable.ic_resource_hunting_trophies,
          "[brundr]" to R.drawable.ic_unit_brundr,
          "[kaelinn]" to R.drawable.ic_unit_kaelinn,
          "[tracker]" to R.drawable.ic_unit_tracker
        )
      )
    ),
    relic = AnnotatedText(
      text = "[glepnir] Glepnir : Allows you to place a trap in a non-enemy zone. Activate on demand to reveal spikes that damage and slow enemies for as long as they are in the zone. Lasts 30 seconds.",
      res = mapOf(
        "[glepnir]" to R.drawable.ic_relic_glepnir
      )
    ),
    emblem = R.drawable.img_clan_emblem_lynx,
    banner = R.drawable.img_clan_banner_lynx
  ),
  Clan(
    nickname = "Ratatoskr",
    name = "The Clan of the Squirrel",
    warchief = AnnotatedText(
      text = "Led by [andhrimnir] Andhrimnir ",
      res = mapOf(
        "[andhrimnir]" to R.drawable.ic_unit_warchief_andhrimnir
      )
    ),
    description = "Led by the 'warchef' Andhrimnir, the people of the Squirrel generally want to enjoy good food as well as a playful lifestyle. Some (even their allies) would call them mischievous rather than helpful. In the end, nobody quite knows if they are (vaguely) trustworthy friends or just roguish rabble-rousers. Although all agree they can cook!",
    bundleType = GameBundleType.DLC,
    trait = AnnotatedText(
      text = "Led by [andhrimnir] Andhrimnir, the playful and mischievous Clan of the Squirrel enjoys good food and a carefree lifestyle. Though roguish, they remain skilled cooks, leaving their trustworthiness in question.",
      res = mapOf(
        "[andhrimnir]" to R.drawable.ic_unit_warchief_andhrimnir
      )
    ),
    bonuses = listOf(
      AnnotatedText(
        text = "The clan hoards greedily in anticipation of winter 2 months before it starts and can count on a 30% increase in production during this period. However, they have a harder time during winter itself as they consume more [food] Food and [wood] Wood.",
        res = mapOf(
          "[food]" to R.drawable.ic_resource_food,
          "[wood]" to R.drawable.ic_resource_wood
        )
      ),
      AnnotatedText(
        text = "The Squirrel clan gather [ingredients] Ingredients in its territory, depending on the zone type.",
        res = mapOf(
          "[ingredients]" to R.drawable.ic_resource_ingredients
        )
      ),
      AnnotatedText(
        text = "The [stove] Stove replaces the [brewery] Brewery, where [cook] Cooks can prepare [meal] Meals, allowing great bonuses. [andhrimnir] Andhrimnir is your warchief and can be assigned to it to produce more [ingredients] Ingredients.",
        res = mapOf(
          "[stove]" to R.drawable.ic_building_stove,
          "[brewery]" to R.drawable.ic_building_brewery,
          "[cook]" to R.drawable.ic_unit_cook,
          "[meal]" to R.drawable.ic_resource_meal,
          "[andhrimnir]" to R.drawable.ic_unit_warchief_andhrimnir,
          "[ingredients]" to R.drawable.ic_resource_ingredients
        )
      ),
      AnnotatedText(
        text = "The clan can achieve its specific Ratatoskr Victory."
      )
    ),
    relic = AnnotatedText(
      text = "[yggdrasil_root] Yggdrasil's root : The zone where Yggdrasil's Root is built becomes “Eldritch\". Every 4 months, another zone becomes eldritch. Units in Eldritch zones benefit from periodical production bonuses. Enemy units in an eldritch zone have a chance to pick a fight with their own kin for 5s.",
      res = mapOf(
        "[yggdrasil_root]" to R.drawable.ic_relic_yggdrasil_root
      )
    ),
    emblem = R.drawable.img_clan_emblem_squirrel,
    banner = R.drawable.img_clan_banner_squirrel
  )
)

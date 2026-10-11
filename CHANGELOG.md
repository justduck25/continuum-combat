# Changelog

All notable changes to **Continuum Combat** will be documented in this file.

## [0.1.0] - 2026-10-11

### Initial Release
- **Full Melee Tool Support**: Added weapon attribute compatibility for 20 Continuum Construct melee weapons and harvest tools:
  - Swords & Daggers: `sword`, `dagger` (with custom dual-wield combo)
  - Heavy Blades: `cleaver` (claymore 2H stance and slam finisher)
  - Scythes & Sickles: `kama` (sickle combo), `scythe` (180° broad sweep, +0.75 range)
  - Axes: `hand_axe`, `broad_axe` (360° spin finisher), `minotaur_axe`, `mattock`, `pickadze`
  - Hammers: `excavator`, `sledge_hammer`, `vein_hammer` (overhead hammer slam)
  - Polearms & Staves: `javelin` (spear thrust), `sky_staff`, `earth_staff`, `ichor_staff`, `ender_staff`
  - Utility Weapons: `battlesign` (mace bash), `swasher` (rapier thrust)
- **Non-Invasive Integration**: Implemented via Better Combat's JSON weapon attributes system, ensuring 100% preservation of Tinkers' modifier traits, abilities, and leveling.
- **NeoForge 26.1.2 Support**: Configured metadata and dependencies for Minecraft 26.1.2 and NeoForge 26.1.2.78+.

# Continuum Combat

<div align="center">

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![NeoForge](https://img.shields.io/badge/NeoForge-26.1.2-orange.svg)](https://neoforged.net/)
[![Minecraft](https://img.shields.io/badge/Minecraft-26.1.2-brightgreen.svg)](https://minecraft.net/)
[![Release](https://img.shields.io/badge/Release-0.1.0-blue.svg)](https://github.com/justduck25/continuum-combat/releases)

**Continuum Combat** is an official compatibility addon bridging **Continuum Construct (Tinkers' Construct)** with **Better Combat** on NeoForge 26.1.2.

</div>

---

## ✨ Features

- ⚔️ **Full Melee Weapon Support**: Integrates all 20 Continuum Construct melee weapons and tools into Better Combat's dynamic attack animation and combo system.
- 🗡️ **Tailored Combat Behaviors**:
  - **Dagger Dual-Wielding**: Fast slashing combo paired with a lethal dual-handed thrust finisher (`x1.4` damage bonus) when dual-wielding.
  - **Scythe Sweeping**: Broad 180° swing arc and extended reach (`+0.75` blocks) matching the massive scythe blade.
  - **Heavy Cleavers & Axes**: Claymore poses, ground slam finishers, and wide 360° spin attacks for two-handed heavy weapons.
  - **Staves & Polearms**: Unique 3-hit polearm combo sequence ending with an overhead heavy slam.
- 🛡️ **Non-Invasive Architecture**: Data-driven attribute definitions that preserve all Tinkers' modifier traits, stats, and leveling mechanics.

---

## 📋 Weapon Mapping Matrix

| Weapon / Tool | Better Combat Preset | Handedness | Special Properties |
|---|---|:---:|---|
| **Broadsword / Sword** | `sword` | 1-Handed | 3-hit slash combo with thrust finisher |
| **Dagger** | `dagger` | 1-Handed | Short range (`-0.5`), dual-wield thrust finisher (`x1.4`) |
| **Cleaver** | `claymore` | 2-Handed | 2H claymore stance, horizontal slashes & heavy slam |
| **Kama** | `sickle` | 1-Handed | Rapid sickle slashes, dual-wield cross-slash finisher |
| **Scythe** | `scythe` | 2-Handed | Extended reach (`+0.75`), wide 180° horizontal sweep |
| **Hand Axe** | `axe` | 1-Handed | 90° chops |
| **Broad Axe** | `double_axe` | 2-Handed | Heavy 180° sweep followed by a full 360° spin attack |
| **Minotaur Axe** | `double_axe` | 2-Handed | Extended reach (`+0.25`), 180° sweep + 360° spin |
| **Excavator** | `hammer` | 2-Handed | Heavy overhead slam |
| **Sledge Hammer** | `hammer` | 2-Handed | Heavy overhead slam |
| **Vein Hammer** | `hammer` | 2-Handed | Heavy overhead slam |
| **Mattock** | `axe` | 1-Handed | 1H axe attack style |
| **Pickadze** | `axe` | 1-Handed | 1H axe attack style |
| **Javelin** | `spear` | 2-Handed | Long-range piercing thrust (`+1.0` reach) |
| **Battlesign** | `mace` | 1-Handed | Blunt swing combo ending with a vertical bash |
| **Swasher** | `rapier` | 1-Handed | Rapid rapier slashes and direct thrust |
| **Sky Staff** | `staff` | 2-Handed | Polearm 3-hit combo ending with a staff slam |
| **Earth Staff** | `staff` | 2-Handed | Polearm 3-hit combo ending with a staff slam |
| **Ichor Staff** | `staff` | 2-Handed | Polearm 3-hit combo ending with a staff slam |
| **Ender Staff** | `staff` | 2-Handed | Polearm 3-hit combo ending with a staff slam |

---

## 📦 Compatibility & Requirements

| Dependency | Required Version |
|---|---|
| **Minecraft** | `26.1.2` |
| **NeoForge** | `26.1.2.78+` |
| **Continuum Construct** | `3.12.7+` |
| **Better Combat** | `1.9+` |

---

## 🔨 Building from Source

```bash
git clone https://github.com/justduck25/continuum-combat.git
cd continuum-combat
./gradlew build
```

Built JAR files are located in `build/libs/`.

---

## 📜 License

This project is licensed under the [MIT License](LICENSE).

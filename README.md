<WritingBlock id="73182" variant="document"># Minecraft TNT Animation Mod

SpinTNTMod is a lightweight Minecraft mod for Fabric 1.21.11 that adds a horizontal spinning animation to ignited TNT. This Minecraft client-side animation mod increases the TNT's rotation speed as its fuse counts down, creating a progressively faster spinning effect before detonation. The mod changes the TNT entity's rotation without intentionally modifying its explosion behavior, fuse duration, or physics.

## Install

1. Install Minecraft Java Edition 1.21.11.
2. Install Fabric Loader compatible with Minecraft 1.21.11.
3. Download or build the SpinTNTMod JAR file.
4. Place the mod JAR in your Minecraft `mods` folder.
5. Launch Minecraft using your Fabric installation.

## Use

1. Start a Minecraft world with the mod installed.
2. Ignite TNT using flint and steel or another valid ignition method.
3. Observe the ignited TNT as it spins horizontally.
4. Watch the rotation speed increase as the remaining fuse time decreases.
5. The TNT explodes according to its normal game behavior.

The rotation speed is calculated using the default 80-tick TNT fuse:

- At the beginning of the fuse, the rotation speed starts at zero.
- As the fuse decreases, the rotation speed increases.
- Near the end of the fuse, the TNT spins faster.

The current rotation multiplier is 10 degrees per tick at the end of the default fuse countdown.</WritingBlock>

---

More Minecraft mod projects by EnderDevelopment: https://github.com/EnderDevelopment

Project page: https://dash.enderdevelopment.com/community/147048a3-187c-43cc-8540-b261b1c053c7?utm_source=github&utm_medium=readme&utm_campaign=auto_publish&utm_content=147048a3-187c-43cc-8540-b261b1c053c7

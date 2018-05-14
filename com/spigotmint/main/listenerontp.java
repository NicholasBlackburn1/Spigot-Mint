package com.spigotmint.main;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.Sound;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.inventory.meta.FireworkMeta;

import java.util.Random;

import static com.spigotmint.main.color.getColor;

public class listenerontp  implements Listener{
    @EventHandler
    public void onPLayerTeleport(PlayerTeleportEvent event) {

        event.getPlayer().playSound(event.getPlayer().getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP,1.0F, 1.0F);

        Bukkit.broadcastMessage("§4 You just Teleported ");
        Player p = event.getPlayer();
        //Spawn the Firework, get the FireworkMeta.
        Firework fw = (Firework) p.getWorld().spawnEntity(p.getLocation(), EntityType.FIREWORK);
        FireworkMeta fwm = fw.getFireworkMeta();

        //Our random generator
        Random r = new Random();

        //Get the type
        int rt = r.nextInt(4) + 1;
        FireworkEffect.Type type = FireworkEffect.Type.BALL;
        if (rt == 1) type = FireworkEffect.Type.BALL;
        if (rt == 2) type = FireworkEffect.Type.BALL_LARGE;
        if (rt == 3) type = FireworkEffect.Type.BURST;
        if (rt == 4) type = FireworkEffect.Type.CREEPER;
        if (rt == 5) type = FireworkEffect.Type.STAR;

        //Get our random colours
        int r1i = r.nextInt(17) + 1;
        int r2i = r.nextInt(17) + 1;
        Color c1 = getColor(r1i);
        Color c2 = getColor (r2i);

        //Create our effect with this
        FireworkEffect effect = FireworkEffect.builder().flicker(r.nextBoolean()).withColor(c1).withFade(c2).with(type).trail(r.nextBoolean()).build();

        //Then apply the effect to the meta
        fwm.addEffect(effect);

        //Generate some random power and set it
        int rp = r.nextInt(2) + 1;
        fwm.setPower(rp);

        //Then apply this to our rocket
        fw.setFireworkMeta(fwm);



    }

}

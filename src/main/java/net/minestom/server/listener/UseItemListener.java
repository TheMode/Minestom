package net.minestom.server.listener;

import net.minestom.server.MinecraftServer;
import net.minestom.server.entity.Player;
import net.minestom.server.event.item.ItemAnimationEvent;
import net.minestom.server.event.item.ItemUseEvent;
import net.minestom.server.event.player.PlayerItemAnimationEvent;
import net.minestom.server.event.player.PlayerPreEatEvent;
import net.minestom.server.event.player.PlayerUseItemEvent;
import net.minestom.server.inventory.PlayerInventory;
import net.minestom.server.item.ItemStack;
import net.minestom.server.item.Material;
import net.minestom.server.item.event.ItemEventManager;
import net.minestom.server.network.packet.client.play.ClientUseItemPacket;

public class UseItemListener {

    public static void useItemListener(ClientUseItemPacket packet, Player player) {
        final PlayerInventory inventory = player.getInventory();
        final Player.Hand hand = packet.hand;
        ItemStack itemStack = hand == Player.Hand.MAIN ? inventory.getItemInMainHand() : inventory.getItemInOffHand();
        //itemStack.onRightClick(player, hand);

        PlayerUseItemEvent plauerUseItemEvent = new PlayerUseItemEvent(player, hand, itemStack);
        player.callEvent(PlayerUseItemEvent.class, plauerUseItemEvent);

        final PlayerInventory playerInventory = player.getInventory();
        if (plauerUseItemEvent.isCancelled()) {
            playerInventory.update();
            return;
        }

        ItemUseEvent useItemEvent = new ItemUseEvent(
                plauerUseItemEvent.getPlayer(),
                plauerUseItemEvent.getHand(),
                plauerUseItemEvent.getItemStack()
        );

        MinecraftServer.getItemEventManager().callEventOnItem(itemStack, ItemUseEvent.class, useItemEvent);
        if (useItemEvent.isCancelled()) {
            playerInventory.update();
            return;
        }

        itemStack = useItemEvent.getItemStack();
        final Material material = itemStack.getMaterial();

        // Equip armor with right click
        if (material.isArmor()) {
            ItemStack currentlyEquipped;
            if (material.isHelmet()) {
                currentlyEquipped = playerInventory.getHelmet();
                playerInventory.setHelmet(itemStack);
            } else if (material.isChestplate()) {
                currentlyEquipped = playerInventory.getChestplate();
                playerInventory.setChestplate(itemStack);
            } else if (material.isLeggings()) {
                currentlyEquipped = playerInventory.getLeggings();
                playerInventory.setLeggings(itemStack);
            } else {
                currentlyEquipped = playerInventory.getBoots();
                playerInventory.setBoots(itemStack);
            }
            playerInventory.setItemInHand(hand, currentlyEquipped);
        }

        PlayerItemAnimationEvent.ItemAnimationType itemAnimationType = null;
        boolean riptideSpinAttack = false;

        if (material == Material.BOW) {
            itemAnimationType = PlayerItemAnimationEvent.ItemAnimationType.BOW;
        } else if (material == Material.CROSSBOW) {
            itemAnimationType = PlayerItemAnimationEvent.ItemAnimationType.CROSSBOW;
        } else if (material == Material.SHIELD) {
            itemAnimationType = PlayerItemAnimationEvent.ItemAnimationType.SHIELD;
        } else if (material == Material.TRIDENT) {
            itemAnimationType = PlayerItemAnimationEvent.ItemAnimationType.TRIDENT;
        } else if (material.isFood()) {
            itemAnimationType = PlayerItemAnimationEvent.ItemAnimationType.EAT;

            // Eating code, contains the eating time customisation
            PlayerPreEatEvent playerPreEatEvent = new PlayerPreEatEvent(player, itemStack, hand, player.getDefaultEatingTime());
            player.callCancellableEvent(PlayerPreEatEvent.class, playerPreEatEvent, () -> player.refreshEating(hand, playerPreEatEvent.getEatingTime()));
        }

        if (itemAnimationType != null) {

            PlayerItemAnimationEvent playerItemAnimationEvent = new PlayerItemAnimationEvent(player, itemAnimationType);

            PlayerItemAnimationEvent.ItemAnimationType finalItemAnimationType = itemAnimationType;

            player.callCancellableEvent(PlayerItemAnimationEvent.class, playerItemAnimationEvent, () -> {

                ItemAnimationEvent itemAnimationEvent = new ItemAnimationEvent(
                        playerItemAnimationEvent.getPlayer().getItemInHand(hand),
                        player,
                        finalItemAnimationType
                );

                boolean cancelled = MinecraftServer.getItemEventManager().callEventOnItem(useItemEvent.getItemStack(), ItemAnimationEvent.class, itemAnimationEvent);

                if (cancelled) return;

                player.refreshActiveHand(true, hand == Player.Hand.OFF, riptideSpinAttack);
                player.sendPacketToViewers(player.getMetadataPacket());

            });
        }
    }

}

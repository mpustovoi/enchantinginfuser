//package fuzs.enchantinginfuser.compat;
//
//import fuzs.enchantinginfuser.api.world.item.enchantment.EnchantStatsProvider;
//import net.minecraft.core.BlockPos;
//import net.minecraft.world.item.enchantment.Enchantment;
//import net.minecraft.world.level.Level;
//import net.minecraft.world.level.block.state.BlockState;
//import shadows.apotheosis.ench.EnchModule;
//import shadows.apotheosis.ench.table.EnchantingStatManager;
//
//public class ForgeApotheosisEnchantStatsProvider implements EnchantStatsProvider {
//
//    @Override
//    public String getSourceNamespace() {
//        return "apotheosis";
//    }
//
//    @Override
//    public Enchantment.Rarity getRarity(Enchantment enchantment) {
//        return enchantment.getRarity();
//    }
//
//    @Override
//    public String[] getScalingNamespaces() {
//        return new String[]{"minecraft", "apotheosis"};
//    }
//
//    @Override
//    public float getMaximumEnchantPower() {
//        return 50.0F;
//    }
//
//    @Override
//    public float getEnchantPowerBonus(BlockState state, Level level, BlockPos pos) {
//        return EnchantingStatManager.getEterna(state, level, pos);
//    }
//
//    @Override
//    public float getMaximumEnchantPowerScale(BlockState state, Level level, BlockPos pos) {
//        return EnchantingStatManager.getMaxEterna(state, level, pos) / 15.0F;
//    }
//
//    @Override
//    public float getMaximumCostMultiplier() {
//        return 2.5F;
//    }
//
//    @Override
//    public float getMaximumEnchantingPowerMultiplier() {
//        return 3.5F;
//    }
//
//    @Override
//    public boolean isCompatibleWith(Enchantment enchantment, Enchantment other) {
//        return enchantment.isCompatibleWith(other);
//    }
//
//    @Override
//    public int getMinLevel(Enchantment enchantment) {
//        return enchantment.getMinLevel();
//    }
//
//    @Override
//    public int getMaxLevel(Enchantment enchantment) {
//        return EnchModule.getEnchInfo(enchantment).getMaxLevel();
//    }
//
//    @Override
//    public int getMinCost(Enchantment enchantment, int level) {
//        return EnchModule.getEnchInfo(enchantment).getMinPower(level);
//    }
//
//    @Override
//    public int getMaxCost(Enchantment enchantment, int level) {
//        return EnchModule.getEnchInfo(enchantment).getMaxPower(level);
//    }
//
//    @Override
//    public boolean isTreasureOnly(Enchantment enchantment) {
//        return EnchModule.getEnchInfo(enchantment).isTreasure();
//    }
//
//    @Override
//    public boolean isCurse(Enchantment enchantment) {
//        return enchantment.isCurse();
//    }
//
//    @Override
//    public boolean isTradeable(Enchantment enchantment) {
//        return EnchModule.getEnchInfo(enchantment).isTradeable();
//    }
//
//    @Override
//    public boolean isDiscoverable(Enchantment enchantment) {
//        return EnchModule.getEnchInfo(enchantment).isDiscoverable();
//    }
//}

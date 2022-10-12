package sodikov.ak.shopinglist.domain

class GetShopItemInUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopItemInId(shopItemId: Int): ShopItem {
        return shopListRepository.getShopItem(shopItemId)
    }
}
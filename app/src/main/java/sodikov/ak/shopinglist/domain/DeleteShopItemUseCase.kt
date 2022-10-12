package sodikov.ak.shopinglist.domain

class DeleteShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun deleteShopItem(shopItemId: Int) {
        shopListRepository.deleteShopItem(shopItemId)
    }
}
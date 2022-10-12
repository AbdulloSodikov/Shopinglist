package sodikov.ak.shopinglist.domain

interface ShopListRepository {

    fun getShopList(): List<ShopItem>

    fun getShopItem(shopItemId: Int): ShopItem

    fun editShopItem(shopItemId:Int)

    fun addShopItem(shopItem:ShopItem)

    fun deleteShopItem(shopItemId:Int)
}
package sodikov.ak.shopinglist.domain

data class ShopItem(
    val id:Long,
    val name:String,
    val count:Int,
    val enabled:Boolean
)

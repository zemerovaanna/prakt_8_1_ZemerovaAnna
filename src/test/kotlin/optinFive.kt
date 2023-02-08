fun main()
{
    var name:String =""
    val product: MilkProduct = MilkProduct(name)

    print("Введите название молочного продукта:")
    product.name= readln()

    print("Введите вес продукта (г.):")
    product.weight=readln()!!.toFloat()

    print("Введите жирность продукта (%):")
    product.fatcontent=readln()!!.toFloat()

    print("Введите производителя продукта:")
    product.manufacturer=readln()

    print("Введите цену продукта (руб.):")
    product.price=readln().toShort()

    fun getProductInfo() {
        println("Продукт "+product.name+" производителя "+product.manufacturer+" по цене "+product.price)
    }
    fun getProductWeight() {
        println("Продукт"+product.name+" весом "+product.weight+"г.")
    }
    fun getProductFatContent() {
        println("Продукт "+product.name+" жирностью "+ product.fatcontent+"г.")
    }
}
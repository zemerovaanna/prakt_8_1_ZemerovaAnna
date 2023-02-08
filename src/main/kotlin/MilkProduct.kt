class MilkProduct (_name: String){
    var name:String = _name
    var weight: Float = 0.0F
    var fatcontent:Float = 0.0F
    var manufacturer:String = "Undefined"
    var price: Short = 0

    constructor(_name: String, _weight: Float) : this(_name) {
        weight = _weight
    }
    constructor(_name: String, _weight: Float,_fatcontent: Float) : this(_name, _weight) {
        fatcontent = _fatcontent
    }
    constructor(_name: String, _weight: Float,_fatcontent: Float, _manufacturer: String) : this(_name, _weight, _fatcontent) {
        manufacturer = _manufacturer
    }
    constructor(_name: String, _weight: Float,_fatcontent: Float, _manufacturer: String, _price: Short) : this(_name, _weight, _fatcontent, _manufacturer) {
        price = _price
    }
}
fun main(){
    var n: Int = 5
    var s: String = "Jane"
    //10 if stataments
    if(3 in 1..10){
        println("Yes")
    }
    if(s == "Jon" || s == "Jane"){
        println("Welcome")
    }
    if(n < 8){
        println(n + 2)
    }
    if(n > 1){
        println(n - 2)
    }
    if(5 > 2){
        println("True")
    }
    if(n != 2){
        println("Wrong Answer")
    }
    if(n > 2 && n < 6){
        println("You Win")
    }
    if(n >= 3){
        println(n * 5)
    }
    if(n == 5){
        n+= 10
        println(n)
    }
    if(n <= 7){
        println(n + 3)
    }
    //when statement
    var ans: String = when{
        n < 1 -> "Hi There"
        n == 8 -> "Almost There"
        n != 10 -> "Does not Exist"
        n >= 7 -> "You Win"
        n == 2 -> "Too Low"
        else -> "Not Valid"
    }
    println(ans)
    //Loop that prints out 1-100
    var dig: Int = 0
    while(dig < 100){
        dig++
        println(dig)
    }
    //Loop that prints out 1-10 without 4 & 5
    for(all in 1..10){
        if(all == 4){
            continue
        }
        if(all == 5){
            continue
        }
        println(all)
    }
    /*Loop that outputs even numbers from 10-20 and outputs odd numbers from 20-30*/
    var fnos: Int = 10
    var snos: Int = 20
    while(fnos <= 20){
        if(fnos % 2 == 0){
            println(fnos)
        }
        fnos++
        if(snos % 2 == 1){
            println(snos)
        }
        snos++
    }
    //Object for club class
    var club: Club = Club("",0,"","","")
    club.setClubDetails("Chelsea",25,"Stamford Bridge","Thomas Tuchel","Blue")
    println(club.getClubDetails())
    //Object for fruit class
    var fruit: Fruits = Fruits("","",0.0,0.0,0.0)
    fruit.setFruitDetails("Banana","Yellow",3.4,4.5,200.0)
    println(fruit.getFruitDetails())
    //Object for music class
    var music: Music = Music("","","","",0)
    music.setMusicDetails("Way Too Big","Burna Boy","Twice As Tall","Afro-pop",2020)
    println(music.getMusicDetails())
    //Object for country class
    var country: Country = Country("","","","","")
    country.setCountryDetails("Nigeria","2.7 Billion","Naira","Muhamadu Buhari","Africa")
    println(country.getCountryDetails())
    //Object for cryptocurrency class
    var crypto: CryptoCurrency = CryptoCurrency("",0.0,"","",0)
    crypto.setCryptoDetails("Dogecoin",0.3249,"42.241 Billion","www.dogecoin.com",6)
    println(crypto.getCryptoDetails())
}
//Defining five classes with five instance variables and one constructor
class Club{
    var clubName: String = ""
    var clubTrophies: Int = 0
    var clubHome: String = ""
    var clubManager: String = ""
    var clubJersey: String = ""
    
    constructor(cName: String, cTrophies: Int, cHome: String, cManager: String, cJersey: String){
        this.clubName = cName
        this.clubTrophies = cTrophies
        this.clubHome = cHome
        this.clubManager = cManager
        this.clubJersey = cJersey
}
    fun getClubDetails(): String{
    return "\nClub Name: ${this.clubName}\nTrophies: ${this.clubTrophies}\nHome Ground: ${this.clubHome}\nManager: ${this.clubManager}\nJersey Color: ${this.clubJersey}"
}
    fun setClubDetails(cName: String, cTrophies: Int, cHome: String, cManager: String, cJersey: String){
        this.clubName = cName
        this.clubTrophies = cTrophies
        this.clubHome = cHome
        this.clubManager = cManager
        this.clubJersey = cJersey
}
    }
    // Second Class
class Fruits{
    var fruitName: String = ""
    var fruitColor: String = ""
    var fruitWeight: Double = 0.0
    var fruitHeight: Double = 0.0
    var fruitPrice: Double = 0.0
    
    constructor(fName: String, fColor: String, fWeight: Double, fHeight: Double, fPrice: Double){
        this.fruitName = fName
        this.fruitColor = fColor
        this.fruitWeight = fWeight
        this.fruitHeight = fHeight
        this.fruitPrice = fPrice
}
    fun getFruitDetails(): String{
    return "\nFruit Name: ${this.fruitName}\nColor: ${this.fruitColor}\nWeight: ${this.fruitWeight}\nHeight: ${this.fruitHeight}\nPrice (Naira): ${fruitPrice}"
}
    fun setFruitDetails(fName: String, fColor: String, fWeight: Double, fHeight: Double, fPrice: Double){
        this.fruitName = fName
        this.fruitColor = fColor
        this.fruitWeight = fWeight
        this.fruitHeight = fHeight
        this.fruitPrice = fPrice
}
    }
    // Third Class
class Music{
    var title: String = ""
    var artist: String = ""
    var album: String = ""
    var genre: String = ""
    var year: Int = 0
    
    constructor(mTitle: String, mArtist: String, mAlbum: String, mGenre: String, mYear: Int){
        this.title = mTitle
        this.artist = mArtist
        this.album = mAlbum
        this.genre = mGenre
        this.year = mYear
    }
    fun getMusicDetails(): String{
        return "\nMusic Tile: ${this.title}\nArtist: ${this.artist}\nAlbum: ${this.album}\nGenre: ${this.genre}\nYear: ${this.year}"
    }
    fun setMusicDetails(mTitle: String, mArtist: String, mAlbum: String, mGenre: String, mYear: Int){
        this.title = mTitle
        this.artist = mArtist
        this.album = mAlbum
        this.genre = mGenre
        this.year = mYear
    }
    }
    //Fourth Class
class Country{
    var countryName: String = ""
    var countryPopulation: String = ""
    var countryCurrency: String = ""
    var countryPresident: String = ""
    var countryContinent: String = ""
    
    constructor(coName: String, coPop: String, coCurrency: String, coPres: String, coCont: String){
        this.countryName = coName
        this.countryPopulation = coPop
        this.countryCurrency = coCurrency
        this.countryPresident = coPres
        this.countryContinent = coCont
    }
    fun getCountryDetails(): String{
        return "\nCountry Name: ${this.countryName}\nPopulation: ${this.countryPopulation}\nCurrency: ${this.countryCurrency}\nPresident: ${this.countryPresident}\nContinent: ${this.countryContinent}"
    }
    fun setCountryDetails(coName: String, coPop: String, coCurrency: String, coPres: String, coCont: String){
        this.countryName = coName
        this.countryPopulation = coPop
        this.countryCurrency = coCurrency
        this.countryPresident = coPres
        this.countryContinent = coCont
    }
    }
    //Fifth Class
class CryptoCurrency{
    var currencyName: String = ""
    var currencyPrice: Double = 0.0
    var currencyMarketCap: String = ""
    var currencyWebsite: String = ""
    var currencyRank: Int = 0
    
    constructor(cuName: String, cuPrice: Double, cuMCap: String, cuWebsite: String, cuRank: Int){
        this.currencyName = cuName
        this.currencyPrice = cuPrice
        this.currencyMarketCap = cuMCap
        this.currencyWebsite = cuWebsite
        this.currencyRank = cuRank
    }
    fun getCryptoDetails(): String{
        return "\nCryptocurrency Name: ${this.currencyName}\nPrice($): ${this.currencyPrice}\nMarketcap($): ${this.currencyMarketCap}\nWebsite: ${this.currencyWebsite}\nRank: ${this.currencyRank}"
    }
    fun setCryptoDetails(cuName: String, cuPrice: Double, cuMCap: String, cuWebsite: String, cuRank: Int){
        this.currencyName = cuName
        this.currencyPrice = cuPrice
        this.currencyMarketCap = cuMCap
        this.currencyWebsite = cuWebsite
        this.currencyRank = cuRank
    }
    }
class Primougol (var weight: Double, var height:Double)
{
    public fun S()
    {
        if(weight>0&&height>0)
        {
            println("Площадь =${weight*height}")
        }
        else println("не может быть отрицательных значений")
    }
    public fun P()
    {
        if(weight>0&&height>0)
        {
            println("Периметр =${(weight+height)*2}")
        }
        else println("не может быть отрицательных значений")
    }

}
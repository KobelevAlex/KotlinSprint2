package lesson_18

abstract class Packing {
    abstract fun parcelSurfaceArea()
}

class PackageRectangular(
    val length: Double,
    val width: Double,
    val height: Double,
) : Packing() {
    override fun parcelSurfaceArea() {
        val area = 2 * (width * length + length * height + width * height)
        val formattedArea = String.format("%.2f", area)
        println("Площадь прямоугольной посылки - $formattedArea кв.см")
    }
}

class PackageCube(private val edge: Double) : Packing() {
    override fun parcelSurfaceArea() {
        val area = 6 * edge * edge
        val formattedArea = String.format("%.2f", area)
        println("Площадь посылки в форме куба - $formattedArea кв.см")
    }
}

fun main() {
    val listPacking: MutableList<Packing> = mutableListOf()
    val packageRectangular = PackageRectangular(22.3, 33.5, 44.7)
    val packageCube = PackageCube(45.5)
    listPacking.add(packageCube)
    listPacking.add(packageRectangular)
    packageCube.parcelSurfaceArea()
    packageRectangular.parcelSurfaceArea()
}
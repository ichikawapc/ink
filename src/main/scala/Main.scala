import net.sourceforge.tess4j.Tesseract
import java.awt.image.BufferedImage
import javax.imageio.ImageIO
import java.io.File

object Main {
  def main(args : Array[String]) = {
    println("inkプロジェクト始動...")
    val image = openImageFile("text.jpg") //← TODO: Use sample.jpg and trim that.
    val text = readText(image)
    println(text)
  }
  
  def openImageFile(fileName: String) : BufferedImage =
    ImageIO.read(new File(fileName))

  def readText(image : BufferedImage): String = {
    val instance = new Tesseract()
    instance.doOCR(image)
  }
}


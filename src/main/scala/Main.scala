import net.sourceforge.tess4j.Tesseract
import java.awt.image.BufferedImage
import javax.imageio.ImageIO
import java.io.File

object Main {
  def main(args : Array[String]) = {
    println("inkプロジェクト始動...")
    val image = openImageFile("src\\main\\resources\\text.jpg") //← TODO: Use sample.jpg and trim that.
    val trimedImage = trimTextSpace(image)
    val text = readText(trimedImage)
    println(text)
  }
  
  def openImageFile(fileName: String) : BufferedImage =
    ImageIO.read(new File(fileName))

  def trimTextSpace(image : BufferedImage) : BufferedImage = {
    val width = image.getWidth()
    val height = 40
    val x = 0
    val y = image.getHeight() - height
    image.getSubimage(x, y, width, height);
  }

  def readText(image : BufferedImage): String = {
    val instance = new Tesseract()
    instance.doOCR(image)
  }
}


# inkプロジェクト

こういう画像↓
![https://raw.githubusercontent.com/ichikawapc/ink/master/src/main/resources/sample.jpg]()
から下部のテキスト部分に書かれた文字列を読み取りたい。

## 使い方

```console
sbt run -- <画像ファイル名>
```

## 必要要件
次のものが必要です。

* Java 11
* sbt
* tesseract

### Scala のインストール方法
参考: https://www.scala-lang.org/download/

### tesseract のインストール方法

#### UbuntuまたはDebianの人がtesseractをインストールする方法
```console
sudo apt install tessract-ocr
```

#### Intel Macの人がtesseractをインストールする方法
```console
brew install tesseract 
```

#### Windowsの人がtesseractをインストールする方法

TODO


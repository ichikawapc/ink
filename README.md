# inkプロジェクト

こういう画像↓
![https://github.com/ichikawapc/ink/blob/master/src/main/resources/sample.jpg?raw=true]()
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

### Java 11 のインストール方法
TODO:

### sbt のインストール方法
TODO:

### tesseract のインストール方法

#### UbuntuまたはDebianの人がtesseractをインストールする方法
```console
sudo apt install tessract-ocr
```

#### Intel Macの人がtesseractをインストールする方法
```console
brew install tesseract 
```


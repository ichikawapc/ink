サンプル画像をいれます。

作成例(Imagemagickが必要です)

```
convert -size 500x40 -fill white -background black -pointsize 30 -gravity SouthWest label:"ABC 12.34 F(X)" text.jpg
composite -gravity South text.jpg junsaiike.jpg sample.jpg
```

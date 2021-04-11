# Word Count

Count words in texts

### Dependencies

scala version: "2.12.13"

spark version: "3.1.1"

#### Run the command below to build: 
```
sbt package
```

#### To run in Spark:
```
spark-submit --class "WordCount" --master "local[*]" <path to the wordcount jar> "file:///<path to the text>" "file:///<path to the directory result>"
```

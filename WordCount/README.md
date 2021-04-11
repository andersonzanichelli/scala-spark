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
#### Exemple
```
spark-submit --class "WordCount" --master "local[*]" /home/myuser/workspace/scala/WordCount/target/scala-2.12/wordcount_2.12-0.1.jar "file:///home/myuser/spark/Text.txt" "file:///home/myuser/spark/wordcount/result.txt"
```

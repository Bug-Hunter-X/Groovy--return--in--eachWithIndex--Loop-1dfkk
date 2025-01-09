```groovy
def myMethod(List<String> list) {
  list.eachWithIndex { item, index ->
    println "Item $index: $item"
    if (item == "stop") {
      return // This will only exit the eachWithIndex loop, not the method
    }
  }
  println "Method completed"
}

def myMethodCorrected(List<String> list) {
  for (int i = 0; i < list.size(); i++) {
    def item = list[i]
    println "Item $i: $item"
    if (item == "stop") {
      break // This exits the loop
    }
  }
  println "Method completed"
}

myMethod(["a", "b", "stop", "c"])
myMethodCorrected(["a", "b", "stop", "c"])
```
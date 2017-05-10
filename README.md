# transjs

A small Scala Library for transpiling JavaScript or generating javascript

## Usage

`transjs` has two main components, the object `wrappers`, which are simple string wrapping functions, and `JavaScript`, a case class with infix operators with allows linear composition of JavaScript code strings.

### Example

```
val f = JavaScript("4")
println(f + "7")
println(wrappers._while("3===4", wrappers.consoleLog("6")))
```

For documentation, [click here](https://jweinst1.github.io/transjs/target/scala-2.12/api/transjs/index.html)


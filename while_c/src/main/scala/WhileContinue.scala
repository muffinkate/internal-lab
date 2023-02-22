@main
def main() =
  // define the new control-flow structures here

  var i = -1

  while_c(i < 9) {
    i += 1
    if ((i % 2) != 0)
      continue
    println(i)
  }

end main

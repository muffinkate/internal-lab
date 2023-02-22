package internal

// define the new control-flow structure here

@main
def main() =
  var i = 0
  repeat {
    if ((i % 2) == 0)
      println(i)
    i += 1
  } until (i > 9)

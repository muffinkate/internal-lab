// define the new control-flow structure here

@main
def main =

  var i = 0;
  for_loop(i = 0)(i < 10)(i += 2) {
    println(i);
  }

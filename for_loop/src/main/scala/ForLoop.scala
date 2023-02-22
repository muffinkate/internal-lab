// define the new control-flow structure here

var i = 0;

@main
def main =
  for_loop((i = 0))(i < 10)(i += 2) {
    println(i);
  }

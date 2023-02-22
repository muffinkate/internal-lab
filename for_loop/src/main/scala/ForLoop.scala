@main
def main =
  def for_loop(start: Unit)(end: =>Boolean)(inc: =>Unit)(body: =>Unit): Unit = {
    if !end then {
      body
      inc
      for_loop(start)(end)(inc){body}
    }
  }

  var i = 0;

  for_loop((i = 0))(i < 10)(i += 2) {
    println(i);
  }

end main

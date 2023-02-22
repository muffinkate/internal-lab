@main
def main() =
  def loop_until(i: =>Boolean)(body: =>Unit): Unit = {
    if !i then { 
      body 
      loop_until(i) {body}
    }
    else None
  }

  var i = 0

  loop_until(i > 9) {
    if ((i % 2) == 0)
      println(i)
    i += 1
  }

end main
